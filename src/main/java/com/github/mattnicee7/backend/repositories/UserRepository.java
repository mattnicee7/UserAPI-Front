package com.github.mattnicee7.backend.repositories;

import com.github.mattnicee7.backend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
