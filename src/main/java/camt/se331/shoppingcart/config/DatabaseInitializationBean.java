package camt.se331.shoppingcart.config;

import camt.se331.shoppingcart.entity.Product;
import camt.se331.shoppingcart.repository.ProductRepository;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

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
                
        }
    }
}
