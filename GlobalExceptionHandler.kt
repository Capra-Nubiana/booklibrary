package com.example.booklibrary

import org.springframework.http.HttpStatus
import org.springframework.web.bind.MethodArgumentNotValidException
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.RestControllerAdvice
import org.springframework.web.server.ResponseStatusException

@RestControllerAdvice
class GlobalExceptionHandler {

    @ExceptionHandler(MethodArgumentNotValidException::class)
    fun handleValidation(ex: MethodArgumentNotValidException): Map<String, String?> {
        val errors = ex.bindingResult.fieldErrors.associate { it.field to it.defaultMessage }
        return mapOf("errors" to errors.toString())
    }

    @ExceptionHandler(ResponseStatusException::class)
    fun handleNotFound(ex: ResponseStatusException): Map<String, String?> {
        return mapOf("error" to ex.reason)
    }
}
