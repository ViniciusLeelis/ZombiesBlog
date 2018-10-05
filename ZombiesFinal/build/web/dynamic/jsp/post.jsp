<!DOCTYPE html>

        <%@include file= "header.jsp" %>  
        <div class="container">
            <div class="row">
                
                
                <!-- -------------------------------- Início da Postagem -------------------------------- !--> 
                <div class="col-lg-8">
                    <h1>Postagem um</h1>
                    <h4> por <a href="#">Autor nome</a> </h4>
                    <p>Postado em: 25 de Setembro de 2018</p>
                    <hr>
                    <p>Coisas do post Coisas do post Coisas do post Coisas do post Coisas do post Coisas do post Coisas do post Coisas do post Coisas do post Coisas do post </p>
                    <hr>
                    <div class="card my-4">
                        <h5 class="card-header">Leave a Comment:</h5>
                        <div class="card-body">
                            <form method="POST" align="center" action="Comentar.action">
                            <div class="form-group">
                                <textarea class="form-control" rows="3"></textarea>
                            </div>
                                
                            <div class="form-group">
                                <button type="submit" class="submitButton">Comentar</button>
                            </div>                     
                            </form>
                            <form>

                            </form>
                        </div>
                    </div>
                </div>
                <!-- -------------------------------- Fim da postagem -------------------------------- !--> 
              
                <div class="col-sm-3 offset-sm-1 blog-sidebar">
                    <div class="sidebar-module sidebar-module-inset">
                        <h4>Sobre a Zombies</h4>
                        <p>A Zombies Blog foi criado com o intuito de transmitir conhecimento sobre
                        esse mundo mágico da produção audiovisual. Dicas, helps e tutoriais para você !</p>
                    </div>
                    <div class="sidebar-module">
                        <h4>Arquivos do blog</h4>
                        <ol class="list-unstyled">
                            <li><a href="#">March 2014</a></li>
                        </ol>
                    </div>

                    </div><!-- /.blog-sidebar -->
                
            </div>
      <!-- /.row -->

        </div>
    <!-- /.container -->

    <!-- Footer -->
    <footer class="py-5 bg-dark">
      <div class="container">
        <p class="m-0 text-center text-white">Copyright &copy; Your Website 2018</p>
      </div>
      <!-- /.container -->
    </footer>

    <!-- Bootstrap core JavaScript -->
    <script src="vendor/jquery/jquery.min.js"></script>
    <script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

  </body>

</html>
