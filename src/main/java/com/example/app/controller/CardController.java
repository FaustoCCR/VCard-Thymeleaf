package com.example.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.app.model.domain.Empleado;

@Controller
@RequestMapping("/vcard")
public class CardController {

	@Autowired
	private List<Empleado> employees;

	@GetMapping(value = "/")
	public String getCards(Model model) {

		model.addAttribute("employees", employees);

		return "index";

	}

}
