package com.neusoft.elmboot.generator.VO;

import lombok.Data;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
public class OrderDetailVO {
    private Long odId;
    private Long orderId;
    private Long foodId;
    private String foodName;
    private Integer quantity;
    private BigDecimal foodPrice;
    private LocalDateTime createTime;
} 