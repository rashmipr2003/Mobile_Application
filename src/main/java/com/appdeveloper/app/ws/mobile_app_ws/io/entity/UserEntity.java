package com.appdeveloper.app.ws.mobile_app_ws.io.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

@Data
@Entity(name="usersdetails")
public class UserEntity implements Serializable {
    @Serial
    private static final long serialVersionUID = 3139804973834971264L;

    @Id
    @GeneratedValue
    private long id;

    @Column(nullable = false,length = 50)
    private String userID;

    @Column(nullable = false,length = 50)
    private String firstName;

    @Column(nullable = false,length = 50)
    private String lastName;

    @NotNull
    @Column(nullable = false,length = 120,unique=true)
    @Email
    private String email;

    @Column(nullable = false)
    private String encryptedPassword;


    private String emailVerificationToken;

    @Column(nullable = false)
    private Boolean emailVerificationStatus=false;

}
