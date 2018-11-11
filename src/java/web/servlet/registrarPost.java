/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web.servlet;

import api.modelo.Post;
import api.modelo.Usuario;
import api.servico.ServicoPost;
import api.servico.ServicoUsuario;
import core.servico.ServicoPostImpl;
import core.servico.ServicoUsuarioImpl;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Vinicius Lelis
 */
public class registrarPost extends HttpServlet {

    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        ServletContext sc = req.getServletContext();
        ServicoPost sPost = new ServicoPostImpl();
    
            String titulo = req.getParameter("titulo");
            String conteudo = req.getParameter("conteudo");
            String autor = "Vinicius";
            Post post = new Post(titulo, conteudo, autor);
            System.out.println(post.getTitulo() );
            /* --------------------------------------------------- */

            sPost.inserir(post);
 
         }///////
    }
