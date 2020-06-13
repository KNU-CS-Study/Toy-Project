package com.project.amitie.service;

import com.project.amitie.DTO.UserDTO;
import org.springframework.stereotype.Service;

import java.util.List;


public interface UserService {

    List<UserDTO> getUserList();
}
