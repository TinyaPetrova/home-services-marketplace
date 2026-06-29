package com.example.home_services_marketplace.repository;

import com.example.home_services_marketplace.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
