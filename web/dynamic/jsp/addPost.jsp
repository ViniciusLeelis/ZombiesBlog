<!DOCTYPE html>

        <%@include file= "header.jsp" %>  

       <div class="container">
            <h1 class="blog-title">Zombies Produtora Blog</h1>
            <h3 class="lead blog-description">Inserir post:</h3>
        </div>        
        
         
        <div class="container">	
            <div>
                    <div style="padding-top: 2%" class="col-md-12">
                    <form method="POST" action="onRegister">
                        <div class="form-group">
                            <label>T�tulo:</label>
                            <input type="text" class="form-control" id="insertName" placeholder="Digite o t�tulo da postagem:">
                        </div>
                        
                        
                        <div class="form-group">
                            <label >Conte�do:</label>
                            <input type="text" class="form-control" id="insertApelido"  placeholder="Digite o conte�do da postagem">
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