package br.com.cursomc.wallison.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.cursomc.wallison.model.Category;
import br.com.cursomc.wallison.repository.CategoryRepository;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepository categoryRepository;
	
	public Category find(Integer id) {
		Optional<Category> op = categoryRepository.findById(id);
		return op.orElse(null);
	}
	
}
