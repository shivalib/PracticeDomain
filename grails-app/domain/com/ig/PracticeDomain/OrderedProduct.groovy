package com.ig.PracticeDomain

class OrderedProduct {
    int quantity
    int price
    def totalPrice

    static belongsTo = [product: Product, customerOrder: CustomerOrder]

    static constraints = {
        totalPrice formula: "quantity * price"
    }


}
