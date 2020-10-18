/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gm.sga.eis;

import com.gm.sga.domain.Persona;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

/**
 *
 * @author harold
 */

@Stateless
public class PersonaDaoImpl implements PersonaDao{
    
    @PersistenceContext(unitName="PersonaPU")
    EntityManager em;

    @Override
    public List<Persona> findAllPersonas() {
        TypedQuery<Persona> query = em.createNamedQuery("Persona.findAll",Persona.class);
        List<Persona> results = query.getResultList();
        return results;
    }

    @Override
    public Persona findPersonaById(Persona persona) {
        return em.find(Persona.class, persona.getIdPersona());
    }

    @Override
    public Persona findPersonaByEmail(Persona persona) {
        Query query = em.createQuery("from Persona p where p.email =: email");
        query.setParameter("email", persona.getEmail());
        return (Persona) query.getSingleResult();
    }

    @Override
    public void insertPersona(Persona persona) {
        em.persist(persona);
    }

    @Override
    public void updatePersona(Persona persona) {
        em.merge(persona);
    }

    @Override
    public void deletePersona(Persona persona) {
        em.merge(persona);
        em.remove(persona);
    }
    
}
