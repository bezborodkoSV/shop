package com.example.shop.service;

import com.example.shop.model.Product;
import com.example.shop.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public boolean createProduct(Product product) {
        productRepository.save(product);
        return true;
    }

    public boolean deleteProduct(Product product) {
        try {
            productRepository.delete(product);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean updateProduct(Product product){

        return true;
    }

    public List<Product> getListProduct(){
        return productRepository.findAll();
    }
}
