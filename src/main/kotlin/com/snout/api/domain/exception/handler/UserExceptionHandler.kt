package com.snout.api.domain.exception.handler

import com.snout.api.domain.exception.NewUserUnnContentException
import com.snout.api.domain.exception.NoContentNoteException
import com.snout.api.domain.exception.body.GlobalExceptionBody
import jakarta.servlet.http.HttpServletRequest
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestControllerAdvice


@RestControllerAdvice
class UserExceptionHandler {

    @ExceptionHandler(NewUserUnnContentException::class)
    @ResponseStatus(HttpStatus.UNAUTHORIZED)
    fun handleUnnNewUser(
        exception: NewUserUnnContentException,
        request: HttpServletRequest
    ): GlobalExceptionBody {
        return GlobalExceptionBody(
            errorMessage = exception.message,
            status = HttpStatus.UNAUTHORIZED.value(),
            url = request.servletPath
        )
    }
}