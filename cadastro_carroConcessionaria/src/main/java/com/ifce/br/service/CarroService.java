package com.ifce.br.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ifce.br.model.Carro;
import com.ifce.br.repository.CarroRepository;

@Service
public class CarroService {
	
	@Autowired
	private CarroRepository carroRepository;
	
	public void cadastrarCarro(Carro carro) {
		carroRepository.save(carro);
	}
	
	public List<Carro> listaCarros(){
		return carroRepository.findAll();
	}
	//METODO PARA EXCLUIR
	public void excluirCarro(Long Codigo) {
		carroRepository.deleteById(Codigo);
	}
	//METODO PARA ATUALIZAR
	public Carro buscarCarroPorId (Long Codigo) {
	    return carroRepository.getOne(Codigo);
	}
	
}
