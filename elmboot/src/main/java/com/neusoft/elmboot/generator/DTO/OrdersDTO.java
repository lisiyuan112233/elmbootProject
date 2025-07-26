package com.neusoft.elmboot.generator.DTO;

import lombok.Data;
import java.math.BigDecimal;

@Data
public class OrdersDTO {
    private Long userId;
    private Long businessId;
    private Long daId;
    private BigDecimal orderTotal;
} 