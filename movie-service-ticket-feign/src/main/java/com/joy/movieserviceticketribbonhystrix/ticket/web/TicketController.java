package com.joy.movieserviceticketribbonhystrix.ticket.web;

import com.joy.movieserviceticketribbonhystrix.feign.UserFeignClient;
import com.joy.movieserviceticketribbonhystrix.ticket.domain.po.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("ticket")
public class TicketController {

    @Autowired
    private UserFeignClient userFeignClient;

    private static final Logger LOGGER = LoggerFactory.getLogger(TicketController.class);

    @GetMapping("/user/{id}")
    public User findById(@PathVariable Long id){
        return userFeignClient.findById(id);
    }



}
