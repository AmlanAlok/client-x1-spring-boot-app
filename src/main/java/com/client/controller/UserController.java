//package com.client.controller;
//
//import com.client.entity.User;
//import com.client.service.UserService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//import java.util.logging.Logger;
//
//
//
//@RestController
//@RequestMapping("api/v1/user")
//public class UserController {
//
//    private static final Logger logger = Logger.getLogger(UserController.class.getName());
//
//    @Autowired
//    private UserService userService;
//
//    @PostMapping("/save")
//    User saveUser(@RequestBody User user){
//        return userService.saveUser(user);
//    }
//
//}
