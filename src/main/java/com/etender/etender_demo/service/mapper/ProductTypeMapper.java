package com.etender.etender_demo.service.mapper;
import com.etender.etender_demo.dto.ProductTypeDTO;
import com.etender.etender_demo.entity.ProductType;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProductTypeMapper extends EntityMapper<ProductTypeDTO, ProductType>{
}
