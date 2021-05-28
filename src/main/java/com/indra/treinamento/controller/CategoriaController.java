package com.indra.treinamento.controller;

import java.util.List;
import java.util.stream.Collectors;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.indra.treinamento.dto.CategoriaRequest;
import com.indra.treinamento.dto.CategoriaResponse;
import com.indra.treinamento.model.Categoria;
import com.indra.treinamento.repository.CategoriaRepository;

@RestController
@RequestMapping("/categorias")
public class CategoriaController {
	
	@Autowired
	private CategoriaRepository categoriaRepository;
	
	@GetMapping
	@Cacheable("findall")
	public ResponseEntity<List<CategoriaResponse>> all(){
		List<Categoria> categorias = categoriaRepository.findAll();
		return ResponseEntity.ok(categorias.stream().map(CategoriaResponse::new).collect(Collectors.toList()));
	}
	
	@PostMapping
	public ResponseEntity<?> save(@RequestBody @Valid CategoriaRequest request){
		Categoria categoria = request.toModel();
		categoriaRepository.save(categoria);
		
		return new ResponseEntity<>(new CategoriaResponse(categoria), HttpStatus.CREATED);
	}
}
