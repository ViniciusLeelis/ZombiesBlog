
package api.servico;

import api.modelo.Post;
import java.util.List;


public interface ServicoPost {
    public void inserir(Post post);
    public void excluir(Long id);
    public Post procurarID(Long id);
    public List<Post> listarTudo();
    public void alterar(Post post);    
}
