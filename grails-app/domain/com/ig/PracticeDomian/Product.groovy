package com.ig.PracticeDomian

class Product {
    String name
    String description
    String modelNo
    float price
    int quantityAvailable
    int totalQuantity
    String imagePath
    Map parameters
    Discount discount
    Category category
    Brand brand
    Date dateCreated
    Date lastUpdated

    static belongsTo = Seller

    static hasMany = [productSellers: ProductSeller, orderedProduct: OrderedProduct,reviews:Review]

    static constraints = {
        name(nullable: true, blank: true)
        description(nullable: true, blank: true)
        modelNo(nullable: true, blank: true)
        category(nullable: true)
        imagePath(nullable: true, blank: true)
        brand(nullable: true)
        discount(nullable: true)
    }

    static mapping = {
    }
}
