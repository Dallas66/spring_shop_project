package com.epam.rd.denis.springshop.interceptors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Autowired
    UserInterceptor userInterceptor;
    @Autowired
    AdminInterceptor adminInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(userInterceptor).addPathPatterns("/**").excludePathPatterns("/autorization", "/registration", "/css's/**", "/js/**");
        registry.addInterceptor(adminInterceptor).addPathPatterns("/admin");
    }
}
