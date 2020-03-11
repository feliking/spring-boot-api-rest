package com.felix.ejemplo.service;

import java.util.List;

import com.felix.ejemplo.model.Persona;

public interface IPersona {
	List<Persona> index();
	void store(Persona persona);
	void destroy(int id);
	Persona show(int id);
	
}
