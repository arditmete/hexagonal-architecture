package com.example.infrastructure.adapter

import com.example.domain.data.Order
import com.example.domain.exceptions.CustomException
import com.example.domain.exceptions.ErrorCode
import com.example.domain.mapper.IEntityMapper
import com.example.domain.ports.DataPersistencePort
import com.example.infrastructure.entity.OrderEntity
import com.example.infrastructure.repo.OrderRepository
import org.springframework.stereotype.Service

@Service
class OrderJpaAdapter(
    var orderRepository: OrderRepository,
    var orderMapper: IEntityMapper<OrderEntity, Order>
):DataPersistencePort<Order> {
    override fun save(data: Order): Order {
        val orderEntity = orderMapper.toEntity(data, OrderEntity::class.java)
        val orderCreated = orderRepository.save(orderEntity)
        return orderMapper.toObject(orderCreated, Order::class.java)
    }

    override fun delete(data: Order){
        val orderEntity = orderMapper.toEntity(data, OrderEntity::class.java)
        orderRepository.delete(orderEntity)
    }

    override fun update(data: Order): Order {
        val orderEntity = orderMapper.toEntity(data, OrderEntity::class.java)
        val orderCreated = orderRepository.save(orderEntity)
        return orderMapper.toObject(orderCreated, Order::class.java)
    }

    override fun getAll(): List<Order> {
        val entityOrders= orderRepository.findAll()
        return entityOrders.map { orderMapper.toObject(it, Order::class.java) }
    }

    override fun getById(id: Long): Order {
        val orderEntity = orderRepository.findById(id.toInt())
        if (orderEntity.isEmpty) throw CustomException(ErrorCode.ORDER_NOT_FOUND)
        return orderMapper.toObject(orderEntity.get(), Order::class.java)
    }
}