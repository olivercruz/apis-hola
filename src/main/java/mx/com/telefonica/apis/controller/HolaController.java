package mx.com.telefonica.apis.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mensajes")
public class HolaController {
	
	private final Logger logger = LoggerFactory.getLogger(HolaController.class);
	
	@Autowired
	private Environment env;

	@GetMapping("/hola")
	@CrossOrigin
	public String getHola() {
		logger.info("++ IMPRIMIENDO MENSAJE +++");
		String mensaje = null;

		mensaje = env.getProperty("SPRING_MENSAJE");
		logger.info(" ++ MENSAJE +++ --> " + mensaje);

		return "Hola Prueba";
	}
}
