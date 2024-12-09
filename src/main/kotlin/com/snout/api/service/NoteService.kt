package com.snout.api.service

import com.snout.api.adapter.NoteAdapter
import com.snout.api.domain.exception.NoContentNoteException
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
}