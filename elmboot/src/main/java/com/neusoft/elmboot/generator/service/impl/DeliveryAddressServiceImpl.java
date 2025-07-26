package com.neusoft.elmboot.generator.service.impl;

import cn.hutool.core.bean.BeanUtil;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.neusoft.elmboot.generator.entity.DeliveryAddress;
import com.neusoft.elmboot.generator.VO.DeliveryAddressVO;
import com.neusoft.elmboot.generator.DTO.DeliveryAddressDTO;
import com.neusoft.elmboot.generator.mapper.DeliveryAddressMapper;
import com.neusoft.elmboot.generator.service.DeliveryAddressService;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

/**
* @author 32156
* @description 针对表【delivery_address(送货地址表)】的数据库操作Service实现
* @createDate 2025-07-21 21:34:05
*/
@Service
public class DeliveryAddressServiceImpl extends ServiceImpl<DeliveryAddressMapper, DeliveryAddress>
    implements DeliveryAddressService {

    @Autowired
    private DeliveryAddressMapper deliveryAddressMapper;

    @Override
    public List<DeliveryAddressVO> listVOByUserId(Long userId) {
        return deliveryAddressMapper.listVOByUserId(userId);
    }

    @Override
    public DeliveryAddressVO getVOById(Long daId) {
        return deliveryAddressMapper.getVOById(daId);
    }

    @Override
    public int saveDTO(DeliveryAddressDTO dto) {
        DeliveryAddress entity = new DeliveryAddress();
        BeanUtil.copyProperties(dto, entity);
        return this.save(entity) ? 1 : 0;
    }

    @Override
    public int updateDTO(DeliveryAddressDTO dto) {
        DeliveryAddress entity = this.getById(dto.getDaId());
        if(entity == null) return 0;
        BeanUtil.copyProperties(dto, entity);
        return this.updateById(entity) ? 1 : 0;
    }

    @Override
    public int removeById(Long daId) {
        return removeById(daId);
    }
}




