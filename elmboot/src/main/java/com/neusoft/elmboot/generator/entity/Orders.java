package com.neusoft.elmboot.generator.entity;

import com.baomidou.mybatisplus.annotation.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Date;
import lombok.Data;

/**
 * 订单表
 * @TableName orders
 */
@TableName(value ="orders")
@Data
public class Orders {
    public Orders(Long userId, Long businessId, BigDecimal orderTotal, Long daId, orderStateType orderState) {
        this.userId = userId;
        this.businessId = businessId;
        this.orderTotal = orderTotal;
        this.daId = daId;
        this.orderState = orderState;
    }

    public Orders() {
    }

    public enum orderStateType{
        NOT_PAY(0,"未支付"), PAY(1,"已支付");
        @EnumValue
        public final int code;
        public final String desc;

        orderStateType(int code, String desc) {
            this.code = code;
            this.desc = desc;
        }
    }
    /**
     * 订单编号（雪花算法生成）
     */
    @TableId
    private Long orderId;

    /**
     * 所属用户编号
     */
    private Long userId;

    /**
     * 所属商家编号
     */
    private Long businessId;

    /**
     * 订购日期（改为datetime类型存储）
     */
    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime orderDate;

    /**
     * 订单总价
     */
    private BigDecimal orderTotal;

    /**
     * 所属送货地址编号
     */
    private Long daId;

    /**
     * 订单状态（0：未支付；1：已支付）
     */
    private orderStateType orderState;

    /**
     * 记录创建时间
     */
    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime createTime;

    /**
     * 记录修改时间
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
        Orders other = (Orders) that;
        return (this.getOrderId() == null ? other.getOrderId() == null : this.getOrderId().equals(other.getOrderId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getBusinessId() == null ? other.getBusinessId() == null : this.getBusinessId().equals(other.getBusinessId()))
            && (this.getOrderDate() == null ? other.getOrderDate() == null : this.getOrderDate().equals(other.getOrderDate()))
            && (this.getOrderTotal() == null ? other.getOrderTotal() == null : this.getOrderTotal().equals(other.getOrderTotal()))
            && (this.getDaId() == null ? other.getDaId() == null : this.getDaId().equals(other.getDaId()))
            && (this.getOrderState() == null ? other.getOrderState() == null : this.getOrderState().equals(other.getOrderState()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOrderId() == null) ? 0 : getOrderId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getBusinessId() == null) ? 0 : getBusinessId().hashCode());
        result = prime * result + ((getOrderDate() == null) ? 0 : getOrderDate().hashCode());
        result = prime * result + ((getOrderTotal() == null) ? 0 : getOrderTotal().hashCode());
        result = prime * result + ((getDaId() == null) ? 0 : getDaId().hashCode());
        result = prime * result + ((getOrderState() == null) ? 0 : getOrderState().hashCode());
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
        sb.append(", orderId=").append(orderId);
        sb.append(", userId=").append(userId);
        sb.append(", businessId=").append(businessId);
        sb.append(", orderDate=").append(orderDate);
        sb.append(", orderTotal=").append(orderTotal);
        sb.append(", daId=").append(daId);
        sb.append(", orderState=").append(orderState);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append("]");
        return sb.toString();
    }
}