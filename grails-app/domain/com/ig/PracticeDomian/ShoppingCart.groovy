package com.ig.PracticeDomian

class ShoppingCart {
    Date dateCreated
    Date lastUpdated

    static belongsTo = [customer: Customer]
    static hasMany = [products: Product]

    static constraints = {
    }
}
