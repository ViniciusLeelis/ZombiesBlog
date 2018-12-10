
package core.dao;

import api.dao.UsuarioDAO;
import api.modelo.Post;
import api.modelo.Usuario;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UsuarioBD implements UsuarioDAO{

    Connection conexao;
    
    public UsuarioBD(){  /* É criado uma conexão com o banco de dados local */
        try{
            Class.forName("org.mariadb.jdbc.Driver");

            conexao = DriverManager.getConnection("jdbc:mariadb://localhost:3306/zombiesblog","root", ""); 
            
            System.out.println("Banco de dados FUNCIONANDO (TESTE 1)");
        } catch (Exception e){
            System.out.print("Banco de dados ERRO (TESTE 1");
        }
    }
    
    @Override
    public void inserir(Usuario usuario) {
        try{
            PreparedStatement comandoSQLp = conexao.prepareStatement("INSERT INTO zombiesblog.usuario (apelido, senha, nome, email, nivel_acesso) VALUES (?, ?, ?, ?, ?)");  
            comandoSQLp.setString(1, usuario.getApelido());     
            comandoSQLp.setString(2, usuario.getSenha());
            comandoSQLp.setString(3, usuario.getNome());
            comandoSQLp.setString(4, usuario.getEmail());
            comandoSQLp.setString(5, "0");

            comandoSQLp.execute();
     
        }           
        catch (Exception e)
        {
          System.out.print("\nErro de conexão nivel Acessos: " + usuario.getnivelAcesso());
           
          System.out.print("\nErro de conexão apelido: " + usuario.getApelido());
        }
        
    }

    @Override
    public Usuario procurarID (Long id) {  /* Procura um usuário no BD por ID */
        Usuario u = null;
        try{        
            PreparedStatement comandoSQLp = conexao.prepareStatement("select * from zombiesblog.usuario where id = ?");  
            comandoSQLp.setString(1, id.toString());
            ResultSet rs = comandoSQLp.executeQuery();
            rs.next();
            u = new Usuario();
            
            
            u.setId(rs.getLong(1));
            u.setApelido(rs.getString(2));
            u.setSenha(rs.getString(3));
            u.setNome(rs.getString(4));
            u.setEmail(rs.getString(5));
            u.setnivelAcesso(rs.getString(6));
            comandoSQLp.close();
            rs.close();
            return u;
        }           
        catch (Exception e)
        {
          System.out.print("\nErro de conexão ID: " + id);
        }
        return u;
    }

    public Usuario procurarEmail(String emailUsuario){ /* Procura um usuário no BD por nome de usuário*/
        Usuario u = null;
        try{        
            PreparedStatement comandoSQLp = conexao.prepareStatement("select * from usuario where email = ?");  
            comandoSQLp.setString(1, emailUsuario);
            ResultSet rs = comandoSQLp.executeQuery();
            rs.next();
            u = new Usuario();
            u.setId(rs.getLong(1));
            u.setApelido(rs.getString(2));
            u.setSenha(rs.getString(3));
            u.setNome(rs.getString(4));
            u.setEmail(rs.getString(5));  
            u.setnivelAcesso(rs.getString(6));           
            System.out.println("ID" + u.getId());
            comandoSQLp.close();
            rs.close();
            return u;
        }           
        catch (Exception e)
        {
          u = null;
          System.out.print("\nErro na conexão, e-mail: " + emailUsuario);
        }
        return u;
        
    }
    
    @Override
    public Usuario procurarNome(String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Usuario> procurarTudo() {
        Usuario b = null;
        List listaUsuarios = new ArrayList();
        try{        
            PreparedStatement comandoSQLp = conexao.prepareStatement("select * from zombiesblog.usuario");  
      
            ResultSet rs = comandoSQLp.executeQuery();
            while(rs.next()) {
                b = new Usuario();
                b.setId(rs.getLong(1));
                b.setNome(rs.getString(2));
                // setSenha    
                b.setApelido(rs.getString(4));
                b.setEmail(rs.getString(5));
                b.setnivelAcesso(rs.getString(6));
                listaUsuarios.add(b);
            }
            comandoSQLp.close();
            rs.close();

        }           
        catch (Exception e)
        {
          System.out.print("\nErro na conexão, Titulo do post: " );
        }

        return listaUsuarios;
    }
    @Override
    public Usuario atualizar(Usuario usuarioAnt, Usuario usuarioAt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean apagar(Usuario usuario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void apagar(Long id, String autor) {
        try {
            
            PreparedStatement comandoSQLc = conexao.prepareStatement("DELETE FROM zombiesblog.comentarios WHERE autor = ?");            
            PreparedStatement comandoSQLp = conexao.prepareStatement("DELETE FROM zombiesblog.usuario WHERE id = ?");
            comandoSQLc.setString(1, autor);
            comandoSQLp.setString(1, Long.toString(id));      
            comandoSQLc.execute();
            comandoSQLp.execute();           
        } catch (SQLException ex) {
            Logger.getLogger(postBD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public Usuario procurarApelido(String apelido) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
