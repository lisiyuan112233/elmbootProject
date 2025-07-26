package com.neusoft.elmboot.generator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.neusoft.elmboot.generator.entity.Cart;
import com.neusoft.elmboot.generator.VO.CartVO;
import com.neusoft.elmboot.generator.DTO.CartDTO;
import com.neusoft.elmboot.generator.mapper.CartMapper;
import com.neusoft.elmboot.generator.mapper.FoodMapper;
import com.neusoft.elmboot.generator.mapper.BusinessMapper;
import com.neusoft.elmboot.generator.service.CartService;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

/**
* @author 32156
* @description 针对表【cart(购物车表)】的数据库操作Service实现
* @createDate 2025-07-21 21:33:59
*/
@Service
public class CartServiceImpl extends ServiceImpl<CartMapper, Cart>
    implements CartService {

    @Autowired
    private CartMapper cartMapper;

    @Override
    public List<CartVO> listCartVO(Long userId, Long businessId) {
        return cartMapper.listCartVO(userId, businessId);
    }

    @Override
    public int saveCartVO(CartDTO cartDTO) {
        Cart cart = new Cart(cartDTO.getFoodId(), cartDTO.getBusinessId(), cartDTO.getUserId());
        this.save(cart);
        // 简单返回最新一条（实际应返回插入后的完整VO，可根据实际需求调整）
        List<CartVO> list = cartMapper.listCartVO(cartDTO.getUserId(), cartDTO.getBusinessId());
        return list.size();
    }

    @Override
    public int updateCart(CartDTO cartDTO) {
        // 根据 userId, businessId, foodId 更新数量
        return lambdaUpdate()
                .eq(Cart::getUserId, cartDTO.getUserId())
                .eq(Cart::getBusinessId, cartDTO.getBusinessId())
                .eq(Cart::getFoodId, cartDTO.getFoodId())
                .set(Cart::getQuantity, cartDTO.getQuantity())
                .update() ? 1 : 0;
    }

    @Override
    public int removeCart(CartDTO cartDTO) {
        // 支持多种删除方式
        return lambdaUpdate()
                .eq(Cart::getUserId, cartDTO.getUserId())
                .eq(Cart::getBusinessId, cartDTO.getBusinessId())
                .eq(cartDTO.getFoodId() != null, Cart::getFoodId, cartDTO.getFoodId())
                .remove() ? 1 : 0;
    }
}




