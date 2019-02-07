package com.eduardo.helloworld.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(value = "/somar")
@RestController
public class Somar {
	@RequestMapping(method = RequestMethod.GET)
	public String somarValores(@RequestParam(value = "numero1") Long numero1,
			@RequestParam(value = "numero2") Long numero2) {
		return numero1 + " + " + numero2 + " = " + (numero1 + numero2);
	}
}
