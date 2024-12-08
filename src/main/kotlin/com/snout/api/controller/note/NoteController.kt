package com.snout.api.controller.note

import com.snout.api.controller.note.dto.NewNoteRequestDto
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/note")
class NoteController {

    @GetMapping("/new")
    fun newNote(@RequestBody data: NewNoteRequestDto): ResponseEntity<String> {

    }
}