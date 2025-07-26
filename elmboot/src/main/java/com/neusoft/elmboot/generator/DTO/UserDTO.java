package com.neusoft.elmboot.generator.DTO;

import lombok.Data;

@Data
public class UserDTO {
    private Long userId;
    private String password;
    private String userName;
    private Integer userSex;
    private String userImg;
} 