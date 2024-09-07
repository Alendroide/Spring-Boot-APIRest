package com.ejemplo.relacion.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ejemplo.relacion.entity.TipoEspecie;
import com.ejemplo.relacion.repository.TipoEspecieRepository;

@Service
public class TipoEspecieService {
	@Autowired
	private TipoEspecieRepository tipoEspecieRepository;
	
	public List<TipoEspecie> findAllTiposEspecie(){
		return tipoEspecieRepository.findAll();
	}
	
	public Optional<TipoEspecie> findTipoEspecie(int id){
		return tipoEspecieRepository.findById(id);
	}
	
	public TipoEspecie saveTipoEspecie(TipoEspecie tiposEspecie) {
		return tipoEspecieRepository.save(tiposEspecie);
	}
	public void deleteTipoEspecie(int id) {
		tipoEspecieRepository.deleteById(id);
	}
}
