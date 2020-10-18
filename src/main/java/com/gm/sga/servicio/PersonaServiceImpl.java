/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gm.sga.servicio;

import com.gm.sga.domain.Persona;
import com.gm.sga.eis.PersonaDao;
import java.io.Serializable;
import java.util.List;
import javax.annotation.Resource;
import javax.ejb.SessionContext;
import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 *
 * @author Harold
 */

@Stateless
public class PersonaServiceImpl implements PersonaServiceRemote, PersonaService, Serializable{
    
    @Resource
    private SessionContext contexto;
    
    @Inject
    private PersonaDao dao;

    @Override
    public List<Persona> listarPersonas() {        
        return dao.findAllPersonas();
    }

    @Override
    public Persona encontrarPersonaPorId(Persona persona) {
        return dao.findPersonaById(persona);
    }

    @Override
    public Persona encontrarPersonaPorEmail(Persona persona) {
        return dao.findPersonaByEmail(persona);
    }

    @Override
    public void registrarPersona(Persona persona) {
        dao.insertPersona(persona);
    }

    @Override
    public void modificarPersona(Persona persona) {
        
        try{
            dao.updatePersona(persona);
            
        }catch(Throwable t){
            contexto.setRollbackOnly();// hace rollback...
            t.printStackTrace(System.out);// imprime en consola el error
        }
        
    }

    @Override
    public void eliminarPersona(Persona persona) {
        dao.deletePersona(persona);
    }
    
}
