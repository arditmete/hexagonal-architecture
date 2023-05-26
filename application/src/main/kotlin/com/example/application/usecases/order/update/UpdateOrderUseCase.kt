package com.example.application.usecases.order.update

import com.example.application.service.IOrderService
import com.example.application.usecases.UseCaseExecute
import com.example.domain.data.Order
import com.example.domain.mapper.IEntityMapper
import org.springframework.stereotype.Component

@Component
class UpdateOrderUseCase(
    var orderService: IOrderService,
    var orderMapperOutput: IEntityMapper<Order, UpdateOrderOutput>,
    var orderMapperInput: IEntityMapper<Order, UpdateOrderInput>
): UseCaseExecute<UpdateOrderInput, UpdateOrderOutput> {
    override fun execute(input: UpdateOrderInput): UpdateOrderOutput {
        val order = orderMapperInput.toEntity(input, Order::class.java)
        val orderFound = orderService.getById(order.id.toLong())
        orderFound.apply {
            this.quantity = order.quantity
            this.customerName = order.customerName
            this.color = order.color
            this.price = order.price
            this.productName = order.productName
            this.currency = order.currency
            this.productName = order.productName
            this.name = order.name
        }
        val orderUpdated = orderService.update(orderFound)
        return orderMapperOutput.toObject(orderUpdated, UpdateOrderOutput::class.java)
    }
}