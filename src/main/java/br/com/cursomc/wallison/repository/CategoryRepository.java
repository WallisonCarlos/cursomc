package br.com.cursomc.wallison.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.cursomc.wallison.model.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer>{

}
