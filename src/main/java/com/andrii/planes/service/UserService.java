package com.andrii.planes.service;

import com.andrii.planes.model.UserProfile;
import com.andrii.planes.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<UserProfile> getAllUsers() {
        return userRepository.findAll();
    }

    public Optional<UserProfile> getUserById(int id) {
        return userRepository.findById(id);
    }
}
