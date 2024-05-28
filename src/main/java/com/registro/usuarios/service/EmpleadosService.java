package com.registro.usuarios.service;

import java.util.List;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.registro.usuarios.dto.Empleado;
import com.registro.usuarios.entidad.UsuarioEntity;

public interface EmpleadosService {
	
	
	public Empleado crearEmpleado(Empleado body);

}
