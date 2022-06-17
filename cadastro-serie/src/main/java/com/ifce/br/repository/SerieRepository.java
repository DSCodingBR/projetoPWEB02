package com.ifce.br.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.ifce.br.model.Serie;

@Repository
public interface SerieRepository extends JpaRepository<Serie, Long> {

}
