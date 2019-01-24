package com.khang.nguyen.service.impl;

import com.khang.nguyen.dto.UserDTO;
import com.khang.nguyen.model.Users;
import com.khang.nguyen.repository.UserRepository;
import com.khang.nguyen.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Khang Nguyen.
 * Email: khang.nguyen@banvien.com
 * Date: 08/01/2019
 * Time: 10:08 PM
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;
    @Override
    public UserDTO save(UserDTO user) {
        Users users = new Users();
        userRepository.save(users);
        return null;
    }
}
