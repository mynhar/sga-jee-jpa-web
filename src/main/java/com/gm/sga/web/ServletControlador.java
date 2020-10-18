/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gm.sga.web;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.gm.sga.domain.Persona;
import com.gm.sga.servicio.PersonaService;
import javax.ejb.EJB;

/**
 *
 * @author harold
 */

@WebServlet("/ListarPersonas")
public class ServletControlador extends HttpServlet{                                        

    private static final long serialVersionUID = 1L;
    
    @EJB
    private PersonaService personaService;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Persona> personas = personaService.listarPersonas();
        request.setAttribute("personas", personas);
        request.getRequestDispatcher("listarPersonas.jsp").forward(request, response);
    }
   
}
