
package web.servlet;

import api.modelo.Usuario;
import api.servico.ServicoUsuario;
import static com.sun.corba.se.spi.presentation.rmi.StubAdapter.request;
import core.servico.ServicoUsuarioImpl;
import java.io.IOException;
import static java.lang.System.out;
import static java.sql.DriverManager.println;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Autenticador extends HttpServlet {   
    
    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        
        try{
            req.setCharacterEncoding("UTF-8"); 
        }
        catch(Exception e){}   

        /* Pega do metodo POST os parametros "email" e "senha" */
        String emailUsuario = req.getParameter("email");
        String senha = req.getParameter("senha");
        /* --------------------------------------------------- */
        
        /* Cria um novo ServicoUsuarioImpl para utilizar de seus recursos*/
        ServicoUsuario sUsuario = new ServicoUsuarioImpl();   
        Usuario uBD = sUsuario.procurarEmail(emailUsuario);      
        /* --------------------------------------------------- */

        /* Chama os Servlets */ 
        ServletContext sc = req.getServletContext();
        if (uBD!= null && uBD.getSenha().equals(senha)){ /* If para determinar se existe o usuário e a senha no BD */
            if(uBD.getnivelAcesso().equals("1")) {  /* If para determinar se o usuário é administrador */
                try{
                    req.setAttribute("adminLogado",uBD);
                    /* Caso for, seta um atributo para adminLogado e abre o jsp logadoAdmin.jsp */
                    sc.getRequestDispatcher("/dynamic/jsp/logadoAdmin.jsp").forward(req, resp);
                }   catch( Exception e){}
            } else                     /* Caso não for administrador, ele será usuário */
                 try{
                    req.setAttribute("usuarioLogado",uBD);
                    /* Sendo usuário, é setado um atributo de usuarioLogado e abre o jsp logado.jsp */
                    sc.getRequestDispatcher("/dynamic/jsp/logado.jsp").forward(req, resp);
                                

                }   catch( Exception e){}               
        
        }
        else{
            try {
                /* Caso o usuário seja invalido, ele apenas seta um atributo de falha e abre a página inicial */    
            }catch(Exception e){
                req.setAttribute("falhaAutenticacao", true);
                sc.getRequestDispatcher("/dynamic/jsp/index.jsp").forward(req, resp);
       
            }  
        }
    }
}