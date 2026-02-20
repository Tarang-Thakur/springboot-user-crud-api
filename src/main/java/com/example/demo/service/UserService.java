package com.example.demo.service;

import com.example.demo.dto.UserRequest;
import com.example.demo.exception.UserNotFoundException;
import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    // CREATE
    public User createUser(UserRequest request) {

        User user = new User();
        user.setName(request.getName());
        user.setAge(request.getAge());

        return userRepository.save(user);
    }

    // READ ALL
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    // READ BY NAME
    public User getUserByName(String name) {

        return userRepository.findByNameIgnoreCase(name)
                .orElseThrow(() ->
                        new UserNotFoundException("User not found with name: " + name)
                );
    }

    // DELETE
    public void deleteUser(String name) {

        User user = getUserByName(name);
        userRepository.delete(user);
    }

    // UPDATE
    public User updateUser(String name, UserRequest request) {

        User user = getUserByName(name);

        user.setName(request.getName());
        user.setAge(request.getAge());

        return userRepository.save(user);
    }
}