
package api.dao;

import api.modelo.Usuario;
import java.util.List;

public interface UsuarioDAO {
    public Usuario procurarApelido(String apelido);
    public Usuario procurarNome(String name);    
    public Usuario inserir(Usuario usuario);
    public Usuario procurarID(Long id);
    public List<Usuario> procurarTudo();
    public Usuario atualizar(Usuario usuarioAnt, Usuario usuarioAt);
    public boolean apagar(Usuario usuario);
    public boolean apagar(Long id);   
}
