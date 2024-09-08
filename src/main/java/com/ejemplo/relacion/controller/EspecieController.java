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

import com.ejemplo.relacion.entity.Especie;
import com.ejemplo.relacion.service.EspecieService;
@CrossOrigin(origins = "http://192.168.0.103:3000")
@RestController
@RequestMapping("/especies")
public class EspecieController {
	@Autowired
	private EspecieService especieService;
	
	@GetMapping
	public List<Especie> findAllEspecies(){
		return especieService.findAllEspecies();
	}
	
	@GetMapping("/{id}")
	public Optional<Especie> findEspecie(@PathVariable int id){
		return especieService.findEspecie(id);
	}
	
	@GetMapping("/tipo/{tipoespecieId}")
	public List<Especie> findByTipoespecieId(@PathVariable int tipoespecieId){
		return especieService.findByTipoespecieId(tipoespecieId);
	}
	
	@PostMapping
	public Especie saveEspecie(@RequestBody Especie especie) {
		return especieService.saveEspecie(especie);
	}
	
	@DeleteMapping("/{id}")
	public void deleteEspecie(@PathVariable int id) {
		especieService.deleteEspecie(id);
	}
}
