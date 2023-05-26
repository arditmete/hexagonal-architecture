package com.example.domain.ports

interface DataPersistencePort<T> {
    fun save(data: T): T
    fun delete(data: T)
    fun update(data: T): T
    fun getAll(): List<T>
    fun getById(id: Long): T
}