package com.indra.treinamento.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.validator.constraints.NotBlank;

@Entity
public class Categoria {
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	private Long id;
	@NotBlank
	private String descricao;
	
	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	
	@Deprecated
	public Categoria() {}
	
	
	public Categoria(String descricao) {
		this.descricao = descricao;
	}
	
	
	
}
