package com.example.domain.service.impl

import com.example.domain.data.Order
import com.example.domain.service.IOrderStore
import org.springframework.stereotype.Service

@Service
class OrderService(
    val orderStore: IOrderStore
) {
     fun save(data: Order): Order {
       return orderStore.save(data)
    }

     fun delete(data: Order) {
        return orderStore.delete(data)
    }

     fun update(data: Order): Order {
        return orderStore.update(data)
    }

     fun getAll(): List<Order> {
        return orderStore.getAll()
    }

     fun getById(id: Long): Order {
        return orderStore.getById(id)
    }
}