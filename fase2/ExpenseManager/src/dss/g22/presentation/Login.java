package dss.g22.presentation;


import dss.g22.business.moradores.CredencialInvalidaException;
import dss.g22.business.Facade;
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
    private DialogRegistarMorador dialogRegisto;
    
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
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        labelLogo = new javax.swing.JLabel();
        labelEmail = new javax.swing.JLabel();
        campoEmail = new javax.swing.JTextField();
        labelPassword = new javax.swing.JLabel();
        campoPassword = new javax.swing.JPasswordField();
        butaoLogin = new javax.swing.JButton();
        painelRegistar = new javax.swing.JPanel();
        labelNaoTemConta = new javax.swing.JLabel();
        botaoRegistar = new javax.swing.JButton();
        labelCredenciaisInvalidas = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(305, 470));
        setPreferredSize(new java.awt.Dimension(305, 470));
        setResizable(false);
        setSize(new java.awt.Dimension(335, 485));
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
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 0, 0);
        getContentPane().add(labelEmail, gridBagConstraints);

        campoEmail.setMinimumSize(new java.awt.Dimension(256, 26));
        campoEmail.setPreferredSize(new java.awt.Dimension(256, 26));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 0, 0);
        getContentPane().add(campoEmail, gridBagConstraints);

        labelPassword.setText("Password:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 0, 0);
        getContentPane().add(labelPassword, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 0, 0);
        getContentPane().add(campoPassword, gridBagConstraints);

        butaoLogin.setText("Login");
        butaoLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butaoLoginActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.insets = new java.awt.Insets(6, 0, 0, 0);
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
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.insets = new java.awt.Insets(6, 0, 0, 0);
        getContentPane().add(painelRegistar, gridBagConstraints);

        labelCredenciaisInvalidas.setForeground(new java.awt.Color(255, 0, 0));
        labelCredenciaisInvalidas.setText("Credenciais inválidas");
        labelCredenciaisInvalidas.setVisible(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 7, 0, 0);
        getContentPane().add(labelCredenciaisInvalidas, gridBagConstraints);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botaoRegistarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoRegistarActionPerformed
        dialogRegisto = new DialogRegistarMorador(this, true, facade);
        dialogRegisto.setLocationRelativeTo(this);
        dialogRegisto.setVisible(true);
    }//GEN-LAST:event_botaoRegistarActionPerformed

    private void butaoLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butaoLoginActionPerformed
        String email, password;
        
        email = campoEmail.getText();
        password = new String(campoPassword.getPassword());
        
        try {
            facade.login(email, password);
            Dashboard dashboard = new Dashboard();
            dispose();
            dashboard.setVisible(true);
        } catch(CredencialInvalidaException e) {
            labelCredenciaisInvalidas.setVisible(true);
        }
    }//GEN-LAST:event_butaoLoginActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoRegistar;
    private javax.swing.JButton butaoLogin;
    private javax.swing.JTextField campoEmail;
    private javax.swing.JPasswordField campoPassword;
    private javax.swing.JLabel labelCredenciaisInvalidas;
    private javax.swing.JLabel labelEmail;
    private javax.swing.JLabel labelLogo;
    private javax.swing.JLabel labelNaoTemConta;
    private javax.swing.JLabel labelPassword;
    private javax.swing.JPanel painelRegistar;
    // End of variables declaration//GEN-END:variables
}
