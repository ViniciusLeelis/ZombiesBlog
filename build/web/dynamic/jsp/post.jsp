<%@page import="api.modelo.Comentario"%>
<%@page import="java.util.List"%>
<%@page import="api.modelo.Post"%>
<!DOCTYPE html>
     <% Post post = (Post)request.getAttribute("idPost"); %>
     <% List<Comentario> comentarios = (List<Comentario>)request.getAttribute("listComentarios"); %>
     
        <%@include file= "header.jsp" %>  
        <div class="container">
            <div class="row">
                
           
                <!-- -------------------------------- Início da Postagem -------------------------------- !--> 
                <div class="col-lg-8">
                    <h1> <%= post.getTitulo() %></h1>
                    <h4> por <a href="#"> <%= post.getAutor() %> </a> </h4>
                    <p>Postado em: <%= post.getData() %> </p>

                    <hr>
                    <p> <%= post.getConteudo() %> </p>
                    <hr>
                    <div class="card my-4">
                        <h5 class="card-header">Deixe um comentário:</h5>
                        <div class="card-body">
                            <form method="POST" align="center" action="novoComentario.action">
                            <div class="form-group">
                                <textarea name="comentario" class="form-control" rows="3"></textarea>
                                <input type="hidden" name="idPost" value="<%= post.getId() %>">
                            </div>
                                
                            <div class="form-group">
                                <button type="submit" class="submitButton">Comentar</button>
                            </div>                     
                            </form>
 
                        </div>
                    </div>
             
                                        
                    <% for(Comentario c: comentarios) { 
                    %>
                    <hr>
                    <article class="card">
                        <div class="card-body">
                            <img class="avatar" src="static/img/user.png" alt="img" width="75" height="75">
                            <cite>
                                <a href="#"> <%= c.getAutor() %> </a>
                            </cite>
                            <a>
                                <span><%= c.getData() %> </span>
                            </a>
                        </div>
                        <section class="comment-content comment">
                            <p><%= c.getComentario() %> </p>
                        </section>
                    </article>
                      <% } %>
                </div>
                  
                <!-- -------------------------------- Fim da postagem -------------------------------- !--> 
              
                <div class="col-sm-3 offset-sm-1 blog-sidebar">
                    <div class="sidebar-module sidebar-module-inset">
                        
                        <h4>Sobre a Zombies</h4>
                        <p>A Zombies Blog foi criado com o intuito de transmitir conhecimento sobre
                        esse mundo mágico da produção audiovisual. Dicas, helps e tutoriais para você !</p>
                    </div>
                    <div class="sidebar-module">
                        <h4>Arquivos do blog</h4>
                        <ol class="list-unstyled">
                            <li><a href="#">March 2014</a></li>
                        </ol>
                    </div>

                    </div><!-- /.blog-sidebar -->
                
            </div>
      <!-- /.row -->

        </div>
    <!-- /.container -->

    <!-- Footer -->
    <footer class="py-5 bg-dark">
      <div class="container">
        <p class="m-0 text-center text-white">Copyright &copy; Zombies Produtora 2018</p>
      </div>
      <!-- /.container -->
    </footer>
    <script>
      function typeWriter(elemento) {
        const textoArray = elemento.innerHTML.split('');
        elemento.innerHTML = '';
        textoArray.forEach((letra, i) => {
          setTimeout(() => elemento.innerHTML += letra, 75 * i);
        });
      }

      const titulo = document.querySelector('h1');
      typeWriter(titulo);
    </script>

    <!-- Bootstrap core JavaScript -->
    <script src="vendor/jquery/jquery.min.js"></script>
    <script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

  </body>

</html>
