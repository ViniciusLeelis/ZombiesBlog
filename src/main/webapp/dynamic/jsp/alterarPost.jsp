<!DOCTYPE html>
<%@page import="api.modelo.Post"%>
<%@page import="api.modelo.Usuario"%>
<%@page import="api.modelo.Comentario"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<% Usuario usuario = (Usuario)session.getAttribute("usuario");%>
<% Post post = (Post)request.getAttribute("post"); %>
<% List<Comentario> comentarios = (List<Comentario>)request.getAttribute("listComentarios"); %>
    
                
        <%@include file= "header.jsp" %>  

       <div class="container">
            <h1 class="blog-title">Zombies Produtora Blog</h1>
            <h3 class="lead blog-description">Alterar post:</h3>
        </div>        
      
        <!-- Form que mandará o POST para o alterarPost.action!-->
        <div class="container">	
            <div> 
                    <div style="padding-top: 2%" class="col-md-12">
                        <form method="POST" action="inserirAlteracao.action">
                        <div class="form-group">
                            <label>Título:</label>
                            <input type="hidden" value="&#153;" name="bugIE"> 
                            <textarea name="titulo" type="text" class="form-control" id="insertTitulo" placeholder="<%= post.getTitulo() %>" required acceptcharset="UTF-8"><%= post.getTitulo() %></textarea>
                        </div>
                        
                        
                        <div class="form-group">
                            <label >Conteúdo:</label>
                            <input name="autor" type="hidden" value="">
                            <input name="idPost" type="hidden" value="<%= post.getId() %>">
                            <textarea name="conteudo" id="insertConteudo" class="form-control" placeholder="<%= post.getConteudo() %>" rows="4" required acceptcharset="UTF-8"><%= post.getConteudo() %></textarea>
                        </div>
                        <% if(comentarios.isEmpty()) { %>  <!-- Verifica se existem comentários !-->
                        <div align="center" class="form-group">
                            <button id="alterarPost" type="submit" class="submitButton">Alterar post</button>
                            <% } else { %>
                            <div style="color: red"> Você não pode alterar esse tópico :( </div>
                            <% } %>
                        </div>                    
                    </form>
                </div>	
            </div>
        </div>        
       <footer>	<!-- Footer do blog !-->
       </footer>
       <script>
            document.getElementById("alterarPost").addEventListener("click", addComentario);

            function addPost() {
                alert ("Post alterado com sucesso!");
            } 
       </script>                     
    </body>
    
</html>
