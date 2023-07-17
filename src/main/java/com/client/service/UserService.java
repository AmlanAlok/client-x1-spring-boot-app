package com.client.service;

import com.client.entity.User;
import com.client.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;

@Service
public class UserService {

    @Autowired
    public UserRepository userRepository;

    public User saveUser(User user){
        user.setCreatedAt(new Timestamp(System.currentTimeMillis()));
        System.out.println(user);
//        return userRepository.save(user);
        return user;

    }
}
