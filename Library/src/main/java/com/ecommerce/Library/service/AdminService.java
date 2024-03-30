package com.ecommerce.Library.service;

import com.ecommerce.Library.dto.AdminDto;
import com.ecommerce.Library.model.Admin;


public interface AdminService {
    Admin findByUserName(String username);


    Admin save(AdminDto adminDto);
}
