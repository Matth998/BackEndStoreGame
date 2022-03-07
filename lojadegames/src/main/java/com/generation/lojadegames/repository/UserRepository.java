package com.generation.lojadegames.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.generation.lojadegames.model.UserModel;

public interface UserRepository extends JpaRepository<UserModel, Long>{

	public Optional<UserModel> findByEmail(String email);
	
	public List<UserModel> findByNameContainingIgnoreCase(String name);
	
}
