package com.felix.ejemplo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.felix.ejemplo.model.Categoria;
import com.felix.ejemplo.service.ICategoria;

@CrossOrigin(origins="*")
@RestController
@RequestMapping("/api")
public class CategoriaController {

	@Autowired
	private ICategoria s;
	
	@GetMapping("/categoria")
	public List<Categoria> index() {
		return s.getCategorias();
	}
	
	@GetMapping("/categoria/{id}")
	public Categoria show(@PathVariable("id")int id) {
		return s.getCategoria(id);
	}
	
	@PostMapping("/categoria")
	public Categoria store(@RequestBody Categoria categoria) {
		return s.store(categoria);
	}
	
	@PutMapping("/categoria")
	public Categoria update(@RequestBody Categoria categoria) {
		return s.store(categoria);
	}
	
	@DeleteMapping("/categoria/{id}")
	public Categoria destroy(@PathVariable int id) {
		return s.deleteCategoria(id);
	}
	
}
