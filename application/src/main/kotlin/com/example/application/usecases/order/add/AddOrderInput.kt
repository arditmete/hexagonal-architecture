package com.example.application.usecases.order.add

data class AddOrderInput (
    var name: String,
    var quantity: Int,
    var productName: String,
    var customerName: String,
    var color: String,
    var price: Double,
    var currency: String
)