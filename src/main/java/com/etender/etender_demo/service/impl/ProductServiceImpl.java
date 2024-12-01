package com.etender.etender_demo.service.impl;

import com.etender.etender_demo.dto.ProductDTO;
import com.etender.etender_demo.dto.ProductTypeDTO;
import com.etender.etender_demo.entity.Product;
import com.etender.etender_demo.entity.ProductType;
import com.etender.etender_demo.repository.ProductRepository;
import com.etender.etender_demo.repository.ProductTypeRepository;
import com.etender.etender_demo.service.ProductService;
import com.etender.etender_demo.service.mapper.ProductMapper;
import com.etender.etender_demo.service.mapper.ProductTypeMapper;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {
    private final ProductTypeRepository productTypeRepository;
    private final ProductRepository productRepository;
    private final ProductTypeMapper productTypeMapper;
    private final ProductMapper productMapper;
    public ProductDTO save(ProductDTO productDTO){
        Optional<ProductType> productType = productTypeRepository.findByName(productDTO.getProductType().getName());
        if(productType.isPresent()){
            ProductTypeDTO productTypeDTO = productTypeMapper.toDto(productType.get());
            productDTO.setProductType(productTypeDTO);
        }
        else{
            ProductType productType1 = productTypeMapper.toEntity(productDTO.getProductType());
            productType1 = productTypeRepository.save(productType1);
            productDTO.setProductType(productTypeMapper.toDto(productType1));
        }
        Product product = productMapper.toEntity(productDTO);
        product = productRepository.save(product);
        return productMapper.toDto(product);
    }
}
