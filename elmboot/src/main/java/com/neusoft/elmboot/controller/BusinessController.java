package com.neusoft.elmboot.controller;

import cn.hutool.core.bean.BeanUtil;
import com.neusoft.elmboot.Utils.Result;
import com.neusoft.elmboot.generator.VO.BusinessVO;
import com.neusoft.elmboot.generator.entity.Business;
import com.neusoft.elmboot.generator.service.BusinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/business")
public class BusinessController {
    @Autowired
    private BusinessService businessService;
    @GetMapping("/orderType/{orderTypeId}")
    public Result<List<BusinessVO>> listBusinessByOrderTypeId(@PathVariable Long orderTypeId){
        List<BusinessVO> list = businessService.BusinessByOrderTypeId(orderTypeId);
        return Result.success(list);
    }
    @GetMapping("/{businessId}")
    public Result<BusinessVO> getBusinessById(@PathVariable String businessId){
        Long BusinessId = Long.parseLong(businessId);
        BusinessVO vo = businessService.getBusinessById(BusinessId);
        return Result.success(vo);
    }
}
















