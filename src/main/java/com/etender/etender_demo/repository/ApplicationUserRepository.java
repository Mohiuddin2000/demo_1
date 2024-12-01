package com.etender.etender_demo.repository;

import com.etender.etender_demo.entity.ApplicationUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApplicationUserRepository extends JpaRepository<ApplicationUser,Integer> {
    ApplicationUser findByUsername(String username);
}
