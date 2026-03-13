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
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Aluno
 */
public class JogadorDAO {
    public void cadastrarJogador(JogadorBean jogadores) {
        try{
            Connection conn = Conexao.conectar();
            PreparedStatement stmt = null;
            
            stmt = conn.prepareStatement("insert into jogadores (nome, clube) VALUES (?,?)");
            stmt.setString(1, jogadores.getNomeJogador());
            stmt.setString(2, jogadores.getClube());
                    
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
        
        public List<JogadorBean> ler () {
            List<JogadorBean> jogadores = new ArrayList();
            try {
            Connection conn = Conexao.conectar();
            PreparedStatement stmt = null;
            ResultSet rs = null;
            
            stmt = conn.prepareStatement("SELECT * FROM jogadores");
            
            rs = stmt.executeQuery();
            while(rs.next()) {
                JogadorBean jogador = new JogadorBean();
                jogador.setNomeJogador(rs.getString("nome"));
                jogador.setClube(rs.getString("clube"));
                
                jogadores.add(jogador);
            }
            
        } catch(SQLException e) {
            e.printStackTrace();
        }
        return jogadores;
        }
}
