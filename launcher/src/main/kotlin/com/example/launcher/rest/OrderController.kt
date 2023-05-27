package com.example.launcher.rest

import com.example.application.usecases.order.add.AddOrderInput
import com.example.application.usecases.order.add.AddOrderOutput
import com.example.application.usecases.order.add.AddOrderUseCase
import com.example.application.usecases.order.delete.DeleteOrderInput
import com.example.application.usecases.order.delete.DeleteOrderOutput
import com.example.application.usecases.order.delete.DeleteOrderUseCase
import com.example.application.usecases.order.get.order.GetOrdersUseCase
import com.example.application.usecases.order.get.order.GetOrdersOutput
import com.example.application.usecases.order.get.orders.GetOrderInput
import com.example.application.usecases.order.get.orders.GetOrderOutput
import com.example.application.usecases.order.get.orders.GetOrderUseCase
import com.example.application.usecases.order.update.UpdateOrderInput
import com.example.application.usecases.order.update.UpdateOrderOutput
import com.example.application.usecases.order.update.UpdateOrderUseCase
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("orders")
class OrderController(
    var addOrderUseCase: AddOrderUseCase,
    var getOrdersUseCase: GetOrdersUseCase,
    var deleteOrderUseCase: DeleteOrderUseCase,
    var updateOrderUseCase: UpdateOrderUseCase,
    var getOrderUseCase: GetOrderUseCase
) {

    @GetMapping("{id}")
    fun getOrder(@PathVariable id: String): GetOrderOutput {
        return getOrderUseCase.execute(GetOrderInput(id))
    }

    @GetMapping
    fun getOrders(): GetOrdersOutput {
        return getOrdersUseCase.execute(null)
    }

    @PostMapping("/add")
    fun addOrder(@RequestBody addOrderInput: AddOrderInput): AddOrderOutput {
        return addOrderUseCase.execute(addOrderInput)
    }

    @PostMapping("/delete")
    fun delete(@RequestBody deleteOrderInput: DeleteOrderInput): DeleteOrderOutput {
        return deleteOrderUseCase.execute(deleteOrderInput)
    }

    @PostMapping("/update")
    fun update(@RequestBody updateOrderInput: UpdateOrderInput): UpdateOrderOutput {
        return updateOrderUseCase.execute(updateOrderInput)
    }
}