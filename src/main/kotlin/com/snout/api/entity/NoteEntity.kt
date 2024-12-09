package com.snout.api.entity

import com.snout.api.domain.enums.NoteStatus
import com.snout.api.domain.model.User
import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.EnumType
import jakarta.persistence.Enumerated
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.JoinColumn
import jakarta.persistence.ManyToOne
import java.time.Instant

@Entity(name = "Note")
data class NoteEntity(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Int? = null,

    @Column
    val title: String = "",

    @Column
    val content: String = "",

    @Column
    val createdAt: Instant = Instant.now(),

    @Column
    val author: Int = 0,

    @Enumerated(EnumType.STRING)
    val status: NoteStatus = NoteStatus.NORMAL
)
