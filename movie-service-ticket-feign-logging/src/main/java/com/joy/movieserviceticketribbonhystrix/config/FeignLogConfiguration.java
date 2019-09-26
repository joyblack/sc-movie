package com.joy.movieserviceticketribbonhystrix.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FeignLogConfiguration {
    @Bean
    Logger.Level feignLoggerLevel(){
        // 若该为Basic，则不会打印返回数据等信息
        return Logger.Level.BASIC;
//        return Logger.Level.FULL;
    }
}
