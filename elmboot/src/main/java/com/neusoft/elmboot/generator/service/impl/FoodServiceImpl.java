package com.neusoft.elmboot.generator.service.impl;

import cn.hutool.core.bean.BeanUtil;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.neusoft.elmboot.generator.VO.FoodVO;
import com.neusoft.elmboot.generator.entity.Food;
import com.neusoft.elmboot.generator.mapper.FoodMapper;
import com.neusoft.elmboot.generator.service.FoodService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* @author 32156
* @description 针对表【food(食品表)】的数据库操作Service实现
* @createDate 2025-07-21 21:34:08
*/
@Service
public class FoodServiceImpl extends ServiceImpl<FoodMapper, Food>
    implements FoodService {

    @Override
    public List<FoodVO> listFoodByBusinessId(Long businessId) {
        List<Food> foods = lambdaQuery().eq(Food::getBusinessId, businessId).list();
        return foods.stream().map(food->{
            FoodVO foodVO = new FoodVO();
            BeanUtil.copyProperties(food,foodVO);
            return foodVO;
        }).toList();
    }
}




