package camt.se331.shoppingcart.service;

import camt.se331.shoppingcart.entity.Product;

import java.util.List;

/**
 * Created by Dto on 2/7/2015.
 */
public interface ProductService {
    List<Product> getProductsByName(String name);
    List<Product> getProducts();
    Product getProduct(Long id);
    Product addProduct(Product product);
    Product deleteProduct(Long id);
    Product updateProduct(Product product);
}
