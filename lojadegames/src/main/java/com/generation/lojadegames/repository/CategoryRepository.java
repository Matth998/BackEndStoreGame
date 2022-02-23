package com.generation.lojadegames.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.generation.lojadegames.model.CategoryModel;

public interface CategoryRepository extends JpaRepository<CategoryModel, Long>{

	public List<CategoryModel> findAllByDescriptionContainingIgnoreCase(String description);
	
}
