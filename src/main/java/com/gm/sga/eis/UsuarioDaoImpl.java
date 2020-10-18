/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gm.sga.eis;

import com.gm.sga.domain.Persona;
import com.gm.sga.domain.Usuario;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

/**
 *
 * @author harold
 */
@Stateless
public class UsuarioDaoImpl implements UsuarioDao{
    
    @PersistenceContext(unitName="PersonaPU")
    EntityManager em;

    @Override
    public List<Usuario> findAll() {
        TypedQuery<Usuario> query = em.createNamedQuery("Usuario.findAll",Usuario.class);
        List<Usuario> results = query.getResultList();
        return results;
    }

    @Override
    public Usuario findById(Usuario entity) {
        return em.find(Usuario.class, entity.getIdUsuario());
    }   

    @Override
    public void insert(Usuario entity) {
        em.persist(entity);
    }

    @Override
    public void update(Usuario entity) {
        em.merge(entity);
    }

    @Override
    public void delete(Usuario entity) {
        em.merge(entity);
        em.remove(entity);
    }
    
    
    
}
