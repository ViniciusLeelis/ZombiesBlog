 
package web.servlet;

import api.modelo.Usuario;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebFilter(filterName = "paginasProtegidas",
        urlPatterns = {
            "/screenLogin/*",
            "/screenLogado",
            "/screenPost/*",})
public class sessionFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException { }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        
        HttpServletRequest requisicaoServlet = (HttpServletRequest) request;
        HttpServletResponse respostaServlet = (HttpServletResponse) response;
        HttpSession sessao = requisicaoServlet.getSession();
        
        if(sessao.getAttribute("usuarioAutenticado") != null){ //&& "1".equals(sessao.getAttribute("tipoUsuario"))){
            chain.doFilter(request, response);
            Usuario usuario = (Usuario)request.getAttribute("usuarioAutenticado");
            System.out.println("usuario: " + usuario.getNome());
            
        }else{
            respostaServlet.sendRedirect("/");
        }
    }

    @Override
    public void destroy() { }
    
}
