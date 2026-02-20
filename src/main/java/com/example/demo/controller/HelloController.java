package com.example.demo.controller;

import com.example.demo.dto.UserRequest;
import com.example.demo.model.User;
import com.example.demo.response.ApiResponse;
import com.example.demo.service.UserService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class HelloController {

    private final UserService userService;

    private List<UserRequest> users = new ArrayList<>();

    public HelloController(UserService userService) {
        this.userService = userService;
    }

    // CREATE
//    @PostMapping
//    public ResponseEntity<User> createUser(@Valid @RequestBody UserRequest request) {
//
//        return new ResponseEntity<>(
//                userService.createUser(request),
//                HttpStatus.CREATED
//        );
//    }

    // READ ALL

    @GetMapping
    public ResponseEntity<List<User>> getAllUsers() {
        return ResponseEntity.ok(userService.getAllUsers());
    }

    @PostMapping
    public ApiResponse<User> createUser(@Valid @RequestBody UserRequest request) {

        User user = userService.createUser(request);

        return new ApiResponse<>(
                true,
                "User created successfully",
                user
        );
    }

    @GetMapping("/list")   // or remove completely (not needed)
    public List<UserRequest> getUsers() {
        return users;
    }

    // READ BY NAME
    @GetMapping("/{name}")
    public ResponseEntity<User> getUser(@PathVariable String name) {
        return ResponseEntity.ok(userService.getUserByName(name));
    }

    // DELETE
    @DeleteMapping("/{name}")
    public ResponseEntity<String> deleteUser(@PathVariable String name) {
        userService.deleteUser(name);
        return ResponseEntity.ok("User deleted successfully");
    }

    //UPDATE
    @PutMapping("/{name}")
    public ResponseEntity<User> updateUser(
            @PathVariable String name,
            @Valid @RequestBody UserRequest request) {

        return ResponseEntity.ok(
                userService.updateUser(name, request)
        );
    }

}
