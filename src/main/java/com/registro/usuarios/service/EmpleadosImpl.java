package com.registro.usuarios.service;

import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.registro.usuarios.dto.Empleado;
import com.registro.usuarios.entidad.EmpleadosEntity;
import com.registro.usuarios.repository.EmpleadosRepository;

@Service
public class EmpleadosImpl implements EmpleadosService {
	private static final Logger log = LoggerFactory.getLogger(EmpleadosImpl.class);
	private final EmpleadosRepository empleadosRepository;
	private final BCryptPasswordEncoder passwordEncoder;
	private final ModelMapper modelMapper;

	@Autowired
	public EmpleadosImpl(EmpleadosRepository empleadosRepository, BCryptPasswordEncoder passwordEncoder,
			ModelMapper modelMapper) {
		this.empleadosRepository = empleadosRepository;
		this.passwordEncoder = passwordEncoder;
		this.modelMapper = modelMapper;

	}

	@Override
	public Empleado crearEmpleado(Empleado body) {
		EmpleadosEntity nuevoEmpleado = modelMapper.map(body, EmpleadosEntity.class);
		try {
			empleadosRepository.save(nuevoEmpleado);
		} catch (Exception e) {
			log.info("No se pudo ingresar el nuevo empleado : " + e);
		}

		return null;
	}

}
