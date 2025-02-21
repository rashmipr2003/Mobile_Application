package com.appdeveloper.app.ws.mobile_app_ws.ui.model.request;

import lombok.Data;

@Data
public class UserLoginRequest {
    private String email;
    private String password;

}
