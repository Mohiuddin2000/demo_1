package com.etender.etender_demo.repository;

import com.etender.etender_demo.dto.ProductTypeDTO;
import com.etender.etender_demo.entity.ProductType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProductTypeRepository extends JpaRepository<ProductType,Integer> {
    Optional<ProductType> findByName(String productType);
}
