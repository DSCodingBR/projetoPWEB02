package com.ifce.br.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Carro {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long codigo;
	private Integer ano;
	private String marca;
	private String cor;
	private float preco;
	private String documentacao;
	public Long getCodigo() {
		return codigo;
	}
	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}
	public Integer getAno() {
		return ano;
	}
	public void setAno(Integer ano) {
		this.ano = ano;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public float getPreco() {
		return preco;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}
	public String getDocumentacao() {
		return documentacao;
	}
	public void setDocumentacao(String documentacao) {
		this.documentacao = documentacao;
	}
	
	@Override
	public String toString() {
		return "Carro [codigo=" + codigo + ","
				+ " ano=" + ano + ", marca=" + marca + ","
				+ " cor=" + cor + ", preco=" + preco
				+ ", documentacao=" + documentacao + "]";
	}
	
	
	

	
	
	
	
}
