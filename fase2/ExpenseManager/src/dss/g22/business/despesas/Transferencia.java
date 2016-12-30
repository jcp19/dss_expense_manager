package dss.g22.business.despesas;

public class Transferencia {

    private int idQuemTransferiu;
    private int idQuemRecebeu;
    private double quantia;
    private String descricao;
    private int idTransferencia;

    public Transferencia(int idTransferencia, double quantia, String descricao, int idQuemTransferiu, int idQuemRecebeu) {
        this.idTransferencia = idTransferencia;
        this.quantia = quantia;
        this.descricao = descricao;
        this.idQuemTransferiu = idQuemTransferiu;
        this.idQuemRecebeu = idQuemRecebeu;
    }

    public int getIdQuemTransferiu() {
    	return this.idQuemTransferiu;
    }
    
    public int getIdQuemRecebeu() {
	return this.idQuemRecebeu;
    }
    
    public int getIdTransferencia() {
        return this.idTransferencia;
    }
    
    public double getQuantia() {
        return this.quantia;
    }

    public String getDescricao() {
        return this.descricao;
    }
    
    /**
     * 
     * @param idTransferencia
     */
    public void setIdTransferencia(int idTransferencia) {
	this.idTransferencia = idTransferencia;
    }
    /**
     * 
     * @param idQuemTransferiu
     */
    public void setIdQuemTransferiu(int idQuemTransferiu) {
    	this.idQuemTransferiu = idQuemTransferiu;
    }

    /**
     * 
     * @param idQuemRecebeu
     */
    public void setIdQuemRecebeu(int idQuemRecebeu) {
	this.idQuemRecebeu = idQuemRecebeu;
    }
}