package com.appdeveloper.app.ws.mobile_app_ws.ui.model.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDetailsRequestModel {

    @NotNull(message = "First name cannot be null")
    private String firstName;

    @NotNull(message = "Last name cannot be null")
    private String lastName;

    @NotNull(message = "Email cannot be null")
    @Email(message = "Invalid email format")
    private String email;

    @NotNull(message = "Password cannot be null")
    private String password;
}
