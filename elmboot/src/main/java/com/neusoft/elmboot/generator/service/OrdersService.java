package com.neusoft.elmboot.generator.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.neusoft.elmboot.generator.entity.Orders;
import com.neusoft.elmboot.generator.VO.OrdersVO;
import com.neusoft.elmboot.generator.DTO.OrdersDTO;
import java.util.List;
/**
* @author 32156
* @description 针对表【orders(订单表)】的数据库操作Service
* @createDate 2025-07-21 21:34:15
*/
public interface OrdersService extends IService<Orders> {

    List<OrdersVO> listVOByUserId(Long userId);
    OrdersVO getVOById(Long orderId);
    int createOrders(OrdersDTO dto);
}
