package dss.g22.business.despesas;

import dss.g22.data.DespesaDAO;
import dss.g22.data.FaturaDAO;
import dss.g22.data.TransferenciaDAO;
import java.time.LocalDate;

public class Despesas {

	private FaturaDAO faturas;
	private TransferenciaDAO transferencias;
	private DespesaDAO despesas;

	/**
	 * 
	 * @param idMorador
	 */
	public Fatura[] getFaturasMorador(int idMorador) {
		// TODO - implement Despesas.getFaturasMorador
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param idMorador
	 */
	public Transferencia[] getTransferenciasMorador(int idMorador) {
		// TODO - implement Despesas.getTransferenciasMorador
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param idFatura
	 */
	public Fatura getFatura(int idFatura) {
		// TODO - implement Despesas.getFatura
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param idDespesa
	 */
	public Despesa getDespesa(int idDespesa) {
		// TODO - implement Despesas.getDespesa
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param idDespesa
	 * @param novaDesignacao
	 * @param novaDescricao
	 */
	public void editaDespesa(int idDespesa, String novaDesignacao, String novaDescricao) {
		// TODO - implement Despesas.editaDespesa
		throw new UnsupportedOperationException();
	}

	public Despesa[] getDespesas() {
		// TODO - implement Despesas.getDespesas
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param designacao
	 * @param descricao
	 * @param fatura
	 */
	public void registaDespesaPontual(String designacao, String descricao, Fatura fatura) {
		// TODO - implement Despesas.registaDespesaPontual
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param designacao
	 * @param descricao
	 * @param dataPrimeiraPeriodicidade
	 * @param metodoDivisaoOmissao
	 */
	public void registaDespesaRecorrente(String designacao, String descricao, LocalDate dataPrimeiraPeriodicidade, MetodoDivisao metodoDivisaoOmissao) {
		// TODO - implement Despesas.registaDespesaRecorrente
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param idDespesa
	 */
	public void removeDespesa(int idDespesa) {
		// TODO - implement Despesas.removeDespesa
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param idDespesa
	 */
	public void encerraDespesaRecorrente(int idDespesa) {
		// TODO - implement Despesas.encerraDespesaRecorrente
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param idDespesa
	 * @param fatura
	 */
	public void registaFatura(int idDespesa, Fatura fatura) {
		// TODO - implement Despesas.registaFatura
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param idFatura
	 */
	public void removeFatura(int idFatura) {
		// TODO - implement Despesas.removeFatura
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param idTransferencia
	 */
	public void removeTransferencia(int idTransferencia) {
		// TODO - implement Despesas.removeTransferencia
		throw new UnsupportedOperationException();
	}

	public Despesas() {
		faturas = new FaturaDAO();
		transferencias = new TransferenciaDAO();
		despesas = new DespesaDAO();
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
		// TODO - implement Despesas.registaTransferencia
		throw new UnsupportedOperationException();
	}

}