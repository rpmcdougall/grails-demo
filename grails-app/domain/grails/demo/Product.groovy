package grails.demo

import org.grails.datastore.gorm.*

class Product implements GormEntity<Product>{

    String name
    Double price

    static constraints = {
        name blank:false
        price range:0.0..1000.00
    }
}
