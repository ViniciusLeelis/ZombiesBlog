/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web.servlet;

import api.servico.ServicoComentario;
import api.servico.ServicoPost;
import core.servico.ServicoComentarioImpl;
import core.servico.ServicoPostImpl;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Vinicius Lelis
 */
public class excluirPost extends HttpServlet {

     @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        ServletContext sc = req.getServletContext();
            ServicoPost sPost = new ServicoPostImpl();   
            String idPost = req.getParameter("idPostDel");
            /* --------------------------------------------------- */

            /* Cria um novo ServicoUsuarioImpl para utilizar de seus recursos*/
          
            sPost.excluir(Long.parseLong(idPost));
            
          

            resp.setContentType("text/html;charset=UTF-8");
            try (PrintWriter out = resp.getWriter()) {
                out.println("<!DOCTYPE html>");           
                out.println("<html>");
                out.println("<body>");
                out.println("<script>");
                out.println("alert (\"Comentário excluido com sucesso\");");
                out.println("</script>");
                out.println("</body>");
                out.println("</html>");   
                resp.sendRedirect( "/zombiesfinal/");
            }
        catch(Exception e){}   

         }
///////
    }