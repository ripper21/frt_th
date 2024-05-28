package com.registro.usuarios.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.registro.usuarios.entidad.EmpleadosEntity;
@Repository
public interface EmpleadosRepository extends JpaRepository<EmpleadosEntity, Integer> {
	
	EmpleadosEntity findByEmail(String email);

}
