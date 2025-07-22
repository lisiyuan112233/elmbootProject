package com.neusoft.elmboot;

import com.neusoft.elmboot.generator.entity.*;
import com.neusoft.elmboot.generator.mapper.BusinessMapper;
import com.neusoft.elmboot.generator.mapper.FoodMapper;
import com.neusoft.elmboot.generator.service.*;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class ElmbootApplicationTests {

    @Autowired
    public OrderTypeDictService orderTypeDictService;
    @Autowired
    public BusinessService businessService;
    @Autowired
    public BusinessMapper businessMapper;
    @Autowired
    public FoodService foodService;
    @Autowired
    public UserService userService;
    @Autowired
    public DeliveryAddressService deliveryAddressService;
    @Autowired
    public CartService cartService;
    @Autowired
    public OrdersService ordersService;
    @Autowired
    public OrderDetailService orderDetailService;
    @Test
    void contextLoads() {
        List<OrderTypeDict> OrderTypeDictList = new ArrayList<>();

        // 添加初始分类数据（对应表中数据）
        OrderTypeDictList.add(new OrderTypeDict("美食",1));
        OrderTypeDictList.add(new OrderTypeDict("早餐",2));
        OrderTypeDictList.add(new OrderTypeDict("跑腿代购",3));
        OrderTypeDictList.add(new OrderTypeDict("汉堡披萨",4));
        OrderTypeDictList.add(new OrderTypeDict("甜品饮品",5));
        OrderTypeDictList.add(new OrderTypeDict("速食简餐",6));
        OrderTypeDictList.add(new OrderTypeDict("地方小吃",7));
        OrderTypeDictList.add(new OrderTypeDict("米粉面馆",8));
        OrderTypeDictList.add(new OrderTypeDict("包子粥铺",9));
        OrderTypeDictList.add(new OrderTypeDict( "炸鸡炸串",10));
        orderTypeDictService.saveBatch(OrderTypeDictList);
    }
    @Test
    void test() {
        List<OrderDetail> orderDetailList = new ArrayList<>();

// 订单1的明细（对应订单1：用户1在商家1的订单）
        orderDetailList.add(new OrderDetail(
                1947476817652801537L,  // orderId：关联订单1
                1947460004353167361L,  // foodId：关联食品1（广式烧鹅）
                2,   // quantity：购买数量
                new BigDecimal("58.00")  // foodPrice：购买时单价
        ));

// 订单2的明细（对应订单2：用户2在商家3的订单）
        orderDetailList.add(new OrderDetail(
                1947476817761853442L,  // orderId：关联订单2
                1947460004474802183L,  // foodId：关联食品7（北京烤鸭）
                1,   // quantity：购买数量
                new BigDecimal("168.00")  // foodPrice：购买时单价
        ));

// 订单3的明细（对应订单3：用户3在商家4的订单）
        orderDetailList.add(new OrderDetail(
                1947476817761853443L,  // orderId：关联订单3
                1947460004474802186L, // foodId：关联食品10（蒜蓉粉丝蒸扇贝）
                3,   // quantity：购买数量
                new BigDecimal("58.00")  // foodPrice：购买时单价
        ));

// 订单4的明细（对应订单4：用户4在商家5的订单）
        orderDetailList.add(new OrderDetail(
                1947476817761853444L,  // orderId：关联订单4
                1947460004474802189L, // foodId：关联食品13（素炒时蔬）
                2,   // quantity：购买数量
                new BigDecimal("16.00")  // foodPrice：购买时单价
        ));

// 订单5的明细（对应订单5：用户5在商家2的订单）
        orderDetailList.add(new OrderDetail(
                1947476817761853445L,  // orderId：关联订单5
                1947460004474802180L,  // foodId：关联食品4（水煮鱼）
                1,   // quantity：购买数量
                new BigDecimal("68.00")  // foodPrice：购买时单价
        ));
        orderDetailList.add(new OrderDetail(  // 订单5包含两种食品
                1947476817761853445L,  // orderId：关联订单5
                1947460004474802182L,  // foodId：关联食品6（回锅肉）
                1,   // quantity：购买数量
                new BigDecimal("38.00")  // foodPrice：购买时单价
        ));
        orderDetailService.saveBatch(orderDetailList);
    }

    public static void main(String[] args) {
    }
}
