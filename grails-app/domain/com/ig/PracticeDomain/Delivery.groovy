package com.ig.PracticeDomain

class Delivery {
    String status
    Date dateCreated
    Date lastUpdated

    static belongsTo = [CustomerOrder]

    static constraints = {
    }
}
