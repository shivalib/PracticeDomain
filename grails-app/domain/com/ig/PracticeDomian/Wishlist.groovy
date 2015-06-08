package com.ig.PracticeDomian

class Wishlist {
    Customer customer

    static hasMany = [products: Product]

    static constraints = {
    }
}
