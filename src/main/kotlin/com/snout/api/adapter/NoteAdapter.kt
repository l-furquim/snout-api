package com.snout.api.adapter

import com.snout.api.domain.model.Note
import java.util.Optional

interface NoteAdapter {

    fun newNote(note: Note)
    fun updateNote(newTitle: String, newContent: String, noteId: Int)
    fun deleteNote(noteId: Int)
    fun findNotesByUserId(userId: Int): Optional<List<Note>>
}