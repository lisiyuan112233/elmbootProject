package com.neusoft.elmboot.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import com.neusoft.elmboot.generator.service.DeliveryAddressService;
import com.neusoft.elmboot.generator.entity.DeliveryAddress;

import java.util.Arrays;
import java.util.List;
import com.neusoft.elmboot.Utils.Result;
import com.neusoft.elmboot.generator.DTO.DeliveryAddressDTO;
import com.neusoft.elmboot.generator.VO.DeliveryAddressVO;

@RestController
@RequestMapping("/api/deliveryAddress")
public class DeliveryAddressController {
    @Autowired
    private DeliveryAddressService deliveryAddressService;

    // 1. listDeliveryAddressByUserId: 查询用户所有送货地址
    @GetMapping
    public Result<List<DeliveryAddressVO>> listDeliveryAddressByUserId(@RequestParam Long userId) {
        // 假设有对应 service 方法
         return Result.success(deliveryAddressService.listVOByUserId(userId));

    }

    // 2. getDeliveryAddressById: 根据送货地址编号查询
    @GetMapping("/{daId}")
    public Result<DeliveryAddressVO> getDeliveryAddressById(@PathVariable Long daId) {
        // 假设有对应 service 方法
         return Result.success(deliveryAddressService.getVOById(daId));

    }

    // 3. saveDeliveryAddress: 添加送货地址
    @PostMapping
    public Result<Integer> saveDeliveryAddress(@RequestBody DeliveryAddressDTO address) {
        // 假设有对应 service 方法
         return Result.success(deliveryAddressService.saveDTO(address));

    }

    // 4. updateDeliveryAddress: 更新送货地址
    @PutMapping
    public Result<Integer> updateDeliveryAddress(@RequestBody DeliveryAddressDTO address) {
        // 假设有对应 service 方法
         return Result.success(deliveryAddressService.updateDTO(address));

    }

    // 5. removeDeliveryAddress: 删除送货地址
    @DeleteMapping("/{daId}")
    public Result<Integer> removeDeliveryAddress(@PathVariable Long daId) {
        // 假设有对应 service 方法
         return Result.success(deliveryAddressService.removeById(daId));

    }

    @ExceptionHandler(Exception.class)
    public Result<String> handleException(Exception e) {
        return Result.error("送货地址操作失败: " + e.getMessage());
    }

    public static void main(String[] args) {
            int[] arr={34,6,35,1}; for(int i=arr.length-1;i>0;i--){ for(int j=0;j<i;j++){

                if(arr[j]>arr[j+1]){ int b;b=arr[j];arr[j]=arr[j+1];arr[j+1]=b;}; } }        System.out.println(Arrays.toString(arr));
    }
} 