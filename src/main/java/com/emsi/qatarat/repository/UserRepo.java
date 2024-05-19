package com.emsi.qatarat.repository;

import com.emsi.qatarat.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Long> {
}
