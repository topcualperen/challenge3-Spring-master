package com.topcualperen.dto;

import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
public class UserDto {

    @Email
    @NotBlank(message = "Email may not be blank !")
    private String email;

    @NotBlank(message = "Password may not be blank !")
    private String password;

}
