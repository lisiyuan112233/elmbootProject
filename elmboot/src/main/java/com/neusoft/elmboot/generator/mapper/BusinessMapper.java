package com.neusoft.elmboot.generator.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.neusoft.elmboot.generator.VO.BusinessVO;
import com.neusoft.elmboot.generator.entity.Business;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
* @author 32156
* @description 针对表【business(商家表)】的数据库操作Mapper
* @createDate 2025-07-21 21:33:34
* @Entity generator.entity.Business
*/
public interface BusinessMapper extends BaseMapper<Business> {
    @Select("SELECT * " +
            "FROM business b " +
            "LEFT JOIN order_type_dict ot ON b.order_type_id = ot.type_id " +
            "WHERE b.business_id = #{typeId}")
    List<BusinessVO> selectByType(@Param("typeId") Long typeId);
    @Select("select * from business where order_type_id=#{typeId}")
    List<Business> BusinessByOrderTypeId(@Param("typeId") Long typeId);
    @Select("select * from business left join order_type_dict on order_type_id=type_id where business_id=#{businessId}")
    BusinessVO getBusinessById(@Param("businessId") Long businessId);
}




