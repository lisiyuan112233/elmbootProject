package com.neusoft.elmboot.Configs;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.neusoft.elmboot.generator.entity.Business;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
@Configuration
public class basicConfig implements WebMvcConfigurer {
    @Override
    @SuppressWarnings("all")
    public void addCorsMappings(CorsRegistry registry){
        registry.addMapping("/**").
                allowedOriginPatterns("http://localhost:8081").
                allowCredentials(true).
                allowedMethods("GET","POST","PUT","DELETE","OPTIONS").
                allowedHeaders("*").
                maxAge(36000);

    }

    public static void main(String[] args) {
        System.out.println(new ObjectMapper().convertValue(new Business(), Business.class));
    }
}
