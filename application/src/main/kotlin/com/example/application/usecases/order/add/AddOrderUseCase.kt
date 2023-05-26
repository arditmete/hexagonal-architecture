package com.example.application.usecases.order.add

import com.example.application.service.IOrderService
import com.example.application.usecases.UseCaseExecute
import com.example.domain.data.Order
import com.example.domain.mapper.IEntityMapper
import org.springframework.stereotype.Component

@Component
class AddOrderUseCase(
    var orderService: IOrderService,
    var orderMapper: IEntityMapper<AddOrderOutput, Order, >
): UseCaseExecute<AddOrderInput, AddOrderOutput>() {
        override fun execute(input: AddOrderInput): AddOrderOutput {
                val order = (Order().apply {
                    this.name = input.name
                    this.color = input.color
                    this.currency = input.currency
                    this.customerName = input.customerName
                    this.productName = input.productName
                    this.quantity = input.quantity
                })
            orderService.save(order)
            val orderEntity = orderMapper.toEntity(order, AddOrderOutput::class.java)
              return AddOrderOutput().apply {
                  this.name = orderEntity.name
                  this.color = orderEntity.color
                  this.currency = orderEntity.currency
                  this.customerName = orderEntity.customerName
                  this.productName = orderEntity.productName
                  this.quantity = orderEntity.quantity
              }
        }
}


