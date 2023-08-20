package com.gamergroup.web.repository;

import com.gamergroup.web.models.Role;
import com.gamergroup.web.models.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role,Long> {
    Role findByName(String name);
}
