package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.repository.UserRepository;
import com.example.demo.entity.User;
import com.example.demo.vo.UserVO;


@RestController
@RequestMapping(value = "rest")
public class TestController {

    @Autowired
    UserRepository userRepository;

    @PostMapping(value = "dashboard/addUser")

    public boolean add(User user) {
        System.out.println("dashboard/addUser 들어옴");
        System.out.println("uservo.getName(): "+user.getName()+" /uservo.getAge(): "+user.getAge());
        userRepository.save(user);
        return true;
    }
}
