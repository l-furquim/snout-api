package com.snout.api.domain.exception.handler

import java.lang.RuntimeException

class NoteNotFoundException(message: String): RuntimeException(message) {
}