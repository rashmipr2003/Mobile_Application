package com.appdeveloper.app.ws.mobile_app_ws.service;

import com.appdeveloper.app.ws.mobile_app_ws.shared.dto.UserDto;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    UserDto createUser(UserDto userdto);
}
