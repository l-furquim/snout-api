package com.snout.api.controller.note.dto

import com.snout.api.domain.model.Note

data class FindNotesByUserIdResponseDto(val notes: List<Note>)
