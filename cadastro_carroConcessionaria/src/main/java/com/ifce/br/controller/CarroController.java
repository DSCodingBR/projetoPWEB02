package com.ifce.br.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ifce.br.model.Carro;
import com.ifce.br.service.CarroService;

@Controller
@RequestMapping("/carro")
public class CarroController {
	
	@Autowired
	private CarroService carroService;
	
	@GetMapping("/olaMundo")
	public String olaMundo() {
		return "OlaMundo";
	}
	@GetMapping("/formulario")
	public String pessoaFormulario() {
		
		return "Formulario";
		
	}
	
	@PostMapping("/salvar")
	public String cadastrarCarro(Carro carro){
		carroService.cadastrarCarro(carro);
		return "redirect:/carro/listar";
	}
	
	@GetMapping("/listar")
	public ModelAndView listarCarros() {
		List<Carro> carros = carroService.listaCarros();
		ModelAndView mv = new ModelAndView("listagem-carro");
		mv.addObject("listaCarros", carros);
		return mv;
	}
	
	@RequestMapping("/excluir/{codigo}")
	public ModelAndView excluirCarros (@PathVariable Long codigo) {
		carroService.excluirCarro(codigo);
		ModelAndView mv = new ModelAndView ("redirect:/carro/listar");
		return mv;
	}
	
	@RequestMapping("/atualizar/{codigo}")
	public ModelAndView atualizarAnimes (@PathVariable Long codigo) {
		Carro carro = carroService.buscarCarroPorId(codigo);
		ModelAndView mv = new ModelAndView("FormularioAtualizar");
		mv.addObject("carro", carro);
		return mv;
	}
	
}
