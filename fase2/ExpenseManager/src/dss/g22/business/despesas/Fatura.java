package dss.g22.business.despesas;

import java.time.LocalDate;

public class Fatura {

	private MetodoDivisao comoFoiDividido;
	private MetodoDivisao comoDeviaSerDividido;
	private double valorTotal;
	private int idFatura;
	private LocalDate data;

	public void getAttribute() {
		// TODO - implement Fatura.getAttribute
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param attribute
	 */
	public void setAttribute(int attribute) {
		// TODO - implement Fatura.setAttribute
		throw new UnsupportedOperationException();
	}

	public double getValorTotal() {
		return this.valorTotal;
	}

	/**
	 * 
	 * @param valorTotal
	 */
	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public int getIdFatura() {
		return this.idFatura;
	}

	/**
	 * 
	 * @param idFatura
	 */
	public void setIdFatura(int idFatura) {
		this.idFatura = idFatura;
	}

	public LocalDate getData() {
		return this.data;
	}

	/**
	 * 
	 * @param data
	 */
	public void setData(LocalDate data) {
		this.data = data;
	}

	/**
	 * 
	 * @param valorTotal
	 * @param data
	 * @param comoFoiDividido
	 * @param comoDeviaSerDividido
	 */
	public Fatura(double valorTotal, LocalDate data, MetodoDivisao comoFoiDividido, MetodoDivisao comoDeviaSerDividido) {
		// TODO - implement Fatura.Fatura
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param idFatura
	 * @param valorTotal
	 * @param data
	 * @param comoFoiDividido
	 * @param comoDeviaSerDividido
	 */
	public Fatura(int idFatura, double valorTotal, LocalDate data, MetodoDivisao comoFoiDividido, MetodoDivisao comoDeviaSerDividido) {
		// TODO - implement Fatura.Fatura
		throw new UnsupportedOperationException();
	}

}