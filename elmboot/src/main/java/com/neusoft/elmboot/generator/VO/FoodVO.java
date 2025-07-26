package com.neusoft.elmboot.generator.VO;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;
@Data
public class FoodVO {
    private Long foodId;

    /**
     * 食品名称
     */
    private String foodName;

    /**
     * 食品介绍
     */
    private String foodExplain;

    /**
     * 食品图片
     */
    private String foodImg;

    /**
     * 食品价格
     */
    private BigDecimal foodPrice;

    /**
     * 所属商家编号
     */
    private Long businessId;

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
