package com.neusoft.elmboot.generator.VO;

import lombok.Data;
import java.time.LocalDateTime;

@Data
public class DeliveryAddressVO {
    private Long daId;
    private String contactName;
    private Integer contactSex;
    private String contactTel;
    private String address;
    private Long userId;
    private LocalDateTime createTime;
    private LocalDateTime updateTime;
} 