package dss.g22.data;

import com.mysql.jdbc.exceptions.MySQLIntegrityConstraintViolationException;
import dss.g22.business.despesas.Transferencia;
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

public class TransferenciaDAO implements Map<Integer, Transferencia> {
    private Connection conn;
    
    @Override
    public int size() {
        int i = 0;
        
        try {
            conn = Connect.connect();
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery("SELECT count(*) FROM Transferencia");
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
            String sql = "SELECT idTransferencia FROM Transferencia WHERE idTransferencia = '" + (String) key + "'";
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
    public Transferencia get(Object key) {
        Transferencia t = null;
        
        try {
            conn = Connect.connect();
            PreparedStatement stm = conn.prepareStatement("SELECT * FROM Transferencia WHERE idTransferencia = ?");
            stm.setInt(1, (Integer) key);
            ResultSet rs = stm.executeQuery();
            if (rs.next()) {
                t = new Transferencia(
                    rs.getInt("idTransferencia"), rs.getDouble("quantia"),rs.getString("descricao"),
                    rs.getInt("idQuemTransferiu"), rs.getInt("idQuemRecebeu")
                );
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
            Connect.close(conn);
        }
        return t;
    }

    @Override
    public Transferencia put(Integer key, Transferencia value) {
        Transferencia t = null;
        
        try {
            conn = Connect.connect();
            PreparedStatement stm = conn.prepareStatement("INSERT INTO Transferencia\n" +
                    "(quantia, descricao, idQuemTransferiu, idQuemRecebeu)\n" +
                    "VALUES (?, ?, ?, ?)",
                    Statement.RETURN_GENERATED_KEYS);
            
            stm.setDouble(1, value.getQuantia());
            stm.setString(2, value.getDescricao());
            stm.setInt(3, value.getIdQuemTransferiu());
            stm.setInt(4, value.getIdQuemRecebeu());
            stm.executeUpdate();
            
            ResultSet rs = stm.getGeneratedKeys();
            if(rs.next()) {
                int novoId = rs.getInt(1);
                value.setIdTransferencia(novoId);
            }
            t = value;
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
            Connect.close(conn);
        }
        return t;
    }

    @Override
    public Transferencia remove(Object key) {
        Transferencia t = get(key);
        
        try {
            conn = Connect.connect();
            PreparedStatement stm = conn.prepareStatement("DELETE FROM Transferencia WHERE idTransferencia = ?");
            stm.setInt(1, (Integer) key);
            stm.executeUpdate();
        } catch (ClassNotFoundException | SQLException e) {
            throw new NullPointerException(e.getMessage());
        } finally {
            Connect.close(conn);
        }
        return t;
    }

    @Override
    public void putAll(Map<? extends Integer, ? extends Transferencia> m) {
        m.forEach((k,v) -> put(k,v));
    }

    @Override
    public void clear() {
        try {
            conn = Connect.connect();
            Statement stm = conn.createStatement();
            stm.executeUpdate("DELETE FROM Transferencia");
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
    public Collection<Transferencia> values() {
        Collection<Transferencia> col = new HashSet<Transferencia>();
        
        try {
            conn = Connect.connect();
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery("SELECT * FROM Transferencia");
            while (rs.next()) {
                col.add(new Transferencia(
                        rs.getInt("idTransferencia"), rs.getInt("quantia"), rs.getString("descricao"),
                        rs.getInt("idQuemTransferiu"), rs.getInt("idQuemRecebeu"))
                );
            }  
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
            Connect.close(conn);
        }
        return col;
    }

    @Override
    public Set<Entry<Integer, Transferencia>> entrySet() {
        throw new UnsupportedOperationException("Não implementado.");
    }
}
