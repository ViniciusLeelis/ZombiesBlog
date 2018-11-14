/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web.servlet;

import api.modelo.Comentario;
import api.modelo.Post;
import api.modelo.Usuario;
import api.servico.ServicoComentario;
import api.servico.ServicoPost;
import api.servico.ServicoUsuario;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import core.servico.ServicoComentarioImpl;
import core.servico.ServicoPostImpl;
import core.servico.ServicoUsuarioImpl;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author vinicius.lelis
 */
public class novoComentario extends HttpServlet {

   @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        ServletContext sc = req.getServletContext();
            ServicoComentario sComentario = new ServicoComentarioImpl();    
            String timeStamp = new SimpleDateFormat("dd/MM/yyyy HH:mm").format(Calendar.getInstance().getTime());            /* Pega do metodo POST os parametros "email" e "senha" */
            String coment = req.getParameter("comentario");
            String idPost = req.getParameter("idPost");
            String autor = req.getParameter("autor");
            String data = timeStamp;
            Comentario comentario = new Comentario(autor, coment, data, Long.parseLong(idPost));

            /* --------------------------------------------------- */

            /* Cria um novo ServicoUsuarioImpl para utilizar de seus recursos*/
            sComentario.inserir(comentario);
            resp.setContentType("text/html;charset=UTF-8");
            try (PrintWriter out = resp.getWriter()) {
                out.println("<!DOCTYPE html>");           
                out.println("<html>");
                out.println("<body>");
                out.println("<script>");
                out.println("alert (\"Comentario inserido!!!\");");
                out.println("</script>");
                out.println("</body>");
                out.println("</html>");    
                System.out.println("Comentario inserido ?" + comentario.getAutor() + "  sadoksda  " +  comentario.getComentario());

            }
        catch(Exception e){}   

         }
}