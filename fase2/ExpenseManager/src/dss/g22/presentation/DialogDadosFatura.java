/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dss.g22.presentation;

import java.awt.CardLayout;

/**
 *
 * @author joao
 */
public class DialogDadosFatura extends javax.swing.JDialog {

    /**
     * Creates new form NewJDialog
     */
    public DialogDadosFatura(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    
    public DialogDadosFatura(javax.swing.JDialog parent, boolean modal) {
        super(parent, modal);
        initComponents();
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

        painelBotoesCancelarConfirmar = new javax.swing.JPanel();
        botaoCancelar = new javax.swing.JButton();
        botaoConfirmar = new javax.swing.JButton();
        painelFatura1 = new dss.g22.presentation.PainelFatura();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(430, 480));
        setPreferredSize(new java.awt.Dimension(430, 480));
        setResizable(false);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        painelBotoesCancelarConfirmar.setLayout(new javax.swing.BoxLayout(painelBotoesCancelarConfirmar, javax.swing.BoxLayout.LINE_AXIS));

        botaoCancelar.setText("Cancelar");
        botaoCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCancelarActionPerformed(evt);
            }
        });
        painelBotoesCancelarConfirmar.add(botaoCancelar);

        botaoConfirmar.setText("Confirmar");
        painelBotoesCancelarConfirmar.add(botaoConfirmar);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 0, 0);
        getContentPane().add(painelBotoesCancelarConfirmar, gridBagConstraints);
        getContentPane().add(painelFatura1, new java.awt.GridBagConstraints());

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_botaoCancelarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoCancelar;
    private javax.swing.JButton botaoConfirmar;
    private javax.swing.JPanel painelBotoesCancelarConfirmar;
    private dss.g22.presentation.PainelFatura painelFatura1;
    // End of variables declaration//GEN-END:variables
}
