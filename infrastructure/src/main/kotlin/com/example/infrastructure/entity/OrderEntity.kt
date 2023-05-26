package com.example.infrastructure.entity

import java.math.BigInteger
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.Table

@Table(name= "orders")
@Entity
class OrderEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Int? = null,

    @Column(name="name")
    var name: String = "",

    @Column(name = "quantity")
    var quantity: Int = 0,

    @Column(name = "color")
    var color: String = "",

    @Column(name = "price")
    var price: Double = 0.0,

    @Column(name = "currency")
    var currency: String = "",

    @Column(name = "customer_name")
    var customerName: String = "",

    @Column(name = "product_name")
    var productName: String = ""
)
