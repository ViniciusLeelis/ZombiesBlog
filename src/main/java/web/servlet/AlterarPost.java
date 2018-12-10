/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web.servlet;

import api.modelo.Comentario;
import api.modelo.Post;
import api.servico.ServicoComentario;
import api.servico.ServicoPost;
import core.servico.ServicoComentarioImpl;
import core.servico.ServicoPostImpl;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Vinicius Lelis
 */
public class AlterarPost extends HttpServlet {

     @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
            ServletContext sc = req.getServletContext();                
            ServicoPost sPost = new ServicoPostImpl(); 
            ServicoComentario cComentario = new ServicoComentarioImpl();             
            String id = req.getParameter("idPost");
            Post uBD = sPost.procurarID(Long.parseLong(id));
            List<Comentario> cBD = cComentario.listarComentario(Long.parseLong(id));
   
            resp.setContentType("text/html;charset=UTF-8");
            try{
                HttpSession ses = req.getSession();
                req.setAttribute("post",uBD);
                req.setAttribute("listComentarios",cBD);                  
        
                sc.getRequestDispatcher("/dynamic/jsp/alterarPost.jsp").forward(req, resp);
            } catch (Exception e){
                e.printStackTrace();
            }
///////
    }
    
}