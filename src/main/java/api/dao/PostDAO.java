
package api.dao;

import api.modelo.Post;
import java.util.List;

public interface PostDAO {
    public Post procurarPost(Long idPost);   
    public void inserir(Post post);
    public List<Post> listarTudo();
    public Post atualizar(Post postAnt, Post postAt);
    public void apagar(Post  post);
    public void apagar(Long id);   
    public void alterar(Post post);
}
