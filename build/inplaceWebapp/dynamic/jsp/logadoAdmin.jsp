<%@page import="java.util.List"%>
<%@page import="api.modelo.Post"%>
<%@page import="api.modelo.Comentario"%>
<%@page import="api.modelo.Usuario"%>

        <% Usuario u = (Usuario)session.getAttribute("usuario"); %>
        <% List<Post> posts = (List<Post>)request.getAttribute("listPosts"); %>
        <% List<Usuario> usuarios = (List<Usuario>)request.getAttribute("listUsuarios"); %>
        <%@include file= "header.jsp" %>  

        <% if(session.getAttribute("usuario")==null)  { %>
        <div> Fa�a Login para continuar ! </div>
                                
        <% } else if(u.getnivelAcesso().equals("1")) {
                                 %> 
        <div align="center" class="conteudo">
            <div  style="padding-top: 02px; padding-bottom: 25px;">
                <h2> Seja bem-vindo ! </h2>
                <p>Voc� est� logado como: <%= u.getNome() %></p>
                <div> Deseja adicionar um novo t�pico?</div>
                <a href="addPost"><button onclick="" class="submitButton">Adicionar t�pico</button></a> 
            </div>
            <hr>
            
             <!-- Foi definido um CSS usando media queries para tornar a table responsiva !-->
            <!-- Gerenciar t�picos -->
            <div class="col-md-12">
                <h3> Gerenciar t�picos: </h3>
                <table class="table table-condensed">
                    <tr>
                        <td class="active">Autor</td>
                        <td class="active">T�tulo</td>
                        <td class="col-md-6 active">Conte�do</td>
                        <td class="active">Data</td>
                        <td class="active">A��o</td>
                    </tr>
                <!-- Loop de t�picos existentes no blog  -->
                   <% for(Post p: posts) { %>
              
                    <tr class="active">
                        <td ><%= p.getAutor() %></td>
                        <td><%= p.getTitulo() %></td>
                        <td ><%= p.getConteudo()%></td>
                        <td><%= p.getData()%></td>
                        <td>
                            <form method="POST" action="excluirPost.action">
                                <input type="hidden" name="idPostDel" value="<%= p.getId() %>">
                            <button type="submit" class="deleteButton">Excluir </button>
                            </form>
                            <a href="Post?idPost=<%= p.getId() %>"><button onclick="" class="submitButton">Ver t�pico </button></a>
                        </td>
                    </tr>
                            <% } %>  
                <!-- Fim do loop  -->
                </table>
              
            </div>
            
                  
            <!-- Gerenciar Usu�rios -->
            <hr>
            <div class="col-md-12">
                <h3> Gerenciar usu�rios: </h3>
                <table class="table table-condensed">
                 <% for(Usuario x: usuarios) { %>                    
                    <tr>
                        <td class="active">Nome</td>
                        <td class="active">Fun��o</td>
                        <td class="active">Apelido</td>
                        <td class="active col-md-2">A��o</td>

                    </tr>
                <!-- Loop de t�picos existentes no blog  -->
                    <tr class="active">
                        <td ><%= x.getNome() %></td>
                        <td class="active"><% if(x.getnivelAcesso().equals("1")) {%>
                            Administrador <% } else {%>
                            Usu�rio <% } %></td>
                        <td><%= x.getApelido() %></td>


                        <td>
                            <button onclick="" class="deleteButton">Excluir </button>
                            <button onclick="" class="submitButton">Alterar usu�rio </button>
                        </td>
                    </tr>
                    <% } %>  
                <!-- Fim do loop  -->
                </table>
            </div>
            
            </div>  
        <% } else { %>
            <div> Apenas administradores podem ver essa p�gina </div>
            
         <% } %>
    </body>
</html>