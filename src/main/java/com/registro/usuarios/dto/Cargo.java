package com.registro.usuarios.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class Cargo {
	
	@JsonProperty(access = JsonProperty.Access.READ_ONLY)
	private Integer id_cargo;

	private String nombre;


	
	

}
