package com.neusoft.elmboot.generator.DTO;

import lombok.Data;

@Data
public class CartDTO {
    private Long userId;
    private Long businessId;
    private Long foodId;
    private Integer quantity;
} 