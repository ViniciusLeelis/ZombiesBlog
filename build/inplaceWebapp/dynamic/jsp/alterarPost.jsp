<!DOCTYPE html>
<%@page import="api.modelo.Post"%>
<%@page import="api.modelo.Usuario"%>
<% Usuario usuario = (Usuario)session.getAttribute("usuario");%>
<% Post post = (Post)request.getAttribute("post"); %>
             
        <%@include file= "header.jsp" %>  

       <div class="container">
            <h1 class="blog-title">Zombies Produtora Blog</h1>
            <h3 class="lead blog-description">Alterar post:</h3>
        </div>        
      
        <!-- Form que mandará o POST para o alterarPost.action!-->
        <div class="container">	
            <div> 
                    <div style="padding-top: 2%" class="col-md-12">
                        <form method="POST" action="insertAlteracao.action">
                        <div class="form-group">
                            <label>Título:</label>
                            <input type="hidden" value="&#153;" name="bugIE"> 
                            <textarea name="titulo" type="text" class="form-control" id="insertTitulo" placeholder="<%= post.getTitulo() %>" required acceptcharset="UTF-8"><%= post.getTitulo() %></textarea>
                        </div>
                        
                        
                        <div class="form-group">
                            <label >Conteúdo:</label>
                            <input name="autor" type="hidden" value="">
                            <input name="idPost" type="hidden" value="<%= post.getId() %>">
                            <textarea name="conteudo" id="insertConteudo" class="form-control" placeholder="<%= post.getConteudo() %>" rows="4"><%= post.getConteudo() %></textarea>
                        </div>

                        <div align="center" class="form-group">
                            <button type="submit" class="submitButton">Alterar post</button>
                        </div>                    
                    </form>
                </div>	
            </div>
        </div>        
      <footer>	<!-- Footer do blog !-->
      </footer>

    </body>
</html>
