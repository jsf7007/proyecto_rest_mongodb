package com.proyecto.repository;

import java.util.List;
import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.proyecto.entity.Banco;

public interface BancoRepository extends MongoRepository<Banco, Integer>{

	@Query("{nombre_banco: ?0}")
	public List<Banco> listaBancoPorNombre(String nombreBanco);
	
	@Query("{id_banco: ?0}")
	public List<Banco> listaBancoPorId(int idBanco);

	@Query("{id_banco: ?0}")
	public List<Banco> buscaBancoPorId(int idBanco);
}
