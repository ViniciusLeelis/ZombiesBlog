<%@page import="api.modelo.Comentario"%>
<%@page import="api.modelo.Usuario"%>

        <% Usuario u = (Usuario)session.getAttribute("usuario"); %>
        <%@include file= "header.jsp" %>  


        <% if(session.getAttribute("usuario")==null)  { %>
        <div> Faça Login para continuar ! </div>
                                
        <% } else if(u.getnivelAcesso().equals("0")) {
        %>    
        <div align="center" class="conteudo">
            <div  style="padding-top: 02px; padding-bottom: 25px;">
                <h2> Seja bem-vindo ! </h2>
                <p>Você está logado como: <%= u.getNome() %></p>
            </div>
            <hr>
                <!-- Foi definido um CSS usando media queries para tornar a table responsiva 
                    Essa table tem como objetivo mostrar os comentários do usuário logado 
                !-->  
            <div class="col-md-12 ">
                <h3> Gerenciar comentários: </h3>
                <table class="table table-condensed">
                    <tr>
                        <td class="active">Seu comentário</td>
                        <td class="active">Post comentado</td>
                        <td class="active">Data </td>
                        <td class="active">Ação</td>
                    </tr>
                <!-- Loop de tópicos existentes no blog  -->
                    <tr class="active">
                        <td>Só tenho algumas dúvidas em questão do CSS, eu não cosigo direcionar para a pasta correta </td>
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
                <% } else { %>
                <div> Apenas usuários podem ver essa páginas </div>
                <% } %>
    </body>
</html>
