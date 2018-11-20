/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web.servlet;

import api.modelo.Post;
import api.servico.ServicoPost;
import core.servico.ServicoPostImpl;
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
public class screenLogadoAdmin extends HttpServlet {

        @Override
        public void doGet(HttpServletRequest req, HttpServletResponse resp){
                    
            ServletContext sc = req.getServletContext();
            ServicoPost sPost = new ServicoPostImpl();   
            List<Post> uBD = sPost.listarTudo();   

            try{
                req.setAttribute("listPosts",uBD);    
                sc.getRequestDispatcher("/dynamic/jsp/logadoAdmin.jsp").forward(req, resp);            
            } catch (Exception e){}
        }
}
