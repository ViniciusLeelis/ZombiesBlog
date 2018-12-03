package org.apache.jsp.dynamic.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import api.modelo.Post;
import api.modelo.Comentario;
import api.modelo.Usuario;
import api.modelo.Usuario;

public final class logadoAdmin_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        ");
 Usuario u = (Usuario)session.getAttribute("usuario"); 
      out.write("\n");
      out.write("        ");
 List<Post> posts = (List<Post>)request.getAttribute("listPosts"); 
      out.write("\n");
      out.write("        ");
 List<Usuario> usuarios = (List<Usuario>)request.getAttribute("listUsuarios"); 
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
      out.write("        ");
 if(session.getAttribute("usuario")==null)  { 
      out.write("\n");
      out.write("        <div> Faça Login para continuar ! </div>\n");
      out.write("                                \n");
      out.write("        ");
 } else if(u.getnivelAcesso().equals("1")) {
                                 
      out.write(" \n");
      out.write("        <div align=\"center\" class=\"conteudo\">\n");
      out.write("            <div  style=\"padding-top: 02px; padding-bottom: 25px;\">\n");
      out.write("                <img width=\"10%\" src=\"static/img/zombi.gif\">\n");
      out.write("                <h2> Seja bem-vindo ! </h2>\n");
      out.write("                <p>Você está logado como: ");
      out.print( u.getNome() );
      out.write("</p>\n");
      out.write("                <div> Deseja adicionar um novo tópico?</div>\n");
      out.write("                <a href=\"addPost\"><button onclick=\"\" class=\"submitButton\">Adicionar tópico</button></a> \n");
      out.write("            </div>\n");
      out.write("            <hr>\n");
      out.write("            \n");
      out.write("             <!-- Foi definido um CSS usando media queries para tornar a table responsiva !-->\n");
      out.write("            <!-- Gerenciar tópicos -->\n");
      out.write("            <div class=\"col-md-12\">\n");
      out.write("                <h3> Gerenciar tópicos: </h3>\n");
      out.write("                <table class=\"table table-condensed\">\n");
      out.write("                    <tr>\n");
      out.write("                        <td class=\"active\">Autor</td>\n");
      out.write("                        <td class=\"active\">Título</td>\n");
      out.write("                        <td class=\"col-md-6 active\">Conteúdo</td>\n");
      out.write("                        <td class=\"active\">Data</td>\n");
      out.write("                        <td class=\"active\">Ação</td>\n");
      out.write("                    </tr>\n");
      out.write("                <!-- Loop de tópicos existentes no blog  -->\n");
      out.write("                   ");
 for(Post p: posts) { 
      out.write("\n");
      out.write("              \n");
      out.write("                    <tr class=\"active\">\n");
      out.write("                        <td >");
      out.print( p.getAutor() );
      out.write("</td>\n");
      out.write("                        <td>");
      out.print( p.getTitulo() );
      out.write("</td>\n");
      out.write("                        <td >");
      out.print( p.getConteudo());
      out.write("</td>\n");
      out.write("                        <td>");
      out.print( p.getData());
      out.write("</td>\n");
      out.write("                        <td>\n");
      out.write("                            <form method=\"POST\" action=\"excluirPost.action\">\n");
      out.write("                                <input type=\"hidden\" name=\"idPostDel\" value=\"");
      out.print( p.getId() );
      out.write("\">\n");
      out.write("                            <button type=\"submit\" class=\"deleteButton\">Excluir </button>\n");
      out.write("                            </form>\n");
      out.write("                            <form method=\"POST\" action=\"alterarPost.action\">\n");
      out.write("                                <input type=\"hidden\" name=\"idPost\" value=\"");
      out.print( p.getId() );
      out.write("\">\n");
      out.write("                            <button type=\"submit\" class=\"submitButton\">Alterar</button>\n");
      out.write("                            </form>                            \n");
      out.write("                            <a href=\"Post?idPost=");
      out.print( p.getId() );
      out.write("\"><button onclick=\"\" class=\"submitButton\">Ver tópico </button></a>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                            ");
 } 
      out.write("  \n");
      out.write("                <!-- Fim do loop  -->\n");
      out.write("                </table>\n");
      out.write("              \n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("                  \n");
      out.write("            <!-- Gerenciar Usuários -->\n");
      out.write("            <hr>\n");
      out.write("            <div class=\"col-md-12\">\n");
      out.write("                <h3> Gerenciar usuários: </h3>\n");
      out.write("                <table class=\"table table-condensed\">\n");
      out.write("                 ");
 for(Usuario x: usuarios) { 
      out.write("\n");
      out.write("                    ");
 if(x.getnivelAcesso().equals("0")) { 
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                        <td class=\"active\">Nome</td>\n");
      out.write("                        <td class=\"active\">Função</td>\n");
      out.write("                        <td class=\"active\">Apelido</td>\n");
      out.write("                        <td class=\"active col-md-2\">Ação</td>\n");
      out.write("                \n");
      out.write("                    </tr>\n");
      out.write("                <!-- Loop de tópicos existentes no blog  -->\n");
      out.write("                    <tr class=\"active\">\n");
      out.write("                        <td >");
      out.print( x.getNome() );
      out.write("</td>\n");
      out.write("                        <td class=\"active\">");
 if(x.getnivelAcesso().equals("1")) {
      out.write("\n");
      out.write("                            Administrador ");
 } else {
      out.write("\n");
      out.write("                            Usuário ");
 } 
      out.write("</td>\n");
      out.write("                        <td>");
      out.print( x.getApelido() );
      out.write("</td>\n");
      out.write("                        <td>\n");
      out.write("                            <form method=\"POST\" action=\"excluirUsuario.action\">\n");
      out.write("                                <input type=\"hidden\" name=\"idUsuario\" value=\"");
      out.print( x.getId() );
      out.write("\">   \n");
      out.write("                                <input type=\"hidden\" name=\"autorUsuario\" value=\"");
      out.print( x.getApelido() );
      out.write("\">   \n");
      out.write("                                <input type=\"hidden\" value=\"&#153;\" name=\"bugIE\">\n");
      out.write("                            <button type=\"submit\" class=\"deleteButton\">Excluir </button>\n");
      out.write("                            </form>                            \n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    ");
 }
                            } 
      out.write("  \n");
      out.write("                <!-- Fim do loop  -->\n");
      out.write("                </table>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            </div>  \n");
      out.write("        ");
 } else { 
      out.write("\n");
      out.write("            <div> Apenas administradores podem ver essa página </div>\n");
      out.write("            \n");
      out.write("         ");
 } 
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
