package com.example.productcatelogservice_jul2025.controllers;


import com.example.productcatelogservice_jul2025.dtos.ProductDto;
import com.example.productcatelogservice_jul2025.models.Product;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductController {

    @GetMapping("/products/{id}")
    public Product getProductDetails(@PathVariable Long id) {
        Product product = new Product();
        product.setId(id);
        product.setName("Iphone 15");
        return product;
    }

    @PatchMapping("/products/{id}")
    public ProductDto updateProduct(@PathVariable Long id, @RequestBody ProductDto productDto) {
        return null;
    }

    @PostMapping("/products/create")
    public ProductDto createProduct(@RequestBody ProductDto productDto) {
        return null;
    }

    @GetMapping("/products")
    public ProductDto createProduct() {
        return null;
    }

    @DeleteMapping("/products/{id}")
    public ProductDto deleteProduct(@PathVariable Long id) {
        return null;
    }
    @PutMapping("/products/{id}")
    public ProductDto putProduct(@PathVariable Long id) {
        return null;
    }

}
