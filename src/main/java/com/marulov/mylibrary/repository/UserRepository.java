package com.marulov.mylibrary.repository;

import com.marulov.mylibrary.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}