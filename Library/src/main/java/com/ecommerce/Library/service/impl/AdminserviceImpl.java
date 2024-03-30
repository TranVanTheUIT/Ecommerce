package com.ecommerce.Library.service.impl;

import com.ecommerce.Library.dto.AdminDto;
import com.ecommerce.Library.model.Admin;
import com.ecommerce.Library.repository.AdminRepository;
import com.ecommerce.Library.repository.RoleRepository;

import com.ecommerce.Library.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class AdminserviceImpl implements AdminService {

    @Autowired
    private AdminRepository adminRepository;

    @Autowired
    private RoleRepository roleRepository;

    @Override
    public Admin findByUserName(String username) {
        return adminRepository.findByUserName(username);
    }


    @Override
    public Admin save(AdminDto adminDto) {
        Admin admin = new Admin();
        admin.setFirstName(adminDto.getFirstName());
        admin.setLastName(adminDto.getLastName());
        admin.setUserName(adminDto.getUsername());
        admin.setPassword(adminDto.getPassword());
        admin.setRoles(Arrays.asList(roleRepository.findByName("ADMIN")));
        return adminRepository.save(admin);
    }
}
