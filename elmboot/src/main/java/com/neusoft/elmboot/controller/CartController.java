package com.neusoft.elmboot.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import com.neusoft.elmboot.generator.service.CartService;
import com.neusoft.elmboot.generator.entity.Cart;
import java.util.List;
import com.neusoft.elmboot.generator.DTO.CartDTO;
import com.neusoft.elmboot.generator.VO.CartVO;
import com.neusoft.elmboot.Utils.Result;

@RestController
@RequestMapping("/api/cart")
public class CartController {
    @Autowired
    private CartService cartService;

    // 1. listCart: 根据用户编号查询所有购物车信息，或根据用户编号和商家编号查询某商家的购物车信息
    @GetMapping
    public Result<List<CartVO>> listCart(@RequestParam Long userId, @RequestParam(required = false) Long businessId) {
        return Result.success(cartService.listCartVO(userId, businessId));
    }

    // 2. saveCart: 向购物车表中添加一条记录
    @PostMapping
    public Result<Integer> saveCart(@RequestBody CartDTO cartDTO) {
        return Result.success(cartService.saveCartVO(cartDTO));
    }

    // 3. updateCart: 更新购物车中食品数量
    @PutMapping
    public Result<Integer> updateCart(@RequestBody CartDTO cartDTO) {
        return Result.success(cartService.updateCart(cartDTO));
    }

    // 4. removeCart: 删除购物车中的食品记录
    @DeleteMapping
    public Result<Integer> removeCart(@RequestBody CartDTO cartDTO) {
        return Result.success(cartService.removeCart(cartDTO));
    }

    @ExceptionHandler(Exception.class)
    public Result<String> handleException(Exception e) {
        return Result.error("购物车操作失败: " + e.getMessage());
    }
} 