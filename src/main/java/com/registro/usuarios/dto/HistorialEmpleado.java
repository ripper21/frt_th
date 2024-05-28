package com.registro.usuarios.dto;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class HistorialEmpleado {
	
	@JsonProperty(access = JsonProperty.Access.READ_ONLY)
	private Integer id_historial_empleados;

	private Date fecha_inicio;
	
	private Date fecha_termino;

	private Integer id_empleado;

	private Integer id_departamento;

	private Integer id_cargo;
	
	

}
