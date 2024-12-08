package com.snout.api.controller.note.dto

data class NewNoteRequestDto(
    val title: String,
    val content: String,
    val userId: Int
    )
