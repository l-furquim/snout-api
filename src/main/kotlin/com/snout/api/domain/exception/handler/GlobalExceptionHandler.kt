package com.snout.api.domain.exception.handler

import com.snout.api.domain.exception.NoContentNoteException
import com.snout.api.domain.exception.body.GlobalExceptionBody
import jakarta.servlet.http.HttpServletRequest
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestControllerAdvice

@RestControllerAdvice
class GlobalExceptionHandler {

    @ExceptionHandler(Exception::class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    fun handleNoContentNote(
        exception: Exception,
        request: HttpServletRequest
    ): GlobalExceptionBody {
        return GlobalExceptionBody(
            errorMessage = exception.message,
            status = HttpStatus.INTERNAL_SERVER_ERROR.value(),
            url = request.servletPath
        )
    }

}