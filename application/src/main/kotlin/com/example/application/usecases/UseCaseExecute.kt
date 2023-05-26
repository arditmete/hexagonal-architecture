package com.example.application.usecases

interface UseCaseExecute<I, O> {
     fun execute(input: I): O
}