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
public class ClubeDAO {
    public void cadastrarClube(ClubeBean clubes) {
        try{
            Connection conn = Conexao.conectar();
            PreparedStatement stmt = null;
            
            stmt = conn.prepareStatement("insert into clube (nome, fundacao) VALUES (?,?)");
            stmt.setString(1, clubes.getNomeClube());
            stmt.setDate(2, clubes.getFundacao());
                    
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
        
        public List<ClubeBean> ler () {
            List<ClubeBean> clubes = new ArrayList();
            try {
            Connection conn = Conexao.conectar();
            PreparedStatement stmt = null;
            ResultSet rs = null;
            
            stmt = conn.prepareStatement("SELECT * FROM clube");
            
            rs = stmt.executeQuery();
            while(rs.next()) {
                ClubeBean clube = new ClubeBean();
                clube.setNomeClube(rs.getString("nome clube"));
                clube.setFundacao(rs.getDate("fundação"));
                
                clubes.add(clube);
            }
            
        } catch(SQLException e) {
            e.printStackTrace();
        }
        return clubes;
        }
}
