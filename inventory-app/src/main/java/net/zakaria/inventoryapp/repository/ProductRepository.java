package net.zakaria.inventoryapp.repository;

import net.zakaria.inventoryapp.entitie.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product , String> {
}
