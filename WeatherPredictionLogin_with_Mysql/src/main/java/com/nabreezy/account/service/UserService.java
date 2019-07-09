package com.nabreezy.account.service;

import com.nabreezy.account.model.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}
