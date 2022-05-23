package com.itheima.config;

import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
/**
 * 创建第三方的配置文件
 * @Configuration
 * 使用@Configuration声明是一个配置类
 * @Bean
 * 将对象注入到Spring的容器中
 */
public class MPConfig {
    @Bean
    public MybatisPlusInterceptor mybatisPlusInterceptor(){
        MybatisPlusInterceptor interceptor = new MybatisPlusInterceptor();
        /**
         * 手动创建了一个MybatisPlusInterceptor的拦截器壳，但需要手动添加拦截器
         * addInnerInterceptor方法来添加
         */

        //添加分页的拦截器
        interceptor.addInnerInterceptor(new PaginationInnerInterceptor());
        return  interceptor;
    }
}
