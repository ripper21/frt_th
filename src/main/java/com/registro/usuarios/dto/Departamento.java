package com.registro.usuarios.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class Departamento {
	
	@JsonProperty(access = JsonProperty.Access.READ_ONLY)
	private Integer id_departamento;

	private String nombre;

	private Integer id_gerente;
	
	

}
