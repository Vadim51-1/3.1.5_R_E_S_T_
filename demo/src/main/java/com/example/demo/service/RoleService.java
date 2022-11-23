package com.example.demo.service;

import com.example.demo.model.Role;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public interface RoleService {
    Role findRoleById(Integer id);

    List<Role> getAllRoles();

    void addRole(Role role);
}
