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
import static java.lang.System.out;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author vinicius.lelis
 */
public class Registrar extends HttpServlet {

  
    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        ServletContext sc = req.getServletContext();
            ServicoPost sPost = new ServicoPostImpl();   
            List<Post> uBD = sPost.listarTudo();   

            /* Pega do metodo POST os parametros "email" e "senha" */
            String apelido = req.getParameter("apelido");
            String senha = req.getParameter("senha");
            String nome = req.getParameter("nome");
            String email = req.getParameter("email");
            String nivelAcesso = "0";
            Usuario user = new Usuario(apelido, senha, nome, email, "0");

            /* --------------------------------------------------- */

            /* Cria um novo ServicoUsuarioImpl para utilizar de seus recursos*/
            ServicoUsuario sUsuario = new ServicoUsuarioImpl();

            sUsuario.inserir(user);
            resp.setContentType("text/html;charset=UTF-8");
            try (PrintWriter out = resp.getWriter()) {
                out.println("<!DOCTYPE html>");           
                out.println("<html>");
                out.println("<body>");
                out.println("<script>");
                out.println("alert (\"Olá ! " + nome + ", seu cadastro foi realizado com sucesso !!\");");
                out.println("</script>");
                out.println("</body>");
                out.println("</html>");           
            }
        catch(Exception e){}   

         }
///////
    }
