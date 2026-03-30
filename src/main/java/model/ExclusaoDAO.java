/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Aluno
 */
public class ExclusaoDAO {
    public void deletarJogador(int id) {
        // delete
        try {
            Connection conn = Conexao.conectar();
            PreparedStatement stmt = null;
           
            stmt = conn.prepareStatement(
               "DELETE FROM jogadores WHERE id = ?");
           
            stmt.setInt(1, id);
           
            stmt.executeUpdate();
            stmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
        public void deletarClube(int id) {
        // delete
        try {
            Connection conn = Conexao.conectar();
            PreparedStatement stmt = null;
           
            stmt = conn.prepareStatement(
               "DELETE FROM clube WHERE id = ?");
           
            stmt.setInt(1, id);
           
            stmt.executeUpdate();
            stmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
