
package api.servico;

import api.modelo.Comentario;
import java.util.List;


public interface ServicoComentario {
    public Comentario inserir(Comentario comentario);
    public Comentario procurarID(Long id);
    public boolean apagar(Comentario  comentario);
    public boolean apagar(Long id);  
    public List<Comentario> listarComentario(Long idPost);
    
}
