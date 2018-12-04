<%@page import="java.util.List"%>
<%@page import="api.modelo.Post"%>
<%@page import="api.modelo.Comentario"%>
<%@page import="api.modelo.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

        <% Usuario u = (Usuario)session.getAttribute("usuario"); %>
        <% List<Post> posts = (List<Post>)request.getAttribute("listPosts"); %>
        <% List<Usuario> usuarios = (List<Usuario>)request.getAttribute("listUsuarios"); %>
        <%@include file= "header.jsp" %>  

        <% if(session.getAttribute("usuario")==null)  { %>
        <div> Faça Login para continuar ! </div>
                                
        <% } else if(u.getnivelAcesso().equals("1")) {
                                 %> 
        <div align="center" class="conteudo">
            <div  style="padding-top: 02px; padding-bottom: 25px;">
                <img width="10%" src="static/img/zombi.gif">
                <h2> Seja bem-vindo ! </h2>
                <p>Você está logado como: <%= u.getNome() %></p>
                <div> Deseja adicionar um novo tópico?</div>
                <a href="addPost"><button onclick="" class="submitButton">Adicionar tópico</button></a> 
            </div>
            <hr>
            
             <!-- Foi definido um CSS usando media queries para tornar a table responsiva !-->
            <!-- Gerenciar tópicos -->
            <div class="col-md-12">
                <h3> Gerenciar tópicos: </h3>
                <table class="table table-condensed">
                    <tr>
                        <td class="active">Autor</td>
                        <td class="active">Título</td>
                        <td class="col-md-6 active">Conteúdo</td>
                        <td class="active">Data</td>
                        <td class="active">Ação</td>
                    </tr>
                <!-- Loop de tópicos existentes no blog  -->
                   <% for(Post p: posts) { %>
              
                    <tr class="active">
                        <td ><%= p.getAutor() %></td>
                        <td>
                            <% 
                            if (p.getTitulo().length() > 30) { %>
                            <p><%= p.getTitulo().substring(0, 30) + "... [+]" %> </p>
                            <% } else { %>
                            <p><%= p.getTitulo() %></p>
                            <% } %>
                        </td>
                        <td>
                            <% 
                            if (p.getConteudo().length() > 200) { %>
                            <p><%= p.getConteudo().substring(0, 200) + "... [+]" %> </p>
                            <% } else { %>
                            <p><%= p.getConteudo() %></p>
                            <% } %>
                        </td>
                        <td><%= p.getData()%></td>
                        <td>
                            <form method="POST" action="excluirPost.action">
                                <input type="hidden" name="idPostDel" value="<%= p.getId() %>">
                            <button type="submit" class="deleteButton">Excluir </button>
                            </form>
                            
                            
                            <form method="POST" action="alterarPost.action">
                                <input type="hidden" name="idPost" value="<%= p.getId() %>">
                            <button type="submit" class="submitButton">Alterar</button>
                            </form>                            
                            <a href="Post?idPost=<%= p.getId() %>"><button onclick="" class="submitButton">Ver tópico </button></a>
                        </td>
                    </tr>
                            <% } %>  
                <!-- Fim do loop  -->
                </table>
              
            </div>
            
                  
            <!-- Gerenciar Usuários -->
            <hr>
            <div class="col-md-12">
                <h3> Gerenciar usuários: </h3>
                <table class="table table-condensed">
                 <% for(Usuario x: usuarios) { %>
                    <% if(x.getnivelAcesso().equals("0")) { %>
                    <tr>
                        <td class="active">Nome</td>
                        <td class="active">Função</td>
                        <td class="active">Apelido</td>
                        <td class="active col-md-2">Ação</td>
                
                    </tr>
                <!-- Loop de tópicos existentes no blog  -->
                    <tr class="active">
                        <td ><%= x.getNome() %></td>
                        <td class="active"><% if(x.getnivelAcesso().equals("1")) {%>
                            Administrador <% } else {%>
                            Usuário <% } %></td>
                        <td><%= x.getApelido() %></td>
                        <td>
                            <form method="POST" action="excluirUsuario.action">
                                <input type="hidden" name="idUsuario" value="<%= x.getId() %>">   
                                <input type="hidden" name="autorUsuario" value="<%= x.getApelido() %>">   
                                <input type="hidden" value="&#153;" name="bugIE">
                            <button type="submit" class="deleteButton">Excluir </button>
                            </form>                            
                        </td>
                    </tr>
                    <% }
                            } %>  
                <!-- Fim do loop  -->
                </table>
            </div>
            
            </div>  
        <% } else { %>
            <div> Apenas administradores podem ver essa página </div>
            
         <% } %>
    </body>
</html>
