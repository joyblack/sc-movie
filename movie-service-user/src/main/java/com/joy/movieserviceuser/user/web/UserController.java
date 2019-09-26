package com.joy.movieserviceuser.user.web;

import com.joy.movieserviceuser.user.domain.entity.UserEntity;
import com.joy.movieserviceuser.user.domain.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserRepository userRepository;

    /**
     * 通过ID获取用户信息
     */
    @GetMapping("{id}")
    public UserEntity get(@PathVariable Long id){
        return userRepository.findAllById(id);
    }
}
