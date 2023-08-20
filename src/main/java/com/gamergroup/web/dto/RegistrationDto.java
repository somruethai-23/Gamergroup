package com.gamergroup.web.dto;

import com.gamergroup.web.models.UserEntity;
import jakarta.validation.constraints.NotEmpty;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;
import java.util.stream.Collector;

@Data
public class RegistrationDto extends UserEntity {
    private Long id ;
    @NotEmpty
    private String username;
    @NotEmpty
    private String email;
    @NotEmpty
    private String password;

}
