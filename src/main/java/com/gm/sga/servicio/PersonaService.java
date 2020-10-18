/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gm.sga.servicio;


import java.util.List;
import javax.ejb.Local;
import com.gm.sga.domain.Persona;

/**
 *
 * @author Harold
 */

@Local
public interface PersonaService {

    public List<Persona> listarPersonas();

    public Persona encontrarPersonaPorId(Persona persona);

    public Persona encontrarPersonaPorEmail(Persona persona);

    public void registrarPersona(Persona persona);

    public void modificarPersona(Persona persona);

    public void eliminarPersona(Persona persona);

}
