package com.ejemplo.relacion.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name="tiposespecie")
public class TipoEspecie {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(length=30,nullable=false)
	private String nombre;
	
	@Column(columnDefinition="TEXT")
	private String descripcion;
	
	@OneToMany(mappedBy="tipoespecie",cascade=CascadeType.ALL)
	@JsonIgnoreProperties("tipoespecie")
	private List<Especie> especies;
}
