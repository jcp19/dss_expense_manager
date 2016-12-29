public class LinhaHistorico {

	private Operacao tipoOperacao;
	private int idResponsavel;
	private LocalDateTime horaOperacao;

	public int getIdResponsavel() {
		return this.idResponsavel;
	}

	/**
	 * 
	 * @param idResponsavel
	 */
	public void setIdResponsavel(int idResponsavel) {
		this.idResponsavel = idResponsavel;
	}

	public LocalDateTime getHoraOperacao() {
		return this.horaOperacao;
	}

	/**
	 * 
	 * @param horaOperacao
	 */
	public void setHoraOperacao(LocalDateTime horaOperacao) {
		this.horaOperacao = horaOperacao;
	}

}