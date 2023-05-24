package com.Transf.Serasa.dominio.modelo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PrimeiroControlador {

	@GetMapping("esportes")
	@ResponseBody
	public String olaMundo() {
		return "Página de esportes";
	}
}
