package com.ig.PracticeDomain

class Wishlist {

    static hasMany = [products: Product]

    static belongsTo = [customer: Customer]

    static constraints = {
    }
}
