package com.ig.PracticeDomain

class Customer {
    String firstName
    String lastName
    String username
    String password
    String email
    String contactNumber
    Address address

    static hasMany = [customerOrder: CustomerOrder]

    static constraints = {
        email(email: true, unique: true)
    }
}
