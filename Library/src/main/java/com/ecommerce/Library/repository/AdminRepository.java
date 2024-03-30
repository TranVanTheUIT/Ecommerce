package com.ecommerce.Library.repository;

import com.ecommerce.Library.model.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Long> {

    Admin findByUserName(String username);
}
