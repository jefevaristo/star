package br.com.star.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OlaMundoController {
	
	@RequestMapping("/olaMundoSpring")
	public String execute() {
		System.out.println("execitando a l�gica com spring mvc");
		
		return "ok";
		
	}
	

}
