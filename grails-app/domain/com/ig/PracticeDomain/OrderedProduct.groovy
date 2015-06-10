package com.ig.PracticeDomain

class OrderedProduct {
    int quantity
    int price

    static belongsTo = [product: Product, customerOrder: CustomerOrder]

    static constraints = {
    }


}
