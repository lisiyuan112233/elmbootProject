package com.neusoft.elmboot.generator.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.neusoft.elmboot.generator.entity.Cart;
import com.neusoft.elmboot.generator.VO.CartVO;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import java.util.List;

/**
* @author 32156
* @description 针对表【cart(购物车表)】的数据库操作Mapper
* @createDate 2025-07-21 21:33:59
* @Entity generator.entity.Cart
*/
public interface CartMapper extends BaseMapper<Cart> {

    @Select("SELECT c.*, b.business_name, f.food_name, f.food_img, f.food_price FROM cart c " +
            "LEFT JOIN business b ON c.business_id = b.business_id " +
            "LEFT JOIN food f ON c.food_id = f.food_id " +
            "WHERE c.user_id = #{userId} " +
            "AND (#{businessId} IS NULL OR c.business_id = #{businessId})")
    List<CartVO> listCartVO(@Param("userId") Long userId, @Param("businessId") Long businessId);
}




