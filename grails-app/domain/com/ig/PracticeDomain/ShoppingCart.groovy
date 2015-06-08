package com.ig.PracticeDomain

class ShoppingCart {
    Date dateCreated
    Date lastUpdated

    static belongsTo = [customer: Customer]

    static hasMany = [cartProduct:CartProduct]

    static constraints = {
    }
}
