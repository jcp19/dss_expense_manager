/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dss.g22.data;

import dss.g22.business.moradores.Notificacao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author joao
 */
public class NotificacaoDAO {
    private Connection conn;
    
    public List<Notificacao> getNotificacoes() {
        List<Notificacao> l = new ArrayList();
        
        try {
            conn = Connect.connect();
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery("SELECT * FROM Notificacao");
            while (rs.next()) {
                l.add(new Notificacao(rs.getInt("idNotificacao"), rs.getString("mensagem")));
            }  
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
            Connect.close(conn);
        }
        return l;
    }
    
    public List<String> getMensagensNotificacao() {
        List<String> l = new ArrayList<>();
        
        try {
            conn = Connect.connect();
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery("SELECT * FROM Notificacao");
            while (rs.next()) {
                l.add(rs.getString("mensagem"));
            }  
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
            Connect.close(conn);
        }
        return l;
    }
    
    public Notificacao registaNotificacao(String mensagem) {
        Notificacao n = null;
        
        try {
            conn = Connect.connect();
            PreparedStatement stm = conn.prepareStatement("INSERT INTO Notificacao\n" +
                    "(mensagem)\n" +
                    "VALUES (?)",
                    Statement.RETURN_GENERATED_KEYS);
            
            stm.setString(1, mensagem);
            stm.executeUpdate();
            ResultSet rs = stm.getGeneratedKeys();
            if(rs.next()) {
                int novoId = rs.getInt(1);
                n = new Notificacao(novoId, mensagem);
            }
        } catch(ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return n;
    }
}
