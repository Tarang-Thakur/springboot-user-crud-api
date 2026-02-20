package com.example.demo.service;

import com.example.demo.dto.UserRequest;
import com.example.demo.model.User;
import org.springframework.stereotype.Service;
import com.example.demo.exception.UserNotFoundException;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    private final List<User> users = new ArrayList<>();

    // CREATE
    public User createUser(UserRequest request) {
        User user = new User(request.getName(), request.getAge());
        users.add(user);
        return user;
    }

    // READ ALL
    public List<User> getAllUsers() {
        return users;
    }

    // READ BY NAME
    public User getUserByName(String name) {
        return users.stream()
                .filter(u -> u.getName().equalsIgnoreCase(name))
                .findFirst()
                .orElseThrow(() ->
                        new UserNotFoundException("User not found with name: " + name)
                );
    }

    // DELETE
    public void deleteUser(String name) {
        boolean removed = users.removeIf(u -> u.getName().equalsIgnoreCase(name));
        if (!removed) {
            throw new UserNotFoundException("User not found with name: " + name);
        }
    }

    // UPDATE
    public User updateUser(String name, UserRequest request) {

        User user = users.stream()
                .filter(u -> u.getName().equalsIgnoreCase(name))
                .findFirst()
                .orElseThrow(() ->
                        new UserNotFoundException("User not found with name: " + name)
                );

        user.setName(request.getName());
        user.setAge(request.getAge());

        return user;
    }

}
