package com.ig.PracticeDomain

class Address {
    String streetNo
    String landmark
    String state
    String city
    String country
    String pincode

    static belongsTo = [Customer]

    static constraints = {
        landmark(nullable: true, blank: true)
    }
}
