package com.hd.user.controller;

import com.hd.user.entity.User;
import com.hd.user.service.UserService;
import com.hd.user.vo.ResponseTemplateVO;
import io.swagger.v3.oas.annotations.Operation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/users")
@Slf4j
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/")
    @Operation(summary = "Save User REST API")
    public User saveUser(@RequestBody User user){
        log.info("Inside save user method of UserController");
        return userService.saveUser(user);
    }

    @GetMapping("/{id}")
    @Operation(summary = "Save user with template vo")
    public ResponseTemplateVO getUserWithDepartment(@PathVariable("id") Long userId){
        log.info("Inside save user of UserController");
        return userService.getUserWithDepartment(userId);
    }
}
