/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package api.servico;

import api.modelo.Usuario;


public interface ServicoUsuario {
    public Usuario inserir(Usuario usuario);
    public Usuario procurarEmail(String emailUsuario);
    
}