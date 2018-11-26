
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
    public void inserir(Comentario comentario) {
        comentarioBD cDao = new comentarioBD();
        cDao.inserir(comentario);
    }




    @Override
    public boolean apagar(Comentario comentario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void apagar(Long id) {
        comentarioBD cDao = new comentarioBD();
        cDao.apagar(id);
    }

    @Override
    public List<Comentario> listarComentario(Long idPost) {
        comentarioBD cDao = new comentarioBD();
        List<Comentario> listaComentario = cDao.listarComentario(idPost);
    
        return listaComentario;
    }

        @Override
        public List<Comentario> listarComentarioUsuario(String autor) {
        comentarioBD cDao = new comentarioBD();
        List<Comentario> listaComentario = cDao.listarComentarioUsuario(autor);
    
        return listaComentario;
    }
    @Override
    public Comentario procurarID(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
