package com.ig.PracticeDomain

class CustomerOrder {
    Delivery delivery
    Date dateCreated
    Date lastUpdated

    static belongsTo = [customer: Customer]

    static hasMany = [orderedProducts: OrderedProduct]

    static constraints = {
    }
}
