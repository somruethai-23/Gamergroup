package com.gamergroup.web.service.impl;

import com.gamergroup.web.dto.RegistrationDto;
import com.gamergroup.web.models.Role;
import com.gamergroup.web.models.UserEntity;
import com.gamergroup.web.repository.RoleRepository;
import com.gamergroup.web.repository.UserRepository;
import com.gamergroup.web.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;
    private RoleRepository roleRepository;
    private PasswordEncoder passwordEncoder;

    @Autowired
    public UserServiceImpl(UserRepository userRepository, RoleRepository roleRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public void saveUser(RegistrationDto registrationDto) {
        UserEntity user = new UserEntity();
        user.setUsername(registrationDto.getUsername());
        user.setEmail(registrationDto.getEmail());
        user.setPassword(passwordEncoder.encode(registrationDto.getPassword()));
        Role role = roleRepository.findByName("USER");
        user.setRoles(Arrays.asList(role));
        userRepository.save(user);
    }

    @Override
    public UserEntity findByEmail(String email) {

        return userRepository.findByEmail(email);
    }

    @Override
    public UserEntity findByUsername(String username) {
        return userRepository.findByUsername(username);
    }

}
