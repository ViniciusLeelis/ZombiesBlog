package org.apache.jsp.dynamic.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import api.modelo.Usuario;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/dynamic/jsp/header.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <link rel=\"stylesheet\" href=\"static/css/style.css\" >     <!-- arquivo .css que uso para inserir meus códigos .css !-->\n");
      out.write("        <link rel=\"stylesheet\" href=\"static/css/bootstrap.css\">\n");
      out.write("        <script src=\"static/js/jquery.js\" ></script>\n");
      out.write("        <script src=\"static/js/other.js\" ></script>  <!-- arquivo .js que uso para inserir meus códigos JS !-->\n");
      out.write("        <script src=\"static/js/bootstrap.js\" ></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/crypto-js/3.1.2/rollups/aes.js\"></script>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Zombies BLOG</title>\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("    <body>\n");
      out.write("   <!-- Header do blog     !-->     \n");
      out.write("        <header>  \n");
      out.write("          <div class=\"container_header\">\n");
      out.write("              <div class=\"header\">\n");
      out.write("                  <a href=\"/zombiesfinal/\" class=\"logo\"><img width=\"50%\" src=\"static/img/logo.png\"></img></a>\n");
      out.write("                  <p class=\"white\"></p>\n");
      out.write("\n");
      out.write("                       </p>\n");
      out.write("                  <div class=\"header-right\">\n");
      out.write("                      <a class=\"active\" href=\"/zombiesfinal/\">Pagina inicial</a>\n");
      out.write("                      ");
  if(session.getAttribute("usuario")==null) { 
      out.write("\n");
      out.write("                      <a href=\"Login\">Login</a>\n");
      out.write("                      ");
 } else { 
      out.write("\n");
      out.write("                      <a href=\"Login\">Página de administração</a>\n");
      out.write("                      <a href=\"Logout\"> Deslogar </a>\n");
      out.write("                      ");
 } 
      out.write("\n");
      out.write("                      <a href=\"\" > </a>\n");
      out.write("                  </div>\n");
      out.write("             </div> \n");
      out.write("        </header>\n");
      out.write("      \n");
      out.write("\n");
      out.write("        <!-- Final do header !-->\n");
      out.write("       \n");
      out.write("\n");
      out.write("  \r\n");
      out.write("        \r\n");
      out.write("       <!-- É pego a sessão salva setado com o atributo \"usuario\"   !-->\r\n");
      out.write("       ");
 Usuario usuario = (Usuario)session.getAttribute("usuario");
      out.write("   \r\n");
      out.write("       ");
 String error = (String)request.getAttribute("erroLogin"); 
      out.write("\r\n");
      out.write("       <div class=\"container\">\r\n");
      out.write("            <h1 class=\"blog-title\">Zombies Produtora Blog</h1>\r\n");
      out.write("                   ");
 if(error.equals("erro")){
           
      out.write("\r\n");
      out.write("           <p style=\"color: #d64550; font-size: 16px;\" class=\"lead blog-description\">Usuário ou senha inválidos :( </p>\r\n");
      out.write("           ");
 } else {
      out.write("\r\n");
      out.write("           <p class=\"lead blog-description\">Faça login !</p>\r\n");
      out.write("           ");
 } 
      out.write("\r\n");
      out.write("            \r\n");
      out.write("        </div>        \r\n");
      out.write("       \r\n");
      out.write("        ");
 if(session.getAttribute("usuario")==null)  { 
      out.write("  \r\n");
      out.write("       <!-- Autenticação do usuário através do metodo POST  !-->\r\n");
      out.write("        <div class=\"container\">\t\r\n");
      out.write("            <div class=\"pai\">\r\n");
      out.write("                    <div style=\"padding-top: 2%\" class=\"col-md-4 offset-md-3 box_login\">\r\n");
      out.write("                        <form method=\"POST\" align=\"center\" action=\"Autenticador.action\"> \r\n");
      out.write("                            <div class=\"form-group\">\r\n");
      out.write("                            <label>Seu endereço de e-mail</label>\r\n");
      out.write("                            <input name=\"email\" type=\"email\" class=\"form-control\" id=\"exampleInputEmail1\" aria-describedby=\"email\" placeholder=\"Enter email\" required>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"form-group\">\r\n");
      out.write("                                <label>Senha:</label>\r\n");
      out.write("                                <input name=\"senha\" type=\"password\" class=\"form-control\" name=\"senha\" id=\"password\" placeholder=\"Digite sua senha\" required>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"form-group\">\r\n");
      out.write("                                <button type=\"submit\" class=\"submitButton\">Logar</button>\r\n");
      out.write("                            </div>                     \r\n");
      out.write("                        </form>\r\n");
      out.write("                             <div class=\"form-group\">\r\n");
      out.write("                            <p> Ainda não é cadastrado?</p>\r\n");
      out.write("                            <a href=\"Register\">\r\n");
      out.write("                               <button class=\"submitButton\">Cadastrar</button>\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </div> \r\n");
      out.write("                    </div>\t\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        ");
 } else if(usuario.getnivelAcesso().equals("1")) { 
            response.sendRedirect(request.getContextPath() + "/LogadoAdmin");
            
      out.write("       \r\n");
      out.write("        ");
 } else { 
            response.sendRedirect(request.getContextPath() + "/Logado");

            }
      out.write("\r\n");
      out.write("        \r\n");
      out.write("\r\n");
      out.write("        \r\n");
      out.write("\r\n");
      out.write("       <!-- Fim do div de autenticação !-->               \r\n");
      out.write("  \r\n");
      out.write("       \r\n");
      out.write("       <!-- Script para verificar se foi digitado um e-mail e uma senha validas  !-->\r\n");
      out.write("        <script>\r\n");
      out.write("            $(\"#form\").submit(function() {\r\n");
      out.write("                if($(\"senha\").val()== null || $(\"#senha\").val() ==\"\"){\r\n");
      out.write("                    alert('Digite uma senha válida');      \r\n");
      out.write("                    return false;\r\n");
      out.write("                }\r\n");
      out.write("            });  \r\n");
      out.write("            $(\"#form\").submit(function() {\r\n");
      out.write("                if($(\"#name\").val()== null || $(\"#name\").val() ==\"\"){\r\n");
      out.write("                    alert('Digite um e-mail válido');      \r\n");
      out.write("                    return false;\r\n");
      out.write("                }\r\n");
      out.write("            });            \r\n");
      out.write("        </script>\r\n");
      out.write("      <footer>\t<!-- Footer do blog !-->\r\n");
      out.write("      </footer>\r\n");
      out.write("\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
