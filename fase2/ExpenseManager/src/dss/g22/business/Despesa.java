package dss.g22.business;


import java.time.LocalDate;

public abstract class Despesa {

	private Periodicidade periodicidade;
	private String designacao;
	private String descricao;
	private LocalDate dataRegisto;
	private int idDespesa;

	public String getDesignacao() {
		return this.designacao;
	}

	/**
	 * 
	 * @param designacao
	 */
	public void setDesignacao(String designacao) {
		this.designacao = designacao;
	}

	public String getDescricao() {
		return this.descricao;
	}

	/**
	 * 
	 * @param descricao
	 */
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	/**
	 * 
	 * @param dataRegisto
	 */
	public void setDataRegisto(LocalDate dataRegisto) {
		this.dataRegisto = dataRegisto;
	}

	/**
	 * 
	 * @param idDespesa
	 */
	private void setIdDespesa(int idDespesa) {
		this.idDespesa = idDespesa;
	}

	public int getIdDespesa() {
		return this.idDespesa;
	}

	/**
	 * 
	 * @param periodicidade
	 */
	public void setPeriodicidade(Periodicidade periodicidade) {
		this.periodicidade = periodicidade;
	}

	public Periodicidade getPeriodicidade() {
		return this.periodicidade;
	}

	public LocalDate getDataRegisto() {
		return this.dataRegisto;
	}

	/**
	 * 
	 * @param idMoradorOrigem
	 * @param idMoradorDestino
	 * @param montante
	 * @param descricao
	 * @param data
	 */
	public void registaTransferencia(int idMoradorOrigem, int idMoradorDestino, double montante, String descricao, LocalDate data) {
		// TODO - implement Despesa.registaTransferencia
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param fatura
	 */
	public void associaFatura(Fatura fatura) {
		// TODO - implement Despesa.associaFatura
		throw new UnsupportedOperationException();
	}

}