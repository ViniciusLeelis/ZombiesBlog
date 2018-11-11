/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core.dao;

import api.dao.ComentarioDAO;
import api.dao.PostDAO;
import api.modelo.Comentario;
import api.modelo.Post;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class comentarioBD implements ComentarioDAO{

    Connection conexao;
    
    public comentarioBD(){  /* É criado uma conexão com o banco de dados local */
        try{
            Class.forName("org.mariadb.jdbc.Driver");

            conexao = DriverManager.getConnection("jdbc:mariadb://localhost:3306/zombiesblog","root", ""); 
            
            System.out.println("Banco de dados... OK!");
        } catch (Exception e){
            System.out.print("Banco de dados... FAILED");
        }
    }

    
    @Override
    public boolean apagar(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Comentario> listarComentario(Long idPost) {
        Comentario c = null;
        List listaComentario = new ArrayList();
        try{        
            PreparedStatement comandoSQLp = conexao.prepareStatement("select * from zombiesblog.comentarios where idPost = ?");  
            comandoSQLp.setString(1, idPost.toString());
            ResultSet rs = comandoSQLp.executeQuery();
            while(rs.next()) {
                c = new Comentario();
                c.setId(rs.getLong(1));
                c.setAutor(rs.getString(2));
                c.setComentario(rs.getString(3));    
                c.setData(rs.getString(4));
                c.setIdPost(rs.getLong(5));
                listaComentario.add(c);
            }
            System.out.print("bataaataa:" + c.getAutor());
            System.out.println("batatata" + c.getComentario());       
            System.out.println("batatat: " + c.getId());
            comandoSQLp.close();
            rs.close();

        }           
        catch (Exception e)
        {
          System.out.print("\nbatataaa " );
        }

        return listaComentario;
    }



    @Override
    public Comentario inserir(Comentario comentario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean apagar(Comentario comentario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
