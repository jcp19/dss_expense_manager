package dss.g22.business;

import data.DespesaDAO;
import data.FaturaDAO;
import data.TransferenciaDAO;
import java.time.LocalDate;
import java.util.List;
import java.util.Map;

public class Despesas {

	private FaturaDAO faturas;
	private DespesaDAO despesas;
	private TransferenciaDAO transferencias;

	/**
	 * 
	 * @param idMorador
	 */
	public List<Fatura> getFaturasMorador(int idMorador) {
		// TODO - implement Despesas.getFaturasMorador
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param idMorador
	 */
	public List<Transferencia> getTransferenciasMorador(int idMorador) {
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
	 * @param novaDesignacao
	 * @param novaDescricao
	 */
	public void editaDespesa(String novaDesignacao, String novaDescricao) {
		// TODO - implement Despesas.editaDespesa
		throw new UnsupportedOperationException();
	}

	public List<Despesa> getDespesas() {
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
	public void registaDespesaRecorrente(String designacao, String descricao, LocalDate dataPrimeiraPeriodicidade, Map<Integer, Double> metodoDivisaoOmissao) {
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

}