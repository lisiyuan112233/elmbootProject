package com.neusoft.elmboot.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import com.neusoft.elmboot.generator.service.UserService;
import com.neusoft.elmboot.generator.entity.User;
import java.util.List;
import com.neusoft.elmboot.Utils.Result;
import com.neusoft.elmboot.generator.DTO.UserDTO;
import com.neusoft.elmboot.generator.VO.UserVO;

@RestController
@RequestMapping("/api/user")
public class UserController {
    @Autowired
    private UserService userService;

    // 1. getUserByIdByPass: 根据用户编号和密码查询用户信息
    @GetMapping("/login")
    public Result<UserVO> getUserByIdByPass(@RequestParam Long userId, @RequestParam String password) {
        // 假设有对应 service 方法
         return Result.success(userService.getVOByIdAndPass(userId, password));

    }

    // 2. getUserById: 根据用户编号查询用户表返回的行数
    @GetMapping("/{userId}/count")
    public Result<Integer> getUserById(@PathVariable Long userId) {
        // 假设有对应 service 方法
         return Result.success(userService.countById(userId));

    }

    // 3. saveUser: 添加用户
    @PostMapping
    public Result<Integer> saveUser(@RequestBody UserDTO user) {
        // 假设有对应 service 方法
         return Result.success(userService.saveDTO(user));

    }

    @ExceptionHandler(Exception.class)
    public Result<String> handleException(Exception e) {
        return Result.error("用户操作失败: " + e.getMessage());
    }
} 