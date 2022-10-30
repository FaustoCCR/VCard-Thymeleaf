package com.example.app;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.app.model.domain.Ciudad;
import com.example.app.model.domain.Empleado;
import com.example.app.model.domain.Sucursal;

@Configuration
public class AppConfig {

	@Autowired
	private Ciudad ciudad;
	@Autowired
	private Sucursal sucursal;

	@Bean("employees")
	public List<Empleado> registerEmployees() {

		Empleado empleado1 = new Empleado("https://cdn.pixabay.com/photo/2016/04/01/11/25/avatar-1300331__340.png",
				"Javier Campos", "javicampos@colinealcorp.com", "+593 995403223", "Jefe de Producción", ciudad,
				sucursal);
		Empleado empleado2 = new Empleado("https://cdn.pixabay.com/photo/2016/04/26/07/57/woman-1353825__340.png",
				"Ana Armijos", "aniarmijos@colinealcorp.com", "+593 992603277", "Ejecutiva de Ventas", ciudad,
				sucursal);
		Empleado empleado3 = new Empleado("https://cdn.pixabay.com/photo/2016/04/25/21/14/woman-1353211__340.png",
				"Lucía Figueroa", "luciafigueroa@colinealcorp.com", "+593 993663291", "Marketing", ciudad, sucursal);

		return Arrays.asList(empleado1, empleado2, empleado3);

	}

}
