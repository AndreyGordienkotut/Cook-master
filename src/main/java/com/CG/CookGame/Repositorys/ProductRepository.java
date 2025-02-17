package com.CG.CookGame.Repositorys;

import com.CG.CookGame.Models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {
    boolean existsByName(String name);
}
