/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package api.modelo;

import javafx.scene.chart.PieChart.Data;

/**
 *
 * @author vinicius.lelis
 */
public class Comentario{
    
    private Long id;
    private String autor;
    private String comentario;
    private String data;
        private Long idPost;
    
   
    
    public Comentario(Long id, String autor, String comentario, String data, Long idPost) {        
        this.setId(id);
        this.setAutor(autor);
        this.setComentario(comentario);
        this.setData(data);
        this.setIdPost(idPost);
        
    }
    
    public Comentario(String autor, String comentario, String data, Long idPost) {
        this.autor = autor;
        this.comentario = comentario;
        this.data = data;
        this.idPost = idPost;
    }
    
    public Comentario() { }    
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public Long getId() {
        return id;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
    
    public String getComentario() {
        return comentario;
    }

    public void setData(String data) {
        this.data = data;
    }
    
    public String getData() {
        return data;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    public String getAutor() {
        return autor;
    }

    public long getIdPost() {
        return idPost; //To change body of generated methods, choose Tools | Templates.
    }
    public void setIdPost(long idPost) {
        this.idPost = idPost;
    }
    
}
