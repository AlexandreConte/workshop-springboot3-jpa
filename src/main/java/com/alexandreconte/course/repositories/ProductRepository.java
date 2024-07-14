package com.alexandreconte.course.repositories;

import com.alexandreconte.course.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
