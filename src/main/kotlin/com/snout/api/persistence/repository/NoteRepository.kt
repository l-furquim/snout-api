package com.snout.api.persistence.repository

import com.snout.api.entity.NoteEntity
import org.springframework.data.jpa.repository.JpaRepository

interface NoteRepository: JpaRepository<NoteEntity, Int> {
}