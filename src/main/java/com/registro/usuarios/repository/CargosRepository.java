package com.registro.usuarios.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.registro.usuarios.entidad.CargosEntity;
import com.registro.usuarios.entidad.EmpleadosEntity;
@Repository
public interface CargosRepository extends JpaRepository<CargosEntity, Integer> {
	
	CargosEntity findByName(String name);

}
