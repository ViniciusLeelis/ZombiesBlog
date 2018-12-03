<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<!DOCTYPE html>

        <%@include file= "header.jsp" %>  
             <% Usuario usuario = (Usuario)session.getAttribute("usuario");%>
       <div class="container">
            <h1 class="blog-title">Zombies Produtora Blog</h1>
            <h3 class="lead blog-description">Inserir post:</h3>
        </div>        
        
        <!-- Form que mandar� o POST para o novoPost.action!-->
        <div class="container">	
            <div>
                    <div style="padding-top: 2%" class="col-md-12">
                    <form method="POST" action="novoPost.action">
                        <div class="form-group">
                            <label>T�tulo:</label>
                            <input type="hidden" value="&#153;" name="bugIE"> 
                            <input name="titulo" type="text" class="form-control" id="insertTitulo" placeholder="Digite o t�tulo da postagem:" required acceptcharset="UTF-8">
                        </div>
                        
                        
                        <div class="form-group">
                            <label >Conte�do:</label>
                            <input name="autor" type="hidden" value="<%= usuario.getNome() %>">
                            <textarea name="conteudo" id="insertConteudo" class="form-control" placeholder="Digite o conte�do da postagem" rows="4" required acceptcharset="UTF-8"></textarea>
                        </div>

                        <div align="center" class="form-group">
                            <button type="submit" class="submitButton">Inserir post</button>
                        </div>                    
                    </form>
                </div>	
            </div>
        </div>     
        <!-- Form que mandar� o POST para o novoPost.action!-->
        
        <script>
           (function() {
               const titulos = ['Um t�tulo maneiro', 'Um t�tulo incr�vel', 'Um titulo sensacional'];
               const tituloRandom = titulos[Math.floor(Math.random() * (1 - 0 + 1)) + 1];
               document.getElementById('insertTitulo').placeholder = tituloRandom;
               
               
           })();
        </script>

    </body>
</html>
