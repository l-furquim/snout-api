package com.snout.api.domain.model

import com.snout.api.domain.enums.NoteStatus
import java.time.Instant

data class Note (
    val id: Int? = null,
    val title: String,
    val content: String,
    val createdAt: Instant = Instant.now(),
    val author: Int,
    val status: NoteStatus = NoteStatus.NORMAL
) {
}