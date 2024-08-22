package com.ejemplo.relacion.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ejemplo.relacion.entity.Especie;
import com.ejemplo.relacion.repository.EspecieRepository;

@Service
public class EspecieService {
	@Autowired
	private EspecieRepository especieRepository;
	
	public List<Especie> findAllEspecies(){
		return especieRepository.findAll();
	}
	
	public Optional<Especie> findEspecie(int id){
		return especieRepository.findById(id);
	}
	
	public List<Especie> findByTipoespecieId(int tipoespecieId){
		return especieRepository.findByTipoespecieId(tipoespecieId);
	}
	
	public Especie saveEspecie(Especie especie) {
		return especieRepository.save(especie);
	}
}
