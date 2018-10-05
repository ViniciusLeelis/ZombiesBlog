
package core.servico;

import api.dao.UsuarioDAO;
import api.modelo.Comentario;

import api.modelo.Usuario;
import api.servico.ServicoUsuario;
import core.dao.UsuarioBD;
import java.util.ArrayList;
import java.util.List;

public class ServicoUsuarioImpl implements ServicoUsuario {

    @Override
    public Usuario inserir(Usuario usuario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Usuario procurarEmail(String emailUsuario) {
        UsuarioBD uDao = new UsuarioBD();
        Usuario u = uDao.procurarEmail(emailUsuario);

        return u;
    }    
}
