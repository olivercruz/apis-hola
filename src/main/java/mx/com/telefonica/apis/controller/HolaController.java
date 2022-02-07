package mx.com.telefonica.apis.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HolaController {
	
	@GetMapping("/hola")
	public String getHola() {
		return "Hola Prueba";
	}
}
