package com.project.amitie.mapper;

import com.project.amitie.dto.UserDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface UserMapper {

    @Select("SELECT user_name AS userName FROM   users")
    List<String> selectAllUserName();

    List<String> selectAllUser();
}
