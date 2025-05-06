package com.k_stock.kstock.controller;

import com.k_stock.kstock.model.dto.request.ProductRequest;
import com.k_stock.kstock.service.ProductService;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/api/product")
public class ProductController {
    private final ProductService productService;
    public ProductController (ProductService productService) {
        this.productService = productService;
    }

    @PostMapping("")
    public ResponseEntity<String> createProduct(
            @Valid @RequestBody ProductRequest request
            ) {
        String response = productService.createProduct(request);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }
}