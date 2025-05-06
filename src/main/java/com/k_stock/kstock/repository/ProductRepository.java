package com.k_stock.kstock.repository;

import com.k_stock.kstock.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
