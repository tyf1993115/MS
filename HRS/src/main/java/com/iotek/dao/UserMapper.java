package com.iotek.dao;

import com.iotek.model.User;

public interface UserMapper {
    User getUser(User user);
    void savaRegisUser(User user);
}
