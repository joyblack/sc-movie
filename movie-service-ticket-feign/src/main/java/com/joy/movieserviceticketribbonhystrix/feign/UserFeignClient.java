package com.joy.movieserviceticketribbonhystrix.feign;

import com.joy.movieserviceticketribbonhystrix.ticket.domain.po.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "movie-service-user")
public interface UserFeignClient {
    /**
     * 通过ID获取用户信息
     */
    @RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
    User findById(@PathVariable Long id);


}
