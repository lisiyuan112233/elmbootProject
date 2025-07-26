package com.neusoft.elmboot.generator.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.neusoft.elmboot.generator.entity.OrderTypeDict;
import com.neusoft.elmboot.generator.VO.OrderTypeDictVO;
import java.util.List;

/**
* @author 32156
* @description 针对表【order_type_dict(点餐分类数据字典表)】的数据库操作Service
* @createDate 2025-07-21 21:34:13
*/
public interface OrderTypeDictService extends IService<OrderTypeDict> {

    List<OrderTypeDictVO> listAllVO();
}
