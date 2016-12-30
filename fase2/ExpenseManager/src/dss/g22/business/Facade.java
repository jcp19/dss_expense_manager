package dss.g22.business;


import dss.g22.business.despesas.Despesa;
import dss.g22.business.despesas.Transferencia;
import dss.g22.business.despesas.Fatura;
import dss.g22.business.moradores.Moradores;
import dss.g22.business.moradores.CampoInvalidoException;
import dss.g22.business.moradores.EmailEmUsoException;
import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import javax.swing.ImageIcon;

public class Facade {

	private Moradores moradores;
        
        public Facade() {
            moradores = new Moradores();
        }
        
	/**
	 * 
	 * @param avatar
	 */
	public void alteraAvatarMoradorAutenticado(ImageIcon avatar) {
		// TODO - implement Facade.alteraAvatarMoradorAutenticado
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param email
	 * @param password
	 */
	public void login(String email, String password) throws CampoInvalidoException{
		// TODO - implement Facade.login
		moradores.login(email, password);
	}

	public double getSaldoMoradorAutenticado() {
		// TODO - implement Facade.getSaldoMoradorAutenticado
		return moradores.getSaldoMoradorAutenticado();
	}

	public List<Transferencia> getTransferenciasMoradorAutenticado() {
		// TODO - implement Facade.getTransferenciasMoradorAutenticado
		throw new UnsupportedOperationException();
	}

	public List<Fatura> getFaturasMoradorAutenticado() {
		// TODO - implement Facade.getFaturasMoradorAutenticado
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param idFatura
	 */
	public Fatura getFatura(int idFatura) {
		// TODO - implement Facade.getFatura
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param idDespesa
	 */
	public Despesa getDespesa(int idDespesa) {
		// TODO - implement Facade.getDespesa
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param mail
	 */
	public void alteraMailMoradorAutenticado(String mail) throws EmailEmUsoException {
		// TODO - implement Facade.alteraMailMoradorAutenticado
		moradores.alteraMailMoradorAutenticado(mail);
	}

	/**
	 * 
	 * @param password
	 */
	public void validaPasswordMoradorAutenticado(String password) {
		// TODO - implement Facade.validaPasswordMoradorAutenticado
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param password
	 */
	public void alteraPasswordMoradorAutenticado(String password) {
		// TODO - implement Facade.alteraPasswordMoradorAutenticado
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param novaDesignacao
	 * @param novaDescricao
	 */
	public void editaDespesa(String novaDesignacao, String novaDescricao) {
		// TODO - implement Facade.editaDespesa
		throw new UnsupportedOperationException();
	}

	public void eliminaContaMoradorAutenticado() {
		// TODO - implement Facade.eliminaContaMoradorAutenticado
		throw new UnsupportedOperationException();
	}

	public List<Despesa> getDespesas() {
		// TODO - implement Facade.getDespesas
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param designacao
	 * @param descricao
	 * @param fatura
	 */
	public void registaDespesaPontual(String designacao, String descricao, Fatura fatura) {
		// TODO - implement Facade.registaDespesaPontual
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
		// TODO - implement Facade.registaDespesaRecorrente
		throw new UnsupportedOperationException();
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
		// TODO - implement Facade.registaTransferencia
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param idDespesa
	 */
	public void removeDespesa(int idDespesa) {
		// TODO - implement Facade.removeDespesa
		throw new UnsupportedOperationException();
	}

	public void terminarSessao() {
		// TODO - implement Facade.terminarSessao
		moradores.terminarSessao();
	}

	/**
	 * 
	 * @param idDespesa
	 */
	public void encerraDespesaRecorrente(int idDespesa) {
		// TODO - implement Facade.encerraDespesaRecorrente
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param idDespesa
	 * @param fatura
	 */
	public void registaFatura(int idDespesa, Fatura fatura) {
		// TODO - implement Facade.registaFatura
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
		// TODO - implement Facade.registaMorador
		throw new UnsupportedOperationException();
	}

        public void registaMorador(String nome, String email, String password) throws EmailEmUsoException {
            moradores.registaMorador(nome, email, password);
	}
                
	/**
	 * 
	 * @param idFatura
	 */
	public void removeFatura(int idFatura) {
		// TODO - implement Facade.removeFatura
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param idTransferencia
	 */
	public void removeTransferencia(int idTransferencia) {
		// TODO - implement Facade.removeTransferencia
		throw new UnsupportedOperationException();
	}

    public String getNomeMoradorAutenticado() {
        return moradores.getNomeMoradorAutenticado();
    }

    public String getMailMoradorAutenticado() {
        return moradores.getMailMoradorAutenticado();
    }

    public void alteraPasswordMoradorAutenticado(String passwordAtual, String passwordNova) throws CampoInvalidoException {
        moradores.alteraPasswordMoradorAutenticado(passwordAtual, passwordNova);
    }

    public void notificaRegistoMorador(String nome) {
        moradores.notificaRegistoMorador(nome);
    }

    public String[] mensagensNotificacoes(){
        return moradores.mensagensNotificacoes();
    }


}