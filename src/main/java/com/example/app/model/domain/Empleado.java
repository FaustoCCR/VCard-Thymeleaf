package com.example.app.model.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Empleado {

	private int id;
	private String imagen;
	private String nombre;
	private String email;
	private String celular;
	private String cargo;
	private Ciudad ciudad;
	private Sucursal sucursal;
	private static final int COUNT_EMPLOYEES = 0;

	public Empleado(String imagen, String nombre, String email, String celular, String cargo,
			Ciudad ciudad, Sucursal sucursal) {
		id = COUNT_EMPLOYEES + 1;
		this.imagen = imagen;
		this.nombre = nombre;
		this.email = email;
		this.celular = celular;
		this.cargo = cargo;
		this.ciudad = ciudad;
		this.sucursal = sucursal;
	}

}
