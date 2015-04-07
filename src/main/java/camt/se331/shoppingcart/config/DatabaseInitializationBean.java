package camt.se331.shoppingcart.config;

import camt.se331.shoppingcart.entity.Product;
import camt.se331.shoppingcart.repository.ProductRepository;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * Created by LIN LI on 4/7/2015.
 */
@Component
@Profile("db.init")

public class DatabaseInitializationBean implements InitializingBean {
    @Autowired
    ProductRepository productRepository;
    @Override
    public void afterPropertiesSet() throws Exception{
        Product [] initProduct={
                new Product(1l,"Kindle","the good book reader",6900.00),
                new Product(2l,"Surface Pro","the unknow computer",34000.00),
                new Product(3l,"Mac pro","Mac book interim",44000.00),
                new Product(4l,"Candle","Use for lightenup the world",10.00),
                new Product(5l,"Bin","User for what ?",200.00),
                new Product(6l,"Telephone","call the others",150.00),
                new Product(7l,"iPhone","what it is ?",26000.00),
                new Product(8l,"Galaxy Note 4","Who still use this ?",24000.00),
                new Product(9l,"AngularJS","We hate it",2000.00),
                new Product(10l,"Mazda","Very handsome guy use this",300000.00)
        };
        productRepository.save(Arrays.asList(initProduct));
        productRepository.save(new Product(1l,"Kindle","the good book reader",6900.00));
    }
}
