package com.client.service;

import com.client.entity.User;
import com.client.modal.MyUserDetails;
import com.client.repository.RoleRepository;
import com.client.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    UserRepository userRepository;

    @Autowired
    RoleRepository roleRepository;

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
//        return new MyUserDetails(username);
        Optional<User> user =userRepository.findByEmail(userName);
        user.orElseThrow(() -> new UsernameNotFoundException("Not found: " + userName));
        User currentUser = user.get();
        String roleName = roleRepository.findById(currentUser.getRolesId()).get().getName();
        System.out.println(roleName);
        return new MyUserDetails(currentUser, roleName);
    }
}
