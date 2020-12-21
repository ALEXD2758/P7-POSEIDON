package com.alex.poseidon.services;


import com.alex.poseidon.models.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    UserService userService;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        Set<GrantedAuthority> grantedAuthorities = new HashSet<>();
        UserModel personToLogin = userService.getUserByEmail(s);
        if(personToLogin.getRole().equals("ADMIN")) {
            grantedAuthorities.add(new SimpleGrantedAuthority("ADMIN"));
            return new User(personToLogin.getUsername(), personToLogin.getPassword(), grantedAuthorities);
        }
        else {
            grantedAuthorities.add(new SimpleGrantedAuthority("USER"));
            return new User(personToLogin.getUsername(), personToLogin.getPassword(), grantedAuthorities);
        }
    }
}