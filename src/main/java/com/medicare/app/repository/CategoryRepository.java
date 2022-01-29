package com.medicare.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.medicare.app.model.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {

}
