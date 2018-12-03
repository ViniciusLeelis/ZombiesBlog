<!DOCTYPE html>

        <%@include file= "header.jsp" %>  
             <% Usuario usuario = (Usuario)session.getAttribute("usuario");%>
       <div class="container">
            <h1 class="blog-title">Zombies Produtora Blog</h1>
            <h3 class="lead blog-description">Inserir post:</h3>
        </div>        
        
        <!-- Form que mandará o POST para o novoPost.action!-->
        <div class="container">	
            <div>
                    <div style="padding-top: 2%" class="col-md-12">
                    <form method="POST" action="novoPost.action">
                        <div class="form-group">
                            <label>Título:</label>
                            <input name="titulo" type="text" class="form-control" id="insertTitulo" placeholder="Digite o título da postagem:" required>
                        </div>
                        
                        
                        <div class="form-group">
                            <label >Conteúdo:</label>
                            <input name="autor" type="hidden" value="<%= usuario.getNome() %>">
                            <textarea name="conteudo" id="insertConteudo" class="form-control" placeholder="Digite o conteúdo da postagem" rows="4" required></textarea>
                        </div>

                        <div align="center" class="form-group">
                            <button type="submit" class="submitButton">Inserir post</button>
                        </div>                    
                    </form>
                </div>	
            </div>
        </div>     
        <!-- Form que mandará o POST para o novoPost.action!-->
        
      <footer>	<!-- Footer do blog !-->
      </footer>

    </body>
</html>
