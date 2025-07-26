package com.neusoft.elmboot.generator.service.impl;

import cn.hutool.core.bean.BeanUtil;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.neusoft.elmboot.generator.VO.BusinessVO;
import com.neusoft.elmboot.generator.entity.Business;
import com.neusoft.elmboot.generator.mapper.BusinessMapper;
import com.neusoft.elmboot.generator.service.BusinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* @author 32156
* @description 针对表【business(商家表)】的数据库操作Service实现
* @createDate 2025-07-21 21:33:34
*/
@Service
public class BusinessServiceImpl extends ServiceImpl<BusinessMapper, Business>
    implements BusinessService {

    @Autowired
    private BusinessMapper businessMapper;
    @Override
    public List<BusinessVO> BusinessByOrderTypeId(Long id) {
        List<Business> list = businessMapper.BusinessByOrderTypeId(id);
        List<BusinessVO> list1 = list.stream().map(Busi -> {
            BusinessVO businessVO = new BusinessVO();
            BeanUtil.copyProperties(Busi, businessVO);
            return businessVO;
        }).toList();
        return list1;
    }

    @Override
    public BusinessVO getBusinessById(Long id) {
        return businessMapper.getBusinessById(id);
    }
}




