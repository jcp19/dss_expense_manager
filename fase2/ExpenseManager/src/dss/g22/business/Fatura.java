package dss.g22.business;

import java.util.*;

public class Fatura {

	private MetodoDivisao comoFoiDividido;
	private MetodoDivisao comoDeviaSerDividido;
	private double valorTotal;
	private int idFatura;

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

}