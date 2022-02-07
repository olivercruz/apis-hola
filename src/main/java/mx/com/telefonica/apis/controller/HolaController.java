package mx.com.telefonica.apis.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mensajes")
public class HolaController {
	
	private final Logger logger = LoggerFactory.getLogger(HolaController.class);
	
	@GetMapping("/hola")
	@CrossOrigin
	public String getHola() {
		logger.info("++ IMPRIMIENDO MENSAJE +++");
		return "Hola Prueba";
	}
}
