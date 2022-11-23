package com.example.demo.service;

import com.example.demo.model.Role;
import com.example.demo.model.User;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;


import java.util.Collection;
import java.util.List;

@Service
public interface UserService extends UserDetailsService {

    List<User> getAllUsers();

    User createUser(User user);

    void deleteUser(Integer id);

    void updateUser(Integer id, User user);

    User showUser(Integer id);

    Collection<? extends GrantedAuthority> mapRolesToAuthorities(Collection<Role> roles);

    User findByUsername(String username);
}
