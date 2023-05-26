package com.example.application.service

import com.example.domain.data.Order

interface IOrderService{
    fun save(data: Order): Order
    fun delete(data: Order)
    fun update(data: Order): Order
    fun getAll(): List<Order>
    fun getById(id: Long): Order
}