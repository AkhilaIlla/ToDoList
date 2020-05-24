package com.sample.sampleproject.repository;

import com.sample.sampleproject.model.Product;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository @Primary
public interface ProductRepository extends JpaRepository<Product, Long> {
}
