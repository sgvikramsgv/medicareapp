package com.medicare.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medicare.app.model.Category;
import com.medicare.app.repository.CategoryRepository;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepository categoryRepository;	
	
	
	public void addCategory(Category category) {
		categoryRepository.save(category);
	}
	
	public List<Category> getAllCategory(){
		return categoryRepository.findAll();
	}
	
	public void removeCatById(int id) {
		categoryRepository.deleteById(id);
	}
	public Optional<Category> getCategoryById(int id) {
		return categoryRepository.findById(id);
	}
}
