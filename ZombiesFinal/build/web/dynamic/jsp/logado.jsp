<%@page import="api.modelo.Comentario"%>
<%@page import="api.modelo.Usuario"%>

        <% Usuario u = (Usuario)request.getAttribute("usuarioLogado"); %>
        <%@include file= "header.jsp" %>  

    
        <div align="center" class="conteudo">
            <div  style="padding-top: 02px; padding-bottom: 25px;">
                <h2> Seja bem-vindo ! </h2>
                <p>Voc� est� logado como: <%= u.getNome() %></p>
            </div>
            <hr>

                <div class="col-md-12 ">
                <h3> Gerenciar coment�rios: </h3>
                <table class="table table-condensed">
                    <tr>
                        <td class="active">Seu coment�rio</td>
                        <td class="active">Post comentado</td>
                        <td class="active">Data </td>
                        <td class="active">A��o</td>
                    </tr>
                <!-- Loop de t�picos existentes no blog  -->
                    <tr class="active">
                        <td>S� tenho algumas d�vidas em quest�o do CSS, eu n�o cosigo direcionar para a pasta correta </td>
                        <td >A arte de usar Servlets </td>
                        <td> 29/09/2018 </td>
                        <td>
                            <button onclick="" class="deleteButton">Excluir </button>
                            <button onclick="" class="submitButton">Ver coment�rio </button>
                        </td>
                    </tr>
                    
                <!-- Fim do loop  -->
                </table>
            </div> 
    </body>
</html>