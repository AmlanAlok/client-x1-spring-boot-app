package com.client.service;

import com.client.entity.User;
import com.client.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    public UserRepository userRepository;

    public User saveUser(User user){
        return userRepository.save(user);
    }
}
