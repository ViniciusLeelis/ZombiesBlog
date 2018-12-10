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
public class RedirecionarLogadoAdmin extends HttpServlet {


        @Override
        public void doGet(HttpServletRequest req, HttpServletResponse resp){
                    
            ServletContext sc = req.getServletContext();
            ServicoPost sPost = new ServicoPostImpl();   
            List<Post> pBD = sPost.listarTudo();   
            ServicoUsuario sUsuario = new ServicoUsuarioImpl();   
            List<Usuario> uBD = sUsuario.procurarTudo();   

            try{
                req.setAttribute("listPosts",pBD);    
                req.setAttribute("listUsuarios", uBD);
                
                sc.getRequestDispatcher("/dynamic/jsp/logadoAdmin.jsp").forward(req, resp);            
            } catch (Exception e){}
        }
}