package org.apache.jsp.dynamic.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import api.modelo.Comentario;
import java.util.List;
import api.modelo.Post;
import api.modelo.Usuario;

public final class post_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("     ");
 Post post = (Post)request.getAttribute("idPost"); 
      out.write("\n");
      out.write("     ");
 Usuario usuario = (Usuario)session.getAttribute("usuario");
      out.write("\n");
      out.write("     ");
 List<Comentario> comentarios = (List<Comentario>)request.getAttribute("listComentarios"); 
      out.write("\n");
      out.write("    \n");
      out.write("     \n");
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
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                \n");
      out.write("           \n");
      out.write("                <!-- -------------------------------- Início da Postagem -------------------------------- !--> \n");
      out.write("                <div class=\"col-lg-8\">\n");
      out.write("                    <h1> ");
      out.print( post.getTitulo() );
      out.write("</h1>\n");
      out.write("                    <h4> por <a href=\"#\"> ");
      out.print( post.getAutor() );
      out.write(" </a> </h4>\n");
      out.write("                    <p>Postado em: ");
      out.print( post.getData() );
      out.write(" </p>\n");
      out.write("\n");
      out.write("                    <hr>\n");
      out.write("                    <p> ");
      out.print( post.getConteudo() );
      out.write(" </p>\n");
      out.write("                    <hr>\n");
      out.write("\n");
      out.write("                 <!-- Verifica se o usuário está logado, caso não esteja, é apresentado uma mensagem  !-->\n");
      out.write("                    ");
 if(session.getAttribute("usuario")==null)  
                    {
                    
      out.write(" \n");
      out.write("                    <h5 class=\"card-header\"><b>Faça login para deixar um comentário!!</b></h5>\n");
      out.write("                   ");
 } else { 
      out.write("   <!-- Se estiver logado é liberado o campo para comentar !-->\n");
      out.write("                    <div class=\"card my-4\">\n");
      out.write("                        <h5 class=\"card-header\">Deixe um comentário:</h5>\n");
      out.write("                        <div class=\"card-body\">\n");
      out.write("                            <form method=\"POST\" align=\"center\" action=\"novoComentario.action\">        <!-- É enviado o comentário via POST !-->\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <textarea name=\"comentario\" id=\"proibir\" class=\"form-control\" rows=\"3\"></textarea>\n");
      out.write("                                    <input type=\"hidden\" name=\"idPost\" value=\"");
      out.print( post.getId() );
      out.write("\">\n");
      out.write("                                    <input type=\"hidden\" name=\"autor\" value=\"");
      out.print( usuario.getNome() );
      out.write("\">\n");
      out.write("\n");
      out.write("                                </div>\n");
      out.write("                                \n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <button type=\"submit\" class=\"submitButton\">Comentar</button>\n");
      out.write("                                </div>                     \n");
      out.write("                            </form>\n");
      out.write(" \n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                        ");
 } 
      out.write("                          \n");
      out.write("                                    \n");
      out.write("\n");
      out.write("                   <!-- Loop para exibir o restante dos comentários !-->                    \n");
      out.write("                                        \n");
      out.write("                    ");
 for(Comentario c: comentarios) { 
      out.write("\n");
      out.write("                    <hr>\n");
      out.write("                    <article class=\"card\">\n");
      out.write("                        <div class=\"card-body\">\n");
      out.write("                            <img id=\"userZombie\" width=\"05%\" src=\"static/img/user_zombie.gif\">\n");
      out.write("                            <cite>\n");
      out.write("                                <a href=\"#\"> ");
      out.print( c.getAutor() );
      out.write(" </a>\n");
      out.write("                            </cite>\n");
      out.write("                            <a>\n");
      out.write("                                <span>");
      out.print( c.getData() );
      out.write(" </span>\n");
      out.write("                            </a>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                        <section class=\"comment-content comment\">\n");
      out.write("                            <p>");
      out.print( c.getComentario() );
      out.write(" </p>\n");
      out.write("                            ");
 if(session.getAttribute("usuario")==null)  {
                                
                            } else if(usuario.getnivelAcesso().equals("1")) {
                                 
      out.write(" \n");
      out.write("                                    <form method=\"POST\" action=\"excluirComentario.action\">\n");
      out.write("                                        <input type=\"hidden\" name=\"idComentario\" value=\"");
      out.print( c.getId() );
      out.write("\">\n");
      out.write("                                    <a href=\"excluirComentario.action\"><button type=\"submit\" class=\"btn btn-danger\">Excluir</button></a> \n");
      out.write("                                    </form>         \n");
      out.write("                                ");
} 
      out.write("  \n");
      out.write("                        </section>\n");
      out.write("                    </article>\n");
      out.write("                      ");
 } 
      out.write("\n");
      out.write("                </div>\n");
      out.write("                  \n");
      out.write("                <!-- -------------------------------- Fim do loop -------------------------------- !--> \n");
      out.write("              \n");
      out.write("                <div class=\"col-sm-3 offset-sm-1 blog-sidebar\">\n");
      out.write("                    <div class=\"sidebar-module sidebar-module-inset\">\n");
      out.write("                        <h4>Sobre a Zombies</h4>\n");
      out.write("                        <p>A Zombies Blog foi criado com o intuito de transmitir conhecimento sobre\n");
      out.write("                        esse mundo mágico da produção audiovisual. Dicas, helps e tutoriais para você !</p>\n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                </div><!-- /.blog-sidebar -->\n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("      <!-- /.row -->\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("    <!-- /.container -->\n");
      out.write("\n");
      out.write("    <!-- Footer -->\n");
      out.write("    <footer class=\"py-5 bg-dark\">\n");
      out.write("      <div class=\"container\">\n");
      out.write("        <p class=\"m-0 text-center text-white\">Copyright &copy; Zombies Produtora 2018</p>\n");
      out.write("      </div>\n");
      out.write("      <!-- /.container -->\n");
      out.write("    </footer>\n");
      out.write("    \n");
      out.write("    <script>\n");
      out.write("     <!-- Script usando listener para identificar as palavras ofensivas, junto adicionei um sistema de criptografia para criptografar uma String contendo as palavras ofensivas, mas sem sucesso !-->\n");
      out.write("        $('#proibir').keyup(function() {\n");
      out.write("            var $th = $(this);\n");
      out.write("            var e = jsEncode.encode(\"/porra|caralho/gi\",\"123\");\n");
      out.write("            var d = jsEncode.encode(e,\"123\");\n");
      out.write("            $th.val($th.val().replace(/porra|caralho|fode|bucet|puta|puto|caralh|viado|bost|boquet|cagad|bunda|foda|fudid|punhet|cuzao|vai tomar no cu|tomar no cu|puta que pariu|putaquepariu|ralho|/gi,function(str){return '';}));\n");
      out.write("        }).bind('paste',function(e) {\n");
      out.write("            setTimeout(function() {\n");
      out.write("                $('#someinput').val($('#someinput').val().replace(/porra|caralho|fode|bucet|puta|puto|caralh|viado|bost|boquet|cagad|bunda|foda|fudid|punhet|cuzao|vai tomar no cu|tomar no cu|puta que pariu|putaquepariu|ralho|/gi,function(str){return '';}));\n");
      out.write("                $('#someinput').val($('#someinput').val().replace(/\\s+/g,' '));\n");
      out.write("            },100);\n");
      out.write("        });       \n");
      out.write(" \n");
      out.write(" \n");
      out.write(" <!--  Script para fazer o efeito de máquina de ecsrver no h1   !-->\n");
      out.write("      function typeWriter(elemento) {\n");
      out.write("        const textoArray = elemento.innerHTML.split('');\n");
      out.write("        elemento.innerHTML = '';\n");
      out.write("        textoArray.forEach((letra, i) => {\n");
      out.write("          setTimeout(() => elemento.innerHTML += letra, 75 * i);\n");
      out.write("        });\n");
      out.write("      }\n");
      out.write("\n");
      out.write("      const titulo = document.querySelector('h1');\n");
      out.write("      typeWriter(titulo);\n");
      out.write("\n");
      out.write("      (function() {\n");
      out.write("            const titulos = ['Digite um comentário TOP', 'Digite um comentário show!', 'Grgrgrrg comentario'];\n");
      out.write("            const tituloRandom = titulos[Math.floor(Math.random() * (1 - 0 + 1)) + 1];\n");
      out.write("            document.getElementById('proibir').placeholder = tituloRandom;\n");
      out.write("            document.getElementbyId('seila')\n");
      out.write("            const imagens = ['user_zombies.gif', 'user_zombie2.gif'];\n");
      out.write("            const imgRandom = imagens[Math.floor(Math.random() * (1 - 0 + 1)) + 0];\n");
      out.write("            document.getElementById(\"userZombie\").src = \"imgRandom\";\n");
      out.write("           })();\n");
      out.write("           \n");
      out.write("\n");
      out.write("            \n");
      out.write("    </script>\n");
      out.write("\n");
      out.write("\n");
      out.write("  </body>\n");
      out.write("\n");
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
