package com.example.application.usecases

interface UseCaseExecute<U, I, O > {
    fun execute(input: I): O
}