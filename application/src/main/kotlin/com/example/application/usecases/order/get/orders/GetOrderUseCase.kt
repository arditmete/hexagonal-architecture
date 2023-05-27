package com.example.application.usecases.order.get.orders

import com.example.application.service.IOrderService
import com.example.application.usecases.UseCaseExecute
import com.example.domain.data.Order
import com.example.domain.mapper.IEntityMapper
import org.springframework.stereotype.Component

@Component
class GetOrderUseCase(
    var orderService: IOrderService,
    var orderMapper: IEntityMapper<GetOrderOutput, Order>
): UseCaseExecute<GetOrderInput?, GetOrderOutput> {
    override fun execute(input: GetOrderInput?): GetOrderOutput {
        val order = orderService.getById(input?.id?.toLong()!!)
        return orderMapper.toEntity(order, GetOrderOutput::class.java)
    }
}