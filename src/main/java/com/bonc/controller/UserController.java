package com.bonc.controller;

import com.bonc.service.UserService;
import com.bonc.utils.ManagerResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("login")
    @ResponseBody
    public ManagerResult userReg(String userName,String password){
        userService.reg(userName,password);
        return  ManagerResult.ok();
    }


}
