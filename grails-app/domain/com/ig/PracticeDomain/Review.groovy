package com.ig.PracticeDomain

class Review {
    Customer customer
    String title
    String description
    float numberOfStars

    static belongsTo = [product: Product]

    static constraints = {
        title(nullable: true, blank: true)
        description(nullable: true, blank: true)
    }
}
