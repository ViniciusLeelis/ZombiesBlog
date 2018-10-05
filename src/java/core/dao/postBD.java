/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core.dao;

import api.dao.PostDAO;
import api.modelo.Post;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

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
    public Post procurarPost(String tituloPost){ /* Procura um usuário no BD por nome de usuário*/
        Post p = null;
        try{        
            PreparedStatement comandoSQLp = conexao.prepareStatement("select * from zombiesblog.post where titulo = ?");  
            comandoSQLp.setString(1, tituloPost);
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
          System.out.print("\nErro na conexão, Titulo do post: " + tituloPost);
        }
        return p;
    }
    
    @Override
    public boolean apagar(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Post inserir(Post post) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Post atualizar(Post postAnt, Post postAt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean apagar(Post post) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Post> listarTudo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
