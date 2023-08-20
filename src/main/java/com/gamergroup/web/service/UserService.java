package com.gamergroup.web.service;

import com.gamergroup.web.dto.RegistrationDto;
import com.gamergroup.web.models.UserEntity;

import java.util.Optional;

public interface UserService {
    void saveUser(RegistrationDto registrationDto);

    UserEntity findByEmail(String email);

    UserEntity findByUsername(String username);

}
