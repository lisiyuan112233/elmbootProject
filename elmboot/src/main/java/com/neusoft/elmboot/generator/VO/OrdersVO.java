package com.neusoft.elmboot.generator.VO;

import lombok.Data;
import java.time.LocalDateTime;
import java.math.BigDecimal;
import java.util.List;

@Data
public class OrdersVO {
    private Long orderId;
    private Long userId;
    private String userName;
    private Long businessId;
    private String businessName;
    private LocalDateTime orderDate;
    private BigDecimal orderTotal;
    private Long daId;
    private String deliveryAddress;
    private Integer orderState;
    private LocalDateTime createTime;
    private LocalDateTime updateTime;
    private List<OrderDetailVO> orderDetails;
} 