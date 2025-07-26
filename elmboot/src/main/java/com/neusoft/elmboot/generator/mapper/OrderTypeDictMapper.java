package com.neusoft.elmboot.generator.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.neusoft.elmboot.generator.entity.OrderTypeDict;
import com.neusoft.elmboot.generator.VO.OrderTypeDictVO;
import org.apache.ibatis.annotations.Select;
import java.util.List;

/**
* @author 32156
* @description 针对表【order_type_dict(点餐分类数据字典表)】的数据库操作Mapper
* @createDate 2025-07-21 21:34:13
* @Entity generator.entity.OrderTypeDict
*/
public interface OrderTypeDictMapper extends BaseMapper<OrderTypeDict> {

    @Select("SELECT type_id, type_name, sort_order, create_time, update_time FROM order_type_dict WHERE del_tag = 1 ORDER BY sort_order ASC")
    List<OrderTypeDictVO> listAllVO();
}




