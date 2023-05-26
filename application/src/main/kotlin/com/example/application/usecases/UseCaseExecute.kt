package com.example.application.usecases

abstract class UseCaseExecute<I, O> {
    abstract fun execute(input: I): O
}