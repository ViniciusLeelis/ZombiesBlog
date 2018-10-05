
package api.dao;

import api.modelo.Post;
import java.util.List;

public interface PostDAO {
    public Post procurarPost(String curso);   
    public Post inserir(Post post);
    public List<Post> listarTudo();
    public Post atualizar(Post postAnt, Post postAt);
    public boolean apagar(Post  post);
    public boolean apagar(Long id);   
}
