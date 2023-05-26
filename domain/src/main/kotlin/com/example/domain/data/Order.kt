package com.example.domain.data

data class Order (
        var id: String = "",
        var name: String = "",
        var quantity: Int = 0,
        var productName: String = "",
        var customerName: String = "",
        var color: String = "",
        var price: Double = 0.0,
        var currency: String = ""
)