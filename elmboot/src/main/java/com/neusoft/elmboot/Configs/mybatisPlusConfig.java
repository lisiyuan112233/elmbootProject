package com.neusoft.elmboot.Configs;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDateTime;

@Configuration
public class mybatisPlusConfig {
    @Bean
    @SuppressWarnings("all")
    public MyMetaObjectHandler myMetaObjectHandler() {
        return new MyMetaObjectHandler();
    }
}
class MyMetaObjectHandler implements MetaObjectHandler {
    @Override
    public void insertFill(MetaObject metaObject) {
        // 强制填充，无论字段是否为空
        strictInsertFill(metaObject, "createTime", LocalDateTime.class, LocalDateTime.now());
        strictInsertFill(metaObject, "updateTime", LocalDateTime.class, LocalDateTime.now());
    }

    @Override
    public void updateFill(MetaObject metaObject) {
        strictUpdateFill(metaObject, "updateTime", LocalDateTime.class, LocalDateTime.now());
    }
}
