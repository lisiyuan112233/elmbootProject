package com.neusoft.elmboot.generator.VO;

import lombok.Data;
import java.time.LocalDateTime;
import java.math.BigDecimal;

@Data
public class CartVO {
    private Long cartId;
    private Long userId;
    private Long businessId;
    private String businessName;
    private Long foodId;
    private String foodName;
    private String foodImg;
    private BigDecimal foodPrice;
    private Integer quantity;
    private LocalDateTime createTime;
    private LocalDateTime updateTime;
} 