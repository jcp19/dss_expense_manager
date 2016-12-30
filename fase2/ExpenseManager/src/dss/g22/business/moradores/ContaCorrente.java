package dss.g22.business.moradores;

import java.time.LocalDate;
import java.util.*;

public class ContaCorrente {

    private Collection<Movimento> movimentos;
    private double saldo;

    public double getSaldo() {
        return this.saldo;
    }

    /**
     *
     * @param saldo
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public ContaCorrente() {
        // TODO - implement ContaCorrente.ContaCorrente
        throw new UnsupportedOperationException();
    }

    /**
     *
     * @param descricao
     * @param credito
     * @param debito
     * @param data
     * @param saldoAposOperacao
     */
    public void registaMovimento(String descricao, double credito, double debito, LocalDate data, Double saldoAposOperacao) {
        // TODO - implement ContaCorrente.registaMovimento
        throw new UnsupportedOperationException();
    }

}
