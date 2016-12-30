/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dss.g22.business.moradores;

/**
 *
 * @author joaop
 */
public class EmailEmUsoException extends Exception {

    public EmailEmUsoException(String str) {
        super(str);
    }

    public EmailEmUsoException() {
        super("O email introduzido ja se encontra em uso.");
    }
}
