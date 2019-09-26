package com.joy.movieserviceticketribbonhystrix.ticket.web;

import com.joy.movieserviceticketribbonhystrix.ticket.domain.po.User;
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

@RestController
@RequestMapping("ticket")
public class TicketController {
    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private LoadBalancerClient loadBalancerClient;

    private static final Logger LOGGER = LoggerFactory.getLogger(TicketController.class);

    @GetMapping("/user/{id}")
    public User findById(@PathVariable Long id){
        System.out.println("请求:" + id);
        return restTemplate.getForObject("http://movie-service-user/user/" + id,User.class);
    }


    /**
     * 查看当前选择的微服务节点的信息
     */
    @GetMapping("/log")
    public void log(){
        /**
         * 选择微服务节点
         */
        ServiceInstance serviceInstance = loadBalancerClient.choose("movie-service-user");
        LOGGER.info("{}:{}:{}",serviceInstance.getInstanceId(), serviceInstance.getHost(), serviceInstance.getPort());
    }

}
