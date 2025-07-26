package com.neusoft.elmboot.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import com.neusoft.elmboot.generator.service.OrderTypeDictService;
import com.neusoft.elmboot.generator.VO.OrderTypeDictVO;
import com.neusoft.elmboot.Utils.Result;
import java.util.List;

@RestController
@RequestMapping("/api/orderType")
public class OrderTypeDictController {
    @Autowired
    private OrderTypeDictService orderTypeDictService;

    // 获取所有分类列表
    @GetMapping
    public Result<List<OrderTypeDictVO>> listAllOrderTypes() {
        return Result.success(orderTypeDictService.listAllVO());
    }

    @ExceptionHandler(Exception.class)
    public Result<String> handleException(Exception e) {
        return Result.error("分类操作失败: " + e.getMessage());
    }
} 