/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dss.g22.presentation;

/**
 *
 * @author joao
 */
public class DialogRegistarTransferencia extends javax.swing.JDialog {

    /**
     * Creates new form DialogRegistarTransferencia
     */
    public DialogRegistarTransferencia(java.awt.Frame parent, boolean modal) {
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

        labelQuemTransferiu = new javax.swing.JLabel();
        labelQuemRecebeu = new javax.swing.JLabel();
        labelQuantia = new javax.swing.JLabel();
        labelDescricaoTransferencia = new javax.swing.JLabel();
        comboBoxQuemTransferiu = new javax.swing.JComboBox<>();
        comboBoxQuemRecebeu = new javax.swing.JComboBox<>();
        campoQuantiaTransferida = new javax.swing.JTextField();
        scrollDescricaoTransferencia = new javax.swing.JScrollPane();
        descricaoTransferencia = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        botaoCancelarRegistoTransferencia = new javax.swing.JButton();
        botaoConfirmarRegistoTransferencia = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(445, 265));
        setResizable(false);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        labelQuemTransferiu.setText("Quem transferiu:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 0, 0);
        getContentPane().add(labelQuemTransferiu, gridBagConstraints);

        labelQuemRecebeu.setText("Quem recebeu:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 0, 0);
        getContentPane().add(labelQuemRecebeu, gridBagConstraints);

        labelQuantia.setText("Quantia:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 0, 0);
        getContentPane().add(labelQuantia, gridBagConstraints);

        labelDescricaoTransferencia.setText("Descrição:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 0, 0);
        getContentPane().add(labelDescricaoTransferencia, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 0, 0);
        getContentPane().add(comboBoxQuemTransferiu, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 0, 0);
        getContentPane().add(comboBoxQuemRecebeu, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(6, 7, 0, 2);
        getContentPane().add(campoQuantiaTransferida, gridBagConstraints);

        descricaoTransferencia.setColumns(20);
        descricaoTransferencia.setLineWrap(true);
        descricaoTransferencia.setRows(5);
        descricaoTransferencia.setWrapStyleWord(true);
        scrollDescricaoTransferencia.setViewportView(descricaoTransferencia);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.insets = new java.awt.Insets(6, 11, 0, 6);
        getContentPane().add(scrollDescricaoTransferencia, gridBagConstraints);

        jPanel1.setLayout(new java.awt.GridBagLayout());

        botaoCancelarRegistoTransferencia.setText("Cancelar");
        botaoCancelarRegistoTransferencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCancelarRegistoTransferenciaActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        jPanel1.add(botaoCancelarRegistoTransferencia, gridBagConstraints);

        botaoConfirmarRegistoTransferencia.setText("Confirmar");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        jPanel1.add(botaoConfirmarRegistoTransferencia, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(6, 0, 0, 0);
        getContentPane().add(jPanel1, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoCancelarRegistoTransferenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCancelarRegistoTransferenciaActionPerformed
        dispose();
    }//GEN-LAST:event_botaoCancelarRegistoTransferenciaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoCancelarRegistoTransferencia;
    private javax.swing.JButton botaoConfirmarRegistoTransferencia;
    private javax.swing.JTextField campoQuantiaTransferida;
    private javax.swing.JComboBox<String> comboBoxQuemRecebeu;
    private javax.swing.JComboBox<String> comboBoxQuemTransferiu;
    private javax.swing.JTextArea descricaoTransferencia;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelDescricaoTransferencia;
    private javax.swing.JLabel labelQuantia;
    private javax.swing.JLabel labelQuemRecebeu;
    private javax.swing.JLabel labelQuemTransferiu;
    private javax.swing.JScrollPane scrollDescricaoTransferencia;
    // End of variables declaration//GEN-END:variables
}
