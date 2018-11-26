<!DOCTYPE html>

        <%@include file= "header.jsp" %>  

       <div class="container">
            <h1 class="blog-title">Zombies Produtora Blog</h1>
            <h3 class="lead blog-description">Insira suas informações abaixo para cadastro: </h3>
       </div>        
        
    <!-- Inserir um novo usuário pelo metodo POST!-->         
       <div class="container">	
           <div>
                   <div style="padding-top: 2%" class="col-md-12">
                        <form method="POST" action="Registrar.action">
                            <div class="form-group">
                                <label>Nome:</label>
                                <input name="nome" type="text" class="form-control" id="insertName" placeholder="Digite seu nome, por favor">
                            </div>
                        
                            <div class="form-group">
                                <label >Apelido:</label>
                                <input name="apelido" type="text" class="form-control" id="insertApelido"  placeholder="Digite o seu apelido, por favor">
                            </div>
                        
                            <div class="form-group">
                                <label>E-mail:</label>
                                <input name="email" type="email" class="form-control" id="insertEmail"  placeholder="Digite o seu email, por favor">
                            </div>
                        
                            <div class="form-group">
                                <label>Password</label>
                                <input name="senha" type="password" class="form-control" name="password" id="password" placeholder="Digite sua senha, por favor">
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
