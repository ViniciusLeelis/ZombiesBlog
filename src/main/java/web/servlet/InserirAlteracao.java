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
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Vinicius Lelis
 */
public class InserirAlteracao extends HttpServlet {

    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        ServletContext sc = req.getServletContext();
            ServicoPost sPost = new ServicoPostImpl();    
            String idPost = req.getParameter("idPost");
            String titulo = req.getParameter("titulo");
            String autor = req.getParameter("autor");
            String conteudo = req.getParameter("conteudo");
            String timeStamp = new SimpleDateFormat("dd/MM/yyyy HH:mm").format(Calendar.getInstance().getTime());            /* Pega do metodo POST os parametros "email" e "senha" */
            /* --------------------------------------------------- */
            Post post = new Post(Long.parseLong(idPost), titulo, conteudo, timeStamp + " (alterado)", autor);
            sPost.alterar(post);
            
            /* Cria um novo ServicoUsuarioImpl para utilizar de seus recursos*/
            
            resp.sendRedirect( "Post?idPost=" + idPost);
            PrintWriter out = resp.getWriter();  
            resp.setContentType("text/html");  
            out.println("<script type=\"text/javascript\">");  
            out.println("alert('Alterado com sucesso !!');");  
            out.println("</script>");
                
            }  

         }
