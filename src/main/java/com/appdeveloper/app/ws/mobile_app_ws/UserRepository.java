package com.appdeveloper.app.ws.mobile_app_ws;

import com.appdeveloper.app.ws.mobile_app_ws.io.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<UserEntity,Long> {
    UserEntity findUserByEmail(String email);
}
