package com.neusoft.elmboot.generator.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.neusoft.elmboot.generator.entity.DeliveryAddress;
import com.neusoft.elmboot.generator.VO.DeliveryAddressVO;
import com.neusoft.elmboot.generator.DTO.DeliveryAddressDTO;
import java.util.List;

/**
* @author 32156
* @description 针对表【delivery_address(送货地址表)】的数据库操作Service
* @createDate 2025-07-21 21:34:05
*/
public interface DeliveryAddressService extends IService<DeliveryAddress> {

    List<DeliveryAddressVO> listVOByUserId(Long userId);
    DeliveryAddressVO getVOById(Long daId);
    int saveDTO(DeliveryAddressDTO dto);
    int updateDTO(DeliveryAddressDTO dto);
    int removeById(Long daId);
}
