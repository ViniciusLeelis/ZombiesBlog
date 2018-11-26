
package core.servico;

import api.dao.UsuarioDAO;
import api.modelo.Comentario;
import api.modelo.Post;

import api.modelo.Usuario;
import api.servico.ServicoUsuario;
import core.dao.UsuarioBD;
import core.dao.postBD;
import java.util.ArrayList;
import java.util.List;

public class ServicoUsuarioImpl implements ServicoUsuario {

    @Override
    public void inserir(Usuario usuario) {
        UsuarioBD uDao = new UsuarioBD();
        uDao.inserir(usuario);
        
    }

    @Override
    public Usuario procurarEmail(String emailUsuario) {
        UsuarioBD uDao = new UsuarioBD();
        Usuario u = uDao.procurarEmail(emailUsuario);

        return u;
    }    

    @Override
    public List<Usuario> procurarTudo() {
        UsuarioBD uDao = new UsuarioBD();
        List<Usuario> listaUsuarios = uDao.procurarTudo();
    
        return listaUsuarios;    
    }

}
