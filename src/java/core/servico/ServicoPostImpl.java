
package core.servico;

import api.dao.PostDAO;
import api.modelo.Comentario;
import api.modelo.Post;
import api.servico.ServicoPost;
import core.dao.postBD;
import java.util.ArrayList;
import java.util.List;

public class ServicoPostImpl implements ServicoPost {

    @Override
    public Post inserir(Post post) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Post procurarTitulo(String titulo) {
        postBD pDao = new postBD();
        Post p = pDao.procurarPost(titulo);

        return p;
    }    

}
