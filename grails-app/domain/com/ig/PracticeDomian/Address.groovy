package com.ig.PracticeDomian

class Address {
    String streetNo
    String landmark
    String state
    String city
    String country
    String pincode

    static constraints = {
        streetNo(nullable: true, blank: true)
        landmark(nullable: true, blank: true)
        state(nullable: true, blank: true)
        city(nullable: true, blank: true)
        country(nullable: true, blank: true)
        pincode(nullable: true, blank: true)
    }
}
