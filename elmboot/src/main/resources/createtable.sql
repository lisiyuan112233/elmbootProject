CREATE TABLE `business` (
  `business_id` bigint NOT NULL COMMENT '商家编号（雪花算法生成）',
  `business_name` varchar(40) NOT NULL COMMENT '商家名称',
  `business_address` varchar(50) DEFAULT NULL COMMENT '商家地址',
  `business_explain` varchar(40) DEFAULT NULL COMMENT '商家介绍',
  `business_img` mediumtext NOT NULL COMMENT '商家图片',
  `order_type_id` bigint NOT NULL COMMENT '点餐分类',
  `star_price` decimal(5,2) DEFAULT 0.00 COMMENT '起送费',
  `delivery_price` decimal(5,2) DEFAULT 0.00 COMMENT '配送费',
  `remarks` varchar(40) DEFAULT NULL COMMENT '备注',
  `create_time` datetime NOT NULL COMMENT '创建时间',
  `update_time` datetime NOT NULL COMMENT '修改时间',
  PRIMARY KEY (`business_id`),
  KEY `idx_order_typeId` (`order_type_id`) COMMENT '点餐分类索引'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='商家表';

CREATE TABLE `food` (
  `food_id` bigint NOT NULL COMMENT '食品编号（雪花算法生成）',
  `food_name` varchar(30) NOT NULL COMMENT '食品名称',
  `food_explain` varchar(30) NOT NULL COMMENT '食品介绍',
  `food_img` mediumtext NOT NULL COMMENT '食品图片',
  `food_price` decimal(5,2) NOT NULL COMMENT '食品价格',
  `business_id` bigint NOT NULL COMMENT '所属商家编号',
  `remarks` varchar(40) DEFAULT NULL COMMENT '备注',
  `create_time` datetime NOT NULL COMMENT '创建时间',
  `update_time` datetime NOT NULL COMMENT '修改时间',
  PRIMARY KEY (`food_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='食品表';

CREATE TABLE `cart` (
  `cart_id` bigint NOT NULL COMMENT '购物车记录编号（雪花算法生成）',
  `food_id` bigint NOT NULL COMMENT '食品编号',
  `business_id` bigint NOT NULL COMMENT '所属商家编号',
  `user_id` bigint NOT NULL COMMENT '所属用户编号',
  `quantity` int NOT NULL COMMENT '同一类型食品的购买数量',
  `create_time` datetime NOT NULL COMMENT '创建时间',
  `update_time` datetime NOT NULL COMMENT '修改时间',
  PRIMARY KEY (`cart_id`),
  -- 联合唯一索引：防止同一用户对同一食品重复添加购物车
  UNIQUE KEY `uk_user_food` (`user_id`, `food_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='购物车表';

CREATE TABLE `delivery_address` (
  `da_id` bigint NOT NULL COMMENT '送货地址编号（雪花算法生成）',
  `contact_name` varchar(20) NOT NULL COMMENT '联系人姓名',
  `contact_sex` int NOT NULL COMMENT '联系人性别（0-未知，1-男，2-女）',
  `contact_tel` varchar(20) NOT NULL COMMENT '联系人电话',
  `address` varchar(100) NOT NULL COMMENT '送货地址',
  `user_id` bigint NOT NULL COMMENT '所属用户编号',
  `create_time` datetime NOT NULL COMMENT '创建时间',
  `update_time` datetime NOT NULL COMMENT '修改时间',
  PRIMARY KEY (`da_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='送货地址表';

CREATE TABLE `orders` (
  `order_id` bigint NOT NULL COMMENT '订单编号（雪花算法生成）',
  `user_id` bigint NOT NULL COMMENT '所属用户编号',
  `business_id` bigint NOT NULL COMMENT '所属商家编号',
  `order_date` datetime NOT NULL COMMENT '订购日期（改为datetime类型存储）',
  `order_total` decimal(7,2) NOT NULL DEFAULT 0.00 COMMENT '订单总价',
  `da_id` bigint NOT NULL COMMENT '所属送货地址编号',
  `order_state` int NOT NULL DEFAULT 0 COMMENT '订单状态（0：未支付；1：已支付）',
  `create_time` datetime NOT NULL COMMENT '记录创建时间',
  `update_time` datetime NOT NULL COMMENT '记录修改时间',
  PRIMARY KEY (`order_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='订单表';

CREATE TABLE `order_detail` (
  `od_id` bigint NOT NULL COMMENT '订单明细编号（雪花算法生成）',
  `order_id` bigint NOT NULL COMMENT '所属订单编号',
  `food_id` bigint NOT NULL COMMENT '所属食品编号',
  `quantity` int NOT NULL COMMENT '食品数量',
  `create_time` datetime NOT NULL COMMENT '创建时间',
  `food_price` decimal(5,2) NOT NULL COMMENT '购买时的食品单价',
  PRIMARY KEY (`od_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='订单明细表';

CREATE TABLE `user` (
  `user_id` bigint NOT NULL COMMENT '用户编号',
  `password` varchar(20) NOT NULL COMMENT '密码',
  `user_name` varchar(20) NOT NULL COMMENT '用户名称',
  `user_sex` int NOT NULL DEFAULT 1 COMMENT '用户性别（1：男；0：女）',
  `user_img` mediumtext COMMENT '用户头像',
  `del_tag` int NOT NULL DEFAULT 1 COMMENT '删除标记（1：正常；0：删除）',
  `create_time` datetime NOT NULL COMMENT '创建时间',
  `update_time` datetime NOT NULL COMMENT '修改时间',
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='用户表';

CREATE TABLE `order_type_dict` (
  `type_id` bigint NOT NULL COMMENT '分类编号',
  `type_name` varchar(20) NOT NULL COMMENT '分类名称',
  `sort_order` int NOT NULL DEFAULT 0 COMMENT '排序序号（用于展示顺序）',
  `del_tag` int NOT NULL DEFAULT 1 COMMENT '删除标记（1：正常；0：删除）',
  `create_time` datetime NOT NULL COMMENT '创建时间',
  `update_time` datetime NOT NULL COMMENT '修改时间',
  PRIMARY KEY (`type_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='点餐分类数据字典表';














