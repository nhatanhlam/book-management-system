package com.example.book_social_network.user.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PasswordUpdateDTO {

    @NotBlank(message = "Password cannot be blank")
    private String newPassword;

    @NotBlank(message = "Old password is required")
    private String oldPassword;
}
