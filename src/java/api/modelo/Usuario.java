/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package api.modelo;

import java.util.List;

/**
 *
 * @author vinicius.lelis
 */
public class Usuario extends Identificador{
    private Long id;
    String nome;
    private String senha;
    private String apelido;
    private String email;
    private String nivelAcesso;
    private List<Comentario> comentarios;
  
  public Usuario(){}   
  public Usuario(Long id, String nome, String senha,
                   String apelido, String email, String nivelAcesso,
                   List<Comentario> comentarios){
        super(id);
        this.setNome(nome);
        this.setSenha(senha);
        this.setApelido(apelido);
        this.setEmail(email);
        this.setnivelAcesso(nivelAcesso);
        this.setComentarios(comentarios); 
            
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeUsuario() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setnivelAcesso(String nivelAcesso) {
        this.nivelAcesso = nivelAcesso;
    }   
    
    public String getnivelAcesso() {
        return nivelAcesso;
    }    
    public List<Comentario> getComentarios() {
        return comentarios;
    }

    public void setComentarios(List<Comentario> comentarios) {
        this.comentarios = comentarios;
    }
}
