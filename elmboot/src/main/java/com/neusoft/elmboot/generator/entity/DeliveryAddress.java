package com.neusoft.elmboot.generator.entity;

import com.baomidou.mybatisplus.annotation.*;

import java.time.LocalDateTime;
import java.util.Date;
import lombok.Data;

/**
 * 送货地址表
 * @TableName delivery_address
 */
@TableName(value ="delivery_address")
@Data
public class DeliveryAddress {
    public enum contactSexType{
        UNKNOWN(0,"未知"), MAN(1,"男"),WOMAN(2,"女");
        @EnumValue
        public final int code;
        public final String desc;

        contactSexType(int code, String desc) {
            this.code = code;
            this.desc = desc;
        }
    }

    public DeliveryAddress(String contactName, contactSexType contactSex, String contactTel, String address, Long userId) {
        this.contactName = contactName;
        this.contactSex = contactSex;
        this.contactTel = contactTel;
        this.address = address;
        this.userId = userId;
    }

    public DeliveryAddress() {
    }

    /**
     * 送货地址编号（雪花算法生成）
     */
    @TableId
    private Long daId;

    /**
     * 联系人姓名
     */
    private String contactName;

    /**
     * 联系人性别（0-未知，1-男，2-女）
     */
    private contactSexType contactSex;

    /**
     * 联系人电话
     */
    private String contactTel;

    /**
     * 送货地址
     */
    private String address;

    /**
     * 所属用户编号
     */
    private Long userId;

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
        DeliveryAddress other = (DeliveryAddress) that;
        return (this.getDaId() == null ? other.getDaId() == null : this.getDaId().equals(other.getDaId()))
            && (this.getContactName() == null ? other.getContactName() == null : this.getContactName().equals(other.getContactName()))
            && (this.getContactSex() == null ? other.getContactSex() == null : this.getContactSex().equals(other.getContactSex()))
            && (this.getContactTel() == null ? other.getContactTel() == null : this.getContactTel().equals(other.getContactTel()))
            && (this.getAddress() == null ? other.getAddress() == null : this.getAddress().equals(other.getAddress()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getDaId() == null) ? 0 : getDaId().hashCode());
        result = prime * result + ((getContactName() == null) ? 0 : getContactName().hashCode());
        result = prime * result + ((getContactSex() == null) ? 0 : getContactSex().hashCode());
        result = prime * result + ((getContactTel() == null) ? 0 : getContactTel().hashCode());
        result = prime * result + ((getAddress() == null) ? 0 : getAddress().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
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
        sb.append(", daId=").append(daId);
        sb.append(", contactName=").append(contactName);
        sb.append(", contactSex=").append(contactSex);
        sb.append(", contactTel=").append(contactTel);
        sb.append(", address=").append(address);
        sb.append(", userId=").append(userId);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append("]");
        return sb.toString();
    }
}