package camt.se331.shoppingcart.repository;

import camt.se331.shoppingcart.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by stick on 2015/4/7.
 */
public interface ProductRepository extends JpaRepository<Product,Long> {
}
