package com.snout.api.persistence.repository

import com.snout.api.entity.NoteEntity
import jakarta.transaction.Transactional
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Modifying
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.query.Param;

interface NoteRepository: JpaRepository<NoteEntity, Int> {

    @Modifying
    @Query("UPDATE Note n SET n.title = :newTitle, n.content = :newContent WHERE n.id = :noteId")
    @Transactional
    fun updateNote(@Param("newTitle") newTitle: String, @Param("newContent") newContent: String, @Param("noteId") noteId: Int)
}