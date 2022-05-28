package com.ifce.br.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Anime {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long codigo;
	private String nome;
	private String categoria;
	private String status;
	private Integer episodios;
	public Long getCodigo() {
		return codigo;
	}
	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Integer getEpisodios() {
		return episodios;
	}
	public void setEpisodios(Integer episodios) {
		this.episodios = episodios;
	}
	@Override
	public String toString() {
		return "Anime [codigo=" + codigo + ", nome=" + nome + ","
				+ " categoria=" + categoria + ", status=" + status
				+ ", episodios=" + episodios + "]";
	}
	
	
	
}
