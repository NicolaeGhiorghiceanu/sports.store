package com.sports.store.service;

import com.sports.store.dto.UserDto;
import com.sports.store.entity.User;
import com.sports.store.mapper.UserMapper;
import com.sports.store.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private UserMapper userMapper;
    public void saveUser(UserDto userDto){
        User user = userMapper.mapp(userDto);
        userRepository.save(user);

    }
}
