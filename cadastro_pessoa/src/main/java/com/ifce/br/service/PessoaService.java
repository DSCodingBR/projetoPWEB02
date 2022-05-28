package com.ifce.br.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ifce.br.model.Pessoa;
import com.ifce.br.repository.PessoaRepository;

@Service
public class PessoaService {
	
	@Autowired
	private PessoaRepository pessoaRepository;
	
	public void cadastrarPessoa(Pessoa pessoa) {
		pessoaRepository.save(pessoa);
	}
	
}
