package com.example.application.usecases.order.get

import com.example.domain.data.Order

data class GetOrdersOutput(
    var orders: List<Order> = listOf()
)