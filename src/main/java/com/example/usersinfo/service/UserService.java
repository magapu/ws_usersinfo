package com.example.usersinfo.service;


import com.example.usersinfo.DTO.UsersInfoDTO;
import com.example.usersinfo.Entity.Sripy;
import com.example.usersinfo.Repo.UserRepo;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Slf4j
@Service
@AllArgsConstructor
@NoArgsConstructor
public class UserService {

    @Autowired
    private UserRepo userRepo;

    public List<UsersInfoDTO> fetchAllRecord(){
        List<UsersInfoDTO> usersList = new ArrayList<>();
        List<Sripy> usersInfo=  userRepo.findAll();
        log.info("userInfo==> " + usersInfo);
        usersInfo.forEach(val->{
            UsersInfoDTO userDto = new UsersInfoDTO();
            userDto.setEmail(val.getEmail());
            userDto.setPassword(val.getPassword());
            userDto.setFirstName(val.getFirstName());
            userDto.setLastName(val.getLastName());
            userDto.setMobile(val.getMobile());
            usersList.add(userDto);
        });
        return usersList;
    }
}
