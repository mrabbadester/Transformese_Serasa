package com.Transf.Serasa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@SpringBootApplication
public class DemoApplication {

	@GetMapping("/")
	public ModelAndView index() {
		ModelAndView MA = new ModelAndView();
		MA.setViewName("home/index");
		return MA;
		
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
