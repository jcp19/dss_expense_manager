/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dss.g22.presentation;

import dss.g22.business.Facade;
import dss.g22.business.moradores.EmailEmUsoException;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import static dss.g22.presentation.images.ConstantesImagens.ALTURA_IMG_NORMAL;
import static dss.g22.presentation.images.ConstantesImagens.LARGURA_IMG_NORMAL;

/**
 *
 * @author joao
 */
public class DialogRegistarMorador extends javax.swing.JDialog {

    /**
     * Creates new form DialogRegisto
     */
    private Facade facade;

    public DialogRegistarMorador(java.awt.Frame parent, boolean modal, Facade facade) {
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

        selecionadorImagem = new javax.swing.JFileChooser();
        labelNome = new javax.swing.JLabel();
        campoNome = new javax.swing.JTextField();
        labelEmail = new javax.swing.JLabel();
        campoEmail = new javax.swing.JTextField();
        labelPassword = new javax.swing.JLabel();
        campoPassword = new javax.swing.JPasswordField();
        labelConfirmarPassword = new javax.swing.JLabel();
        campoConfirmarPassword = new javax.swing.JPasswordField();
        labelImagemMorador = new javax.swing.JLabel();
        painelCancelarREgistar = new javax.swing.JPanel();
        butaoRegistar = new javax.swing.JButton();
        butaoCancelar = new javax.swing.JButton();
        painelErros = new javax.swing.JPanel();
        labelCamposObrigatorios = new javax.swing.JLabel();
        labelErroPassDiferentes = new javax.swing.JLabel();
        labelErroEmailEmUso = new javax.swing.JLabel();

        selecionadorImagem.setAcceptAllFileFilterUsed(false);
        selecionadorImagem.setCurrentDirectory(null);
        selecionadorImagem.setDialogTitle("Selecionar imagem");
        selecionadorImagem.setFileFilter(new javax.swing.filechooser.FileNameExtensionFilter(
            "Imagens", javax.imageio.ImageIO.getReaderFileSuffixes()));

    setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    setMinimumSize(new java.awt.Dimension(540, 31));
    setPreferredSize(new java.awt.Dimension(540, 310));
    setResizable(false);
    getContentPane().setLayout(new java.awt.GridBagLayout());

    labelNome.setText("Nome:");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
    gridBagConstraints.insets = new java.awt.Insets(6, 6, 0, 0);
    getContentPane().add(labelNome, gridBagConstraints);

    campoNome.setMinimumSize(new java.awt.Dimension(273, 26));
    campoNome.setPreferredSize(new java.awt.Dimension(273, 26));
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 1;
    gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
    gridBagConstraints.insets = new java.awt.Insets(3, 3, 0, 0);
    getContentPane().add(campoNome, gridBagConstraints);

    labelEmail.setText("E-mail:");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.gridwidth = 2;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
    gridBagConstraints.insets = new java.awt.Insets(6, 6, 0, 0);
    getContentPane().add(labelEmail, gridBagConstraints);

    campoEmail.setMinimumSize(new java.awt.Dimension(273, 26));
    campoEmail.setPreferredSize(new java.awt.Dimension(273, 26));
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 3;
    gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
    gridBagConstraints.insets = new java.awt.Insets(3, 3, 0, 0);
    getContentPane().add(campoEmail, gridBagConstraints);

    labelPassword.setText("Password:");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 5;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
    gridBagConstraints.insets = new java.awt.Insets(6, 6, 0, 0);
    getContentPane().add(labelPassword, gridBagConstraints);

    campoPassword.setMinimumSize(new java.awt.Dimension(273, 26));
    campoPassword.setPreferredSize(new java.awt.Dimension(273, 26));
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 6;
    gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
    gridBagConstraints.insets = new java.awt.Insets(3, 3, 0, 0);
    getContentPane().add(campoPassword, gridBagConstraints);

    labelConfirmarPassword.setText("Confirmar password:");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 7;
    gridBagConstraints.gridwidth = 5;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
    gridBagConstraints.insets = new java.awt.Insets(6, 6, 0, 0);
    getContentPane().add(labelConfirmarPassword, gridBagConstraints);

    campoConfirmarPassword.setMinimumSize(new java.awt.Dimension(273, 26));
    campoConfirmarPassword.setPreferredSize(new java.awt.Dimension(273, 26));
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 8;
    gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
    gridBagConstraints.insets = new java.awt.Insets(3, 3, 0, 0);
    getContentPane().add(campoConfirmarPassword, gridBagConstraints);

    labelImagemMorador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dss/g22/presentation/images/NoImage.jpeg"))); // NOI18N
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 1;
    gridBagConstraints.gridy = 1;
    gridBagConstraints.gridheight = 8;
    gridBagConstraints.ipady = 27;
    gridBagConstraints.insets = new java.awt.Insets(0, 35, 0, 0);
    getContentPane().add(labelImagemMorador, gridBagConstraints);

    painelCancelarREgistar.setLayout(new java.awt.GridBagLayout());

    butaoRegistar.setText("Registar");
    butaoRegistar.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            butaoRegistarActionPerformed(evt);
        }
    });
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 1;
    gridBagConstraints.gridy = 0;
    painelCancelarREgistar.add(butaoRegistar, gridBagConstraints);

    butaoCancelar.setText("Cancelar");
    butaoCancelar.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            butaoCancelarActionPerformed(evt);
        }
    });
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
    painelCancelarREgistar.add(butaoCancelar, gridBagConstraints);

    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 10;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
    gridBagConstraints.insets = new java.awt.Insets(3, 0, 0, 0);
    getContentPane().add(painelCancelarREgistar, gridBagConstraints);

    painelErros.setLayout(new javax.swing.OverlayLayout(painelErros));

    labelCamposObrigatorios.setForeground(new java.awt.Color(255, 0, 0));
    labelCamposObrigatorios.setText("Preencha todos os campos.");
    labelCamposObrigatorios.setVisible(false);
    painelErros.add(labelCamposObrigatorios);

    labelErroPassDiferentes.setForeground(new java.awt.Color(255, 0, 0));
    labelErroPassDiferentes.setText("As passwords introduzidas não coincidem.");
    labelErroPassDiferentes.setOpaque(true);
    labelErroPassDiferentes.setVisible(false);
    painelErros.add(labelErroPassDiferentes);

    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 9;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
    gridBagConstraints.insets = new java.awt.Insets(0, 6, 0, 0);
    getContentPane().add(painelErros, gridBagConstraints);

    labelErroEmailEmUso.setForeground(new java.awt.Color(255, 0, 0));
    labelErroEmailEmUso.setText("O e-mail escolhido já está em uso");
    labelErroEmailEmUso.setVisible(false);
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
    gridBagConstraints.insets = new java.awt.Insets(0, 6, 0, 0);
    getContentPane().add(labelErroEmailEmUso, gridBagConstraints);

    pack();
    }// </editor-fold>//GEN-END:initComponents

    private void butaoCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butaoCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_butaoCancelarActionPerformed

    private void butaoRegistarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butaoRegistarActionPerformed
        // TODO add your handling code here:
        String nome = campoNome.getText().trim();
        String password = new String(campoPassword.getPassword());
        String email = campoEmail.getText().trim();
        String confirmacaoPassword = new String(campoConfirmarPassword.getPassword());

        if (nome.length() == 0 || password.length() == 0 || confirmacaoPassword.length() == 0 || email.length() == 0) {
            labelCamposObrigatorios.setVisible(true);
            labelErroPassDiferentes.setVisible(false);
            labelErroEmailEmUso.setVisible(false);

        } else if (!password.equals(confirmacaoPassword)) {
            labelCamposObrigatorios.setVisible(false);
            labelErroPassDiferentes.setVisible(true);
            labelCamposObrigatorios.setVisible(false);
        } else {
            try {
                facade.registaMorador(nome, email, password);
                dispose();
            } catch (EmailEmUsoException e) {
                labelCamposObrigatorios.setVisible(false);
                labelErroPassDiferentes.setVisible(false);
                labelErroEmailEmUso.setVisible(true);
            }
        }

    }//GEN-LAST:event_butaoRegistarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton butaoCancelar;
    private javax.swing.JButton butaoRegistar;
    private javax.swing.JPasswordField campoConfirmarPassword;
    private javax.swing.JTextField campoEmail;
    private javax.swing.JTextField campoNome;
    private javax.swing.JPasswordField campoPassword;
    private javax.swing.JLabel labelCamposObrigatorios;
    private javax.swing.JLabel labelConfirmarPassword;
    private javax.swing.JLabel labelEmail;
    private javax.swing.JLabel labelErroEmailEmUso;
    private javax.swing.JLabel labelErroPassDiferentes;
    private javax.swing.JLabel labelImagemMorador;
    private javax.swing.JLabel labelNome;
    private javax.swing.JLabel labelPassword;
    private javax.swing.JPanel painelCancelarREgistar;
    private javax.swing.JPanel painelErros;
    private javax.swing.JFileChooser selecionadorImagem;
    // End of variables declaration//GEN-END:variables
}
