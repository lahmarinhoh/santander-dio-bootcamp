package com.dio.santander.service;

import com.dio.santander.model.User;

public interface UserService {

    User findById(Long id);
    User create(User userToCreate);

}
