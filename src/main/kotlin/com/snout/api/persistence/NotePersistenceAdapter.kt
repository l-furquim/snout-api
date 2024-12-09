package com.snout.api.persistence

import com.snout.api.adapter.NoteAdapter
import com.snout.api.domain.exception.SaveNoteException
import com.snout.api.domain.model.Note
import com.snout.api.entity.NoteEntity
import com.snout.api.mapper.NoteMapper
import com.snout.api.persistence.repository.NoteRepository
import org.springframework.stereotype.Component
import java.io.IOException

@Component
class NotePersistenceAdapter(
    private val repository: NoteRepository,
    private val mapper: NoteMapper

    ): NoteAdapter {

    override fun newNote(note: Note) {
        val noteEntity: NoteEntity = mapper.toEntity(note)

        if(noteEntity != null){
            try{
                repository.save(noteEntity)
            }
            catch (e: IOException){
                throw SaveNoteException("Erro ao salvar a nota " + e.message)
            }
        }
    }
}