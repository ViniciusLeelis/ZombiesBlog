<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

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
                            <input type="hidden" value="&#153;" name="bugIE"> 
                            <input name="titulo" type="text" class="form-control" id="insertTitulo" placeholder="Digite o título da postagem:" required acceptcharset="UTF-8">
                        </div>
                        
                        
                        <div class="form-group">
                            <label >Conteúdo:</label>
                            <input name="autor" type="hidden" value="<%= usuario.getNome() %>">
                            <textarea name="conteudo" id="insertConteudo" class="form-control" placeholder="Digite o conteúdo da postagem" rows="4" required acceptcharset="UTF-8"></textarea>
                        </div>

                        <div align="center" class="form-group">
                            <button type="submit" class="submitButton">Inserir post</button>
                        </div>                    
                    </form>
                </div>	
            </div>
        </div>     
        <!-- Form que mandará o POST para o novoPost.action!-->
        
        <script>
           (function() {
               const titulos = ['Um título maneiro', 'Um título incrível', 'Um titulo sensacional'];
               const tituloRandom = titulos[Math.floor(Math.random() * (1 - 0 + 1)) + 1];
               document.getElementById('insertTitulo').placeholder = tituloRandom;
               
               
           })();
        </script>

    </body>
</html>
