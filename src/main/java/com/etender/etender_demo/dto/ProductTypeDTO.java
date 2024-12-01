package com.etender.etender_demo.dto;
import lombok.Data;
import java.io.Serializable;

@Data
public class ProductTypeDTO implements Serializable {
    private int id;
    private String name;
}
