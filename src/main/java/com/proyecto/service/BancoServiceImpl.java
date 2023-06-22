package com.proyecto.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.entity.Banco;
import com.proyecto.repository.BancoRepository;

@Service
public class BancoServiceImpl implements BancoService {

	@Autowired
	private BancoRepository repository;

	@Override
	public List<Banco> listaBanco() {
		return repository.findAll();
	}

	@Override
	public Banco insertaBanco(Banco obj) {
		return repository.save(obj);
	}

	@Override
	public Optional<Banco> buscaBanco(int idBanco) {
		return repository.findById(idBanco);
	}

	@Override
	public void eliminaBanco(int idBanco) {
		List<Banco> opt =  repository.buscaBancoPorId(idBanco);
		repository.delete(opt.get(0));
	}

	@Override
	public List<Banco> listaBancoPorNombre(String nombreBanco) {
		return repository.listaBancoPorNombre(nombreBanco);
	}
	
	@Override
	public List<Banco> listaBancoPorId(int idBanco) {
		return repository.listaBancoPorId(idBanco);
	}
	
	@Override
	public List<Banco> buscaBancoPorId(int idBanco) {
		return repository.buscaBancoPorId(idBanco);
	}

}


