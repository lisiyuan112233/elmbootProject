package com.neusoft.elmboot.generator.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.neusoft.elmboot.generator.VO.BusinessVO;
import com.neusoft.elmboot.generator.entity.Business;

import java.util.List;

/**
* @author 32156
* @description 针对表【business(商家表)】的数据库操作Service
* @createDate 2025-07-21 21:33:34
*/
public interface BusinessService extends IService<Business> {
    List<BusinessVO> BusinessByOrderTypeId(Long id);
    BusinessVO getBusinessById(Long id);
}
