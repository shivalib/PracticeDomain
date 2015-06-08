package com.ig.PracticeDomain

class Delivery {
    String status
    Date dateCreated
    Date lastUpdated

    static belongsTo = [customerOrder: CustomerOrder]

    static constraints = {
        deliveryCharge(nullable: true)
        status(nullable: true, blank: true)
    }
}
