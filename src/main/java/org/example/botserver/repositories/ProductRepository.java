package org.example.botserver.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.example.botserver.models.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
