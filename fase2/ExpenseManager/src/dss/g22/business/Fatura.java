package dss.g22.business;

import java.util.Map;

public class Fatura {

	private Map<Integer, Double> comoFoiDividido;
	private Map<Integer, Double> comoDeviaSerDividido;
	private double valorTotal;

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

}