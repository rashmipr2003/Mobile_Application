package com.appdeveloper.app.ws.mobile_app_ws.shared.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;

@Getter
@Setter
public class UserDto implements Serializable {

    @Serial
    private static final long serialVersionUID = 3244093633818855503L;
    private String userID;
    private String firstName;
    private String lastName;

    @NotNull
    @Email
    private String email;

    @NotNull
    private String password;
    private String encryptedPassword;
    private String emailVerificationToken;
    private Boolean emailVerificationStatus=false;
}
