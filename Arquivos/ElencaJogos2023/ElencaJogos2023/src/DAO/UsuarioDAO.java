/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

/**
 *
 * @author Bruno Pz
 */
import Conexao.Conexao;
import Login.TelaLogin;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class UsuarioDAO {
    
    public boolean verLogin(String email, String senha) {
         
        Connection con = Conexao.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        boolean check = false;

        try {
                stmt = con.prepareStatement("SELECT * FROM cadastro WHERE "
                        + "email = ? and senha = ?");
                stmt.setString(1, email);
                stmt.setString(2, senha);

                rs = stmt.executeQuery();
                if (rs.next()) {           
                        check = true;
                }

            } catch (SQLException ex) {
                Logger.getLogger(
                        UsuarioDAO.class.getName()).log
                (Level.SEVERE, null, ex);
            } finally {
                Conexao.closeConnection(con, stmt, rs);
            }
            return check;
    }
     
     public void inserir(String nome, String data_nasc, String email, String senha) {
        Connection con = Conexao.getConnection();
        PreparedStatement stmt = null;
        String sql = "INSERT INTO cadastro (nome, data_nasc, email, senha) VALUES(?, ?, ?, ?)";

        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, nome);
            stmt.setString(2, data_nasc);
            stmt.setString(3, email);
            stmt.setString(4, senha);

            stmt.execute();
            JOptionPane.showMessageDialog(null, "Dados inseridos com sucesso!");
        } catch (SQLException ex) {
            throw new RuntimeException("Erro ao inserir no Banco de Dados!", ex);
        } finally {
            Conexao.closeConnection(con, stmt);
        }
    }
     
     public List<Usuario> readForId(int id) {
         
        List<Usuario> usuarios = new ArrayList<>();

        Connection con = Conexao.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            stmt = con.prepareStatement("SELECT * FROM cadastro WHERE id = ?");
            stmt.setInt(1, id);
            rs = stmt.executeQuery();

            while (rs.next()) {
                Usuario usuario = new Usuario();

                usuario.setId(rs.getInt("id"));
                usuario.setEmail(rs.getString("email"));
                usuario.setSenha(rs.getString("senha"));

                usuarios.add(usuario);
            }
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            Conexao.closeConnection(con, stmt, rs);
        }

        return usuarios;
    }
     
     public List<Usuario> getUsuarios() {
         
        List<Usuario> usuarios = new ArrayList<>();

        Connection con = Conexao.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            stmt = con.prepareStatement("SELECT * FROM cadastro");
            rs = stmt.executeQuery();

            while (rs.next()) {
                Usuario usuario = new Usuario();

                usuario.setId(rs.getInt("id"));
                usuario.setEmail(rs.getString("email"));
                usuario.setSenha(rs.getString("senha"));

                usuarios.add(usuario);
            }
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            Conexao.closeConnection(con, stmt, rs);
        }

        return usuarios;
    }
}
