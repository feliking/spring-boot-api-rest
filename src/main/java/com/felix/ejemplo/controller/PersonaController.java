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

import com.felix.ejemplo.model.Persona;
import com.felix.ejemplo.service.IPersona;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")
public class PersonaController {

	@Autowired
	private IPersona serv;
	
	@GetMapping("/persona")
	public List<Persona> index(){
		return serv.index();
	}
	
	@GetMapping("/persona/{id}")
	public Persona show(@PathVariable("id") int id) {
		return serv.show(id);
	}
	
	@PostMapping("/persona")
	public Persona store(@RequestBody Persona persona) {
		serv.store(persona);
		return persona;
	}
	
	@PutMapping("/persona")
	public Persona update(@RequestBody Persona persona) {
		serv.store(persona);
		return persona;
	}
	
	@DeleteMapping("/persona/{id}")
	public Persona destroy(@PathVariable("id") int id) {
		Persona p = serv.show(id);
		serv.destroy(id);
		return p;
	}
}
