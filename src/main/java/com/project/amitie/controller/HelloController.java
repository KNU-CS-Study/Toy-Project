package com.project.amitie.controller;

import com.project.amitie.dto.UserDTO;
import com.project.amitie.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
public class HelloController {

    @Autowired
    private UserService userService;

    @RequestMapping("/")
    public String hello(){
        log.info("hello Controller!!!!");

        List<String> users = userService.getUserList();
        for(int i=0;i<users.size();i++){
            log.debug("users : "+users.get(i));
        }
        return users.get(0);
    }
}
