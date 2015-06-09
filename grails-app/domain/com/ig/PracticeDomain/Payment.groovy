package com.ig.PracticeDomain

class Payment {
    PaymentMethod method

    static belongsTo = [customer: Customer]

    static constraints = {
    }
}
