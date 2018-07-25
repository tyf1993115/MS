package com.iotek.service;

import com.iotek.dao.UserMapper;
import com.iotek.model.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("userService")
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;
    public User getUser(User user) {
        return userMapper.getUser(user);
    }

    public void savaRegisUser(User user) {
        userMapper.savaRegisUser(user);
    }
}
