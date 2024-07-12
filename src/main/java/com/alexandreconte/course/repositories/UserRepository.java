package com.alexandreconte.course.repositories;

import com.alexandreconte.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
