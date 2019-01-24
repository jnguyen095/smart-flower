package com.khang.nguyen.controller;

import com.google.common.collect.Lists;
import com.khang.nguyen.dto.UserDTO;
import com.khang.nguyen.model.Users;
import com.khang.nguyen.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Khang Nguyen.
 * Email: khang.nguyen@banvien.com
 * Date: 29/12/2018
 * Time: 11:07 AM
 */
@Controller
public class HomeController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping(value = "/home")
    public ResponseEntity home(){
        return new ResponseEntity("Hello Smart Flower!", HttpStatus.OK);
    }

    @GetMapping(value = "/user/list")
    public ResponseEntity<List<Users>> userList(){
        List<Users> result = Lists.newArrayList(userRepository.findAll());
        return new ResponseEntity(result, HttpStatus.OK);
    }

    @GetMapping(value = "/user/add")
    public ResponseEntity<Users> addUser(UserDTO user){
        List<Users> result = userRepository.save(user);
        return new ResponseEntity(result, HttpStatus.OK);
    }
}
