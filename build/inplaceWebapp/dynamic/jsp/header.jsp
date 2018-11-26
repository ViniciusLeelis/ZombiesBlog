<%@page import="api.modelo.Usuario"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="static/css/style.css" >     <!-- arquivo .css que uso para inserir meus códigos .css !-->
        <link rel="stylesheet" href="static/css/bootstrap.css">
        <script src="static/js/jquery.js" ></script>
        <script src="static/js/other.js" ></script>  <!-- arquivo .js que uso para inserir meus códigos JS !-->
        <script src="static/js/bootstrap.js" ></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/crypto-js/3.1.2/rollups/aes.js"></script>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Zombies BLOG</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">


    </head>
    
    <body>
   <!-- Header do blog     !-->     
        <header>  
          <div class="container_header">
              <div class="header">
                  <a href="/zombiesfinal/" class="logo"><img width="50%" src="static/img/logo.png"></img></a>
                  <p class="white"></p>

                       </p>
                  <div class="header-right">
                      <a class="active" href="/zombiesfinal/">Pagina inicial</a>
                      <%  if(session.getAttribute("usuario")==null) { %>
                      <a href="Login">Login</a>
                      <% } else { %>
                      <a href="Login">Página de administração</a>
                      <a href="Logout"> Deslogar </a>
                      <% } %>
                      <a href="" > </a>
                  </div>
             </div> 
        </header>
      

        <!-- Final do header !-->
       

