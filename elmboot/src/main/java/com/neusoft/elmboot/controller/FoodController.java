package com.neusoft.elmboot.controller;

import com.neusoft.elmboot.Utils.Result;
import com.neusoft.elmboot.generator.VO.FoodVO;
import com.neusoft.elmboot.generator.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/food")
public class FoodController {
    @Autowired
    private FoodService foodService;
    @GetMapping("/byBusiness/{businessId}")
    public Result<List<FoodVO>> listFoodByBusinessId(@PathVariable String businessId){
        long id = Long.parseLong(businessId);
        return Result.success(foodService.listFoodByBusinessId(id));
    }
    @ExceptionHandler
    public Result<String> handleException(Exception e){
        return Result.error(e.getMessage());
    }
}
