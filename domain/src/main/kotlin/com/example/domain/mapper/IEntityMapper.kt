package com.example.domain.mapper

interface IEntityMapper<T, S> {
    fun toEntity(data: S, targetClass: Class<T>): T
    fun toObject(data: T, targetClass: Class<S>): S
}