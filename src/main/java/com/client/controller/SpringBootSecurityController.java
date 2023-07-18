package com.client.controller;


import com.client.entity.User;
import com.client.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringBootSecurityController {

    @Autowired
    private UserService userService;

    @GetMapping("/")
    public String home() {
        return ("<h1>Welcome</h1>");
    }

    @GetMapping("/user")
    public String user() {
        System.out.println("USER-----------");
        return ("<h1>Welcome User</h1>");
    }

    @GetMapping("/admin")
    public String admin() {
        System.out.println("ADMIN-----------");
        return ("<h1>Welcome Admin</h1>");
    }

    @PostMapping("/save")
    User saveUser(@RequestBody User user){
        return userService.saveUser(user);
    }

}
