/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UsuarioDAO {
    public void cadastrar(UsuarioBean usuario) {
        try{
            Connection conn = Conexao.conectar();
            PreparedStatement stmt = null;
            
            stmt = conn.prepareStatement("insert into usuarios (nome, usuario, senha, admin) VALUES (?,?,?,?)");
            stmt.setString(1, usuario.getNome());
            stmt.setString(2, usuario.getUsuario());
            stmt.setString(3, usuario.getSenha());
            stmt.setBoolean(4, false);
                    
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public UsuarioBean logar(String usuario, String senha) {
        UsuarioBean userLogado = new UsuarioBean();
        try{
            Connection conn = Conexao.conectar();
            PreparedStatement stmt = null;
            ResultSet rs = null;
            
            stmt = conn.prepareStatement("Select * from usuarios where usuarios. usuario = ? and usuarios.senha = ?");
            stmt.setString(1, usuario);
            stmt.setString(2, senha);
            
            rs = stmt.executeQuery();
            if(rs.next()){
                userLogado.setId(rs.getInt("id"));
                userLogado.setNome(rs.getString("nome"));
                userLogado.setUsuario(rs.getString("usuario"));
                userLogado.setSenha(rs.getString("senha"));
                userLogado.setAdmin(rs.getBoolean("admin"));
            }
            
        } catch(SQLException e) {
            e.printStackTrace();
        }
        return userLogado;
    }
    
}
