package com.snout.api.port

import com.snout.api.domain.model.Note


interface NotePort {

    fun newNote(title: String, content: String, userId: Int)
    fun updateNote(newTitle: String, newContent: String, noteId: Int)
    fun deleteNote(noteId: Int)
    fun findNotesByUserId(userId: Int): List<Note>
}