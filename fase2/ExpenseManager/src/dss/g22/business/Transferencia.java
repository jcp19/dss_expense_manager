package dss.g22.business;

public class Transferencia {

	private int idQuemTransferiu;
	private int idQuemRecebeu;
	private double quantia;
	private String descricao;

	public int getIdQuemTransferiu() {
		return this.idQuemTransferiu;
	}

	/**
	 * 
	 * @param idQuemTransferiu
	 */
	public void setIdQuemTransferiu(int idQuemTransferiu) {
		this.idQuemTransferiu = idQuemTransferiu;
	}

	public int getIdQuemRecebeu() {
		return this.idQuemRecebeu;
	}

	/**
	 * 
	 * @param idQuemRecebeu
	 */
	public void setIdQuemRecebeu(int idQuemRecebeu) {
		this.idQuemRecebeu = idQuemRecebeu;
	}

}