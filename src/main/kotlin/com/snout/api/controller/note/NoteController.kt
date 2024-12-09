package com.snout.api.controller.note

import com.snout.api.controller.note.dto.NewNoteRequestDto
import com.snout.api.port.NotePort
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/note")
class NoteController
    (
    private val notePort: NotePort
) {

    @PostMapping("/new")
    fun newNote(@RequestBody data: NewNoteRequestDto): ResponseEntity<String> {
        notePort.newNote(data.title, data.content, data.userId)

        return ResponseEntity.ok().body("Nota criada com sucesso.")
    }
}