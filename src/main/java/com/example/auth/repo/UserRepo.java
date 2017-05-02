package com.example.auth.repo;

import com.example.auth.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Vitalii on 02.05.2017.
 */
public interface UserRepo extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
