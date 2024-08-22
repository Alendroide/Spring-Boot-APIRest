package com.ejemplo.relacion.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ejemplo.relacion.entity.Especie;

public interface EspecieRepository extends JpaRepository<Especie,Integer> {
	List<Especie> findByTipoespecieId(int tipoespecieId);
}
