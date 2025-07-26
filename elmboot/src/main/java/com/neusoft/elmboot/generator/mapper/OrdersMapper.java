package com.neusoft.elmboot.generator.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.neusoft.elmboot.generator.entity.Orders;
import com.neusoft.elmboot.generator.VO.OrdersVO;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import java.util.List;

/**
* @author 32156
* @description 针对表【orders(订单表)】的数据库操作Mapper
* @createDate 2025-07-21 21:34:15
* @Entity generator.entity.Orders
*/
public interface OrdersMapper extends BaseMapper<Orders> {

    @Select("SELECT * FROM orders WHERE user_id = #{userId}")
    List<OrdersVO> listVOByUserId(@Param("userId") Long userId);
    @Select("SELECT * FROM orders WHERE order_id = #{orderId}")
    OrdersVO getVOById(@Param("orderId") Long orderId);
}




