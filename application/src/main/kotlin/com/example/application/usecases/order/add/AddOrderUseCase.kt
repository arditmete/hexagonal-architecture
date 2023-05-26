package com.example.application.usecases.order.add

import com.example.application.service.IOrderService
import com.example.application.usecases.UseCaseExecute
import com.example.domain.data.Order
import com.example.domain.mapper.IEntityMapper
import org.springframework.stereotype.Component

@Component
class AddOrderUseCase(
    var orderService: IOrderService,
    var orderMapperInput: IEntityMapper<Order, AddOrderInput>,
    var orderMapperOutput: IEntityMapper<Order, AddOrderOutput>
) : UseCaseExecute<AddOrderInput, AddOrderOutput> {
    override fun execute(input: AddOrderInput): AddOrderOutput {
        val order = orderMapperInput.toEntity(input, Order::class.java)
        orderService.save(order)
        return orderMapperOutput.toObject(order, AddOrderOutput::class.java)
    }
}


