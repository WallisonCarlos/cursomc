package br.com.cursomc.wallison.resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/categories")
public class CategorieResource {

	@RequestMapping(method=RequestMethod.GET)
	public String list() {
		return "REST está funcionado";
	}
	
}
