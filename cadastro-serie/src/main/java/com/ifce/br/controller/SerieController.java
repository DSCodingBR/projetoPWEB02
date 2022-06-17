package com.ifce.br.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.ifce.br.model.Serie;
import com.ifce.br.service.SerieService;

@Controller
@RequestMapping("/serie")
public class SerieController {
	@Autowired
	private SerieService serieService;
	
	//FORMULARIO
	@GetMapping("/formulario")
	public ModelAndView SerieFormulario () {
		ModelAndView mv = new ModelAndView ("Formulario");
		mv.addObject("serie", new Serie());
		return mv;
	}
	//METODO CADASTRO
	@RequestMapping("/salvar")
	public ModelAndView cadastrarSerie (Serie serie, @RequestParam(value="imagem")MultipartFile imagem) {
		serieService.cadastrarSerie(serie);
		ModelAndView mv = new ModelAndView ("redirect:/serie/listar");
		return mv;
	}
	//METODO LISTAR
	@GetMapping("/listar")
	public ModelAndView listarSeries () {
		List <Serie> series = serieService.listarSeries();
		ModelAndView mv = new ModelAndView ("listagem-serie");
		mv.addObject("listaSeries", series);
		return mv;
	}
	//METODO EXLCUIR
	@RequestMapping("/excluir/{codigo}")
	public ModelAndView excluirSeries (@PathVariable Long codigo) {
		serieService.excluirAnimes(codigo);
		ModelAndView mv = new ModelAndView ("redirect:/serie/listar");
		return mv;
	}
	//METODO ATUALIZAR
	@RequestMapping("/atualizar/{codigo}")
	public ModelAndView atualizarSeries (@PathVariable Long codigo) {
		Optional<Serie> serie = serieService.buscarPorId(codigo);
		ModelAndView mv = new ModelAndView ("Formulario");
		mv.addObject("serie", serie);
		return mv;
	}
	
}
