package com.ig.PracticeDomain

class Wishlist {
    Customer customer

    static hasMany = [products: Product]

    static constraints = {
    }
}
