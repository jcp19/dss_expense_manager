package dss.g22.business.moradores;

import com.mysql.jdbc.exceptions.MySQLIntegrityConstraintViolationException;
import dss.g22.business.moradores.Morador;
import dss.g22.business.despesas.Despesa;
import dss.g22.business.despesas.Fatura;
import dss.g22.business.despesas.Transferencia;
import dss.g22.business.moradores.CampoInvalidoException;
import dss.g22.data.MoradorDAO;
import dss.g22.data.NotificacaoDAO;
import java.util.List;
import javax.swing.ImageIcon;

public class Moradores {

	private MoradorDAO moradores;
        private NotificacaoDAO notificacoes;
        private Morador moradorAutenticado;
        
        public Moradores() {
            moradores = new MoradorDAO();
            notificacoes = new NotificacaoDAO();
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
	public void login(String email, String password) throws CampoInvalidoException {
		moradorAutenticado = moradores.get(email,password);
                if(moradorAutenticado == null) {
                    throw new CampoInvalidoException("Uma das credenciais e invalida");
                }
	}

	public double getSaldoMoradorAutenticado() {
		// TODO - implement Moradores.getSaldoMoradorAutenticado
		return -69;
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
	public void alteraMailMoradorAutenticado(String mail) throws EmailEmUsoException {
		// TODO - implement Moradores.alteraMailMoradorAutenticado
		int id = moradorAutenticado.getIdMorador();
                try{
                    moradores.alterarEmail(id, mail);
                    moradorAutenticado.setEmail(mail);
                } catch(EmailEmUsoException e){
                    throw new EmailEmUsoException();
                }             
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
	 * @param avatar
	 */
	public void registaMorador(String nome, String email, String password, ImageIcon avatar) {
		// TODO - implement Moradores.registaMorador
		throw new UnsupportedOperationException();
	}
        
        public void registaMorador(String nome, String email, String password) throws EmailEmUsoException {
		// TODO - implement Moradores.registaMorador
		Morador novo = new Morador(nome, email, password);
                Morador m = moradores.put(0, novo);
                if(m == null) {
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

    public String getNomeMoradorAutenticado() {
        return moradorAutenticado.getNome();
    }

    public String getMailMoradorAutenticado() {
        return moradorAutenticado.getEmail();
    }

    public void alteraPasswordMoradorAutenticado(String passwordAtual, String passwordNova) throws CampoInvalidoException {
        if(passwordAtual.equals(moradorAutenticado.getPassword())){
            int idMorador = moradorAutenticado.getIdMorador();
            moradores.alterarPassword(idMorador, passwordNova);
        } else throw new CampoInvalidoException("A password fornecida e invalida");
    }

    public void notificaRegistoMorador(String nome) {
        notificacoes.registaNotificacao("O morador " + nome + " registou-se no apartamento.");
    }
    
    public String[] mensagensNotificacoes(){
        String[] mensagens = notificacoes.getMensagensNotificacao().stream().toArray(String[]::new);
        return mensagens;
    }

}