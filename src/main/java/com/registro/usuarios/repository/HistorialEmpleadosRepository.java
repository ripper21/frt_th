package com.registro.usuarios.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.registro.usuarios.entidad.EmpleadosEntity;
import com.registro.usuarios.entidad.HistorialEmpleadosEntity;
@Repository
public interface HistorialEmpleadosRepository extends JpaRepository<HistorialEmpleadosEntity, Integer> {
	


}
