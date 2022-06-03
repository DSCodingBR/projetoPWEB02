package com.ifce.br.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.ifce.br.model.Carro;

@Repository
public interface CarroRepository extends JpaRepository<Carro, Long>{

	
	
}
