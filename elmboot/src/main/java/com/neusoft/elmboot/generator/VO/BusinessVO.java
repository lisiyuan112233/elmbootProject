package com.neusoft.elmboot.generator.VO;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;
@Data
public class BusinessVO {
    private Long businessId;

    /**
     * 商家名称
     */
    private String businessName;

    /**
     * 商家地址
     */
    private String businessAddress;

    /**
     * 商家介绍
     */
    private String businessExplain;

    /**
     * 商家图片
     */
    private String businessImg;

    /**
     * 点餐分类
     */
    private String typeName;
    private Long orderTypeId;
    /**
     * 起送费
     */
    private BigDecimal starPrice;

    /**
     * 配送费
     */
    private BigDecimal deliveryPrice;

    /**
     * 备注
     */
    private String remarks;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 修改时间
     */
    private LocalDateTime updateTime;
}
