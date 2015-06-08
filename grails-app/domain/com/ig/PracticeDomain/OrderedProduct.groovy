package com.ig.PracticeDomain

class OrderedProduct {
    int quantity
    int price
    Delivery delivery

    static belongsTo = [product: Product, customerOrder: CustomerOrder]

    static constraints = {
        delivery(nullable: true)
    }
}
