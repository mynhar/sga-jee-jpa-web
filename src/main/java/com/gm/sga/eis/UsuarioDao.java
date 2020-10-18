/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gm.sga.eis;

import com.gm.sga.domain.Usuario;
import java.util.List;

/**
 *
 * @author harold
 */
public interface UsuarioDao {
    
     public List<Usuario> findAll();
    
    public Usuario findById(Usuario obj);
    
    public void insert(Usuario obj);
    
    public void update(Usuario obj);
    
    public void delete(Usuario obj);
    
}
