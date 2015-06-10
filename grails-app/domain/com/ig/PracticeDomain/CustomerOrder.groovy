package com.ig.PracticeDomain

class CustomerOrder {
    String deliveryStatus
    Date dateCreated
    Date lastUpdated

    static belongsTo = [customer: Customer]

    static hasMany = [orderedProducts: OrderedProduct]

    static constraints = {
        deliveryStatus(nullable: true,blank: true)
    }
}
