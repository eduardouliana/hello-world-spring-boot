package com.eduardo.helloworld.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(value="/helloworld")
@RestController
public class HelloWorld {	
	@RequestMapping(method=RequestMethod.GET,value="/mostrarmsg")
	public String teste() {
		return "Hello World";
	}
}