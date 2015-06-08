package com.ig.PracticeDomain

class Delivery {
    def deliveryCharge
    String status
    Date dateCreated
    Date lastUpdated

    static belongsTo = [orderedProduct: CustomerOrder]

    static constraints = {
        status(nullable: true, blank: true)
    }
}
