package com.gamergroup.web.repository;

import com.gamergroup.web.models.UserEntity;
import org.jetbrains.annotations.NotNull;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<UserEntity,Long> {
    UserEntity findByEmail(String email);
    UserEntity findByUsername(String username);

    UserEntity findFirstByUsername(String username);

}
