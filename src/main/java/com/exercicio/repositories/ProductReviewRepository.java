package com.exercicio.repositories;

import com.exercicio.models.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductReviewRepository extends JpaRepository<ProductCategory, Integer> {
}
