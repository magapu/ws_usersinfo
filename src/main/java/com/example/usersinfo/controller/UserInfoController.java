package com.example.usersinfo.controller;


import com.example.usersinfo.DTO.UsersInfoDTO;
import com.example.usersinfo.service.UserService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;


@AllArgsConstructor
@NoArgsConstructor
@RestController
public class UserInfoController {

    @Autowired
    private UserService userService;

    @GetMapping("/admin/getUsersInfo")
    public List<UsersInfoDTO> getUserDetails(){
        return  userService.fetchAllRecord();
    }
}
