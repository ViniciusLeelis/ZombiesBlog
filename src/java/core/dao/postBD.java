/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core.dao;

import api.dao.PostDAO;
import api.modelo.Post;
import api.modelo.Usuario;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class postBD implements PostDAO{

    Connection conexao;
    
    public postBD(){  /* É criado uma conexão com o banco de dados local */
        try{
            Class.forName("org.mariadb.jdbc.Driver");

            conexao = DriverManager.getConnection("jdbc:mariadb://localhost:3306/zombiesblog","root", ""); 
            
            System.out.println("Banco de dados... OK!");
        } catch (Exception e){
            System.out.print("Banco de dados... FAILED");
        }
    }

    @Override
    public Post procurarPost(Long idPost){ /* Procura um usuário no BD por nome de usuário*/
        Post p = null;
        try{        
            PreparedStatement comandoSQLp = conexao.prepareStatement("select * from zombiesblog.post where id = ?");  
            comandoSQLp.setString(1, Long.toString(idPost));
            ResultSet rs = comandoSQLp.executeQuery();
            rs.next();
            p = new Post();
            p.setId(rs.getLong(1));
            p.setTitulo(rs.getString(2));
            p.setConteudo(rs.getString(3));    
            p.setData(rs.getString(4));
            p.setAutor(rs.getString(5));

            comandoSQLp.close();
            rs.close();
            return p;
           
        }           
        catch (Exception e)
        {
          System.out.print("\nErro na conexão, Titulo do post: " + idPost);
        }
        return p;
         
    }
    
    @Override
    public void apagar(Long id) {
        try {
            PreparedStatement comandoSQLc = conexao.prepareStatement("DELETE FROM zombiesblog.comentarios WHERE idPost = ?");            
            PreparedStatement comandoSQLp = conexao.prepareStatement("DELETE FROM zombiesblog.post WHERE id = ?");
            comandoSQLc.setString(1, Long.toString(id));
            comandoSQLp.setString(1, Long.toString(id));      
            comandoSQLc.execute();
            comandoSQLp.execute();           
        } catch (SQLException ex) {
            Logger.getLogger(postBD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    @Override
    public void inserir(Post post) {
        try{
            PreparedStatement comandoSQLp = conexao.prepareStatement("INSERT INTO zombiesblog.post (titulo, conteudo, data, autor) VALUES (?, ?, ?, ?)");  
            
            comandoSQLp.setString(1, post.getTitulo());     
            comandoSQLp.setString(2, post.getConteudo()); 
         
            comandoSQLp.setString(3,  post.getData());
            comandoSQLp.setString(4, post.getAutor());
            comandoSQLp.execute();
            System.out.println("Testando inserção de post: " + post.getData());
     
        }           
        catch (Exception e)
        {
        }
        
    }

    @Override
    public Post atualizar(Post postAnt, Post postAt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void apagar(Post post) {
        try {  
            PreparedStatement comandoSQLp = conexao.prepareStatement("DELETE FROM zombiesblog.post WHERE id = ?");
            String id = post.getId().toString();
            comandoSQLp.setString(1, id);             
            comandoSQLp.execute();
                        
        } catch (SQLException ex) {
            Logger.getLogger(postBD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public List<Post> listarTudo() {
        Post b = null;
        List listaPosts = new ArrayList();
        try{        
            PreparedStatement comandoSQLp = conexao.prepareStatement("select * from zombiesblog.post");  
      
            ResultSet rs = comandoSQLp.executeQuery();
            while(rs.next()) {
                b = new Post();
                b.setId(rs.getLong(1));
                b.setTitulo(rs.getString(2));
                b.setConteudo(rs.getString(3));    
                b.setData(rs.getString(4));
                b.setAutor(rs.getString(5));
                listaPosts.add(b);
            }
            System.out.print("Autor:" + b.getAutor());
            System.out.println("Conteudo" + b.getConteudo());       
            System.out.println("Id: " + b.getId());
            comandoSQLp.close();
            rs.close();

        }           
        catch (Exception e)
        {
          System.out.print("\nErro na conexão, Titulo do post: " );
        }

        return listaPosts;
    }

    
}
