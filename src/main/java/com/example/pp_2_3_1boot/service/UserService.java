package com.example.pp_2_3_1boot.service;

import com.example.pp_2_3_1boot.model.User;

import java.util.List;

public interface UserService {

    public List<User> getAllUsers();

    public User getUserById(long id);

    public void saveUser(User user);

    public void updateUser( User updatedUser);

    public void deleteUser(long id);
}
