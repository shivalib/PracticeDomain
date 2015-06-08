package com.ig.PracticeDomian

class CustomerOrder {
    Delivery delivery
    Date dateCreated
    Date lastUpdated

    static belongsTo = [customer: Customer]

    static hasMany = [orderedProducts: OrderedProduct]

    static constraints = {
        delivery(nullable: true)
    }
}
