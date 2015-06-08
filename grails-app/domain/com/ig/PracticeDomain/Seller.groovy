package com.ig.PracticeDomain

class Seller {
    String name
    String contactNumber

    static hasMany = [productSellers: ProductSeller]

    static constraints = {
        contactNumber(nullable: true, blank: true)
    }
}
