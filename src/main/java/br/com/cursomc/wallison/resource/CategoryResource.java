package br.com.cursomc.wallison.resource;



import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.cursomc.wallison.model.Category;

@RestController
@RequestMapping(value = "/categories")
public class CategoryResource {

	@RequestMapping(method=RequestMethod.GET)
	public List<Category> list() {
		
		Category c1 = new Category(1, "Terror");
		Category c2 = new Category(2, "Horror");
		
		List<Category> categories = Collections.synchronizedList(new ArrayList<>());
		categories.add(c1);
		categories.add(c2);
		
		return categories;
	}
	
}
