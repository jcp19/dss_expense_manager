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
public class DialogPesquisarDespesa extends javax.swing.JDialog {

    /**
     * Creates new form DialogPesquisarDespesa
     */
    public DialogPesquisarDespesa(java.awt.Frame parent, boolean modal) {
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

        labelIndicaoPesquisa = new javax.swing.JLabel();
        painelPesquisaDespesa = new dss.g22.presentation.PainelDespesas();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(490, 510));
        setPreferredSize(new java.awt.Dimension(490, 510));
        setResizable(false);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        labelIndicaoPesquisa.setText("Selecione a despesa recorrente a que pretende associar uma fatura:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 12, 0, 0);
        getContentPane().add(labelIndicaoPesquisa, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 0, 0);
        getContentPane().add(painelPesquisaDespesa, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel labelIndicaoPesquisa;
    private dss.g22.presentation.PainelDespesas painelPesquisaDespesa;
    // End of variables declaration//GEN-END:variables
}
