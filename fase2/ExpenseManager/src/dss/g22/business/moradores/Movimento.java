package dss.g22.business.moradores;

import java.time.LocalDate;

public class Movimento {

    private String descricao;
    private double credito;
    private double debito;
    private LocalDate data;
    private Double saldoAposOperacao;

    public String getDescricao() {
        return this.descricao;
    }

    public double getCredito() {
        return this.credito;
    }

    public double getDebito() {
        return this.debito;
    }

    public LocalDate getData() {
        return this.data;
    }

    public Double getSaldoAposOperacao() {
        return this.saldoAposOperacao;
    }

    /**
     *
     * @param descricao
     * @param credito
     * @param debito
     * @param data
     * @param saldoAposOperacao
     */
    public Movimento(String descricao, double credito, double debito, LocalDate data, Double saldoAposOperacao) {
        // TODO - implement Movimento.Movimento
        throw new UnsupportedOperationException();
    }

}
