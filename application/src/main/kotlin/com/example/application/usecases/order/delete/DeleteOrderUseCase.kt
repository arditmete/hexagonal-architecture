package com.example.application.usecases.order.delete

import com.example.application.usecases.UseCaseExecute
import com.example.domain.data.Order
import com.example.domain.mapper.IEntityMapper
import com.example.domain.service.impl.OrderService
import org.springframework.stereotype.Component

@Component
class DeleteOrderUseCase(
    var orderService: OrderService,
    var orderMapper: IEntityMapper<Order, DeleteOrderInput >
) :
    UseCaseExecute<DeleteOrderUseCase, DeleteOrderInput, DeleteOrderOutput> {
    override fun execute(input: DeleteOrderInput): DeleteOrderOutput {
        val order= orderMapper.toEntity(input, Order::class.java)
        orderService.delete(order)
        return DeleteOrderOutput().apply {
            this.message = "Deleted"
        }
    }
}


