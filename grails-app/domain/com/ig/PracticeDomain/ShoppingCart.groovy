package com.ig.PracticeDomain

class ShoppingCart {
    Date dateCreated
    Date lastUpdated

    static belongsTo = [customer: Customer]

    static hasMany = [cartProducts:CartProduct]

    static constraints = {
    }
}
