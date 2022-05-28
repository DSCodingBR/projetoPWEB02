package com.ifce.br.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.ifce.br.model.Anime;
import com.ifce.br.service.AnimeService;

@Controller
@RequestMapping("/anime")
public class AnimeController {
	
	@Autowired
	private AnimeService animeService;
	
	@GetMapping("/olaMundo")
	public String olaMundo() {
		return "OlaMundo";
	}
	@GetMapping("/formulario")
	public String animeFormulario() {
		
		return "Formulario";
		
	}
	
	@PostMapping("/salvar")
	public String cadastrarAnime(Anime anime){
		//MAGIC HERE
		animeService.cadastrarAnime(anime);
		
		//PAG OF SUCESS
		
		return "sucesso";
	}
	
}
