package com.registro.usuarios.service;

import java.util.Arrays;

import org.springframework.stereotype.Service;

import com.registro.usuarios.dto.UsuarioRegistroDTO;
import com.registro.usuarios.modelo.Rol;
import com.registro.usuarios.modelo.Usuario;
import com.registro.usuarios.repository.UsuarioRepositorio;

@Service
public class UsuarioServiceImpl implements UsuarioService {
	
	private UsuarioRepositorio usuarioRepository;
	
	

    public UsuarioServiceImpl(UsuarioRepositorio usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }


	@Override
	public Usuario guardar(UsuarioRegistroDTO registroDTO) {
		Usuario usuario = new Usuario(registroDTO.getNombre(),
				registroDTO.getApellido(),
				registroDTO.getEmail(),
				registroDTO.getPassword(),
				Arrays.asList(new Rol ("ROLE_USER")));				
				
		return usuarioRepository.save(usuario);
	}

}
