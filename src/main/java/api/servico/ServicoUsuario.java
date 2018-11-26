/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package api.servico;

import api.modelo.Post;
import api.modelo.Usuario;
import java.util.List;


public interface ServicoUsuario {
    public void inserir(Usuario usuario);
    public Usuario procurarEmail(String emailUsuario);
    public List<Usuario> procurarTudo();
    public void apagar(Long id);
}
