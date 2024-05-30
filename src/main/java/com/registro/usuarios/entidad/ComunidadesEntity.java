package com.registro.usuarios.entidad;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "comunidades")
@Data
public class ComunidadesEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_comunidades")
	private Integer id_comunidades;

	@Column(name = "nombre")
	private String nombre;
	
    @OneToMany(mappedBy = "comunidad")
    private List<MunicipiosEntity> municipios;
    
    @ManyToOne
    @JoinColumn(name = "id_comunidad", nullable = false)
    private ComunidadesEntity comunidad;

}
