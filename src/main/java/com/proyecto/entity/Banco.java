package com.proyecto.entity;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Document(collection = "banco")
public class Banco {
	
	private int id_banco;
	private String nombre_banco;
		
}



