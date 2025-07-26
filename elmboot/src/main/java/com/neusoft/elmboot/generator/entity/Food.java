package com.neusoft.elmboot.generator.entity;

import com.baomidou.mybatisplus.annotation.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Date;
import lombok.Data;

/**
 * 食品表
 * @TableName food
 */
@TableName(value ="food")
@Data
public class Food {
    public Food(String foodName, String foodExplain, String foodImg, BigDecimal foodPrice, Long businessId, String remarks) {
        this.foodName = foodName;
        this.foodExplain = foodExplain;
        this.foodImg = foodImg;
        this.foodPrice = foodPrice;
        this.businessId = businessId;
        this.remarks = remarks;
    }

    public Food() {
    }

    /**
     * 食品编号（雪花算法生成）
     */
    @TableId
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
        Food other = (Food) that;
        return (this.getFoodId() == null ? other.getFoodId() == null : this.getFoodId().equals(other.getFoodId()))
            && (this.getFoodName() == null ? other.getFoodName() == null : this.getFoodName().equals(other.getFoodName()))
            && (this.getFoodExplain() == null ? other.getFoodExplain() == null : this.getFoodExplain().equals(other.getFoodExplain()))
            && (this.getFoodImg() == null ? other.getFoodImg() == null : this.getFoodImg().equals(other.getFoodImg()))
            && (this.getFoodPrice() == null ? other.getFoodPrice() == null : this.getFoodPrice().equals(other.getFoodPrice()))
            && (this.getBusinessId() == null ? other.getBusinessId() == null : this.getBusinessId().equals(other.getBusinessId()))
            && (this.getRemarks() == null ? other.getRemarks() == null : this.getRemarks().equals(other.getRemarks()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getFoodId() == null) ? 0 : getFoodId().hashCode());
        result = prime * result + ((getFoodName() == null) ? 0 : getFoodName().hashCode());
        result = prime * result + ((getFoodExplain() == null) ? 0 : getFoodExplain().hashCode());
        result = prime * result + ((getFoodImg() == null) ? 0 : getFoodImg().hashCode());
        result = prime * result + ((getFoodPrice() == null) ? 0 : getFoodPrice().hashCode());
        result = prime * result + ((getBusinessId() == null) ? 0 : getBusinessId().hashCode());
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
        sb.append(", foodId=").append(foodId);
        sb.append(", foodName=").append(foodName);
        sb.append(", foodExplain=").append(foodExplain);
        sb.append(", foodImg=").append(foodImg);
        sb.append(", foodPrice=").append(foodPrice);
        sb.append(", businessId=").append(businessId);
        sb.append(", remarks=").append(remarks);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append("]");
        return sb.toString();
    }
}