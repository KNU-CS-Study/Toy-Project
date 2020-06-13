package com.project.amitie.DTO;

import lombok.Data;

@Data
public class UserDTO {
    private int userID;
    private String userName;
    private String userPassword;
    private String school;
    private String major;
    private String imageUrl;
    private String imageFileName;
    private String thumbnailUrl;
    private String thumbnailFileName;
}
