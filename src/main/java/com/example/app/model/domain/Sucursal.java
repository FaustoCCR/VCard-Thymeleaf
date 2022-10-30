package com.example.app.model.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Component
public class Sucursal {
	
	@Value("${sucursal.id}")
	private String id;
	@Autowired
	private Ciudad ciudad;
	@Value("${sucursal.nombre}")
	private String nombre;
}
