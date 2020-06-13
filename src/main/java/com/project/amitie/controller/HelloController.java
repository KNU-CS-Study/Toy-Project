package com.project.amitie.controller;

import com.project.amitie.DTO.UserDTO;
import com.project.amitie.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloController {

    @Autowired
    private UserService userService;

    @RequestMapping("/")
    public String hello(){
        List<UserDTO> users = userService.getUserList();
        String result = "";
        for(int i=0;i<users.size();i++){
            result += users.get(i).toString();
        }
        return result;
    }
}
