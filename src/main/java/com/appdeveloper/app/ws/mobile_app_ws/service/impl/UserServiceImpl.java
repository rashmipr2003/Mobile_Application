package com.appdeveloper.app.ws.mobile_app_ws.service.impl;

import com.appdeveloper.app.ws.mobile_app_ws.UserRepository;
import com.appdeveloper.app.ws.mobile_app_ws.io.entity.UserEntity;
import com.appdeveloper.app.ws.mobile_app_ws.service.UserService;
import com.appdeveloper.app.ws.mobile_app_ws.shared.dto.UserDto;
import com.appdeveloper.app.ws.mobile_app_ws.shared.utils.Utils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Autowired
    Utils utils;

    @Override
    public UserDto createUser(UserDto userdto) {
        if(userRepository.findUserByEmail(userdto.getEmail())!=null) {
            throw new RuntimeException("User already exists");
        }
        UserEntity user= new UserEntity();
        BeanUtils.copyProperties(userdto,user);

        String userid=utils.generateUserId(30);
        user.setUserID(userid);
        user.setEncryptedPassword("testpassword");
        if (user.getEmail() == null) {
            System.out.println("Email is null in service layer");
            throw new IllegalArgumentException("Email cannot be null");
        }
        UserEntity storedUser=userRepository.save(user);

        UserDto returnValue=new UserDto();
        BeanUtils.copyProperties(storedUser,returnValue);

        return returnValue;
    }
}
