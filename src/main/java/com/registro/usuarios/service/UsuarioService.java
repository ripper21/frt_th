package com.registro.usuarios.service;

import com.registro.usuarios.dto.UsuarioRegistroDTO;
import com.registro.usuarios.modelo.Usuario;

public interface UsuarioService {
	public Usuario guardar(UsuarioRegistroDTO registroDTO);

}
