package com.felix.ejemplo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.felix.ejemplo.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {

}
