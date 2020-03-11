package com.felix.ejemplo.service;

import java.util.List;

import com.felix.ejemplo.model.Categoria;

public interface ICategoria {

	List<Categoria> getCategorias();
	Categoria store(Categoria categoria);
	Categoria getCategoria(int id);
	Categoria deleteCategoria(int id);
}
