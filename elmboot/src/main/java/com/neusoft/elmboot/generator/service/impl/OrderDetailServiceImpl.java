package com.neusoft.elmboot.generator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.neusoft.elmboot.generator.entity.OrderDetail;
import com.neusoft.elmboot.generator.mapper.OrderDetailMapper;
import com.neusoft.elmboot.generator.service.OrderDetailService;
import org.springframework.stereotype.Service;

/**
* @author 32156
* @description 针对表【order_detail(订单明细表)】的数据库操作Service实现
* @createDate 2025-07-21 21:34:11
*/
@Service
public class OrderDetailServiceImpl extends ServiceImpl<OrderDetailMapper, OrderDetail>
    implements OrderDetailService {

}




