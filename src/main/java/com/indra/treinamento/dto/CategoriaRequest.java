package com.indra.treinamento.dto;

import org.hibernate.validator.constraints.NotBlank;

import com.indra.treinamento.model.Categoria;

public class CategoriaRequest {
	
	@NotBlank
	private String descricao;
	
	@Deprecated
	public CategoriaRequest () {}
	
	public CategoriaRequest(String descricao) {
		this.setDescricao(descricao);
	}
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public Categoria toModel()
	{
		return new Categoria(descricao);
	}
	
}
