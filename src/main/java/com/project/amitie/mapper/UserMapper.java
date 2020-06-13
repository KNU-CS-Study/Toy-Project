package com.project.amitie.mapper;

import com.project.amitie.DTO.UserDTO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface UserMapper {

    List<UserDTO> selectAllUser();
}
