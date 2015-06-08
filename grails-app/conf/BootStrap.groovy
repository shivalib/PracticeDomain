import com.ig.PracticeDomain.Brand
import com.ig.PracticeDomain.CartProduct
import com.ig.PracticeDomain.Category
import com.ig.PracticeDomain.Customer
import com.ig.PracticeDomain.CustomerOrder
import com.ig.PracticeDomain.Discount
import com.ig.PracticeDomain.OrderedProduct
import com.ig.PracticeDomain.Product
import com.ig.PracticeDomain.ProductSeller
import com.ig.PracticeDomain.Review
import com.ig.PracticeDomain.Seller
import com.ig.PracticeDomain.ShoppingCart

class BootStrap {

    def init = { servletContext ->

        Brand brand = new Brand(name: 'Fastrack')
        brand.save(flush: true, failOnError: true)

        Product product1 = new Product(name: 'watch', brand: brand, price: 100, totalQuantity: 10, quantityAvailable: 10,
                parameters: [
                        styleCode    : '6107SL02 ',
                        strapMaterial: 'Leather Strap'
                ])
        product1.save(failOnError: true, flush: true)

        Product product2 = new Product(name: 'shoe', price: 200, brand: brand, totalQuantity: 10, quantityAvailable: 10,
                parameters: [
                        tipShape: 'round',
                        weight  : '116gm',
                        design  : 'Logo Detail'
                ])
        product2.save(failOnError: true, flush: true)

        Product product3 = new Product(name: 'maggi', price: 10, totalQuantity: 10, quantityAvailable: 10)
        product3.save(failOnError: true, flush: true)

        Discount discount = new Discount(discountAllowed: 25, product: product1)
        discount.save(flush: true, failOnError: true)

        Discount discount1 = new Discount(discountAllowed: 10, product: product2)
        discount1.save(flush: true, failOnError: true)

        Customer customer1 = new Customer(firstName: 'Shivali', lastName: 'Batra', username: 'sample', password: '1234', email: 'abc@gmail.com')
        customer1.save(failOnError: true, flush: true)

        Customer customer2 = new Customer(firstName: 'Nitish', lastName: 'Khureja', username: 'sample', password: '1234', email: 'def@gmail.com')
        customer2.save(failOnError: true, flush: true)

        Category category1 = new Category(name: 'Clothes')
        category1.save(flush: true, failOnError: true)

        Category category2 = new Category(name: 'Men', parentCategory: category1)
        category2.save(flush: true, failOnError: true)

        Category category3 = new Category(name: 'Women', parentCategory: category1)
        category3.save(flush: true, failOnError: true)

        Category category4 = new Category(name: 'Kids', parentCategory: category1)
        category4.save(flush: true, failOnError: true)

        Review review1 = new Review(customer: customer1, product: product1, title: 'title', description: 'blah blah', numberOfStars: 4)
        review1.save(failOnError: true, flush: true)

        Review review2 = new Review(customer: customer2, product: product1, title: 'title', description: 'blah blah', numberOfStars: 3)
        review2.save(failOnError: true, flush: true)

        CustomerOrder customerOrder2 = new CustomerOrder(customer: customer2)
        customerOrder2.save(failOnError: true, flush: true)

        OrderedProduct orderedProduct = new OrderedProduct(customerOrder: customerOrder2, product: product3, quantity: 3, price: product3.price)
        orderedProduct.save(failOnError: true, flush: true)

        OrderedProduct orderedProduct3 = new OrderedProduct(customerOrder: customerOrder2, product: product2, quantity: 5, price: product2.price)
        orderedProduct3.save(failOnError: true, flush: true)

        ShoppingCart shoppingCart = new ShoppingCart(customer: customer1)
        shoppingCart.save(failOnError: true, flush: true)

        CartProduct cartProduct = new CartProduct(shoppingCart: shoppingCart, product: product1, quantity: 2)
        cartProduct.save(failOnError: true, flush: true)
        CartProduct cartProduct1 = new CartProduct(shoppingCart: shoppingCart, product: product2, quantity: 5)
        cartProduct1.save(failOnError: true, flush: true)


        Seller seller = new Seller(name: 'seller1')
        seller.save(failOnError: true, flush: true)
        ProductSeller productSeller=new ProductSeller(seller:seller,product: product1)
        productSeller.save(failOnError: true,flush: true)
        ProductSeller productSeller1=new ProductSeller(seller:seller,product: product2)
        productSeller.save(failOnError: true,flush: true)


    }
    def destroy = {
    }
}
