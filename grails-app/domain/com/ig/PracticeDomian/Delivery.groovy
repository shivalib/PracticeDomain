package com.ig.PracticeDomian

class Delivery {
    int deliveryCharge
    String status
    Date dateCreated
    Date lastUpdated

    static belongsTo = [orderedProduct:CustomerOrder]

    static constraints = {
        status(nullable: true,blank: true)
    }
}
