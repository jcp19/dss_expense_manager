package dss.g22.business.moradores;

import dss.g22.business.despesas.Fatura;
import dss.g22.business.despesas.Transferencia;
import java.util.List;
import javax.swing.ImageIcon;

public class Morador {

    private String nome;
    private String email;
    private String password;
    private ImageIcon avatar;
    private double saldo;
    private int idMorador;
    private boolean foiEliminado;
    
    public Morador(String nome, String email, String password) {
        this.nome = nome;
        this.email = email;
        this.password = password;
    }

    public Morador(int idMorador, String nome, String email, String password) {
        this.idMorador = idMorador;
        this.nome = nome;
        this.email = email;
        this.password = password;
    }

    public Morador(int aInt, String string, int aInt0, String string0, boolean aBoolean) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

	/**
	 * 
	 * @param avatar
	 */
	public void setAvatar(ImageIcon avatar) {
		this.avatar = avatar;
	}

	/**
	 * 
	 * @param nome
	 */
	private void setNome(String nome) {
            this.nome = nome;
	}

	public String getPassword() {
            return this.password;
	}

	/**
	 * 
	 * @param idMorador
	 */
	public List<Fatura> getFaturas(int idMorador) {
		// TODO - implement Morador.getFaturas
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param saldo
	 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	/**
	 * 
	 * @param password
	 */
	public void setPassword(String password) {
            this.password = password;
	}

	public String getEmail() {
		return this.email;
	}

	/**
	 * 
	 * @param idMorador
	 */
	public List<Transferencia> getTransferencias(int idMorador) {
		// TODO - implement Morador.getTransferencias
		throw new UnsupportedOperationException();
	}

	public String getNome() {
            return this.nome;
	}

	public double getSaldo() {
		return this.saldo;
	}

	public ImageIcon getAvatar() {
		return this.avatar;
	}

	/**
	 * 
	 * @param email
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	public int getIdMorador() {
		return this.idMorador;
	}

	/**
	 * 
	 * @param idMorador
	 */
	public void setIdMorador(int idMorador) {
		this.idMorador = idMorador;
	}

	public boolean getFoiEliminado() {
		return this.foiEliminado;
	}

	/**
	 * 
	 * @param foiEliminado
	 */
	public void setFoiEliminado(boolean foiEliminado) {
		this.foiEliminado = foiEliminado;
	}

}