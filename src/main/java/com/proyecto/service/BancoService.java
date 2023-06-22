package com.proyecto.service;

import java.util.List;
import java.util.Optional;

import org.bson.types.ObjectId;

import com.proyecto.entity.Banco;

public interface BancoService {

	public List<Banco> listaBanco();
	public List<Banco> listaBancoPorNombre(String nombreBanco);
	public List<Banco> listaBancoPorId(int objectId);
	public List<Banco> buscaBancoPorId(int idBanco);
	public Banco insertaBanco(Banco obj);
	public Optional<Banco> buscaBanco(int idBanco);
	public void eliminaBanco(int idBanco);
}
