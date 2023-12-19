/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

/**
 *
 * @author Bruno Pz
 */
import java.util.ArrayList;
import java.util.HashMap;
import Conexao.Conexao;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import Principal.PrincipalTelaInterna;
import java.util.HashMap;
import java.util.Map;

public class DAO {
    
    private Connection conn;
    //private Map<Integer, List<Joguim>> categoriaParaId;
    
    public DAO() {
        
        this.conn = Conexao.getConnection();
        
    }
    
    public boolean inserirJogo(String jogo, double nota, String produtora, 
            String classificacao, int categoria_id) {
        
        Connection conn = null;
        PreparedStatement stmt = null;
        
        try {    
            
            conn = Conexao.getConnection();
            String insertSQL = "INSERT INTO jogos(jogo, nota, produtora, "
                    + "classificacao, categoria_id)"
                + " VALUES (?, ?, ?, ?, ?)";
            
            PreparedStatement preparedStatement = conn.prepareStatement
        (insertSQL);
            preparedStatement.setString(1, jogo);
            preparedStatement.setDouble(2, nota);
            preparedStatement.setString(3, produtora);
            preparedStatement.setString(4, classificacao);
            preparedStatement.setInt(5, categoria_id);

            int rowsAffected = preparedStatement.executeUpdate();
            if (rowsAffected > 0) {
                conn.commit();
                return true;
            } else {
                return false;
            }
        } catch (SQLException ex) {
        
        try {
            throw new SQLException("Erro ao inserir no Banco de "
                    + "Dados!", ex);
        } catch (SQLException ex1) {
            Logger.getLogger(DAO.class.getName()).log(Level.SEVERE,
                    null, ex1);
        }
        
    } finally {
        if (stmt != null) {
            try {
                stmt.close();
            } catch (SQLException e) { /* ignorado */ }
        }
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) { /* ignorado */ }
        }
    }     
        return false;
    }

    
    public void inserirCategoria(Cat v) {
        
        Connection conn = null;
        PreparedStatement stmt = null;

        try {

        conn = Conexao.getConnection();
        String sql = "INSERT INTO categoria_elenca1(id, categoria) VALUES(?, ?)";
        stmt = conn.prepareStatement(sql);
        stmt.setInt(1, v.getId());
        stmt.setString(2, v.getCategoria());
        
        stmt.execute();

        } catch (SQLException ex) {

            try {
                throw new SQLException("Erro ao inserir no Banco de "
                        + "Dados!", ex);
            } catch (SQLException ex1) {
                Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, ex1);
            }

        } finally {
            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException e) { /* ignorado */ }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) { /* ignorado */ }
            }
        }
    }
    
    public void deletarJogo(int id) {
        
        String sql = "DELETE FROM jogos WHERE id = ?";

        try (Connection conn = Conexao.getConnection()) {
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, id);

            stmt.execute();
        } catch (SQLException ex) {
            throw new RuntimeException("Erro ao deletar do Banco de "
                    + "Dados!", ex);
        }
    }
    
    public void deletarCategoria(Cat v) {
        String sql = "DELETE FROM categoria_elenca1 WHERE id = ?";

        Connection conn = null;
        PreparedStatement stmt = null;

        try {
            conn = Conexao.getConnection();
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, v.getId());

            stmt.execute();
        } catch (SQLException ex) {
            throw new RuntimeException("Erro ao deletar do Banco de Dados!", ex);
        } finally {
            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException e) { /* ignorado */ }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) { /* ignorado */ }
            }
        }
    }

    
    public List<Jogos> getJogos() {
        
    List<Jogos> jogos = new ArrayList<>();
    String sql = "SELECT * FROM jogos";
    
    try (Connection conn = Conexao.getConnection();
         PreparedStatement stmt = conn.prepareStatement(sql);
         ResultSet rs = stmt.executeQuery()) {

        
        while (rs.next()) {
            
            Jogos eqp = new Jogos();
            
            eqp.setId(rs.getInt("id"));
            eqp.setJogo(rs.getString("jogo"));
            eqp.setNota(rs.getDouble("nota"));
            eqp.setProdutora(rs.getString("produtora"));
            eqp.setClassificacao(rs.getString("classificacao"));
            eqp.setCategoria_id(rs.getInt("categoria_id"));
            
            jogos.add(eqp);
        }
        
        } catch (SQLException ex) {
            throw new RuntimeException("Erro ao recuperar os jogos do "
                    + "Banco de Dados!", ex);
        }
        
        return jogos;
    }
    
    public Iterable<Jogos> readForJogo(String jogo) {
                Connection con = Conexao.getConnection();
                PreparedStatement stmt = null;
                ResultSet rs = null;
                List<Jogos> jogos = new ArrayList<>();

                try {
                    
                    stmt = con.prepareStatement("SELECT * FROM jogos WHERE "
                            + "jogo LIKE ?");
                    stmt.setString(1, "%"+jogo+"%");
                    rs = stmt.executeQuery();

                    while (rs.next()) {
                        
                        Jogos eqp = new Jogos();
                        eqp.setId(rs.getInt("ID"));
                        eqp.setJogo(rs.getString("jogo"));
                        eqp.setNota(rs.getDouble("nota"));
                        eqp.setProdutora(rs.getString("produtora"));
                        eqp.setClassificacao(rs.getString
                        ("classificacao"));
                        eqp.setCategoria_id(rs.getInt("categoria_id"));
                        
                        jogos.add(eqp);
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(DAO.class.getName()).log
        (Level.SEVERE, null, ex);
                } finally {
                    Conexao.closeConnection(con, stmt, rs);
                }
                return jogos;
    }
    
    public void buscarCategorias(int categoriaIdInput) {
        Connection con = Conexao.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            stmt = con.prepareStatement("SELECT * FROM jogos WHERE categoria_id = ?");
            stmt.setInt(1, categoriaIdInput); 
            rs = stmt.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id");
                String jogo = rs.getString("jogo");
                double nota = rs.getFloat("nota");
                String produtora = rs.getString("produtora");
                String classificacao = rs.getString("classificacao");
                int categoriaId = rs.getInt("categoria_id");
                Joguim jogoObj = new Joguim(id, jogo, nota, produtora, classificacao, categoriaId);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            Conexao.closeConnection(con, stmt, rs);
        }
    }

    
    public Iterable<Categoria> readForCategoria(int categoria_id) {
        Connection con = Conexao.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Categoria> cat = new ArrayList<>();
        
        try {
            stmt = con.prepareStatement("SELECT * FROM jogos WHERE categoria_id = ?");
            stmt.setInt(1, categoria_id);
            rs = stmt.executeQuery();

            while (rs.next()) {
                Categoria eqp = new Categoria();
                eqp.setId(rs.getInt("ID"));
                eqp.setJogo(rs.getString("jogo"));
                eqp.setNota(rs.getDouble("nota"));
                eqp.setProdutora(rs.getString("produtora"));
                eqp.setClassificacao(rs.getString("classificacao"));
                eqp.setCategoria_id(rs.getInt("categoria_id")); 
                
                cat.add(eqp);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAO.class.getName()).log
    (Level.SEVERE, null, ex);
        } finally {
            Conexao.closeConnection(con, stmt, rs);
        }
        return cat;
    }

    
    public void updateJogos(Jogos v) {
            
            Connection con = Conexao.getConnection();
            PreparedStatement stmt = null;

                    try {
                        stmt = con.prepareStatement("UPDATE jogos SET "
                                + "jogo = ?,"
                                + "nota = ?, produtora = ?, "
                                + "classificacao = ?, categoria_id = ?" 
                                + " WHERE id = ?");
                        stmt.setString(1, v.getJogo());
                        stmt.setDouble(2, v.getNota());
                        stmt.setString(3, v.getProdutora());
                        stmt.setString(4, v.getClassificacao());
                        stmt.setInt(5, v.getCategoria_id());
                        stmt.setInt(6, v.getId());

                        stmt.executeUpdate();

                        JOptionPane.showMessageDialog(null, 
                                "Atualizado com sucesso!");
                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null, 
                                "Erro ao atualizar: " + ex);
                    } finally {
                        Conexao.closeConnection(con, stmt);
                    }    
    }
    
    public void updateCategoria(Cat v) {
            
            Connection con = Conexao.getConnection();
            PreparedStatement stmt = null;

                    try {
                        String sql = ("UPDATE categoria_elenca1 SET "
                                + "categoria = ?" 
                                + " WHERE id = ?");
                        stmt = conn.prepareStatement(sql);
                        stmt.setString(1, v.getCategoria());
                        stmt.setInt(2, v.getId());

                        stmt.executeUpdate();

                        JOptionPane.showMessageDialog(null, 
                                "Atualizado com sucesso!");
                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null, 
                                "Erro ao atualizar: " + ex);
                    } finally {
                        Conexao.closeConnection(con, stmt);
                    }    
    }
    
    public void close() {
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
