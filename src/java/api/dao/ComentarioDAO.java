
package api.dao;

import api.modelo.Comentario;

import java.util.List;

public interface ComentarioDAO {
    public List<Comentario> listarComentario(Long idPost);   
    public void inserir(Comentario comentario);
    public boolean apagar(Comentario  comentario);
    public void apagar(Long id);   
}
