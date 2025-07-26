package com.neusoft.elmboot.generator.entity;

import com.baomidou.mybatisplus.annotation.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Date;
import lombok.Data;

/**
 * 商家表
 * @TableName business
 */
@TableName(value ="business")
@Data
public class Business {
    public Business(String businessName, String businessAddress, String businessExplain, String businessImg, Long orderTypeId, BigDecimal starPrice, BigDecimal deliveryPrice, String remarks) {
        this.businessName = businessName;
        this.businessAddress = businessAddress;
        this.businessExplain = businessExplain;
        this.businessImg = businessImg;
        this.orderTypeId = orderTypeId;
        this.starPrice = starPrice;
        this.deliveryPrice = deliveryPrice;
        this.remarks = remarks;
    }

    public Business() {
    }

    /**
     * 商家编号（雪花算法生成）
     */
    @TableId
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
    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime createTime;

    /**
     * 修改时间
     */
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private LocalDateTime updateTime;

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Business other = (Business) that;
        return (this.getBusinessId() == null ? other.getBusinessId() == null : this.getBusinessId().equals(other.getBusinessId()))
            && (this.getBusinessName() == null ? other.getBusinessName() == null : this.getBusinessName().equals(other.getBusinessName()))
            && (this.getBusinessAddress() == null ? other.getBusinessAddress() == null : this.getBusinessAddress().equals(other.getBusinessAddress()))
            && (this.getBusinessExplain() == null ? other.getBusinessExplain() == null : this.getBusinessExplain().equals(other.getBusinessExplain()))
            && (this.getBusinessImg() == null ? other.getBusinessImg() == null : this.getBusinessImg().equals(other.getBusinessImg()))
            && (this.getOrderTypeId() == null ? other.getOrderTypeId() == null : this.getOrderTypeId().equals(other.getOrderTypeId()))
            && (this.getStarPrice() == null ? other.getStarPrice() == null : this.getStarPrice().equals(other.getStarPrice()))
            && (this.getDeliveryPrice() == null ? other.getDeliveryPrice() == null : this.getDeliveryPrice().equals(other.getDeliveryPrice()))
            && (this.getRemarks() == null ? other.getRemarks() == null : this.getRemarks().equals(other.getRemarks()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getBusinessId() == null) ? 0 : getBusinessId().hashCode());
        result = prime * result + ((getBusinessName() == null) ? 0 : getBusinessName().hashCode());
        result = prime * result + ((getBusinessAddress() == null) ? 0 : getBusinessAddress().hashCode());
        result = prime * result + ((getBusinessExplain() == null) ? 0 : getBusinessExplain().hashCode());
        result = prime * result + ((getBusinessImg() == null) ? 0 : getBusinessImg().hashCode());
        result = prime * result + ((getOrderTypeId() == null) ? 0 : getOrderTypeId().hashCode());
        result = prime * result + ((getStarPrice() == null) ? 0 : getStarPrice().hashCode());
        result = prime * result + ((getDeliveryPrice() == null) ? 0 : getDeliveryPrice().hashCode());
        result = prime * result + ((getRemarks() == null) ? 0 : getRemarks().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", businessId=").append(businessId);
        sb.append(", businessName=").append(businessName);
        sb.append(", businessAddress=").append(businessAddress);
        sb.append(", businessExplain=").append(businessExplain);
        sb.append(", businessImg=").append(businessImg);
        sb.append(", orderTypeId=").append(orderTypeId);
        sb.append(", starPrice=").append(starPrice);
        sb.append(", deliveryPrice=").append(deliveryPrice);
        sb.append(", remarks=").append(remarks);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append("]");
        return sb.toString();
    }
}