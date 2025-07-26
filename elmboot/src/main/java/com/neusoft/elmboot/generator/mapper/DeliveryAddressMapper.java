package com.neusoft.elmboot.generator.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.neusoft.elmboot.generator.entity.DeliveryAddress;
import com.neusoft.elmboot.generator.VO.DeliveryAddressVO;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import java.util.List;
/**
* @author 32156
* @description 针对表【delivery_address(送货地址表)】的数据库操作Mapper
* @createDate 2025-07-21 21:34:05
* @Entity generator.entity.DeliveryAddress
*/
public interface DeliveryAddressMapper extends BaseMapper<DeliveryAddress> {

    @Select("SELECT * FROM delivery_address WHERE user_id = #{userId}")
    List<DeliveryAddressVO> listVOByUserId(@Param("userId") Long userId);
    @Select("SELECT * FROM delivery_address WHERE da_id = #{daId}")
    DeliveryAddressVO getVOById(@Param("daId") Long daId);
}




