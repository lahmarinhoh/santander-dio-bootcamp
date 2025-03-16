package com.dio.santander.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dio.santander.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
