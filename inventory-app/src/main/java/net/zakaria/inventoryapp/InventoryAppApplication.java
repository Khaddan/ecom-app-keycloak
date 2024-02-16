package net.zakaria.inventoryapp;

import net.zakaria.inventoryapp.entitie.Product;
import net.zakaria.inventoryapp.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.rmi.server.UID;
import java.util.UUID;

@SpringBootApplication
public class InventoryAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(InventoryAppApplication.class, args);
    }
    @Bean
    CommandLineRunner commandLineRunner (ProductRepository productRepository){
        return args -> {
            productRepository.save(Product.builder().id(UUID.randomUUID().toString()).name("Computer").price(9600).quantity(12).build());
            productRepository.save(Product.builder().id(UUID.randomUUID().toString()).name("Printer").price(2300).quantity(18).build());
            productRepository.save(Product.builder().id(UUID.randomUUID().toString()).name("Smart Phone").price(4500).quantity(10).build());
        };
    }

}
