package br.com.star.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.star.modelo.RecebimentosInformacoes;

@Controller
public class NovaVendaController {
	
	@RequestMapping("novaVenda")
	public String form (){
		return "";
	}

	@RequestMapping("addNovaVenda")
	public String add (RecebimentosInformacoes recebimentosInformacoes){
		
		return "";
	}

	
	
	
	
	
}
