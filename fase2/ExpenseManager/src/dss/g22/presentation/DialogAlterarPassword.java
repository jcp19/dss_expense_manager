/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dss.g22.presentation;

import dss.g22.business.Facade;
import dss.g22.business.moradores.CampoInvalidoException;

/**
 *
 * @author joao
 */
public class DialogAlterarPassword extends javax.swing.JDialog {
    private Facade facade;
    /**
     * Creates new form DialogAlterarPassword
     */
    public DialogAlterarPassword(java.awt.Frame parent, boolean modal, Facade facade) {
        super(parent, modal);
        initComponents();
        this.facade = facade;
    }
    
    public DialogAlterarPassword(javax.swing.JDialog parent, boolean modal, Facade facade) {
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

        labelPasswordAtual = new javax.swing.JLabel();
        campoPasswordAtual = new javax.swing.JPasswordField();
        labelPasswordInvalida = new javax.swing.JLabel();
        labelPasswordInvalida.setVisible(false);
        labelNovaPassword = new javax.swing.JLabel();
        campoNovaPassword = new javax.swing.JPasswordField();
        labelConfirmarNovaPassword = new javax.swing.JLabel();
        campoConfirmarNovaPassword = new javax.swing.JPasswordField();
        labelErroPassDiferentes = new javax.swing.JLabel();
        painelCancelarConfirmar = new javax.swing.JPanel();
        butaoCancelar = new javax.swing.JButton();
        botaoConfirmar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Alterar password");
        setMinimumSize(new java.awt.Dimension(315, 26));
        setPreferredSize(new java.awt.Dimension(315, 260));
        setResizable(false);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        labelPasswordAtual.setText("Password atual:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 0, 0);
        getContentPane().add(labelPasswordAtual, gridBagConstraints);

        campoPasswordAtual.setMinimumSize(new java.awt.Dimension(274, 26));
        campoPasswordAtual.setPreferredSize(new java.awt.Dimension(274, 26));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 0, 0);
        getContentPane().add(campoPasswordAtual, gridBagConstraints);

        labelPasswordInvalida.setForeground(new java.awt.Color(255, 0, 0));
        labelPasswordInvalida.setText("Password inválida.");
        labelPasswordInvalida.setOpaque(true);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 6, 0, 0);
        getContentPane().add(labelPasswordInvalida, gridBagConstraints);

        labelNovaPassword.setText("Nova password:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 0, 0);
        getContentPane().add(labelNovaPassword, gridBagConstraints);

        campoNovaPassword.setMinimumSize(new java.awt.Dimension(274, 26));
        campoNovaPassword.setPreferredSize(new java.awt.Dimension(274, 26));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 0, 0);
        getContentPane().add(campoNovaPassword, gridBagConstraints);

        labelConfirmarNovaPassword.setText("Confirmar nova password:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 0, 0);
        getContentPane().add(labelConfirmarNovaPassword, gridBagConstraints);

        campoConfirmarNovaPassword.setMinimumSize(new java.awt.Dimension(274, 26));
        campoConfirmarNovaPassword.setPreferredSize(new java.awt.Dimension(274, 26));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 0, 0);
        getContentPane().add(campoConfirmarNovaPassword, gridBagConstraints);

        labelErroPassDiferentes.setForeground(new java.awt.Color(255, 0, 0));
        labelErroPassDiferentes.setText("As passwords introduzidas não coincidem.");
        labelErroPassDiferentes.setOpaque(true);
        labelErroPassDiferentes.setVisible(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 8, 0, 0);
        getContentPane().add(labelErroPassDiferentes, gridBagConstraints);

        painelCancelarConfirmar.setLayout(new javax.swing.BoxLayout(painelCancelarConfirmar, javax.swing.BoxLayout.LINE_AXIS));

        butaoCancelar.setText("Cancelar");
        butaoCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butaoCancelarActionPerformed(evt);
            }
        });
        painelCancelarConfirmar.add(butaoCancelar);

        botaoConfirmar.setText("Confirmar");
        botaoConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoConfirmarActionPerformed(evt);
            }
        });
        painelCancelarConfirmar.add(botaoConfirmar);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(3, 0, 0, 0);
        getContentPane().add(painelCancelarConfirmar, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoConfirmarActionPerformed
        String passwordAtual, passwordNova1, passwordNova2;
        passwordAtual = new String(campoPasswordAtual.getPassword());
        passwordNova1 = new String(campoNovaPassword.getPassword());
        passwordNova2 = new String(campoConfirmarNovaPassword.getPassword());
        

        if(!passwordNova1.equals(passwordNova2)){
            labelPasswordInvalida.setVisible(false);
            labelErroPassDiferentes.setVisible(true);
        }else try{
            facade.alteraPasswordMoradorAutenticado(passwordAtual, passwordNova1);
            dispose();
        }catch(CampoInvalidoException e){
            labelPasswordInvalida.setVisible(true);
            labelErroPassDiferentes.setVisible(false);
        }

    }//GEN-LAST:event_botaoConfirmarActionPerformed

    private void butaoCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butaoCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_butaoCancelarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoConfirmar;
    private javax.swing.JButton butaoCancelar;
    private javax.swing.JPasswordField campoConfirmarNovaPassword;
    private javax.swing.JPasswordField campoNovaPassword;
    private javax.swing.JPasswordField campoPasswordAtual;
    private javax.swing.JLabel labelConfirmarNovaPassword;
    private javax.swing.JLabel labelErroPassDiferentes;
    private javax.swing.JLabel labelNovaPassword;
    private javax.swing.JLabel labelPasswordAtual;
    private javax.swing.JLabel labelPasswordInvalida;
    private javax.swing.JPanel painelCancelarConfirmar;
    // End of variables declaration//GEN-END:variables
}
