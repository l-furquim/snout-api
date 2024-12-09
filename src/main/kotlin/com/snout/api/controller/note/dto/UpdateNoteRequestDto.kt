package com.snout.api.controller.note.dto

data class UpdateNoteRequestDto(val newTitle: String, val newContent: String, val noteId: Int)
