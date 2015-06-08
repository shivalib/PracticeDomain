package com.ig.PracticeDomain

class ProductSeller {

    static belongsTo = [seller: Seller, product: Product]

    static constraints = {
    }
}
