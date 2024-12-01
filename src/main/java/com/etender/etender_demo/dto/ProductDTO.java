package com.etender.etender_demo.dto;
import lombok.Data;
import java.io.Serializable;

@Data
public class ProductDTO implements Serializable {
    private int id;
    private String name;
    private int quantity;
    private double price;
    private ProductTypeDTO productType;
}
