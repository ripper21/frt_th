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
public class HistorialEmpleadosEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_historial_empleados")
	private Integer id_historial_empleados;

	@Column(name = "fecha_inicio")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fecha_inicio;

	@Column(name = "fecha_termino")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fecha_termino;

	@Column(name = "id_empleado")
	private Integer id_empleado;

	@Column(name = "id_departamento")
	private Integer id_departamento;

	@Column(name = "id_cargo")
	private Integer id_cargo;

}
