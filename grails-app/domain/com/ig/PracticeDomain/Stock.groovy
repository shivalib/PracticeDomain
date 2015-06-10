package com.ig.PracticeDomain

class Stock {
    int totalQuantity

    static hasMany = [product: Product]

    static constraints = {
    }
}
