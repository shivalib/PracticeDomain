package com.ig.PracticeDomain

class CartProduct {
    int quantity
    Product product

    static belongsTo = [shoppingCart:ShoppingCart]

    static constraints = {

    }
}
