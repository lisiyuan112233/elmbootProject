package com.neusoft.elmboot.generator.service.impl;

import cn.hutool.core.bean.BeanUtil;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.neusoft.elmboot.generator.entity.Orders;
import com.neusoft.elmboot.generator.VO.OrdersVO;
import com.neusoft.elmboot.generator.DTO.OrdersDTO;
import com.neusoft.elmboot.generator.mapper.OrdersMapper;
import com.neusoft.elmboot.generator.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

/**
* @author 32156
* @description 针对表【orders(订单表)】的数据库操作Service实现
* @createDate 2025-07-21 21:34:15
*/
@Service
public class OrdersServiceImpl extends ServiceImpl<OrdersMapper, Orders>
    implements OrdersService {

    @Autowired
    private OrdersMapper ordersMapper;

    @Override
    public List<OrdersVO> listVOByUserId(Long userId) {
        return ordersMapper.listVOByUserId(userId);
    }

    @Override
    public OrdersVO getVOById(Long orderId) {
        return ordersMapper.getVOById(orderId);
    }

    @Override
    public int createOrders(OrdersDTO dto) {
        Orders entity = new Orders();
        BeanUtil.copyProperties(dto, entity);
        return this.save(entity) ? 1 : 0;
    }
}




