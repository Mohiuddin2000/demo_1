package com.etender.etender_demo.service.mapper;

import com.etender.etender_demo.dto.ProductDTO;
import com.etender.etender_demo.entity.Product;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProductMapper extends EntityMapper<ProductDTO, Product>{
}
