package com.snout.api.domain.exception

import java.lang.RuntimeException

class NoteNotFoundException(message: String): RuntimeException(message) {
}