package com.joy.movieserviceticketribbonhystrix.ticket.web;

import com.joy.movieserviceticketribbonhystrix.ticket.domain.po.User;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.math.BigDecimal;

@RestController
@RequestMapping("ticket")
public class TicketController {
    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private LoadBalancerClient loadBalancerClient;

    private static final Logger LOGGER = LoggerFactory.getLogger(TicketController.class);

    @HystrixCommand(fallbackMethod = "findByIdFallback")
    @GetMapping("/user/{id}")
    public User findById(@PathVariable Long id){
        return restTemplate.getForObject("http://movie-service-user/user/" + id,User.class);
    }


    /**
     * 容错返回
     */
    public User findByIdFallback(Long id){
        User user = new User();
        user.setBalance(BigDecimal.ZERO);
        user.setId(0L);
        user.setLoginName("未知");
        user.setUsername("未知");
        return user;
    }

}
