package com.neusoft.elmboot.generator.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.neusoft.elmboot.generator.entity.User;
import com.neusoft.elmboot.generator.VO.UserVO;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
* @author 32156
* @description 针对表【user(用户表)】的数据库操作Mapper
* @createDate 2025-07-21 21:34:18
* @Entity generator.entity.User
*/
public interface UserMapper extends BaseMapper<User> {

    @Select("SELECT * FROM user WHERE user_id = #{userId} AND password = #{password}")
    UserVO getVOByIdAndPass(@Param("userId") Long userId, @Param("password") String password);
    @Select("SELECT COUNT(*) FROM user WHERE user_id = #{userId}")
    int countById(@Param("userId") Long userId);
}




