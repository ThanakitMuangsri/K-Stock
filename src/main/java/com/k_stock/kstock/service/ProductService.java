package com.k_stock.kstock.service;

import com.k_stock.kstock.entity.Product;
import com.k_stock.kstock.model.dto.request.ProductRequest;
import com.k_stock.kstock.repository.ProductRepository;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public String createProduct(ProductRequest request){
        Product product = new Product();
        product.setProductName(request.getProductName());
        product.setStock(request.getStock());
        product.setPrice(request.getPrice());

        productRepository.save(product);
        return "Success!!";
    }
}
