package com.example.app.model.domain;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Component
public class Ciudad {

	@Value("${ciudad.id}")
	private String id;
	@Value("${ciudad.nombre}")
	private String nombre;

}
