package com.indra.treinamento.controller;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.indra.treinamento.dto.CategoriaRequest;
import com.indra.treinamento.dto.CategoriaResponse;
import com.indra.treinamento.model.Categoria;


@RestController
@RequestMapping("/produtos")
public class ProdutoController {
	@PostMapping
	public ResponseEntity<?> save(@RequestBody @Valid CategoriaRequest request){
		Categoria categoria = request.toModel();
	//	categoriaRepository.save(categoria);
		
		return new ResponseEntity<>(new CategoriaResponse(categoria), HttpStatus.CREATED);
	}
}
