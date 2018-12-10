<%@page import="api.modelo.Comentario"%>
<%@page import="api.modelo.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

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
                <h3 style="color: red"> Versão pré alpha beta, seu perfil estará disponível na versão alpha beta </h3>
            </div> 
                <% } else { %>
                <div> Apenas usuários podem ver essa páginas </div>
                <% } %>
    </body>
</html>
