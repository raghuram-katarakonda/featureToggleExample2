package com.example.demo.controller;

import java.util.Collection;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.Product;

@RestController
@RequestMapping("/products")
class ProductController {

    private final Product product;

    ProductController(Product productService) {
        this.product = productService;
    }

    @GetMapping
    String getProductInfo() {
        return product.getProductInfo();
    }

}
