package com.neusoft.elmboot.generator.VO;

import lombok.Data;
import java.time.LocalDateTime;

@Data
public class UserVO {
    private Long userId;
    private String userName;
    private Integer userSex;
    private String userImg;
    private LocalDateTime createTime;
    private LocalDateTime updateTime;
} 