package com.ifce.br.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ifce.br.model.Serie;
import com.ifce.br.repository.SerieRepository;

@Service
public class SerieService {
	@Autowired
	private SerieRepository serieRepository;
	//SALVA
	public void cadastrarSerie (Serie serie) {
		serieRepository.save(serie);
	}
	//LISTA TODOS
	public List<Serie> listarSeries (){
		return serieRepository.findAll();
	}
	//EXCLUIR SERIE
	public void excluirAnimes (Long Codigo) {
		serieRepository.deleteById(Codigo);
	}
	//ATUALIZAR SERIES
	public Optional<Serie> buscarPorId(Long codigo) {
	
		return serieRepository.findById(codigo);
		
	}
	

}
