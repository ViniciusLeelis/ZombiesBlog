
package core.servico;

import api.dao.PostDAO;
import api.modelo.Comentario;
import api.modelo.Post;
import api.servico.ServicoComentario;
import api.servico.ServicoPost;
import core.dao.comentarioBD;
import core.dao.postBD;
import java.util.ArrayList;
import java.util.List;

public class ServicoComentarioImpl implements ServicoComentario {

    @Override
    public Comentario inserir(Comentario comentario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }




    @Override
    public boolean apagar(Comentario comentario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean apagar(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Comentario> listarComentario(Long idPost) {
        comentarioBD cDao = new comentarioBD();
        List<Comentario> listaComentario = cDao.listarComentario(idPost);
    
        return listaComentario;
    }

    @Override
    public Comentario procurarID(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
