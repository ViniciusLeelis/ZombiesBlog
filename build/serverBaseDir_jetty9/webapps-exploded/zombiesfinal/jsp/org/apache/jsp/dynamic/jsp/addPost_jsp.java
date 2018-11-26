package org.apache.jsp.dynamic.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import api.modelo.Usuario;

public final class addPost_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE html>\n");
      out.write("\n");
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
      out.write("        <meta charset=\"UTF-8\">\n");
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
      out.write("             ");
 Usuario usuario = (Usuario)session.getAttribute("usuario");
      out.write("\n");
      out.write("       <div class=\"container\">\n");
      out.write("            <h1 class=\"blog-title\">Zombies Produtora Blog</h1>\n");
      out.write("            <h3 class=\"lead blog-description\">Inserir post:</h3>\n");
      out.write("        </div>        \n");
      out.write("        \n");
      out.write("        <!-- Form que mandará o POST para o novoPost.action!-->\n");
      out.write("        <div class=\"container\">\t\n");
      out.write("            <div>\n");
      out.write("                    <div style=\"padding-top: 2%\" class=\"col-md-12\">\n");
      out.write("                    <form method=\"POST\" action=\"novoPost.action\">\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label>Título:</label>\n");
      out.write("                            <input name=\"titulo\" type=\"text\" class=\"form-control\" id=\"insertTitulo\" placeholder=\"Digite o título da postagem:\" required>\n");
      out.write("                        </div>\n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label >Conteúdo:</label>\n");
      out.write("                            <input name=\"autor\" type=\"hidden\" value=\"");
      out.print( usuario.getNome() );
      out.write("\">\n");
      out.write("                            <textarea name=\"conteudo\" id=\"insertConteudo\" class=\"form-control\" placeholder=\"Digite o conteúdo da postagem\" rows=\"4\" required></textarea>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div align=\"center\" class=\"form-group\">\n");
      out.write("                            <button type=\"submit\" class=\"submitButton\">Inserir post</button>\n");
      out.write("                        </div>                    \n");
      out.write("                    </form>\n");
      out.write("                </div>\t\n");
      out.write("            </div>\n");
      out.write("        </div>     \n");
      out.write("        <!-- Form que mandará o POST para o novoPost.action!-->\n");
      out.write("        \n");
      out.write("      <footer>\t<!-- Footer do blog !-->\n");
      out.write("      </footer>\n");
      out.write("\n");
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
