<%@page import="api.modelo.Comentario"%>
<%@page import="java.util.List"%>
<%@page import="api.modelo.Post"%>
<!DOCTYPE html>

     <% Post post = (Post)request.getAttribute("idPost"); %>
     <% Usuario usuario = (Usuario)session.getAttribute("usuario");%>
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

                 <!-- Verifica se o usuário está logado, caso não esteja, é apresentado uma mensagem  !-->
                    <% if(session.getAttribute("usuario")==null)  
                    {
                    %> 
                    <h5 class="card-header"><b>Faça login para deixar um comentário!!</b></h5>
                   <% } else { %>   <!-- Se estiver logado é liberado o campo para comentar !-->
                    <div class="card my-4">
                        <h5 class="card-header">Deixe um comentário:</h5>
                        <div class="card-body">
                            <form method="POST" align="center" action="novoComentario.action">        <!-- É enviado o comentário via POST !-->
                                <div class="form-group">
                                    <textarea name="comentario" id="proibir" class="form-control" rows="3"></textarea>
                                    <input type="hidden" name="idPost" value="<%= post.getId() %>">
                                    <input type="hidden" name="autor" value="<%= usuario.getNome() %>">

                                </div>
                                
                                <div class="form-group">
                                    <button type="submit" class="submitButton">Comentar</button>
                                </div>                     
                            </form>
 
                        </div>
                    </div>
                        <% } %>                          
                                    

                   <!-- Loop para exibir o restante dos comentários !-->                    
                                        
                    <% for(Comentario c: comentarios) { %>
                    <hr>
                    <article class="card">
                        <div class="card-body">
                            <img id="userZombie" width="05%" src="static/img/user_zombie.gif">
                            <cite>
                                <a href="#"> <%= c.getAutor() %> </a>
                            </cite>
                            <a>
                                <span><%= c.getData() %> </span>
                            </a>

                        </div>
                        <section class="comment-content comment">
                            <p><%= c.getComentario() %> </p>
                            <% if(session.getAttribute("usuario")==null)  {
                                
                            } else if(usuario.getnivelAcesso().equals("1")) {
                                 %> 
                                    <form method="POST" action="excluirComentario.action">
                                        <input type="hidden" name="idComentario" value="<%= c.getId() %>">
                                    <a href="excluirComentario.action"><button type="submit" class="btn btn-danger">Excluir</button></a> 
                                    </form>         
                                <%} %>  
                        </section>
                    </article>
                      <% } %>
                </div>
                  
                <!-- -------------------------------- Fim do loop -------------------------------- !--> 
              
                <div class="col-sm-3 offset-sm-1 blog-sidebar">
                    <div class="sidebar-module sidebar-module-inset">
                        <h4>Sobre a Zombies</h4>
                        <p>A Zombies Blog foi criado com o intuito de transmitir conhecimento sobre
                        esse mundo mágico da produção audiovisual. Dicas, helps e tutoriais para você !</p>
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
     <!-- Script usando listener para identificar as palavras ofensivas, junto adicionei um sistema de criptografia para criptografar uma String contendo as palavras ofensivas, mas sem sucesso !-->
        $('#proibir').keyup(function() {
            var $th = $(this);
            var e = jsEncode.encode("/porra|caralho/gi","123");
            var d = jsEncode.encode(e,"123");
            $th.val($th.val().replace(/porra|caralho|fode|bucet|puta|puto|caralh|viado|bost|boquet|cagad|bunda|foda|fudid|punhet|cuzao|vai tomar no cu|tomar no cu|puta que pariu|putaquepariu|ralho|/gi,function(str){return '';}));
        }).bind('paste',function(e) {
            setTimeout(function() {
                $('#someinput').val($('#someinput').val().replace(/porra|caralho|fode|bucet|puta|puto|caralh|viado|bost|boquet|cagad|bunda|foda|fudid|punhet|cuzao|vai tomar no cu|tomar no cu|puta que pariu|putaquepariu|ralho|/gi,function(str){return '';}));
                $('#someinput').val($('#someinput').val().replace(/\s+/g,' '));
            },100);
        });       
 
 
 <!--  Script para fazer o efeito de máquina de ecsrver no h1   !-->
      function typeWriter(elemento) {
        const textoArray = elemento.innerHTML.split('');
        elemento.innerHTML = '';
        textoArray.forEach((letra, i) => {
          setTimeout(() => elemento.innerHTML += letra, 75 * i);
        });
      }

      const titulo = document.querySelector('h1');
      typeWriter(titulo);

      (function() {
            const titulos = ['Digite um comentário TOP', 'Digite um comentário show!', 'Grgrgrrg comentario'];
            const tituloRandom = titulos[Math.floor(Math.random() * (1 - 0 + 1)) + 1];
            document.getElementById('proibir').placeholder = tituloRandom;
            document.getElementbyId('seila')
            const imagens = ['user_zombies.gif', 'user_zombie2.gif'];
            const imgRandom = imagens[Math.floor(Math.random() * (1 - 0 + 1)) + 0];
            document.getElementById("userZombie").src = "imgRandom";
           })();
           

            
    </script>


  </body>

</html>
