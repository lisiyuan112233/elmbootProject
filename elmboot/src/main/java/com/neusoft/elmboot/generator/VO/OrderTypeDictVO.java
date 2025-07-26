package com.neusoft.elmboot.generator.VO;

import lombok.Data;
import java.time.LocalDateTime;

@Data
public class OrderTypeDictVO {
    private Long typeId;
    private String typeName;
    private Integer sortOrder;
    private LocalDateTime createTime;
    private LocalDateTime updateTime;
} 