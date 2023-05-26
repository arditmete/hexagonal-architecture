package com.example.application.usecases.order.get

import com.example.application.service.IOrderService
import com.example.application.usecases.UseCaseExecute
import com.example.application.usecases.order.add.AddOrderInput
import com.example.domain.data.Order
import org.springframework.stereotype.Component

@Component
class GetOrdersUseCase(
    var orderService: IOrderService
): UseCaseExecute<Order, AddOrderInput?, GetOrdersOutput>() {
    override fun execute(input: AddOrderInput?): GetOrdersOutput {
        val orders = orderService.getAll()
        return GetOrdersOutput().apply {
            this.orders = orders
        }
    }
}