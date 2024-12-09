package com.snout.api.service

import com.snout.api.adapter.NoteAdapter
import com.snout.api.domain.exception.NoContentNoteException
import com.snout.api.domain.exception.NoteIdNullException
import com.snout.api.domain.exception.NotesNotFoundException
import com.snout.api.domain.model.Note
import com.snout.api.port.NotePort
import org.springframework.stereotype.Service

@Service
class NoteService(private val adapter: NoteAdapter): NotePort {

    override fun newNote(title: String, content: String, userId: Int) {
        if(title.isEmpty() || content.isEmpty()){
            throw NoContentNoteException("Conteudo e titulo não podem ser vazios.")
        }

        val note = Note(
            title = title,
            content = content,
            author = userId
        )

        adapter.newNote(note)

    }

    override fun updateNote(newTitle: String, newContent: String, noteId: Int) {
        if(newTitle.isEmpty() || newContent.isEmpty()){
            throw NoContentNoteException("Conteudo e titulo não podem ser vazios.")
        }

        adapter.updateNote(newTitle, newContent, noteId)
    }

    override fun deleteNote(noteId: Int) {
        if(noteId == null){
            throw NoteIdNullException("O id da nota não pode ser nulo")
        }

        adapter.deleteNote(noteId)
    }

    override fun findNotesByUserId(userId: Int): List<Note> {
        if(userId == null || userId == 0){
            throw NoteIdNullException("O id do usuario para busca da nota nao pode ser nulo ou 0: " + userId)
        }

        val notes = adapter.findNotesByUserId(userId)

        if(notes.isEmpty){
            throw NotesNotFoundException("Nenhuma nota encontrada para o id do usuario " + userId)
        }

        return notes.get()
    }
}