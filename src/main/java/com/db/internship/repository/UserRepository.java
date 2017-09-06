package com.db.internship.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.db.internship.model.Authority;
import com.db.internship.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	public List<User> findByFirstNameContainingAndLastNameContaining(@Param("firstName") String firstName, @Param("lastName") String lastName);

	public User findByEmailAddress(@Param("email") String email);

	public User findByUsernameContaining(@Param("username") String username);
	

}

