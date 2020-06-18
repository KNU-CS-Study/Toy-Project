package com.project.amitie.mapper;

import com.project.amitie.dto.UserDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface UserMapper {

    public List<UserDTO> selectUserByID();

    @Select("SELECT * FROM   users")
    public List<UserDTO> selectAllUser();


}
