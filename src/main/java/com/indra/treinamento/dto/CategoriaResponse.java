package com.indra.treinamento.dto;

import com.indra.treinamento.model.Categoria;

public class CategoriaResponse {
	
	public Long id;
	private String  descricao;
	
	@Deprecated
	public CategoriaResponse() {}
	public CategoriaResponse(Categoria categoria) {
		this.id = categoria.getId();
		this.descricao = categoria.getDescricao();
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDescricao() {
		return this.descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	
	
}
