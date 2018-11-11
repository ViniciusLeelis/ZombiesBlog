     <%@include file= "header.jsp" %>  
<%@page import="java.util.List"%>
 
     <%@page import="api.modelo.Post"%> 
     <%@page import="api.modelo.Usuario"%>
     <% List<Post> posts = (List<Post>)request.getAttribute("listPosts"); %>
 

      <!-- Final do header do blog    !-->
        <div class="container">
            <h1 class="blog-title">Zombies Produtora Blog</h1>
            <p class="lead blog-description">Seja bem-vindo  ao blog oficial da Zombies Produtora </p>
        </div>        
  
        <div class="container">
            <div class="row">
                <div class="col-sm-8 blog-main">
                    <!-- /. Início do loop -->
          
                    
                <% for(Post p: posts) { %>
                
                    <div class="blog-post">
                        <a href="Post?idPost=<%= p.getId() %>">
                        <h2 class='blog-post-title'><%= p.getTitulo()  %></h2>
                        
                        </a>
                        <p class="blog-post-meta"><%= p.getData() %> <a href="#"><%= p.getAutor() %></a></p>
                        <p><%= p.getConteudo()%></p>
                        
                    </div><!-- /. Post -->
                 <% } %>
                    <!-- /. Fim do loop -->
                <nav class="blog-pagination">
                  <a class="btn btn-outline-primary" href="#">Antigo</a>
                  <a class="btn btn-outline-secondary disabled" href="#">Novo</a>
                </nav>

                </div><!-- /. Lista de paginação -->

                <div class="col-sm-3 offset-sm-1 blog-sidebar">
                    <div class="sidebar-module sidebar-module-inset">
                        <h4>Sobre a Zombies</h4>
                        <p>A Zombies Blog foi criado com o intuito de transmitir conhecimento sobre
                        esse mundo mágico da produção audiovisual. Dicas, helps e tutoriais para você !</p>
                    </div>
                    <div class="sidebar-module">
                        <h4>Arquivos do blog</h4>
                        <ol class="list-unstyled">
                            <li><a href="#">2018 Arquivo</a></li>

                        </ol>
                    </div>

                </div><!-- /.blog-sidebar -->

            </div><!-- /.row -->

         </div>

        <footer class="blog-footer">

        </footer>

    </body>
</html>
