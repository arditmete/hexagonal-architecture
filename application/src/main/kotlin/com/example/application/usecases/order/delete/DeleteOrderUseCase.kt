package com.example.application.usecases.order.delete

import com.example.application.service.IOrderService
import com.example.application.usecases.UseCaseExecute
import com.example.domain.data.Order
import com.example.domain.mapper.IEntityMapper
import org.springframework.stereotype.Component

@Component
class DeleteOrderUseCase(
    var orderService: IOrderService
) : UseCaseExecute<DeleteOrderInput, DeleteOrderOutput> {
    override fun execute(input: DeleteOrderInput): DeleteOrderOutput {
        val order = orderService.getById(input.id.toLong())
        orderService.delete(order)
        return DeleteOrderOutput().apply {
            this.message = "Deleted"
        }
    }
}


