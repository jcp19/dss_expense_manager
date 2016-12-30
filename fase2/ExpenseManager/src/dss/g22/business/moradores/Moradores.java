package dss.g22.business.moradores;

import dss.g22.business.despesas.Despesa;
import dss.g22.business.despesas.Fatura;
import dss.g22.business.despesas.Transferencia;
import dss.g22.business.moradores.CampoInvalidoException;
import dss.g22.business.moradores.EmailEmUsoException;
import dss.g22.business.moradores.Morador;
import dss.g22.data.ContaCorrenteDAO;
import dss.g22.data.MoradorDAO;
import dss.g22.data.NotificacaoDAO;

public class Moradores {

    private NotificacaoDAO notificacoes;
    private MoradorDAO moradores;
    private Morador moradorAutenticado;
    ContaCorrenteDAO contasCorrentes;

    /**
     *
     * @param email
     * @param password
     */
    public void login(String email, String password) throws CampoInvalidoException {
        moradorAutenticado = moradores.get(email, password);
        if (moradorAutenticado == null) {
            throw new CampoInvalidoException("Uma das credenciais e invalida");
        }
    }

    public double getSaldoMoradorAutenticado() {
        // TODO - implement Moradores.getSaldoMoradorAutenticado
        return 0;
    }

    public int getIdMoradorAutenticado() {
        // TODO - implement Moradores.getIdMoradorAutenticado
        throw new UnsupportedOperationException();
    }

    /**
     *
     * @param mail
     */
    public void alteraMailMoradorAutenticado(String mail) throws EmailEmUsoException {
        int id = moradorAutenticado.getIdMorador();
        try {
            moradores.alterarEmail(id, mail);
            moradorAutenticado.setEmail(mail);
        } catch (EmailEmUsoException e) {
            throw new EmailEmUsoException();
        }
    }

    /**
     *
     * @param passwordAtual
     * @param passwordNova
     */
    public void alteraPasswordMoradorAutenticado(String passwordAtual, String passwordNova) throws CampoInvalidoException {
        if (passwordAtual.equals(moradorAutenticado.getPassword())) {
            int idMorador = moradorAutenticado.getIdMorador();
            moradores.alterarPassword(idMorador, passwordNova);
        } else {
            throw new CampoInvalidoException("A password fornecida e invalida");
        }
    }

    /**
     *
     * @param passwordAtual
     */
    public void eliminaContaMoradorAutenticado(String passwordAtual) throws CampoInvalidoException {
        if (moradorAutenticado.getPassword().equals(passwordAtual)) {
            int id = moradorAutenticado.getIdMorador();
            Morador m = moradores.remove(id);
            moradorAutenticado = null;
            notificacoes.registaNotificacao("O morador " + m.getNome() + " saiu sistema.");
        } else {
            throw new CampoInvalidoException("A password introduzida e invalida");
        }

    }

    /**
     *
     * @param despesa
     */
    public void repoeSaldosDespesaRemovida(Despesa despesa) {
        // TODO - implement Moradores.repoeSaldosDespesaRemovida
        throw new UnsupportedOperationException();
    }

    /**
     *
     * @param despesa
     */
    public void notificaRemocaoDespesa(Despesa despesa) {
        // TODO - implement Moradores.notificaRemocaoDespesa
        throw new UnsupportedOperationException();
    }

    public void terminarSessao() {
        moradorAutenticado = null;
    }

    /**
     *
     * @param d
     */
    public void notificaEdicaoDespesa(Despesa d) {
        // TODO - implement Moradores.notificaEdicaoDespesa
        throw new UnsupportedOperationException();
    }

    /**
     *
     * @param m
     */
    public void notificaEliminacaoContaMorador(Morador m) {
        // TODO - implement Moradores.notificaEliminacaoContaMorador
        throw new UnsupportedOperationException();
    }

    /**
     *
     * @param d
     */
    public void notificaRegistoDespesa(Despesa d) {
        // TODO - implement Moradores.notificaRegistoDespesa
        throw new UnsupportedOperationException();
    }

    /**
     *
     * @param t
     */
    public void notificaRegistoTransferencia(Transferencia t) {
        // TODO - implement Moradores.notificaRegistoTransferencia
        throw new UnsupportedOperationException();
    }

    /**
     *
     * @param fatura
     */
    public void atualizaSaldosRegistoFatura(Fatura fatura) {
        // TODO - implement Moradores.atualizaSaldosRegistoFatura
        throw new UnsupportedOperationException();
    }

    /**
     *
     * @param f
     */
    public void notificaRegistoFatura(Fatura f) {
        // TODO - implement Moradores.notificaRegistoFatura
        throw new UnsupportedOperationException();
    }

    /**
     *
     * @param nome
     * @param email
     * @param password
     */
    public void registaMorador(String nome, String email, String password) throws EmailEmUsoException {
        Morador novo = new Morador(nome, email, password);
        Morador m = moradores.put(0, novo);
        if (m == null) {
            throw new EmailEmUsoException();
        }
        notificacoes.registaNotificacao("O morador " + nome + " inscreveu-se no sistema.");
    }

    /**
     *
     * @param fatura
     */
    public void notificaRemocaoFatura(Fatura fatura) {
        // TODO - implement Moradores.notificaRemocaoFatura
        throw new UnsupportedOperationException();
    }

    /**
     *
     * @param fatura
     */
    public void atualizaSaldosRemocaoFatura(Fatura fatura) {
        // TODO - implement Moradores.atualizaSaldosRemocaoFatura
        throw new UnsupportedOperationException();
    }

    /**
     *
     * @param t
     */
    public void atualizaSaldosRemocaoTransferencia(Transferencia t) {
        // TODO - implement Moradores.atualizaSaldosRemocaoTransferencia
        throw new UnsupportedOperationException();
    }

    /**
     *
     * @param t
     */
    public void notificaRemocaoTransferencia(Transferencia t) {
        // TODO - implement Moradores.notificaRemocaoTransferencia
        throw new UnsupportedOperationException();
    }

    public Moradores() {
        moradores = new MoradorDAO();
        notificacoes = new NotificacaoDAO();
        moradorAutenticado = null;
    }

    public String[] mensagensNotificacoes() {
        String[] mensagens = notificacoes.getMensagensNotificacao().stream().toArray(String[]::new);
        return mensagens;
    }

    public String getNomeMoradorAutenticado() {
        return moradorAutenticado.getNome();
    }

    public String getMailMoradorAutenticado() {
        return moradorAutenticado.getEmail();
    }

    public void notificaRegistoMorador(String nome) {
        notificacoes.registaNotificacao("O morador " + nome + " registou-se no apartamento.");
    }

}
