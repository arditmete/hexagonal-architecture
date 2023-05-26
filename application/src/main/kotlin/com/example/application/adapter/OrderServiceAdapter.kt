package com.example.application.adapter

import com.example.application.service.IOrderService
import com.example.domain.data.Order
import com.example.domain.ports.DataPersistencePort
import org.springframework.stereotype.Service

@Service
class OrderServiceAdapter(
    private var dataPersistencePort: DataPersistencePort<Order>
): IOrderService {
    override fun save(data: Order): Order {
        return dataPersistencePort.save(data)
    }

    override fun delete(data: Order) {
        return dataPersistencePort.delete(data)
    }

    override fun update(data: Order): Order {
        return dataPersistencePort.update(data)
    }

    override fun getAll(): List<Order> {
        return dataPersistencePort.getAll()
    }

    override fun getById(id: Long): Order {
        return dataPersistencePort.getById(id)
    }
}