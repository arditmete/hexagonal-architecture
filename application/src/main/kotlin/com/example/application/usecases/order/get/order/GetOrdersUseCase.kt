package com.example.application.usecases.order.get.order

import com.example.application.service.IOrderService
import com.example.application.usecases.UseCaseExecute
import com.example.application.usecases.order.add.AddOrderInput
import com.example.application.usecases.order.get.orders.GetOrderInput
import org.springframework.stereotype.Component

@Component
class GetOrdersUseCase(
    var orderService: IOrderService
): UseCaseExecute<GetOrderInput?, GetOrdersOutput> {
    override fun execute(input: GetOrderInput?): GetOrdersOutput { //TODO check this one
        val orders = orderService.getAll()
        return GetOrdersOutput().apply {
            this.orders = orders
        }
    }
}