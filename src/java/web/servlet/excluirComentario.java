/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web.servlet;

import api.modelo.Post;
import api.servico.ServicoComentario;
import api.servico.ServicoPost;
import core.servico.ServicoComentarioImpl;
import core.servico.ServicoPostImpl;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import static java.time.Clock.system;
import java.util.Calendar;
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
public class excluirComentario extends HttpServlet {
 
  
    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        ServletContext sc = req.getServletContext();
            ServicoComentario sComentario = new ServicoComentarioImpl();   
            String idAutor = req.getParameter("idComentario");
            /* --------------------------------------------------- */

            /* Cria um novo ServicoUsuarioImpl para utilizar de seus recursos*/
            sComentario.apagar(Long.parseLong(idAutor));
            System.out.println("Comentário excluido, id: " + idAutor);
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
