package com.farouk.user.repository;

import com.farouk.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserReposirory extends JpaRepository<User, String> {
}
