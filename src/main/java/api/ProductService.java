package api;

import entity.Product;

import java.util.List;

public interface ProductService {
    List<Product> getAllProducts();
    Integer getNumberOfProducts();
    Product getProductByName(String productName); // if doesn't exist then null
    boolean productCountGraterThanZero(String productName);
    boolean isProductByName(String productName);
    boolean isProductById(Long id);
}
