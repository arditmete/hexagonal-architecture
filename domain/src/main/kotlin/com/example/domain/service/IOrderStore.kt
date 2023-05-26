package com.example.domain.service

import com.example.domain.data.Order
import com.example.domain.ports.DataPersistencePort

interface IOrderStore{
    fun save(data: Order): Order
    fun delete(data: Order)
    fun update(data: Order): Order
    fun getAll(): List<Order>
    fun getById(id: Long): Order
}