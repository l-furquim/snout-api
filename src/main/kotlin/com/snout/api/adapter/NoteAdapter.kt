package com.snout.api.adapter

import com.snout.api.domain.model.Note

interface NoteAdapter {

    fun newNote(note: Note): Void
}