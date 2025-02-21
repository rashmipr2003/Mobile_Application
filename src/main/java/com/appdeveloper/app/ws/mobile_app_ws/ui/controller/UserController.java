package com.appdeveloper.app.ws.mobile_app_ws.ui.controller;

import com.appdeveloper.app.ws.mobile_app_ws.service.UserService;
import com.appdeveloper.app.ws.mobile_app_ws.shared.dto.UserDto;
import com.appdeveloper.app.ws.mobile_app_ws.ui.model.request.UserDetailsRequestModel;
import com.appdeveloper.app.ws.mobile_app_ws.ui.model.response.UserDetailsResponseModel;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@RestController
@RequestMapping("users") //http://localhost:8080/users
public class UserController {

    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    UserService userService;

    @GetMapping
    public String getUser(){


        return "get user was called";
    }

    @PostMapping
    public UserDetailsResponseModel createUser(@Valid @RequestBody UserDetailsRequestModel userDetails){
        logger.info("Received request: {}", userDetails);

        UserDto userdto = new UserDto();
        BeanUtils.copyProperties(userDetails, userdto);

        System.out.println("UserDto email: " + userdto.getEmail());

        UserDto createdUser = userService.createUser(userdto);

        UserDetailsResponseModel returnValue = new UserDetailsResponseModel();
        BeanUtils.copyProperties(createdUser, returnValue);

        return returnValue;
    }

    @PutMapping
    public String updateUser(){

        return "update user was called";
    }

    @DeleteMapping
    public String deleteUser(){

        return "delete user was called";
    }
}
