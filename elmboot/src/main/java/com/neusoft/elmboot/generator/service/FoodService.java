package com.neusoft.elmboot.generator.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.neusoft.elmboot.generator.VO.FoodVO;
import com.neusoft.elmboot.generator.entity.Food;

import java.util.List;

/**
* @author 32156
* @description 针对表【food(食品表)】的数据库操作Service
* @createDate 2025-07-21 21:34:08
*/
public interface FoodService extends IService<Food> {
    List<FoodVO> listFoodByBusinessId(Long businessId);
}
