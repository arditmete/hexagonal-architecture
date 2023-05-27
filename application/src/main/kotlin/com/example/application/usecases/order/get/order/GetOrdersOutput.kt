package com.example.application.usecases.order.get.order

import com.example.domain.data.Order

data class GetOrdersOutput(
    var orders: List<Order> = listOf()
)