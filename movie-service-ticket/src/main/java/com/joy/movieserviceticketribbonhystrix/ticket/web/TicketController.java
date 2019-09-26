package com.joy.movieserviceticketribbonhystrix.ticket.web;

import com.joy.movieserviceticketribbonhystrix.ticket.domain.po.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("ticket")
public class TicketController {
    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private DiscoveryClient discoveryClient;

    @RequestMapping("getUser/{id}")
    public User get(@PathVariable Long id){
        return restTemplate.getForObject("http://localhost:9000/user/" + id, User.class);
    }

    /**
     * 获取元数据
     */
    @RequestMapping("instance")
    public List<ServiceInstance> showInstance(){
        return discoveryClient.getInstances("movie-service-ticket");
    }
}
