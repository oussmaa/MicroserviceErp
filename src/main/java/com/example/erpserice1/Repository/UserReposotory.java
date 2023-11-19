package com.example.erpserice1.Repository;

import com.example.erpserice1.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface UserReposotory extends JpaRepository<User, Long> {


    Optional<User> findByEmail(String email);
}
