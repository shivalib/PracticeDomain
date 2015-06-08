package com.ig.PracticeDomain

class Customer {
    String firstName
    String lastName
    String username
    String password
    String email
    String contactNumber
    Address address

    static hasMany = [orderedProduct: CustomerOrder]

    static constraints = {
        username(nullable: false,blank: false)
        password(nullable: false,blank: false)
        email(email: true,unique: true)
        address(nullable: true)
        contactNumber(nullable: true,blank: true)
    }
}
