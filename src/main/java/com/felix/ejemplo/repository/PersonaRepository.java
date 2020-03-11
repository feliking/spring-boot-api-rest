package com.felix.ejemplo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.felix.ejemplo.model.Persona;

public interface PersonaRepository extends JpaRepository<Persona, Integer> {

}
