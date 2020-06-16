package com.project.amitie.serviceimpl;

import com.project.amitie.dto.UserDTO;
import com.project.amitie.mapper.UserMapper;
import com.project.amitie.service.UserService;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class UserServiceImplement implements UserService {
    @Autowired
    private UserMapper userMapper;


    @Override
    public List<String> getUserList() {
        return userMapper.selectAllUserName();
    }
}
