/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tharishaperera.Products;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author THARISHA
 */
@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping(path = "/products")
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    @GetMapping(path = "/products/{productId}")
    public Product getProductById(@PathVariable int productId) {
        return productService.getProductByID(productId);
    }

    @PostMapping(path = "/products")
    public void createProduct(@RequestBody Product product) {
        productService.createProduct(product);
        System.out.println("product created successfully!");
    }

    @PutMapping(path = "/products/{productId}")
    public void updateProduct(@PathVariable int productId, @RequestBody Product product) {
        productService.updateProduct(productId, product);
        System.out.println("Product with product id: " + productId + " is successfully updated");
    }

    @DeleteMapping(path = "/products")
    public void deleteAllProducts() {
        productService.deleteAllProducts();    
        System.out.println("All products has been deleted successfully");
    }

    @DeleteMapping(path = "/products/{productId}")
    public void deleteProductById(@PathVariable int productId) {
        productService.deleteProductById(productId);
        System.out.println("Product with product id: " + productId + " has been deleted successfully");
    }
}
