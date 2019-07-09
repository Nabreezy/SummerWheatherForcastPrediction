package com.nabreezy.auth.service;

import com.nabreezy.auth.model.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}
