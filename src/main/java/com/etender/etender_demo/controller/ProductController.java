package com.etender.etender_demo.controller;

import com.etender.etender_demo.dto.ProductDTO;
import com.etender.etender_demo.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@AllArgsConstructor
@RestController
public class ProductController {

    private final ProductService productService;

    @PostMapping("/addProduct")
    public ProductDTO addProduct(@RequestBody ProductDTO productDTO){
        return productService.save(productDTO);
    }

}
