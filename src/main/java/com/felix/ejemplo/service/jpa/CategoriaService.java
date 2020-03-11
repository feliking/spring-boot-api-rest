package com.felix.ejemplo.service.jpa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.felix.ejemplo.model.Categoria;
import com.felix.ejemplo.repository.CategoriaRepository;
import com.felix.ejemplo.service.ICategoria;

@Service
public class CategoriaService implements ICategoria {
	
	@Autowired
	private CategoriaRepository r;


	public List<Categoria> getCategorias() {
		return r.findAll();
	}


	public Categoria store(Categoria categoria) {
		r.save(categoria);
		return categoria;
	}


	public Categoria getCategoria(int id) {
		return r.findById(id).get();
	}


	public Categoria deleteCategoria(int id) {
		Categoria categoria = r.findById(id).get();
		r.deleteById(id);
		return categoria;
	}

}
