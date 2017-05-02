package com.example.auth.repo;

import com.example.auth.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Vitalii on 02.05.2017.
 */
public interface RoleRepo extends JpaRepository <Role, Long>{
}
