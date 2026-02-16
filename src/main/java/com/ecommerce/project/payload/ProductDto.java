package com.ecommerce.project.payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductDto {
    private Long ProductId;
    private String ProductName;
    private String Image;
    private Integer quantity;
    private Double price;
    private Double discount;
    private Double specialPrice;
}
