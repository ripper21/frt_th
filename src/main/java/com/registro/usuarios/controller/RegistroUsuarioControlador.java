package com.registro.usuarios.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.registro.usuarios.dto.UsuarioRegistroDTO;
import com.registro.usuarios.service.UsuarioService;

@Controller
@RequestMapping("/registro")
public class RegistroUsuarioControlador {
	
	private UsuarioService usuarioService;

	public RegistroUsuarioControlador(UsuarioService usuarioService) {
		super();
		this.usuarioService = usuarioService;
	}
	
	@ModelAttribute("usuario")
	public UsuarioRegistroDTO retornaNuevoUsarioRegistroDTO() {
		return new UsuarioRegistroDTO();
		
	}

	@GetMapping
	public String mostrarFormularioDeRegistro() {
		return "registro";
	}
	
	@PostMapping
	public String registrarCuentaDeUsuario( @ModelAttribute("usuario") UsuarioRegistroDTO registroDTO) {
		usuarioService.guardar(registroDTO);
		return "redirect:/registro?exito";
		
	}
	
}
