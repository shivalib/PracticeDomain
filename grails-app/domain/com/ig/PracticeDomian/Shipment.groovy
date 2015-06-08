package com.ig.PracticeDomian

class Shipment {
    String status
    Date dateOfShipment

    static constraints = {
        status(nullable: true, blank: true)
    }
}
