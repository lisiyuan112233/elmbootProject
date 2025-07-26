package com.neusoft.elmboot.generator.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.neusoft.elmboot.generator.entity.Cart;
import com.neusoft.elmboot.generator.VO.CartVO;
import com.neusoft.elmboot.generator.DTO.CartDTO;
import java.util.List;

/**
* @author 32156
* @description 针对表【cart(购物车表)】的数据库操作Service
* @createDate 2025-07-21 21:33:59
*/
public interface CartService extends IService<Cart> {

    List<CartVO> listCartVO(Long userId, Long businessId);
    int saveCartVO(CartDTO cartDTO);
    int updateCart(CartDTO cartDTO);
    int removeCart(CartDTO cartDTO);
}
