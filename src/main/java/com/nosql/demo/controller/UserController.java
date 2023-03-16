package com.nosql.demo.controller;


import com.nosql.demo.entities.User;
import com.nosql.demo.repositories.UserRepository;
import com.nosql.demo.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.nosql.demo.repositories.UserRepository;


import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping("")
    public User createUser(@RequestBody User user){
        user.setId(null);
        return userRepository.save(user);
    }

    @GetMapping
    public List<User> getUsers(){
        return userRepository.findAll();
    }

    @GetMapping("/count")
    public long count(){
        return userRepository.count();
    }

    @PutMapping("/{id}")
    public User editUser(@PathVariable String id, @RequestBody  User user) {
        return userRepository.save(user);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable String id){
        userRepository.deleteById(id);
    }
}
