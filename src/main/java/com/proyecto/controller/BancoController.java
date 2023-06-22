package com.proyecto.controller;

import java.util.List;
import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.proyecto.entity.Banco;
import com.proyecto.service.BancoService;

@RestController
@RequestMapping("/rest/banco")
public class BancoController {

	@Autowired
	private BancoService service;
	
	@GetMapping()
	public ResponseEntity<?>  lista(){
		List<Banco> lstSalida = service.listaBanco();
		return ResponseEntity.ok(lstSalida);
	}
	
	@GetMapping("/porNombre/{nombre}")
	public ResponseEntity<?>  listaPorNombre(@PathVariable("nombre") String nombreBanco){
		List<Banco> lstSalida = service.listaBancoPorNombre(nombreBanco);
		return ResponseEntity.ok(lstSalida);
	}


	@GetMapping("/porId/{id}")
	public ResponseEntity<?> listaPorId(@PathVariable("id") int idBanco){
		List<Banco> lstSalida = service.listaBancoPorId(idBanco);
		return ResponseEntity.ok(lstSalida);
	}
	
	
	@PostMapping
	public ResponseEntity<?>  inserta(@RequestBody Banco obj){
		Banco objSalida = service.insertaBanco(obj);
		return ResponseEntity.ok(objSalida);
	}
	
}






