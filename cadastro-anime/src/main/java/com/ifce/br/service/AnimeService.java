package com.ifce.br.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ifce.br.model.Anime;
import com.ifce.br.repository.AnimeRepository;

@Service
public class AnimeService {
	
	@Autowired
	private AnimeRepository animeRepository;
	
	public void cadastrarAnime(Anime anime) {
		animeRepository.save(anime);
	}
	
}