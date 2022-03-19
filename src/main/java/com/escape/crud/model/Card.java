package com.escape.crud.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Card {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private String linkImg;
	private Double precoAnt;
	private Double precoNovo;
	
	public Card() {
		
	}

	public Card(Long id, String nome, String linkImg, Double precoAnt, Double precoNovo) {
		super();
		this.id = id;
		this.nome = nome;
		this.linkImg = linkImg;
		this.precoAnt = precoAnt;
		this.precoNovo = precoNovo;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getLinkImg() {
		return linkImg;
	}

	public void setLinkImg(String linkImg) {
		this.linkImg = linkImg;
	}

	public Double getPrecoAnt() {
		return precoAnt;
	}

	public void setPrecoAnt(Double precoAnt) {
		this.precoAnt = precoAnt;
	}

	public Double getPrecoNovo() {
		return precoNovo;
	}

	public void setPrecoNovo(Double precoNovo) {
		this.precoNovo = precoNovo;
	}
	
}
