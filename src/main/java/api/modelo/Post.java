/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package api.modelo;

import java.util.List;
import javafx.scene.chart.PieChart.Data;

/**
 *
 * @author vinicius.lelis
 */
public class Post {
    private Long id;
    private String titulo;
    private String conteudo;
    private String data_criacao;
    private String autor;
    private List<Comentario> comentarios;
    
    public Post(Long id, String titulo, String conteudo, String data_criacao, String autor) {
        this.setId(id);
        this.setTitulo(titulo);
        this.setConteudo(conteudo);
        this.setData(data_criacao);
        this.setAutor(autor);
   
    }
    public Post(String titulo, String conteudo, String data, String autor) {
        this.titulo = titulo;
        this.conteudo = conteudo;
        this.autor = autor;
        this.data_criacao = data;
    }

    public Post() {
   
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setData(String data_criacao) {
       this.data_criacao = data_criacao;
    }

    public void setConteudo(String conteudo) {
       this.conteudo = conteudo;   
    }
  
    public void setAutor(String autor) {
       this.autor = autor;
    }
    
    public void setId(Long id) {
        this.id= id;
    }
    public void addComentario(Comentario comentario) {
        comentarios.add(comentario);
    }
    public String getTitulo() {
        return titulo;
    }
    public String getAutor() {
        return autor;
    }
    public String getConteudo(){
        return conteudo;
    }
    public String getData(){
        return data_criacao;
        
    }
    public Long getId(){
        return id;
    }
    public String getIdS(){
        return Long.toString(id);
    }    
    public List getComentarios () {
        return comentarios;
    }
    
}
