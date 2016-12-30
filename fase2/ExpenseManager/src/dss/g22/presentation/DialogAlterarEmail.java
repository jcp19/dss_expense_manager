/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dss.g22.presentation;

import dss.g22.business.Facade;
import dss.g22.business.moradores.CampoInvalidoException;
import dss.g22.business.moradores.EmailEmUsoException;

/**
 *
 * @author joao
 */
public class DialogAlterarEmail extends javax.swing.JDialog {

    /**
     * Creates new form DialogAlterarEmail
     */
    private Facade facade;
    
    public DialogAlterarEmail(java.awt.Frame parent, boolean modal, Facade facade) {
        super(parent, modal);
        initComponents();
        this.facade = facade;
    }
    
    public DialogAlterarEmail(javax.swing.JDialog parent, boolean modal, Facade facade) {
        super(parent, modal);
        initComponents();
        this.facade = facade;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        labelNovoEmail = new javax.swing.JLabel();
        campoNovoEmail = new javax.swing.JTextField();
        labelEmailInvalido = new javax.swing.JLabel();
        painelCancelarConfirmar = new javax.swing.JPanel();
        botaoCancelar = new javax.swing.JButton();
        botaoConfirmar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Alterar e-mail");
        setMinimumSize(new java.awt.Dimension(350, 140));
        setModalityType(java.awt.Dialog.ModalityType.APPLICATION_MODAL);
        setName("alterarEmail"); // NOI18N
        setPreferredSize(new java.awt.Dimension(350, 140));
        setResizable(false);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        labelNovoEmail.setText("Novo e-mail:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 0, 0);
        getContentPane().add(labelNovoEmail, gridBagConstraints);

        campoNovoEmail.setPreferredSize(new java.awt.Dimension(305, 26));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(2, 4, 0, 0);
        getContentPane().add(campoNovoEmail, gridBagConstraints);

        labelEmailInvalido.setForeground(new java.awt.Color(255, 0, 0));
        labelEmailInvalido.setText("O e-mail introduzido é inválido.");
        labelEmailInvalido.setOpaque(true);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 8, 0, 0);
        getContentPane().add(labelEmailInvalido, gridBagConstraints);

        painelCancelarConfirmar.setLayout(new javax.swing.BoxLayout(painelCancelarConfirmar, javax.swing.BoxLayout.LINE_AXIS));

        botaoCancelar.setText("Cancelar");
        labelEmailInvalido.setVisible(false);
        botaoCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCancelarActionPerformed(evt);
            }
        });
        painelCancelarConfirmar.add(botaoCancelar);

        botaoConfirmar.setText("Confirmar");
        botaoConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoConfirmarActionPerformed(evt);
            }
        });
        painelCancelarConfirmar.add(botaoConfirmar);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(3, 0, 0, 0);
        getContentPane().add(painelCancelarConfirmar, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_botaoCancelarActionPerformed

    private void botaoConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoConfirmarActionPerformed
        try{
            String novoMail = campoNovoEmail.getText().trim();
            if(novoMail.length() == 0){
                throw new CampoInvalidoException("O email introduzido e invalido");
            }
            facade.alteraMailMoradorAutenticado(novoMail);
            dispose();
            
        }catch(CampoInvalidoException | EmailEmUsoException e){
            labelEmailInvalido.setVisible(true);
        }
    }//GEN-LAST:event_botaoConfirmarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoCancelar;
    private javax.swing.JButton botaoConfirmar;
    private javax.swing.JTextField campoNovoEmail;
    private javax.swing.JLabel labelEmailInvalido;
    private javax.swing.JLabel labelNovoEmail;
    private javax.swing.JPanel painelCancelarConfirmar;
    // End of variables declaration//GEN-END:variables
}
