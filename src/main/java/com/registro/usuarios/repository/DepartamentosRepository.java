package com.registro.usuarios.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.registro.usuarios.entidad.DepartamentosEntity;
@Repository
public interface DepartamentosRepository extends JpaRepository<DepartamentosEntity, Integer> {
	
	DepartamentosEntity findByName(String name);

}
