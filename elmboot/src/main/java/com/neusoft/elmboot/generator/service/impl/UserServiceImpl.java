package com.neusoft.elmboot.generator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.neusoft.elmboot.generator.entity.User;
import com.neusoft.elmboot.generator.VO.UserVO;
import com.neusoft.elmboot.generator.DTO.UserDTO;
import com.neusoft.elmboot.generator.mapper.UserMapper;
import com.neusoft.elmboot.generator.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
* @author 32156
* @description 针对表【user(用户表)】的数据库操作Service实现
* @createDate 2025-07-21 21:34:18
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public UserVO getVOByIdAndPass(Long userId, String password) {
        return userMapper.getVOByIdAndPass(userId, password);
    }

    @Override
    public int countById(Long userId) {
        return userMapper.countById(userId);
    }

    @Override
    public int saveDTO(UserDTO dto) {
        User entity = new User();
        entity.setUserId(dto.getUserId());
        entity.setPassword(dto.getPassword());
        entity.setUserName(dto.getUserName());
        entity.setUserSex(User.userSexType.values()[dto.getUserSex() == null ? 0 : dto.getUserSex()]);
        entity.setUserImg(dto.getUserImg());
        entity.setDelTag(1);
        return this.save(entity) ? 1 : 0;
    }
}




