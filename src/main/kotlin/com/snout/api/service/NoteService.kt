package com.snout.api.service

import com.snout.api.domain.exception.NoContentNoteException
import com.snout.api.port.NotePort
import org.springframework.stereotype.Service

@Service
class NoteService: NotePort {

    override fun newNote(title: String, content: String, userId: Int): Void {
        if(title.isEmpty() || content.isEmpty()){
            throw NoContentNoteException("Conteudo e titulo não podem ser vazios.")
        }


    }
}