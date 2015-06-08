package com.ig.PracticeDomian

class Seller {
    String name
    String contactNumber

    static hasMany = [products:Product,productSellers:ProductSeller]

    static constraints = {
        products(nullable: true)
        contactNumber(nullable: true,blank: true)
    }
}
