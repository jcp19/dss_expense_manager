package dss.g22.business;

import java.util.List;
import javax.swing.ImageIcon;

public class Morador {

	private int nome;
	private int email;
	private int password;
	private ImageIcon avatar;
	private double saldo;
	private int idMorador;
	private boolean foiEliminado;

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
		// TODO - implement Morador.setNome
		throw new UnsupportedOperationException();
	}

	public String getPassword() {
		// TODO - implement Morador.getPassword
		throw new UnsupportedOperationException();
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
		// TODO - implement Morador.setPassword
		throw new UnsupportedOperationException();
	}

	public String getEmail() {
		// TODO - implement Morador.getEmail
		throw new UnsupportedOperationException();
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
		// TODO - implement Morador.getNome
		throw new UnsupportedOperationException();
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
		// TODO - implement Morador.setEmail
		throw new UnsupportedOperationException();
	}

	public int getIdMorador() {
		return this.idMorador;
	}

	/**
	 * 
	 * @param idMorador
	 */
	private void setIdMorador(int idMorador) {
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