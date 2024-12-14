package com.snout.api.entity

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import java.time.Instant
import java.util.*


@Entity(name = "Users")
data class UserEntity(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Int? = null,

    @Column
    val name: String = "",

    @Column
    val email: String = "",

    @Column
    val password: String = "",

    @Column
    val createdAt: Instant = Instant.now(),

    @Column
    val birthDay: Date? = null
) {
}