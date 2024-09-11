package com.ejemplo.relacion.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ejemplo.relacion.entity.TipoEspecie;
import com.ejemplo.relacion.service.TipoEspecieService;
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/tipos")
public class TipoEspecieController {
	@Autowired
	private TipoEspecieService tipoEspecieService;
	
	@GetMapping
	public List<TipoEspecie> findAllTiposEspecies(){
		return tipoEspecieService.findAllTiposEspecie();
	}
	
	@GetMapping("/{id}")
	public Optional<TipoEspecie> findTipoEspecie(@PathVariable int id){
		return tipoEspecieService.findTipoEspecie(id);
	}
	
	@PostMapping
	public TipoEspecie saveTiposEspecie(@RequestBody TipoEspecie tiposEspecie) {
		return tipoEspecieService.saveTipoEspecie(tiposEspecie);
	}
	@DeleteMapping("/{id}")
	public void deleteTipoEspecie(@PathVariable int id) {
		tipoEspecieService.deleteTipoEspecie(id);
	}
}
