package com.neusoft.elmboot.generator.entity;

import com.baomidou.mybatisplus.annotation.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Date;
import lombok.Data;

/**
 * 订单明细表
 * @TableName order_detail
 */
@TableName(value ="order_detail")
@Data
public class OrderDetail {
    public OrderDetail(Long orderId, Long foodId, Integer quantity, BigDecimal foodPrice) {
        this.orderId = orderId;
        this.foodId = foodId;
        this.quantity = quantity;
        this.foodPrice = foodPrice;
    }

    public OrderDetail() {
    }

    /**
     * 订单明细编号（雪花算法生成）
     */
    @TableId
    private Long odId;

    /**
     * 所属订单编号
     */
    private Long orderId;

    /**
     * 所属食品编号
     */
    private Long foodId;

    /**
     * 食品数量
     */
    private Integer quantity;

    /**
     * 创建时间
     */
    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime createTime;

    /**
     * 购买时的食品单价
     */
    private BigDecimal foodPrice;

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
        OrderDetail other = (OrderDetail) that;
        return (this.getOdId() == null ? other.getOdId() == null : this.getOdId().equals(other.getOdId()))
            && (this.getOrderId() == null ? other.getOrderId() == null : this.getOrderId().equals(other.getOrderId()))
            && (this.getFoodId() == null ? other.getFoodId() == null : this.getFoodId().equals(other.getFoodId()))
            && (this.getQuantity() == null ? other.getQuantity() == null : this.getQuantity().equals(other.getQuantity()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getFoodPrice() == null ? other.getFoodPrice() == null : this.getFoodPrice().equals(other.getFoodPrice()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOdId() == null) ? 0 : getOdId().hashCode());
        result = prime * result + ((getOrderId() == null) ? 0 : getOrderId().hashCode());
        result = prime * result + ((getFoodId() == null) ? 0 : getFoodId().hashCode());
        result = prime * result + ((getQuantity() == null) ? 0 : getQuantity().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getFoodPrice() == null) ? 0 : getFoodPrice().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", odId=").append(odId);
        sb.append(", orderId=").append(orderId);
        sb.append(", foodId=").append(foodId);
        sb.append(", quantity=").append(quantity);
        sb.append(", createTime=").append(createTime);
        sb.append(", foodPrice=").append(foodPrice);
        sb.append("]");
        return sb.toString();
    }
}