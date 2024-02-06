package com.nter.primeraweb.primerawebspringboot.service;

import com.nter.primeraweb.primerawebspringboot.entities.Persona;

import java.util.List;

public interface PersonaService {

    // Añado los métodos
    List<Persona> obtenerTodas();
    Persona obtenerPorId(Long id);
    Persona crearPersona(Persona persona);
    Persona actualizarPersona(Long id, Persona persona);
    void eliminarPersona(Long id);
}
