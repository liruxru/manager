package com.bonc;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class ByCrod {
    public static void main(String[] args) {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        String encode = encoder.encode("123456");
        System.out.println(encoder.encode("123456"));
        System.out.println(encoder.encode("123456"));
    }
}
