package dss.g22.data;

import com.mysql.jdbc.exceptions.MySQLIntegrityConstraintViolationException;
import dss.g22.business.moradores.EmailEmUsoException;
import dss.g22.business.moradores.Morador;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MoradorDAO implements Map<Integer, Morador> {
    private Connection conn;
    
    @Override
    public int size() {
        int i = 0;
        
        try {
            conn = Connect.connect();
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery("SELECT count(*) FROM Morador");
            if(rs.next()) {
                i = rs.getInt(1);
            }
        } catch (ClassNotFoundException | SQLException e) {
            throw new NullPointerException(e.getMessage());
        } finally {
            Connect.close(conn);
        }
        return i;
    }

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public boolean containsKey(Object key) {
        boolean r = false;
        
        try {
            conn = Connect.connect();
            Statement stm = conn.createStatement();
            String sql = "SELECT nome FROM Morador WHERE idMorador = '" + (String) key + "'";
            ResultSet rs = stm.executeQuery(sql);
            r = rs.next();
        } catch (ClassNotFoundException | SQLException e) {
            throw new NullPointerException(e.getMessage());
        } finally {
            Connect.close(conn);
        }
        return r;
    }

    @Override
    public boolean containsValue(Object value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Morador get(Object key) {
        Morador m = null;
        
        try {
            conn = Connect.connect();
            PreparedStatement stm = conn.prepareStatement("SELECT * FROM Morador WHERE idMorador=?");
            stm.setInt(1, (Integer) key);
            ResultSet rs = stm.executeQuery();
            if (rs.next()) {
                /* Blob avatarBlob = rs.getBlob("avatar");
                ImageIcon avatarIcon = new ImageIcon(avatarBlob.getBytes(1, (int) avatarBlob.length())); */
                
                m = new Morador(
                    rs.getInt("idMorador"), rs.getString("nome"),rs.getString("email"), rs.getString("password")
                );
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
            Connect.close(conn);
        }
        return m;
    }

    public Morador get(String email, String password) {
        Morador m = null;
        
        try {
            conn = Connect.connect();
            PreparedStatement stm = conn.prepareStatement("SELECT * FROM Morador WHERE email = ? AND password = ? AND foiEliminado = 0");
            stm.setString(1, email);
            stm.setString(2, password);
            ResultSet rs = stm.executeQuery();
            if (rs.next()) {
                /* Blob avatarBlob = rs.getBlob("avatar");
                ImageIcon avatarIcon = new ImageIcon(avatarBlob.getBytes(1, (int) avatarBlob.length())); */
                
                m = new Morador(
                    rs.getInt("idMorador"), rs.getString("nome"),rs.getString("email"), rs.getString("password")
                );
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
            Connect.close(conn);
        }
        return m;
    }

    @Override
    public Morador put(Integer key, Morador value) {
        Morador m = null;
        try {
            conn = Connect.connect();
            PreparedStatement stm = conn.prepareStatement("INSERT INTO Morador\n" +
                    "(nome, email, password)\n" +
                    "VALUES (?, ?, ?)",
                    Statement.RETURN_GENERATED_KEYS);
            
            stm.setString(1, value.getNome());
            stm.setString(2, value.getEmail());
            stm.setString(3, value.getPassword());
            stm.executeUpdate();
            
            ResultSet rs = stm.getGeneratedKeys();
            if(rs.next()) {
                int novoId = rs.getInt(1);
                value.setIdMorador(novoId);
            }
            
            m = value;
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
            Connect.close(conn);
        }
        return m;
    }

    @Override
    public Morador remove(Object key) {
        Morador m = get(key);
        
        try {
            conn = Connect.connect();
            PreparedStatement stm = conn.prepareStatement("UPDATE Morador SET foiEliminado = 1 WHERE idMorador = ?");
            stm.setInt(1, (Integer) key);
            stm.executeUpdate();
        } catch (ClassNotFoundException | SQLException e) {
            throw new NullPointerException(e.getMessage());
        } finally {
            Connect.close(conn);
        }
        return m;
    }

    @Override
    public void putAll(Map<? extends Integer, ? extends Morador> m) {
        m.forEach((k,v) -> put(k,v));
    }

    @Override
    public void clear() {
        try {
            conn = Connect.connect();
            Statement stm = conn.createStatement();
            stm.executeUpdate("DELETE FROM Morador");
        } catch (ClassNotFoundException | SQLException e) {
            // runtime exeption
            throw new NullPointerException(e.getMessage()); 
        } finally {
            Connect.close(conn);
        }
    }

    @Override
    public Set<Integer> keySet() {
        throw new UnsupportedOperationException("Não implementado.");
    }

    @Override
    public Collection<Morador> values() {
        Collection<Morador> col = new HashSet<Morador>();
        
        try {
            conn = Connect.connect();
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery("SELECT * FROM Morador");
            while (rs.next()) {
                col.add(new Morador(
                        rs.getInt("idMorador"), rs.getString("nome"), rs.getInt("email"),
                        rs.getString("password"), rs.getBoolean("foiEliminado"))
                );
            }  
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
            Connect.close(conn);
        }
        return col;
    }
    
    public void alterarEmail(int idMorador, String novo) throws EmailEmUsoException {
        try {
            conn = Connect.connect();
            PreparedStatement stm = conn.prepareStatement("UPDATE Morador SET email=? WHERE idMorador=?");
            stm.setString(1, novo);
            stm.setInt(2, (Integer) idMorador);
            stm.executeUpdate();
        } catch(SQLException e){
            throw new EmailEmUsoException();
        }/* catch(MySQLIntegrityConstraintViolationException e) {
            throw new EmailEmUsoException();
        }*/ catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            Connect.close(conn);
        }
    }

    @Override
    public Set<Entry<Integer, Morador>> entrySet() {
        throw new UnsupportedOperationException("Não implementado.");
    }

    public void alterarPassword(int idMorador, String passwordNova) {
        try {
            conn = Connect.connect();
            PreparedStatement stm = conn.prepareStatement("UPDATE Morador SET password=? WHERE idMorador=?");
            stm.setString(1, passwordNova);
            stm.setInt(2, (Integer) idMorador);
            stm.executeUpdate();
        } catch(SQLException e){
            
        }/* catch(MySQLIntegrityConstraintViolationException e) {
            throw new EmailEmUsoException();
        }*/ catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            Connect.close(conn);
        }
    }
}
