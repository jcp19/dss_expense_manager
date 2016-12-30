package dss.g22.business.despesas;

public class Transferencia {

	private int idQuemTransferiu;
	private int idQuemRecebeu;
	private double quantia;
	private String descricao;
	private int idTransferencia;

	public int getIdQuemTransferiu() {
		return this.idQuemTransferiu;
	}

	public int getIdQuemRecebeu() {
		return this.idQuemRecebeu;
	}

	public int getIdTransferencia() {
		return this.idTransferencia;
	}

	/**
	 * 
	 * @param idQuemTransferiu
	 * @param idQuemRecebeu
	 * @param quantia
	 * @param descricao
	 * @param idTransferencia
	 */
	public Transferencia(int idQuemTransferiu, int idQuemRecebeu, double quantia, String descricao, int idTransferencia) {
        this.quantia = quantia;
        this.descricao = descricao;
        this.idQuemTransferiu = idQuemTransferiu;
        this.idQuemRecebeu = idQuemRecebeu;
	}

	/**
	 * 
	 * @param idTransferencia
	 * @param idQuemTransferiu
	 * @param idQuemRecebeu
	 * @param quantia
	 * @param descricao
	 * @param parameter
	 */
	public Transferencia(int idTransferencia, int idQuemTransferiu, int idQuemRecebeu, double quantia, String descricao, int parameter) {
        this.idTransferencia = idTransferencia;
        this.quantia = quantia;
        this.descricao = descricao;
        this.idQuemTransferiu = idQuemTransferiu;
        this.idQuemRecebeu = idQuemRecebeu;
	}

    public void setIdTransferencia(int novoId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getDescricao() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public double getQuantia() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}