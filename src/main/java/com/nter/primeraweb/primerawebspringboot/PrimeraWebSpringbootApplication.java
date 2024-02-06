package com.nter.primeraweb.primerawebspringboot;

import com.nter.primeraweb.primerawebspringboot.entities.Persona;
import com.nter.primeraweb.primerawebspringboot.repository.PersonaRepository;
import com.nter.primeraweb.primerawebspringboot.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class PrimeraWebSpringbootApplication {
	@Autowired
	private PersonaRepository personaRepository;
	@Autowired
	private PersonaService personaService;

	public static void main(String[] args) {

		SpringApplication.run(PrimeraWebSpringbootApplication.class, args);

	}


	/*@Override
	public void run(String... args) throws Exception {
		personaService.crearPersona(new Persona(5L,"Antonio2", 14));
		personaService.crearPersona(new Persona(6L,"Jose3", 55));
		personaService.crearPersona(new Persona(7L,"Jesus4", 67));
		personaService.crearPersona(new Persona(8L,"Francisco5", 23));
		System.out.println("Numero de personas en la tabla: "+personaRepository.count());

		// Muestro la lista de personas
		personaService.obtenerTodas();
	}*/
}
