package com.godigit.team2.service.user_register;

import com.godigit.team2.entity.user.User;

public interface UserRegisterService {
    public User registerUser(User user);
    public User loginUser(String username, String password);
}
