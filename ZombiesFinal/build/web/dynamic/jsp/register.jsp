<!DOCTYPE html>

        <%@include file= "header.jsp" %>  

       <div class="container">
            <h1 class="blog-title">Zombies Produtora Blog</h1>
            <h3 class="lead blog-description">Insira suas informações abaixo para cadastro: </h3>
        </div>        
        
         
        <div class="container">	
            <div>
                    <div style="padding-top: 2%" class="col-md-12">
                    <form method="POST" action="onRegister">
                        <div class="form-group">
                            <label>Nome:</label>
                            <input type="text" class="form-control" id="insertName" placeholder="Digite seu nome, por favor">
                        </div>
                        
                        <div class="form-group">
                            <label >Apelido:</label>
                            <input type="text" class="form-control" id="insertApelido"  placeholder="Digite o seu apelido, por favor">
                        </div>
                        
                        <div class="form-group">
                            <label>E-mail:</label>
                            <input type="email" class="form-control" id="insertEmail"  placeholder="Digite o seu email, por favor">
                        </div>
                        
                        <div class="form-group">
                            <label>Password</label>
                            <input type="password" class="form-control" name="password" id="password" placeholder="Digite sua senha, por favor">
                        </div>
                        
                        <div align="center" class="form-group">
                            <button type="submit" class="submitButton">Cadastrar</button>
                        </div>                    
                    </form>
                </div>	
            </div>
        </div>     

      <footer>	<!-- Footer do blog !-->
      </footer>

    </body>
</html>
