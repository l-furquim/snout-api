package com.snout.api.port


interface NotePort {

    fun newNote(title: String, content: String, userId: Int);
    fun updateNote(newTitle: String, newContent: String, noteId: Int)
}