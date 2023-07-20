package com.client.modal;

import com.client.entity.User;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


public class MyUserDetails implements UserDetails {

    private String userName;
    private String password;
    private boolean isEnabled;
    private List<GrantedAuthority> authorities = new ArrayList<>();


    public MyUserDetails(String userName) {
        this.userName = userName;
    }

    public MyUserDetails() {
    }

    public MyUserDetails(User user, String roleName) {
        this.userName = user.getEmail();
        this.password = user.getPassword();
        this.isEnabled = user.getIsEnabled();
        this.authorities.add(new SimpleGrantedAuthority(roleName));
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return userName;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return isEnabled;
    }
}
