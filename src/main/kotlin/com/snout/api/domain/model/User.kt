package com.snout.api.domain.model

import java.time.Instant
import java.util.Date

data class User (
    val id: Int,
    val name: String,
    val email: String,
    val password: String,
    val createdAt: Instant = Instant.now(),
    val birthDay: Date,
    val icon: Icon? = null
) {
}