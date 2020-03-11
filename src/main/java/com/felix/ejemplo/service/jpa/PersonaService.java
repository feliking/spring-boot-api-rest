package com.felix.ejemplo.service.jpa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.felix.ejemplo.model.Persona;
import com.felix.ejemplo.repository.PersonaRepository;
import com.felix.ejemplo.service.IPersona;

@Service
public class PersonaService implements IPersona {

	@Autowired
	private PersonaRepository rep;
	
	public List<Persona> index() {
		List<Persona> personas = rep.findAll();
		return personas;
	}

	public void store(Persona persona) {
		rep.save(persona);
	}

	public void destroy(int id) {
		rep.deleteById(id);
	}

	public Persona show(int id) {
		return rep.findById(id).get();
	}

}
