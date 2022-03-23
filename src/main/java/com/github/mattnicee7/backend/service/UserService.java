package com.github.mattnicee7.backend.service;

import com.github.mattnicee7.backend.model.User;
import com.github.mattnicee7.backend.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public User insert(User user) {
        return userRepository.save(user);
    }

}
