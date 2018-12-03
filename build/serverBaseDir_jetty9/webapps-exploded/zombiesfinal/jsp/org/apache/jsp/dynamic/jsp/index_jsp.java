package org.apache.jsp.dynamic.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import api.modelo.Usuario;
import java.util.List;
import api.modelo.Post;
import api.modelo.Usuario;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("     ");
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
      out.write("  \n");
      out.write("\n");
      out.write(" \n");
      out.write("      \n");
      out.write("     \n");
      out.write("     <!-- É puxado a lista de posts pelo request !-->\n");
      out.write("     ");
 List<Post> posts = (List<Post>)request.getAttribute("listPosts"); 
      out.write("\n");
      out.write(" \n");
      out.write("\n");
      out.write("      <!-- Pequena introdução    !-->\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <h1 id=\"animacao\" class=\"blog-title\">Zombies Produtora Blog</h1>\n");
      out.write("            <p class=\"lead blog-description\">Seja bem-vindo  ao blog oficial da Zombies Produtora </p>\n");
      out.write("        </div>        \n");
      out.write("  \n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-sm-8 blog-main\">\n");
      out.write("      <!-- FInal da pequena introdução !-->\n");
      out.write("      \n");
      out.write("      \n");
      out.write("      <!-------------------------------------  Início do loop ---------------------------------------------->\n");
      out.write("          \n");
      out.write("                    \n");
      out.write("                ");
 for(Post p: posts) { 
      out.write("\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                    <div class=\"blog-post\">\n");
      out.write("                        <a href=\"Post?idPost=");
      out.print( p.getId() );
      out.write("\">\n");
      out.write("                        <h2  class='blog-post-title'>");
      out.print( p.getTitulo()  );
      out.write("</h2>\n");
      out.write("                        \n");
      out.write("                        </a>\n");
      out.write("                        <p class=\"blog-post-meta\">");
      out.print( p.getData() );
      out.write(" <a href=\"#\">");
      out.print( p.getAutor() );
      out.write("</a></p>\n");
      out.write("                        ");
 
                            if (p.getConteudo().length() > 100) { 
      out.write("\n");
      out.write("                            <p>");
      out.print( p.getConteudo().substring(0, 100) + "... [saiba mais]" );
      out.write(" </p>\n");
      out.write("                            ");
 } else { 
      out.write("\n");
      out.write("                            <p>");
      out.print( p.getConteudo() );
      out.write("</p>\n");
      out.write("                            ");
 } 
      out.write("\n");
      out.write("\n");
      out.write("                        \n");
      out.write("                    </div><!-- /. Post -->\n");
      out.write("                 ");
 } 
      out.write("\n");
      out.write("      <!---------------------------------- Fim do loop ---------------------------------------------------->\n");
      out.write("\n");
      out.write("\n");
      out.write("                </div><!-- /. Lista de paginação -->\n");
      out.write("\n");
      out.write("                <div class=\"col-sm-3 offset-sm-1 blog-sidebar\">\n");
      out.write("                    <div class=\"sidebar-module sidebar-module-inset\">\n");
      out.write("                        <h4>Sobre a Zombies</h4>\n");
      out.write("                        <p>A Zombies Blog foi criado com o intuito de transmitir conhecimento sobre\n");
      out.write("                        esse mundo mágico da produção audiovisual. Dicas, helps e tutoriais para você !</p>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"sidebar-module\">\n");
      out.write("                        <h4>Arquivos do blog</h4>\n");
      out.write("                        <ol class=\"list-unstyled\">\n");
      out.write("                            <li><a href=\"#\">2018 Arquivo</a></li>\n");
      out.write("                            <div id=\"zombie\"> </div>\n");
      out.write("                        </ol>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </div><!-- /.blog-sidebar -->\n");
      out.write("\n");
      out.write("            </div><!-- /.row -->\n");
      out.write("\n");
      out.write("         </div>\n");
      out.write("\n");
      out.write("        <footer class=\"blog-footer\">\n");
      out.write("        </footer>\n");
      out.write("      \n");
      out.write("<!-- Script para manipular o DOM e escrever os títulos em h1 com efeito de máquina de escrever !-->\n");
      out.write("    <script>\n");
      out.write("        var cont = 0;\n");
      out.write("        $(\"#animacao\").click(function(){\n");
      out.write("            \n");
      out.write("            if(cont != 1 ) {\n");
      out.write("                $(\"div\").animate({\n");
      out.write("                    left: '+=250px',\n");
      out.write("                    height: '+=150px',\n");
      out.write("                    width: '+=150px'\n");
      out.write("\n");
      out.write("                });\n");
      out.write("            cont = 1;}\n");
      out.write("        \n");
      out.write("            else{\n");
      out.write("                $(\"div\").animate({\n");
      out.write("                    left: '0',\n");
      out.write("                    height: '-=150px',\n");
      out.write("                    width: '-=150px'\n");
      out.write("                    });            \n");
      out.write("            cont = 0\n");
      out.write("            } \n");
      out.write("        });          \n");
      out.write("      function typeWriter(elemento) {\n");
      out.write("        const textoArray = elemento.innerHTML.split('');\n");
      out.write("        elemento.innerHTML = '';\n");
      out.write("        \n");
      out.write("        textoArray.forEach((letra, i) => {\n");
      out.write("          setTimeout(() => elemento.innerHTML += letra, 75 * i);\n");
      out.write("        });\n");
      out.write("      }\n");
      out.write("\n");
      out.write("\n");
      out.write("      const titulo = document.querySelector('h1');\n");
      out.write("      typeWriter(titulo);\n");
      out.write("    </script>\n");
      out.write("<!-- Fim do script !-->\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
