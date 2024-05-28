package com.registro.usuarios.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.registro.usuarios.dto.Empleado;
import com.registro.usuarios.service.EmpleadosService;

@Controller
@RequestMapping("/registro")
public class RegistroUsuarioControlador {
	
	private EmpleadosService usuarioService;

	public RegistroUsuarioControlador(EmpleadosService usuarioService) {
		super();
		this.usuarioService = usuarioService;
	}
	
	@ModelAttribute("usuario")
	public Empleado retornaNuevoUsarioRegistroDTO() {
		return new Empleado();
		
	}

	@GetMapping
	public String mostrarFormularioDeRegistro() {
		return "registro";
	}
	
	@PostMapping
	public String registrarCuentaDeUsuario( @ModelAttribute("usuario") Empleado registroDTO) {
		usuarioService.guardar(registroDTO);
		return "redirect:/registro?exito";
		
	}
	
}
