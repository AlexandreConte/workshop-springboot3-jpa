package com.alexandreconte.course.repositories;

import com.alexandreconte.course.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
