package com.gabrielCode;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.ILoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.gabrielCode.service.IPersonaService;
import com.gabrielCode.service.PersonaServiceImpl;

@SpringBootApplication
public class DemoConsolaApplication implements CommandLineRunner {
	private static Logger Log = LoggerFactory.getLogger(DemoConsolaApplication.class);
	@Autowired
	private IPersonaService service;
			

	public static void main(String[] args) {
		SpringApplication.run(DemoConsolaApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception{
		//Log.info("impresion en consola");
		//Log.warn("Esto es una advertencia");
		//Log.error("Esto es un error");
		
		//service = ner PersonaServiceImpl();
		service.registrarHandler("David");
	}

}
