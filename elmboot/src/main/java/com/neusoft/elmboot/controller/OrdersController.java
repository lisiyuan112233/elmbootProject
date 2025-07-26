package com.neusoft.elmboot.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import com.neusoft.elmboot.generator.service.OrdersService;
import com.neusoft.elmboot.generator.entity.Orders;
import java.util.List;
import com.neusoft.elmboot.Utils.Result;
import com.neusoft.elmboot.generator.DTO.OrdersDTO;
import com.neusoft.elmboot.generator.VO.OrdersVO;

@RestController
@RequestMapping("/api/orders")
public class OrdersController {
    @Autowired
    private OrdersService ordersService;

    // 1. createOrders: 创建订单
    @PostMapping
    public Result<Integer> createOrders(@RequestBody OrdersDTO ordersDTO) {
        // 假设有对应 service 方法
         return Result.success(ordersService.createOrders(ordersDTO));

    }

    // 2. getOrdersById: 查询订单详情
    @GetMapping("/{orderId}")
    public Result<OrdersVO> getOrdersById(@PathVariable Long orderId) {
        // 假设有对应 service 方法
         return Result.success(ordersService.getVOById(orderId));

    }

    // 3. listOrdersByUserId: 查询用户所有订单
    @GetMapping
    public Result<List<OrdersVO>> listOrdersByUserId(@RequestParam Long userId) {
        // 假设有对应 service 方法
         return Result.success(ordersService.listVOByUserId(userId));

    }

    @ExceptionHandler(Exception.class)
    public Result<String> handleException(Exception e) {
        return Result.error("订单操作失败: " + e.getMessage());
    }
} 