package com.ifce.br.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ifce.br.model.Pessoa;
import com.ifce.br.service.PessoaService;

@Controller
@RequestMapping("/pessoa")
public class PessoaController {
	
	@Autowired
	private PessoaService pessoaService;
	
	@GetMapping("/olaMundo")
	public String olaMundo() {
		return "OlaMundo";
	}
	@GetMapping("/formulario")
	public String pessoaFormulario() {
		
		return "Formulario";
		
	}
	
	@PostMapping("/salvar")
	public String cadastrarPessoa(Pessoa pessoa){
		//MAGIC HERE
		pessoaService.cadastrarPessoa(pessoa);
		
		//PAG OF SUCESS
		
		return "sucesso";
	}
}
