package com.Transformeses.Serasa2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@SpringBootApplication
public class PrimeiroControlador {
	
	@GetMapping("/")
	@ResponseBody
	public String index() {
		return "Bem vindo, Marlus Abbade";
		
	}

	public static void main(String[] args) {
		SpringApplication.run(PrimeiroControlador.class, args);
	}

}
