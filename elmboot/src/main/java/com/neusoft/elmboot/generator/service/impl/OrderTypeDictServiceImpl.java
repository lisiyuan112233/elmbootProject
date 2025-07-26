package com.neusoft.elmboot.generator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.neusoft.elmboot.generator.entity.OrderTypeDict;
import com.neusoft.elmboot.generator.VO.OrderTypeDictVO;
import com.neusoft.elmboot.generator.mapper.OrderTypeDictMapper;
import com.neusoft.elmboot.generator.service.OrderTypeDictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

/**
* @author 32156
* @description 针对表【order_type_dict(点餐分类数据字典表)】的数据库操作Service实现
* @createDate 2025-07-21 21:34:13
*/
@Service
public class OrderTypeDictServiceImpl extends ServiceImpl<OrderTypeDictMapper, OrderTypeDict>
    implements OrderTypeDictService {

    @Autowired
    private OrderTypeDictMapper orderTypeDictMapper;

    @Override
    public List<OrderTypeDictVO> listAllVO() {
        return orderTypeDictMapper.listAllVO();
    }
}




