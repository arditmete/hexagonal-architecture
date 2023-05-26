package com.example.application.usecases.order.add

data class AddOrderOutput (
    var name: String = "",
    var quantity: Int = 0,
    var productName: String = "",
    var customerName: String = "",
    var color: String = "",
    var price: Double = 0.0,
    var currency: String = ""
)