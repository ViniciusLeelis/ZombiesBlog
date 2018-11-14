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
public class novoPost extends HttpServlet {
 
  
    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        ServletContext sc = req.getServletContext();
            ServicoPost sPost = new ServicoPostImpl();   
            List<Post> uBD = sPost.listarTudo();   

            /* Pega do metodo POST os parametros "email" e "senha" */
            String titulo = req.getParameter("titulo");
            String conteudo = req.getParameter("conteudo");
            String autor = "Lelis";
            String nivelAcesso = "0";
            Post post = new Post(titulo, conteudo, autor);

            /* --------------------------------------------------- */

            /* Cria um novo ServicoUsuarioImpl para utilizar de seus recursos*/
            sPost.inserir(post);
            resp.setContentType("text/html;charset=UTF-8");
            try (PrintWriter out = resp.getWriter()) {
                out.println("<!DOCTYPE html>");           
                out.println("<html>");
                out.println("<body>");
                out.println("<script>");
                out.println("alert (\"Post inserido com sucesso:" + post.getTitulo() + "  !!\");");
                out.println("</script>");
                out.println("</body>");
                out.println("</html>");           
            }
        catch(Exception e){}   

         }
///////
    }


