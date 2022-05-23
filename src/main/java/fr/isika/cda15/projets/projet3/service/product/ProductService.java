package fr.isika.cda15.projets.projet3.service.product;

import fr.isika.cda15.projets.projet3.entity.Product;
import fr.isika.cda15.projets.projet3.service.Service;

import java.util.List;

public interface ProductService extends Service<Product> {
    Product findProductById(Long id);
    List<Product> findAllProduct();
    List<Product> sortProductQuantity();
    List<Product> sortProductUnitPrice();
    List<Product> inStockProduct();
    List<Product> outStockProduct();
}
