package dss.g22.business.despesas;

import java.time.LocalDate;
import java.util.*;

public class Despesa {

	private MetodoDivisao comoPagarOmissao;
	private Collection<Fatura> faturas;
	private Periodicidade periodicidade;
	private String designacao;
	private String descricao;
	private LocalDate dataRegisto;
	private int idDespesa;
	private boolean encerrada;
	private LocalDate dataProxPagamento;

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

	public int getIdDespesa() {
		return this.idDespesa;
	}

	public Periodicidade getPeriodicidade() {
		return this.periodicidade;
	}

	public LocalDate getDataRegisto() {
		return this.dataRegisto;
	}

	/**
	 * 
	 * @param fatura
	 */
	public void associaFatura(Fatura fatura) {
		// TODO - implement Despesa.associaFatura
		throw new UnsupportedOperationException();
	}

	public boolean getEncerrada() {
		return this.encerrada;
	}

	/**
	 * 
	 * @param encerrada
	 */
	public void setEncerrada(boolean encerrada) {
		this.encerrada = encerrada;
	}

	public LocalDate getDataProxPagamento() {
		return this.dataProxPagamento;
	}

	/**
	 * 
	 * @param dataProxPagamento
	 */
	public void setDataProxPagamento(LocalDate dataProxPagamento) {
		this.dataProxPagamento = dataProxPagamento;
	}

	/**
	 * 
	 * @param designacao
	 * @param descricao
	 * @param dataPrimeiraPeriodicidade
	 * @param metodoDivisaoOmissao
	 */
	public Despesa(String designacao, String descricao, LocalDate dataPrimeiraPeriodicidade, MetodoDivisao metodoDivisaoOmissao) {
		// TODO - implement Despesa.Despesa
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param idDespesa
	 * @param designacao
	 * @param descricao
	 * @param dataPrimeiraPeriodicidade
	 * @param metodoDivisaoOmissao
	 */
	public Despesa(int idDespesa, String designacao, String descricao, LocalDate dataPrimeiraPeriodicidade, MetodoDivisao metodoDivisaoOmissao) {
		// TODO - implement Despesa.Despesa
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param designacao
	 * @param descricao
	 * @param fatura
	 */
	public Despesa(String designacao, String descricao, Fatura fatura) {
		// TODO - implement Despesa.Despesa
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param idDespesa
	 * @param designacao
	 * @param descricao
	 * @param fatura
	 */
	public Despesa(int idDespesa, String designacao, String descricao, Fatura fatura) {
		// TODO - implement Despesa.Despesa
		throw new UnsupportedOperationException();
	}

}