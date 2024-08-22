package com.ejemplo.relacion.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
@Table(name="especies")
public class Especie {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(length=30,nullable=false)
	private String nombre;
	
	@Column(columnDefinition="TEXT")
	private String descripcion;
	
	private int tiempoCrecimiento;
	
	@ManyToOne
	@JoinColumn(name="fk_tipoespecie")
	@JsonIgnoreProperties("especies")
	private TipoEspecie tipoespecie;
	
}
