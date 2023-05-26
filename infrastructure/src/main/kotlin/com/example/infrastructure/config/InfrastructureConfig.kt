package com.example.infrastructure.config

import com.example.domain.data.Order
import com.example.domain.mapper.IEntityMapper
import com.example.domain.ports.DataPersistencePort
import com.example.infrastructure.adapter.OrderJpaAdapter
import com.example.infrastructure.entity.OrderEntity
import com.example.infrastructure.repo.OrderRepository
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class InfrastructureConfig {
    @Bean
    fun dataPersistencePort(
        orderRepository: OrderRepository,
        orderMapper: IEntityMapper<OrderEntity, Order>
    ): DataPersistencePort<Order>{
        return OrderJpaAdapter(orderRepository, orderMapper)
    }
}