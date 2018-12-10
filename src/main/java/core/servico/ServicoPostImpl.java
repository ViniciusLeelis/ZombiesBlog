
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
    public void excluir(Long id) {
        postBD pDao = new postBD();
        pDao.apagar(id);
        
    }      
    
    @Override
    public void inserir(Post post) {
        postBD pDao = new postBD();
        pDao.inserir(post);
        
    }  

    @Override
    public Post procurarID(Long id) {
        postBD pDao = new postBD();
        Post p = pDao.procurarPost(id);

        return p;
    }    

    @Override
    public List listarTudo() {
        postBD pDao = new postBD();
        List<Post> listaPost = pDao.listarTudo();
    
        return listaPost;
    }
    @Override
    public void alterar(Post post)  {
        postBD pDao = new postBD();
        pDao.alterar(post);        
    }
}
