        <%@include file= "header.jsp" %>  
        
       <div class="container">
            <h1 class="blog-title">Zombies Produtora Blog</h1>
            <p class="lead blog-description">Faça login !</p>
        </div>        
        
         
        <div class="container">	
            <div class="pai">
                    <div style="padding-top: 2%" class="col-md-4 offset-md-3 box_login">
                        <form method="POST" align="center" action="Autenticador.action">
                            <div class="form-group">
                            <label>Seu endereço de e-mail</label>
                            <input name="email" type="email" class="form-control" id="exampleInputEmail1" aria-describedby="email" placeholder="Enter email">
                            </div>
                            <div class="form-group">
                                <label>Senha:</label>
                                <input name="senha" type="password" class="form-control" name="senha" id="password" placeholder="Digite sua senha">
                            </div>
                            <div class="form-group">
                                <button type="submit" class="submitButton">Logar</button>
                            </div>                     
                        </form>
                             <div class="form-group">
                            <p> Ainda não é cadastrado?</p>
                            <a href="Register">
                               <button class="submitButton">Cadastrar</button>
                            </a>
                        </div> 
                    </div>	
            </div>
        </div>     

      <footer>	<!-- Footer do blog !-->
      </footer>

    </body>
</html>
