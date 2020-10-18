/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gm.sga.servicio;

import com.gm.sga.domain.Usuario;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author harold
 */

@Local
public interface UsuarioService {
    
        
    public List<Usuario> listarUsuarios();

    public Usuario encontrarUsuarioPorId(Usuario entity);

    public void registrarUsuario(Usuario entity);

    public void modificarUsuario(Usuario entity);

    public void eliminarUsuario(Usuario entity);
    
}
