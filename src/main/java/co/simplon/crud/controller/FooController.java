package co.simplon.crud.controller;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;
import co.simplon.crud.model.Foo;




@Controller
@RequestMapping("/foos")
class FooController {
	
	@RequestMapping(method = RequestMethod.GET)
	@ResponseBody
	public List<Foo> findAll() {
	    ArrayList<Foo> list= new ArrayList<>();
	    //ajout dans une liste
	    Foo test= new Foo("foo avec reference");
	    //même chose j'ajoute dans un liste mais en une ligne
	    list.add(test);
	    list.add(new Foo("new foo direct dans la liste"));
	    
		
		return list;
	  
	}

	@RequestMapping(method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	@ResponseBody
	public Long create(@RequestBody Foo resource) {
		System.out.println(resource.toString());
	    return 1L;
	}
	
}
