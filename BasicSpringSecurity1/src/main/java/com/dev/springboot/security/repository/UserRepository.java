package com.dev.springboot.security.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dev.springboot.security.model.User;

@Repository

public interface UserRepository extends JpaRepository<User, Long> {

}
