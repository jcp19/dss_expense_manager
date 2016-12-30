/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dss.g22.presentation;

import dss.g22.business.Facade;
import static dss.g22.presentation.images.ConstantesImagens.ALTURA_IMG_NORMAL;
import static dss.g22.presentation.images.ConstantesImagens.LARGURA_IMG_NORMAL;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;

/**
 *
 * @author joao
 */
public class DialogGestaoContaMorador extends javax.swing.JDialog {
    private Facade facade;
    private DialogAlterarEmail dialogAlterarEmail;
    private DialogAlterarPassword dialogAlterarPassword;
    
    /**
     * Creates new form DialogGestaoContaMorador
     */
    public DialogGestaoContaMorador(java.awt.Frame parent, boolean modal, Facade facade) {
        super(parent, modal);
        initComponents();
        this.facade = facade;
        emailGestaoConta.setText(facade.getMailMoradorAutenticado());
        nomeMoradorGestaoConta.setText(facade.getNomeMoradorAutenticado());
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
        painelGestaoContaMorador = new javax.swing.JPanel();
        labelNomeMorador = new javax.swing.JLabel();
        labelEmailMorador = new javax.swing.JLabel();
        nomeMoradorGestaoConta = new javax.swing.JLabel();
        emailGestaoConta = new javax.swing.JLabel();
        painelAlteracoes = new javax.swing.JPanel();
        botaoAlterarEmail = new javax.swing.JButton();
        botaoAlterarPassword = new javax.swing.JButton();
        botaoEliminarConta = new javax.swing.JButton();
        imagemMoradorGestaoConta = new javax.swing.JButton();

        selecionadorImagem.setAcceptAllFileFilterUsed(false);
        selecionadorImagem.setCurrentDirectory(null);
        selecionadorImagem.setDialogTitle("Selecionar imagem");
        selecionadorImagem.setFileFilter(new javax.swing.filechooser.FileNameExtensionFilter(
            "Imagens", javax.imageio.ImageIO.getReaderFileSuffixes()));

    setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    setTitle("Gestão de conta de morador");
    setMinimumSize(new java.awt.Dimension(360, 360));
    setModalityType(java.awt.Dialog.ModalityType.APPLICATION_MODAL);
    setName("gestaoContaMorador"); // NOI18N
    setPreferredSize(new java.awt.Dimension(360, 360));
    setResizable(false);
    getContentPane().setLayout(new java.awt.GridBagLayout());

    painelGestaoContaMorador.setBorder(javax.swing.BorderFactory.createEtchedBorder());
    painelGestaoContaMorador.setLayout(new java.awt.GridBagLayout());

    labelNomeMorador.setText("Nome:");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 1;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
    gridBagConstraints.insets = new java.awt.Insets(10, 6, 0, 0);
    painelGestaoContaMorador.add(labelNomeMorador, gridBagConstraints);

    labelEmailMorador.setText("E-mail:");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
    gridBagConstraints.insets = new java.awt.Insets(10, 6, 0, 0);
    painelGestaoContaMorador.add(labelEmailMorador, gridBagConstraints);

    nomeMoradorGestaoConta.setText("<pôr nome do morador aqui>");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 1;
    gridBagConstraints.gridy = 1;
    gridBagConstraints.gridwidth = 2;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
    gridBagConstraints.insets = new java.awt.Insets(10, 6, 0, 0);
    painelGestaoContaMorador.add(nomeMoradorGestaoConta, gridBagConstraints);

    emailGestaoConta.setText("<pôr e-mail do morador aqui>");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 1;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.gridwidth = 2;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
    gridBagConstraints.insets = new java.awt.Insets(10, 6, 0, 0);
    painelGestaoContaMorador.add(emailGestaoConta, gridBagConstraints);

    painelAlteracoes.setLayout(new javax.swing.BoxLayout(painelAlteracoes, javax.swing.BoxLayout.LINE_AXIS));

    botaoAlterarEmail.setText("Alterar e-mail");
    botaoAlterarEmail.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            botaoAlterarEmailActionPerformed(evt);
        }
    });
    painelAlteracoes.add(botaoAlterarEmail);

    botaoAlterarPassword.setText("Alterar password");
    botaoAlterarPassword.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            botaoAlterarPasswordActionPerformed(evt);
        }
    });
    painelAlteracoes.add(botaoAlterarPassword);

    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 3;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.insets = new java.awt.Insets(6, 0, 0, 0);
    painelGestaoContaMorador.add(painelAlteracoes, gridBagConstraints);

    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 1;
    gridBagConstraints.insets = new java.awt.Insets(6, 6, 0, 0);
    getContentPane().add(painelGestaoContaMorador, gridBagConstraints);

    botaoEliminarConta.setForeground(new java.awt.Color(204, 0, 0));
    botaoEliminarConta.setText("Eliminar conta");
    botaoEliminarConta.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            botaoEliminarContaActionPerformed(evt);
        }
    });
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.insets = new java.awt.Insets(6, 0, 0, 0);
    getContentPane().add(botaoEliminarConta, gridBagConstraints);

    imagemMoradorGestaoConta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dss/g22/presentation/images/NoImage.jpeg"))); // NOI18N
    imagemMoradorGestaoConta.setBorder(null);
    imagemMoradorGestaoConta.setToolTipText("Clique na imagem para a alterar");
    imagemMoradorGestaoConta.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            imagemMoradorGestaoContaActionPerformed(evt);
        }
    });
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.insets = new java.awt.Insets(6, 6, 10, 0);
    getContentPane().add(imagemMoradorGestaoConta, gridBagConstraints);

    pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoAlterarEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAlterarEmailActionPerformed
        dialogAlterarEmail = new DialogAlterarEmail(this, true, facade);
        dialogAlterarEmail.setLocationRelativeTo(this);
        dialogAlterarEmail.setVisible(true);
        dispose();
        this.setVisible(false);
    }//GEN-LAST:event_botaoAlterarEmailActionPerformed

    private void imagemMoradorGestaoContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imagemMoradorGestaoContaActionPerformed
        int r = selecionadorImagem.showOpenDialog(this);
        
        if(r == JFileChooser.APPROVE_OPTION) {
            try {
                BufferedImage imgMorador = ImageIO.read(selecionadorImagem.getSelectedFile());
                final int l = imgMorador.getWidth(), h = imgMorador.getHeight();
                ImageIcon iconImgMorador;

                if(l != LARGURA_IMG_NORMAL || h != ALTURA_IMG_NORMAL) {
                    iconImgMorador = new ImageIcon(
                        imgMorador.getScaledInstance(LARGURA_IMG_NORMAL, ALTURA_IMG_NORMAL, Image.SCALE_SMOOTH)
                    );
                } else {
                    iconImgMorador = new ImageIcon(imgMorador);
                }

                imagemMoradorGestaoConta.setIcon(iconImgMorador);
            } catch (IOException ex) {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_imagemMoradorGestaoContaActionPerformed

    private void botaoAlterarPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAlterarPasswordActionPerformed
        dialogAlterarPassword = new DialogAlterarPassword(this, true, facade);
        dialogAlterarPassword.setLocationRelativeTo(this);
        dialogAlterarPassword.setVisible(true);
        dispose();
    }//GEN-LAST:event_botaoAlterarPasswordActionPerformed

    private void botaoEliminarContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoEliminarContaActionPerformed
        ConfirmarApagarConta dialog = new ConfirmarApagarConta(this, true, facade);
        dialog.setLocationRelativeTo(this);
        dialog.setVisible(true);
        dispose();
    }//GEN-LAST:event_botaoEliminarContaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoAlterarEmail;
    private javax.swing.JButton botaoAlterarPassword;
    private javax.swing.JButton botaoEliminarConta;
    private javax.swing.JLabel emailGestaoConta;
    private javax.swing.JButton imagemMoradorGestaoConta;
    private javax.swing.JLabel labelEmailMorador;
    private javax.swing.JLabel labelNomeMorador;
    private javax.swing.JLabel nomeMoradorGestaoConta;
    private javax.swing.JPanel painelAlteracoes;
    private javax.swing.JPanel painelGestaoContaMorador;
    private javax.swing.JFileChooser selecionadorImagem;
    // End of variables declaration//GEN-END:variables
}
