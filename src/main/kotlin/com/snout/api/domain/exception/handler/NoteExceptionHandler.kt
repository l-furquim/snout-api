package com.snout.api.domain.exception.handler

import com.snout.api.domain.exception.NoContentNoteException
import com.snout.api.domain.exception.NoteIdNullException
import com.snout.api.domain.exception.NoteNotFoundException
import com.snout.api.domain.exception.NotesNotFoundException
import com.snout.api.domain.exception.body.GlobalExceptionBody
import jakarta.servlet.http.HttpServletRequest
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestControllerAdvice

@RestControllerAdvice
class NoteExceptionHandler {

    @ExceptionHandler(NoContentNoteException::class)
    @ResponseStatus(HttpStatus.UNAUTHORIZED)
    fun handleNoContentNote(
        exception: NoContentNoteException,
        request: HttpServletRequest
    ): GlobalExceptionBody {
        return GlobalExceptionBody(
            errorMessage = exception.message,
            status = HttpStatus.UNAUTHORIZED.value(),
            url = request.servletPath
        )
    }

    @ExceptionHandler(NoteNotFoundException::class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    fun handleNoteNotFound(
        exception: NoteNotFoundException,
        request: HttpServletRequest
    ): GlobalExceptionBody {
        return GlobalExceptionBody(
            errorMessage = exception.message,
            status = HttpStatus.NOT_FOUND.value(),
            url = request.servletPath
        )
    }
    @ExceptionHandler(NoteIdNullException::class)
    @ResponseStatus(HttpStatus.UNAUTHORIZED)
    fun noteIdNullException(
        exception: NoteIdNullException,
        request: HttpServletRequest
    ): GlobalExceptionBody {
        return GlobalExceptionBody(
            errorMessage = exception.message,
            status = HttpStatus.UNAUTHORIZED.value(),
            url = request.servletPath
        )
    }

    @ExceptionHandler(NotesNotFoundException::class)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    fun notesNotFoundException(
        exception: NotesNotFoundException,
        request: HttpServletRequest
    ): GlobalExceptionBody {
        return GlobalExceptionBody(
            errorMessage = exception.message,
            status = HttpStatus.NO_CONTENT.value(),
            url = request.servletPath
        )
    }

}