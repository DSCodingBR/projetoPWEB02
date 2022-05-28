package com.ifce.br.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

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
	
	@GetMapping("/listar")
	public ModelAndView listarAnimes() {
		//MAGIC DE LIST
		List<Anime> animes = animeService.listarAnimes();
		//MANDAR A LISTA PRO FRONT_END/TELA
		ModelAndView mv = new ModelAndView("listagem-anime");
		//RETORNA A LISTA NA TELA
		mv.addObject("listaAnimes", animes);
		return mv;
	}
	
}
