package com.neusoft.elmboot.generator.DTO;

import lombok.Data;

@Data
public class DeliveryAddressDTO {
    private Long daId;
    private String contactName;
    private Integer contactSex;
    private String contactTel;
    private String address;
    private Long userId;
} 