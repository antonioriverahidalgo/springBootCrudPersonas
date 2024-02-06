package com.nter.primeraweb.primerawebspringboot.repository;

import com.nter.primeraweb.primerawebspringboot.entities.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends JpaRepository<Persona,Long> {
}
