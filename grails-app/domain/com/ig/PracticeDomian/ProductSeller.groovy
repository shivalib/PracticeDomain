package com.ig.PracticeDomian

class ProductSeller {

    static belongsTo = [seller: Seller, product: Product]

    static constraints = {
    }
}
