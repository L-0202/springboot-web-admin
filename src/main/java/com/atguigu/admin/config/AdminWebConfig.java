package com.atguigu.admin.config;


import com.atguigu.admin.interceptor.LoginInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 *1.编写一个拦截器实现HandlerInterceptor接口
 * 2.拦截器注册到容器中，实现WebMvcConfigurer的addInterceptors方法
 * 3.指定拦截规则【注意静态资源】
 */
@Configuration
public class AdminWebConfig implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoginInterceptor())
                //所有请求都会被拦截，包括静态资源
                .addPathPatterns("/**")
                //放行静态资源
                .excludePathPatterns("/","/login","/css/**","/fonts/**","/images/**","/js/**");
    }
}
