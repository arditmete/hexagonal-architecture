package com.example.application.rest

import com.example.application.usecases.order.add.AddOrderInput
import com.example.application.usecases.order.add.AddOrderOutput
import com.example.application.usecases.order.add.AddOrderUseCase
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("order/")
class OrderController(
    @Qualifier("addOrderUseCase") var addOrderUseCase: AddOrderUseCase
) {

    @PostMapping("add")
    fun addOrder(@RequestBody addOrderInput: AddOrderInput): AddOrderOutput {
        return addOrderUseCase.execute(addOrderInput)
    }
}