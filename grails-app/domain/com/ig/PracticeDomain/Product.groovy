package com.ig.PracticeDomain

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

    static belongsTo = [Seller, ShoppingCart]

    static hasMany = [productSellers: ProductSeller, orderedProduct: OrderedProduct, reviews: Review]

    static constraints = {
        modelNo(nullable: true, blank: true)
        imagePath(nullable: true, blank: true)
        brand(nullable: true)
        discount(nullable: true,blank:true)
    }

    static mapping = {
    }
}
