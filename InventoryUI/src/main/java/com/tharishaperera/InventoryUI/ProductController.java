/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tharishaperera.InventoryUI;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author THARISHA
 */
public class ProductController {

    private final static String BASE_URL = "http://localhost:8081";

    @GetMapping(path = "/all-products")
    public String allProductsView(Model model) {
        model.addAttribute("product", new Product());
        return "all_products";
    }
}
