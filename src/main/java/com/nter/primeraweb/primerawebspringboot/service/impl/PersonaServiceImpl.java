package com.nter.primeraweb.primerawebspringboot.service.impl;

import com.nter.primeraweb.primerawebspringboot.entities.Persona;
import com.nter.primeraweb.primerawebspringboot.repository.PersonaRepository;
import com.nter.primeraweb.primerawebspringboot.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class PersonaServiceImpl implements PersonaService {
    @Autowired
    private PersonaRepository personaRepository;
    @Override
    public List<Persona> obtenerTodas() {
        return personaRepository.findAll();
    }

    @Override
    public Persona obtenerPorId(Long id) {
        return personaRepository.findById(id).orElse(null);
    }

    @Override
    public Persona crearPersona(Persona persona) {
        return personaRepository.save(persona);
    }

    @Override
    public Persona actualizarPersona(Long id, Persona persona) {
        // Primero encuentro la persona que se me pasa por parámetro
        Persona personaBBDD = personaRepository.findById(id)
                .orElseThrow(()-> new NoSuchElementException("nvhnfc"));

        // Si existe lo que hago es modificar la que he obtenido metiendo los valores de la que se pasa por
        // parámetro
        if(personaBBDD!=null){
            personaBBDD.setNombre(persona.getNombre());
            personaBBDD.setEdad(persona.getEdad());
            return personaRepository.save(personaBBDD);
        }
        return null;
    }

    @Override
    public void eliminarPersona(Long id) {
        personaRepository.deleteById(id);
    }
}
