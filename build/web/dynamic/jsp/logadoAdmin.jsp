<%@page import="java.util.List"%>
<%@page import="api.modelo.Post"%>
<%@page import="api.modelo.Comentario"%>
<%@page import="api.modelo.Usuario"%>

        <% Usuario u = (Usuario)request.getAttribute("adminLogado"); %>
        <% List<Post> posts = (List<Post>)request.getAttribute("listPosts"); %>

        <%@include file= "header.jsp" %>  

    
        <div align="center" class="conteudo">
            <div  style="padding-top: 02px; padding-bottom: 25px;">
                <h2> Seja bem-vindo ! </h2>
                <p>Você está logado como: <%= u.getNome() %></p>
            </div>
            <hr>
            
            
            <!-- Gerenciar tópicos -->
            <div class="col-md-12">
                <h3> Gerenciar tópicos: </h3>
                <table class="table table-condensed">
                    <tr>
                        <td class="active">Autor</td>
                        <td class="active">Título</td>
                        <td class="active">Conteúdo</td>
                        <td class="active">Data</td>
                        <td class="active">Ação</td>
                    </tr>
                <!-- Loop de tópicos existentes no blog  -->
                   <% for(Post p: posts) { %>
              
                    <tr class="active">
                        <td ><%= p.getAutor() %></td>
                        <td><%= p.getTitulo() %></td>
                        <td ><%= p.getConteudo()%></td>
                        <td><%= p.getData()%></td>
                        <td>
                            <button onclick="" class="deleteButton">Excluir </button>
                            <a href="Post?idPost=<%= p.getId() %>"><button onclick="" class="submitButton">Ver tópico </button></a>s
                        </td>
                    </tr>
                            <% } %>  
                <!-- Fim do loop  -->
                </table>
              
            </div>
            
            
            <!-- Gerenciar comentários -->
            <hr>
            <div class="col-md-12 ">
                <h3> Gerenciar comentários: </h3>
                <table class="table table-condensed">
                    <tr>
                        <td class="active">Autor</td>
                        <td class="active">Conteúdo</td>
                        <td class="active">Post comentado</td>
                        <td class="active">Data </td>
                        <td class="active">Ação</td>
                    </tr>
                <!-- Loop de tópicos existentes no blog  -->
                    <tr class="active">
                        <td >Arlete</td>
                        <td>Achei super legal e intuitivo, aguardo novas explicações </td>
                        <td >A arte de usar Servlets </td>
                        <td> 29/09/2018 </td>
                        <td>
                            <button onclick="" class="deleteButton">Excluir </button>
                            <button onclick="" class="submitButton">Ver comentário </button>
                        </td>
                    </tr>
                    
                <!-- Fim do loop  -->
                </table>
            </div>  
            
            <!-- Gerenciar Usuários -->
            <hr>
            <div align="center" class="col-md-12">
                <h3> Gerenciar usuários: </h3>
                <table class="table table-condensed">
                    <tr>
                        <td class="active">Nome</td>
                        <td class="active">Data de cadastro</td>
                        <td class="active">Apelido</td>
                        <td class="active">Função</td>
                        <td class="active">Ação</td>

                    </tr>
                <!-- Loop de tópicos existentes no blog  -->
                    <tr class="active">
                        <td >Arlete Juca</td>
                        <td class="active">Data de cadastro</td>
                        <td>Juquinha</td>
                        <td >Administrador</td>

                        <td>
                            <button onclick="" class="deleteButton">Excluir </button>
                            <button onclick="" class="submitButton">Alterar usuário </button>
                        </td>
                    </tr>
                    
                <!-- Fim do loop  -->
                </table>
            </div>
            
            </div>  
        </div>
    </body>
</html>
