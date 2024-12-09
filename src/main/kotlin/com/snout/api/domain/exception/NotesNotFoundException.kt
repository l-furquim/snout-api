package com.snout.api.domain.exception

import java.lang.RuntimeException

class NotesNotFoundException(message: String): RuntimeException(message) {
}