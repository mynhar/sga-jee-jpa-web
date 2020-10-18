/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gm.sga.servicio;

import com.gm.sga.domain.Usuario;
import com.gm.sga.eis.UsuarioDao;
import java.io.Serializable;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 *
 * @author harold
 */

@Stateless
public class UsuarioServiceImpl implements UsuarioServiceRemote, UsuarioService, Serializable{

    @Inject
    private UsuarioDao dao;
    
    @Override
    public List<Usuario> listarUsuarios() {
        return dao.findAll();
    }

    @Override
    public Usuario encontrarUsuarioPorId(Usuario entity) {
        return dao.findById(entity);
    }

    @Override
    public void registrarUsuario(Usuario entity) {
        dao.insert(entity);
    }

    @Override
    public void modificarUsuario(Usuario entity) {
        dao.update(entity);
    }

    @Override
    public void eliminarUsuario(Usuario entity) {
        dao.delete(entity);
    }
    
}
