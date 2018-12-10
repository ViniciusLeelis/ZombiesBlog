        <%@include file= "header.jsp" %>  
        <%@page contentType="text/html" pageEncoding="UTF-8"%>
        
       <!-- É pego a sessão salva setado com o atributo "usuario"   !-->
       <% Usuario usuario = (Usuario)session.getAttribute("usuario");%>   
       <% String error = (String)request.getAttribute("erroLogin"); %>
       <div class="container">
            <h1 class="blog-title">Zombies Produtora Blog</h1>
                   <% if(error.equals("erro")){
           %>
           <p style="color: #d64550; font-size: 16px;" class="lead blog-description">Usuário ou senha inválidos :( </p>
           <% } else {%>
           <p class="lead blog-description">Faça login !</p>
           <% } %>
            
        </div>        
       
        <% if(session.getAttribute("usuario")==null)  { %>  
       <!-- Autenticação do usuário através do metodo POST  !-->
        <div class="container">	
            <div class="pai">
                    <div style="padding-top: 2%" class="col-md-4 offset-md-3 box_login">
                        <form method="POST" align="center" action="Autenticador.action"> 
                            <div class="form-group">
                            <label>Seu endereço de e-mail</label>
                            <input name="email" type="email" class="form-control" id="exampleInputEmail1" aria-describedby="email" placeholder="Enter email" required>
                            </div>
                            <div class="form-group">
                                <label>Senha:</label>
                                <input name="senha" type="password" class="form-control" name="senha" id="password" placeholder="Digite sua senha" required>
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
        <% } else if(usuario.getnivelAcesso().equals("1")) { 
            response.sendRedirect(request.getContextPath() + "/LogadoAdmin");
            %>       
        <% } else { 
            response.sendRedirect(request.getContextPath() + "/Logado");

            }%>
        

        

       <!-- Fim do div de autenticação !-->               
  
       
       <!-- Script para verificar se foi digitado um e-mail e uma senha validas  !-->
        <script>
            $("#form").submit(function() {
                if($("senha").val()== null || $("#senha").val() ==""){
                    alert('Digite uma senha válida');      
                    return false;
                }
            });  
            $("#form").submit(function() {
                if($("#name").val()== null || $("#name").val() ==""){
                    alert('Digite um e-mail válido');      
                    return false;
                }
            });            
        </script>
      <footer>	<!-- Footer do blog !-->
      </footer>

    </body>
</html>
