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
public class EmpleadosEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_empleado")
	private Integer id_empleado;

	@Column(name = "nombre")
	private String nombre;

	@Column(name = "apellidos")
	private String apellidos;

	@Column(name = "numero_telefonico")
	private String numero_telefonico;

	@Column(name = "fecha_nacimiento")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fecha_nacimiento;

	@Column(name = "email")
	private String email;
	
	@Column(name = "clave")
	private String clave;

	@Column(name = "nif")
	private String nif;

	@Column(name = "ss_num")
	private String ss_num;

	@Column(name = "id_departamento")
	private Integer id_departamento;

	@Column(name = "id_cargo")
	private Integer id_cargo;

}
