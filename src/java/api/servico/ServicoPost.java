
package api.servico;

import api.modelo.Post;


public interface ServicoPost {
    public Post inserir(Post post);
    public Post procurarTitulo(String titulo);
    
}
