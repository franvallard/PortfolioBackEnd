package com.miaplicacion.miprimerproyecto.repository;

import com.miaplicacion.miprimerproyecto.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PersonaRepository extends JpaRepository <Persona, Long> {
    
}
