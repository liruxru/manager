package com.bonc.service.impl;

import com.bonc.mapper.UserMapper;
import com.bonc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public void reg(String userName, String password) {
    //如果用户名存在，返回错误
    BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
    String encode = encoder.encode(password);
    userMapper.reg(userName, encode);

    }
}
