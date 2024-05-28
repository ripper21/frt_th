package com.registro.usuarios.dto;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class Empleado {
	
	@JsonProperty(access = JsonProperty.Access.READ_ONLY)
	private Integer id_empleado;

	private String nombre;

	private String apellidos;

	private String numero_telefonico;

	private Date fecha_nacimiento;

	private String email;

	private String clave;

	private String nif;

	private String ss_num;

	private Integer id_departamento;

	private Integer id_cargo;
	
	

}
