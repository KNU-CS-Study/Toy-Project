package com.project.amitie.serviceimpl;

import com.project.amitie.DTO.UserDTO;
import com.project.amitie.mapper.UserMapper;
import com.project.amitie.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImplement implements UserService {
    @Autowired
    private UserMapper userMapper;


    @Override
    public List<UserDTO> getUserList() {

        return userMapper.selectAllUser();
    }
}
