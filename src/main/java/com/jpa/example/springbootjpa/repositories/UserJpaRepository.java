package com.jpa.example.springbootjpa.repositories;

import com.jpa.example.springbootjpa.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface UserJpaRepository extends JpaRepository<User, Long>
{
	User findByName(String name);
}
