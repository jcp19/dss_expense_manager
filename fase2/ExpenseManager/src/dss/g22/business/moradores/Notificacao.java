/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dss.g22.business.moradores;

/**
 *
 * @author joao
 */
public class Notificacao {
    private int idNotificacao;
    private String mensagem;
    
    public Notificacao(int idNotificacao, String mensagem) {
        this.idNotificacao = idNotificacao;
        this.mensagem = mensagem;
    }
    
    public int getIdNotificacao() {
        return idNotificacao;
    }
    
    public String getMensagemNotificacao() {
        return mensagem;
    }
}
