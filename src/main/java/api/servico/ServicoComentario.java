
package api.servico;

import api.modelo.Comentario;
import java.util.List;


public interface ServicoComentario {
    public void inserir(Comentario comentario);
    public Comentario procurarID(Long id);
    public boolean apagar(Comentario  comentario);
    public void apagar(Long id);  
    public List<Comentario> listarComentario(Long idPost);
    public List<Comentario> listarComentarioUsuario(String autor);
    
}
