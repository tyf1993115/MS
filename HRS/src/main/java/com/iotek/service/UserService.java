package com.iotek.service;

import com.iotek.model.User;

public interface UserService {
    User getUser(User user);
    void savaRegisUser(User user);
}
