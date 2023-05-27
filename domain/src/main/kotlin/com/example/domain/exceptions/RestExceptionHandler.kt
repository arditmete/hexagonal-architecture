package com.example.domain.exceptions

import org.springframework.http.HttpStatus
import org.springframework.web.bind.MethodArgumentNotValidException
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestControllerAdvice

@RestControllerAdvice
class RestExceptionHandler {
    @ExceptionHandler(CustomException::class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    fun handleCustomException(e: CustomException): ErrorResponse? {
        return ErrorResponse(e.errorCode, e.details)
    }

    @ExceptionHandler(MethodArgumentNotValidException::class)
    @ResponseStatus(value = HttpStatus.BAD_REQUEST)
    fun handleRequestBodyNotValidException(exception: MethodArgumentNotValidException): ErrorResponse? {
        return ErrorResponse(ErrorCode.INCORRECT_REQUEST_BODY.message, ErrorCode.INCORRECT_REQUEST_BODY.code)
    }
}
data class ErrorResponse(var details: String, var code: String)