package com.project.amitie.service;

import com.project.amitie.dto.UserDTO;
import com.project.amitie.mapper.UserMapper;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;


    public List<UserDTO> getUserList() {
        return userMapper.selectUserByID();
    }
}
