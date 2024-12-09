package com.snout.api.mapper

import com.snout.api.domain.model.Note
import com.snout.api.entity.NoteEntity
import org.springframework.stereotype.Component

@Component
class NoteMapper {
    fun toEntity(note: Note): NoteEntity{
        return NoteEntity(
            title = note.title,
            content = note.content,
            createdAt = note.createdAt,
            author = note.author,
        )
    }

    fun toDomain(note: NoteEntity): Note{
        return Note(
            id = note.id,
            title = note.title,
            content = note.content,
            createdAt = note.createdAt,
            author = note.author
        )
    }
}