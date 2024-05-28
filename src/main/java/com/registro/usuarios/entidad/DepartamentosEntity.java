package com.registro.usuarios.entidad;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Data;

@Entity
@Table(name = "empleados")
@Data
public class DepartamentosEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_departamento")
	private Integer id_departamento;

	@Column(name = "nombre")
	private String nombre;

	@Column(name = "apellidos")
	private String apellidos;

	@Column(name = "id_gerente")
	private Integer id_gerente;

	@Column(name = "fecha_nacimiento")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fecha_nacimiento;

}
