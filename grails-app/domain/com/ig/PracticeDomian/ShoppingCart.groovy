package com.ig.PracticeDomian

class ShoppingCart {
    int quantity
    int price
    Date dateCreated
    Date lastUpdated

    static belongsTo = [customer: Customer]

    static hasMany = [products: Product]

    static constraints = {
    }
}
