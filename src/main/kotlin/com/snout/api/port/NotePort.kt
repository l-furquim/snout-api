package com.snout.api.port

import org.springframework.stereotype.Component

interface NotePort {

    fun newNote(title: String, content: String, userId: Int);
}