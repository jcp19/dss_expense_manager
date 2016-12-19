package dss.g22.presentation;

import dss.g22.business.Facade;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author joaop
 */
public class Login extends javax.swing.JFrame {
    
    private final Facade facade;
    private static final int LARGURA_IMG = 160, ALTURA_IMG = 160;
    
    /**
     * Creates new form Login
     */
    public Login() {
        this(null);
    }
    
    public Login(Facade f) {
        facade = f;
        initComponents();
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Login().setVisible(true);
        });
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

        dialogRegisto = new javax.swing.JDialog();
        labelNome = new javax.swing.JLabel();
        labelRegistoEmail = new javax.swing.JLabel();
        labelRegistoPassword = new javax.swing.JLabel();
        labelConfirmarPassword = new javax.swing.JLabel();
        campoNome = new javax.swing.JTextField();
        campoRegistoEmail = new javax.swing.JTextField();
        campoRegistoPassword = new javax.swing.JPasswordField();
        campoConfirmarPassword = new javax.swing.JPasswordField();
        butaoCancelar = new javax.swing.JButton();
        butaoRegistar = new javax.swing.JButton();
        butaoProcurar = new javax.swing.JButton();
        labelImagemMorador = new javax.swing.JLabel();
        selecionadorImagem = new javax.swing.JFileChooser();
        labelLogo = new javax.swing.JLabel();
        labelEmail = new javax.swing.JLabel();
        campoEmail = new javax.swing.JTextField();
        labelPassword = new javax.swing.JLabel();
        campoPassword = new javax.swing.JPasswordField();
        butaoLogin = new javax.swing.JButton();
        painelRegistar = new javax.swing.JPanel();
        labelNaoTemConta = new javax.swing.JLabel();
        botaoRegistar = new javax.swing.JButton();

        dialogRegisto.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        dialogRegisto.setTitle("Registo");
        dialogRegisto.setLocationByPlatform(true);
        dialogRegisto.setMinimumSize(new java.awt.Dimension(515, 310));
        dialogRegisto.setModal(true);
        dialogRegisto.setName("dialogRegisto"); // NOI18N
        dialogRegisto.setPreferredSize(new java.awt.Dimension(515, 310));
        dialogRegisto.setResizable(false);
        dialogRegisto.getContentPane().setLayout(new java.awt.GridBagLayout());

        labelNome.setText("Nome:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 0, 0);
        dialogRegisto.getContentPane().add(labelNome, gridBagConstraints);

        labelRegistoEmail.setText("E-mail:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 0, 0);
        dialogRegisto.getContentPane().add(labelRegistoEmail, gridBagConstraints);

        labelRegistoPassword.setText("Password:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 0, 0);
        dialogRegisto.getContentPane().add(labelRegistoPassword, gridBagConstraints);

        labelConfirmarPassword.setText("Confirmar password:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 0, 0);
        dialogRegisto.getContentPane().add(labelConfirmarPassword, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 0, 0);
        dialogRegisto.getContentPane().add(campoNome, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 0, 0);
        dialogRegisto.getContentPane().add(campoRegistoEmail, gridBagConstraints);

        campoRegistoPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoRegistoPasswordActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 0, 0);
        dialogRegisto.getContentPane().add(campoRegistoPassword, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 0, 0);
        dialogRegisto.getContentPane().add(campoConfirmarPassword, gridBagConstraints);

        butaoCancelar.setText("Cancelar");
        butaoCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butaoCancelarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 0, 0);
        dialogRegisto.getContentPane().add(butaoCancelar, gridBagConstraints);

        butaoRegistar.setText("Registar");
        butaoRegistar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butaoRegistarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 0, 0);
        dialogRegisto.getContentPane().add(butaoRegistar, gridBagConstraints);

        butaoProcurar.setText("Procurar...");
        butaoProcurar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butaoProcurarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.insets = new java.awt.Insets(5, 50, 0, 0);
        dialogRegisto.getContentPane().add(butaoProcurar, gridBagConstraints);

        labelImagemMorador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dss/g22/presentation/images/NoImage.jpeg"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridheight = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(0, 50, 0, 0);
        dialogRegisto.getContentPane().add(labelImagemMorador, gridBagConstraints);

        selecionadorImagem.setAcceptAllFileFilterUsed(false);
        selecionadorImagem.setCurrentDirectory(null);
        selecionadorImagem.setFileFilter(new javax.swing.filechooser.FileNameExtensionFilter(
            "Imagens", javax.imageio.ImageIO.getReaderFileSuffixes()));

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setTitle("Login");
    setLocationByPlatform(true);
    setMinimumSize(new java.awt.Dimension(335, 485));
    setPreferredSize(new java.awt.Dimension(335, 48));
    setResizable(false);
    setSize(new java.awt.Dimension(325, 480));
    getContentPane().setLayout(new java.awt.GridBagLayout());

    labelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dss/g22/presentation/images/ExpenseManagerLogo.png"))); // NOI18N
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.gridwidth = 2;
    gridBagConstraints.insets = new java.awt.Insets(0, 5, 20, 0);
    getContentPane().add(labelLogo, gridBagConstraints);

    labelEmail.setText("E-mail:");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 1;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
    gridBagConstraints.insets = new java.awt.Insets(5, 5, 0, 0);
    getContentPane().add(labelEmail, gridBagConstraints);
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.gridwidth = 2;
    gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
    gridBagConstraints.insets = new java.awt.Insets(5, 5, 0, 0);
    getContentPane().add(campoEmail, gridBagConstraints);

    labelPassword.setText("Password:");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 3;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
    gridBagConstraints.insets = new java.awt.Insets(5, 5, 0, 0);
    getContentPane().add(labelPassword, gridBagConstraints);
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.gridwidth = 2;
    gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
    gridBagConstraints.insets = new java.awt.Insets(5, 5, 0, 0);
    getContentPane().add(campoPassword, gridBagConstraints);

    butaoLogin.setText("Login");
    butaoLogin.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            butaoLoginActionPerformed(evt);
        }
    });
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 5;
    gridBagConstraints.gridwidth = 2;
    gridBagConstraints.insets = new java.awt.Insets(5, 5, 0, 0);
    getContentPane().add(butaoLogin, gridBagConstraints);

    painelRegistar.setLayout(new java.awt.GridBagLayout());

    labelNaoTemConta.setText("Se não tem conta, ");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    painelRegistar.add(labelNaoTemConta, gridBagConstraints);

    botaoRegistar.setText("registe-se");
    botaoRegistar.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            botaoRegistarActionPerformed(evt);
        }
    });
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 1;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.ABOVE_BASELINE;
    painelRegistar.add(botaoRegistar, gridBagConstraints);

    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 6;
    gridBagConstraints.gridwidth = 2;
    gridBagConstraints.insets = new java.awt.Insets(10, 5, 0, 0);
    getContentPane().add(painelRegistar, gridBagConstraints);

    pack();
    setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void campoRegistoPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoRegistoPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoRegistoPasswordActionPerformed

    private void butaoRegistarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butaoRegistarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_butaoRegistarActionPerformed

    private void butaoProcurarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butaoProcurarActionPerformed
        int r = selecionadorImagem.showOpenDialog(this);
        
        if(r == JFileChooser.APPROVE_OPTION) {
            try {
                BufferedImage imgMorador = ImageIO.read(selecionadorImagem.getSelectedFile());
                final int l = imgMorador.getWidth(), h = imgMorador.getHeight();
                ImageIcon iconImgMorador;
                
                if(l != LARGURA_IMG || h != ALTURA_IMG) {
                    iconImgMorador = new ImageIcon(
                        imgMorador.getScaledInstance(LARGURA_IMG, ALTURA_IMG, Image.SCALE_SMOOTH)
                    );
                } else {
                    iconImgMorador = new ImageIcon(imgMorador);
                }
                
                labelImagemMorador.setIcon(iconImgMorador);   
            } catch (IOException ex) {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_butaoProcurarActionPerformed

    private void botaoRegistarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoRegistarActionPerformed
        dialogRegisto.setLocationRelativeTo(this);
        dialogRegisto.setVisible(true);
    }//GEN-LAST:event_botaoRegistarActionPerformed

    private void butaoLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butaoLoginActionPerformed
        // NAO ESQUECER DE FAZER CODIGO DE AUTENTICACAO
        Dashboard dashboard = new Dashboard();
        
        // if(autentica(campoEmail.getText(), campoPassword.getText())) {
            dispose();
            dashboard.setVisible(true);
        /* } else {
                Mensagem de "Email e/ou password inválido(s)
        } */
    }//GEN-LAST:event_butaoLoginActionPerformed

    private void butaoCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butaoCancelarActionPerformed
        dialogRegisto.setVisible(false);
    }//GEN-LAST:event_butaoCancelarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoRegistar;
    private javax.swing.JButton butaoCancelar;
    private javax.swing.JButton butaoLogin;
    private javax.swing.JButton butaoProcurar;
    private javax.swing.JButton butaoRegistar;
    private javax.swing.JPasswordField campoConfirmarPassword;
    private javax.swing.JTextField campoEmail;
    private javax.swing.JTextField campoNome;
    private javax.swing.JPasswordField campoPassword;
    private javax.swing.JTextField campoRegistoEmail;
    private javax.swing.JPasswordField campoRegistoPassword;
    private javax.swing.JDialog dialogRegisto;
    private javax.swing.JLabel labelConfirmarPassword;
    private javax.swing.JLabel labelEmail;
    private javax.swing.JLabel labelImagemMorador;
    private javax.swing.JLabel labelLogo;
    private javax.swing.JLabel labelNaoTemConta;
    private javax.swing.JLabel labelNome;
    private javax.swing.JLabel labelPassword;
    private javax.swing.JLabel labelRegistoEmail;
    private javax.swing.JLabel labelRegistoPassword;
    private javax.swing.JPanel painelRegistar;
    private javax.swing.JFileChooser selecionadorImagem;
    // End of variables declaration//GEN-END:variables
}
