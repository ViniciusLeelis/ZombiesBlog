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
public class Comentario extends Identificador{
    
    private Long id;
    private String autor;
    private String comentario;
    private Data data;
    
    public Comentario() {
    }
    
    public Comentario(Long id, String autor, String comentario, Data data) {        
        super(id);
        this.setAutor(autor);
        this.setComentario(comentario);
        this.setData(data);
        
    }

    private void setComentario(String comentario) {
        this.comentario = comentario;
    }
    
    private String getComentario() {
        return comentario;
    }

    private void setData(Data data) {
        this.data = data;
    }
    
    private Data getData() {
        return data;
    }

    private void setAutor(String autor) {
        this.autor = autor;
    }
    
    private String getAutor() {
        return autor;
    }
    
}
