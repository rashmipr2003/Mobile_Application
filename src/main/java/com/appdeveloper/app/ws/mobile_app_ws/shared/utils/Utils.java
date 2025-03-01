package com.appdeveloper.app.ws.mobile_app_ws.shared.utils;

import org.springframework.stereotype.Component;

import java.security.SecureRandom;
import java.util.Random;

//import static org.hibernate.annotations.UuidGenerator.Style.RANDOM;

@Component
public class Utils {

    private final Random RANDOM= new SecureRandom();
    private final String ALPHABET ="0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
    private final int ITERATIONS =10000;
    private final int KEY_LENGTH=256;
    public String generateUserId(int length){
        return generateRandomString(length);
    }
    public String generateRandomString(int length){
        StringBuilder returnValue= new StringBuilder(length);
        for(int i=0;i<length;i++){
            returnValue.append(ALPHABET.charAt(RANDOM.nextInt(ALPHABET.length())));
        }
        return new String(returnValue);
    }


}
