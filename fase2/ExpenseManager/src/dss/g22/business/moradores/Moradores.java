package dss.g22.business.moradores;

import com.mysql.jdbc.exceptions.MySQLIntegrityConstraintViolationException;
import dss.g22.business.moradores.Morador;
import dss.g22.business.despesas.Despesa;
import dss.g22.business.despesas.Fatura;
import dss.g22.business.despesas.Transferencia;
import dss.g22.business.moradores.CredencialInvalidaException;
import dss.g22.data.MoradorDAO;
import java.util.List;
import javax.swing.ImageIcon;

public class Moradores {

	private MoradorDAO moradores;
        private Morador moradorAutenticado;
        
        public Moradores() {
            moradores = new MoradorDAO();
            moradorAutenticado = null;
        }
	/**
	 * 
	 * @param avatar
	 */
	public void alteraAvatarMoradorAutenticado(ImageIcon avatar) {
		// TODO - implement Moradores.alteraAvatarMoradorAutenticado
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param email
	 * @param password
	 */
	public void login(String email, String password) throws CredencialInvalidaException {
		moradorAutenticado = moradores.get(email,password);
                if(moradorAutenticado == null) {
                    throw new CredencialInvalidaException("Uma das credenciais e invalida");
                }
	}

	public double getSaldoMoradorAutenticado() {
		// TODO - implement Moradores.getSaldoMoradorAutenticado
		throw new UnsupportedOperationException();
	}

	public List<Transferencia> getTransferenciasMoradorAutenticado() {
		// TODO - implement Moradores.getTransferenciasMoradorAutenticado
		throw new UnsupportedOperationException();
	}

	public int getIdMoradorAutenticado() {
		// TODO - implement Moradores.getIdMoradorAutenticado
		throw new UnsupportedOperationException();
	}

	public List<Fatura> getFaturasMoradorAutenticado() {
		// TODO - implement Moradores.getFaturasMoradorAutenticado
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param mail
	 */
	public void alteraMailMoradorAutenticado(String mail) {
		// TODO - implement Moradores.alteraMailMoradorAutenticado
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param password
	 */
	public void alteraPasswordMoradorAutenticado(String password) {
		// TODO - implement Moradores.alteraPasswordMoradorAutenticado
		throw new UnsupportedOperationException();
	}

	public void eliminaContaMoradorAutenticado() {
		// TODO - implement Moradores.eliminaContaMoradorAutenticado
		throw new UnsupportedOperationException();
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
		// TODO - implement Moradores.terminarSessao
		throw new UnsupportedOperationException();
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
	 * @param avatar
	 */
	public void registaMorador(String nome, String email, String password, ImageIcon avatar) {
		// TODO - implement Moradores.registaMorador
		throw new UnsupportedOperationException();
	}
        
        public void registaMorador(String nome, String email, String password) throws EmailEmUsoException {
		// TODO - implement Moradores.registaMorador
		Morador novo = new Morador(nome, email, password);
                moradores.put(0, novo);
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

	public List<String> getNotificacoes() {
		// TODO - implement Moradores.getNotificacoes
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param notificacoes
	 */
	public void setNotificacoes(List<String> notificacoes) {
		// TODO - implement Moradores.setNotificacoes
		throw new UnsupportedOperationException();
	}

}