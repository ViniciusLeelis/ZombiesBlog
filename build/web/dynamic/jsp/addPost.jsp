<!DOCTYPE html>

        <%@include file= "header.jsp" %>  

       <div class="container">
            <h1 class="blog-title">Zombies Produtora Blog</h1>
            <h3 class="lead blog-description">Inserir post:</h3>
        </div>        
        
         
        <div class="container">	
            <div>
                    <div style="padding-top: 2%" class="col-md-12">
                    <form method="POST" action="registrarPost.action">
                        <div class="form-group">
                            <label>Título:</label>
                            <input name="titulo" type="text" class="form-control" id="insertTitulo" placeholder="Digite o título da postagem:">
                        </div>
                        
                        
                        <div class="form-group">
                            <label >Conteúdo:</label>
                            <input name="conteudo" type="text" class="form-control" id="insertConteudo"  placeholder="Digite o conteúdo da postagem">
                        </div>

                        <div align="center" class="form-group">
                            <button type="submit" class="submitButton">Inserir post</button>
                        </div>                    
                    </form>
                </div>	
            </div>
        </div>     

      <footer>	<!-- Footer do blog !-->
      </footer>

    </body>
</html>
