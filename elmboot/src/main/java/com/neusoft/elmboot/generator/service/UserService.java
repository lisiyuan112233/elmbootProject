package com.neusoft.elmboot.generator.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.neusoft.elmboot.generator.entity.User;
import com.neusoft.elmboot.generator.VO.UserVO;
import com.neusoft.elmboot.generator.DTO.UserDTO;
/**
* @author 32156
* @description 针对表【user(用户表)】的数据库操作Service
* @createDate 2025-07-21 21:34:18
*/
public interface UserService extends IService<User> {

    UserVO getVOByIdAndPass(Long userId, String password);
    int countById(Long userId);
    int saveDTO(UserDTO dto);
}
