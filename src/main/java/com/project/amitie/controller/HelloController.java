package com.project.amitie.controller;

import com.project.amitie.dto.UserDTO;
import com.project.amitie.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
public class HelloController {

    @Autowired
    private UserService userService;

    @GetMapping("/hello")
    public String hello(){
        log.info("hello Controller!!!!");

        List<UserDTO> users = userService.getUserList();
        //String result ="";
        for(int i=0;i<users.size();i++){
            //result += ("users : "+users.get(i).toString()+" \n");
            log.debug("users : "+users.get(i).toString());
        }
        return "hello";
    }

    @GetMapping("/my")
    public String my(){
        return "my";
    }
}
