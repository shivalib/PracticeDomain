package com.ig.PracticeDomian

class OrderedProduct {
    int quantity
    int price

    static belongsTo = [product: Product, customerOrder: CustomerOrder]

    static constraints = {
    }
}
