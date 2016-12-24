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
public class DialogMetodoDivisaoPorOmissao extends javax.swing.JDialog {

    /**
     * Creates new form DialogMetodoDivisaoPorOmissao
     */
    public DialogMetodoDivisaoPorOmissao(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    
    public DialogMetodoDivisaoPorOmissao(javax.swing.JDialog parent, boolean modal) {
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

        selecionadorData = new com.github.lgooddatepicker.components.DatePicker();
        labelComoDividir = new javax.swing.JLabel();
        labelDataPagamento = new javax.swing.JLabel();
        metodosDivisao = new javax.swing.JComboBox<>();
        painelMetodosDivisao = new javax.swing.JPanel();
        painelMetodoIgual = new javax.swing.JPanel();
        scrollMetodoIgual = new javax.swing.JScrollPane();
        tabelaMetodoIgual = new javax.swing.JTable();
        labelErroMetodoIgual = new javax.swing.JLabel();
        painelMetodoPercentagens = new javax.swing.JPanel();
        scrollPercentagens = new javax.swing.JScrollPane();
        tabelaPercentagens = new javax.swing.JTable();
        painelErrosPercentagens = new javax.swing.JPanel();
        erroTotalPercentagens = new javax.swing.JLabel();
        erroPercentagemNegativa = new javax.swing.JLabel();
        painelPercentagemTotal = new javax.swing.JPanel();
        labelPercentagemTotal = new javax.swing.JLabel();
        labelValorPercentagemTotal = new javax.swing.JLabel();
        labelCaraterPercentagem = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridBagLayout());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(3, 6, 0, 0);
        getContentPane().add(selecionadorData, gridBagConstraints);

        labelComoDividir.setText("Por omissão, como deve ser dividido o valor da cada fatura?");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 0, 0);
        getContentPane().add(labelComoDividir, gridBagConstraints);

        labelDataPagamento.setText("Data da primeira fatura:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 0, 0);
        getContentPane().add(labelDataPagamento, gridBagConstraints);

        metodosDivisao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Igualmente", "Por percentagens" }));
        metodosDivisao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                metodosDivisaoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(3, 1, 0, 0);
        getContentPane().add(metodosDivisao, gridBagConstraints);

        painelMetodosDivisao.setLayout(new java.awt.CardLayout());

        painelMetodoIgual.setLayout(new java.awt.GridBagLayout());

        scrollMetodoIgual.setPreferredSize(new java.awt.Dimension(382, 10));

        tabelaMetodoIgual.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Morador", "Participa"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaMetodoIgual.setColumnSelectionAllowed(true);
        tabelaMetodoIgual.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        scrollMetodoIgual.setViewportView(tabelaMetodoIgual);
        tabelaMetodoIgual.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        painelMetodoIgual.add(scrollMetodoIgual, gridBagConstraints);

        labelErroMetodoIgual.setText("Deve selecionar pelo menos um morador.");
        labelErroMetodoIgual.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        labelErroMetodoIgual.setForeground(new java.awt.Color(255, 0, 0));
        labelErroMetodoIgual.setVisible(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        painelMetodoIgual.add(labelErroMetodoIgual, gridBagConstraints);

        painelMetodosDivisao.add(painelMetodoIgual, "painelMetodoIgual");

        painelMetodoPercentagens.setLayout(new java.awt.GridBagLayout());

        scrollPercentagens.setPreferredSize(new java.awt.Dimension(382, 100));

        tabelaPercentagens.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Morador", "Percentagem (%)"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaPercentagens.setColumnSelectionAllowed(true);
        tabelaPercentagens.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        scrollPercentagens.setViewportView(tabelaPercentagens);
        tabelaPercentagens.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        painelMetodoPercentagens.add(scrollPercentagens, gridBagConstraints);

        painelErrosPercentagens.setLayout(new javax.swing.OverlayLayout(painelErrosPercentagens));

        erroTotalPercentagens.setText("O total tem de ser 100%.");
        erroTotalPercentagens.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        erroTotalPercentagens.setForeground(new java.awt.Color(255, 0, 0));
        erroTotalPercentagens.setVisible(false);
        painelErrosPercentagens.add(erroTotalPercentagens);

        erroPercentagemNegativa.setText("As percentagens devem ser não negativas.");
        erroPercentagemNegativa.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        erroPercentagemNegativa.setForeground(new java.awt.Color(255, 0, 0));
        erroPercentagemNegativa.setVisible(false);
        painelErrosPercentagens.add(erroPercentagemNegativa);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        painelMetodoPercentagens.add(painelErrosPercentagens, gridBagConstraints);

        painelPercentagemTotal.setLayout(new java.awt.GridBagLayout());

        labelPercentagemTotal.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        labelPercentagemTotal.setText("Total: ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        painelPercentagemTotal.add(labelPercentagemTotal, gridBagConstraints);

        labelValorPercentagemTotal.setText("0.00");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        painelPercentagemTotal.add(labelValorPercentagemTotal, gridBagConstraints);

        labelCaraterPercentagem.setText("%");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        painelPercentagemTotal.add(labelCaraterPercentagem, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(3, 0, 0, 0);
        painelMetodoPercentagens.add(painelPercentagemTotal, gridBagConstraints);

        painelMetodosDivisao.add(painelMetodoPercentagens, "painelMetodoPercentagens");

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 0, 0);
        getContentPane().add(painelMetodosDivisao, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void metodosDivisaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_metodosDivisaoActionPerformed
        String opcao = (String) metodosDivisao.getSelectedItem();
        CardLayout cardLayout = (CardLayout) painelMetodosDivisao.getLayout();

        switch(opcao) {
            case "Igualmente":
                cardLayout.show(painelMetodosDivisao, "painelMetodoIgual");
                break;
            default: // por percentagens
                cardLayout.show(painelMetodosDivisao, "painelMetodoPercentagens");
                break;
        }
    }//GEN-LAST:event_metodosDivisaoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel erroPercentagemNegativa;
    private javax.swing.JLabel erroTotalPercentagens;
    private javax.swing.JLabel labelCaraterPercentagem;
    private javax.swing.JLabel labelComoDividir;
    private javax.swing.JLabel labelDataPagamento;
    private javax.swing.JLabel labelErroMetodoIgual;
    private javax.swing.JLabel labelPercentagemTotal;
    private javax.swing.JLabel labelValorPercentagemTotal;
    private javax.swing.JComboBox<String> metodosDivisao;
    private javax.swing.JPanel painelErrosPercentagens;
    private javax.swing.JPanel painelMetodoIgual;
    private javax.swing.JPanel painelMetodoPercentagens;
    private javax.swing.JPanel painelMetodosDivisao;
    private javax.swing.JPanel painelPercentagemTotal;
    private javax.swing.JScrollPane scrollMetodoIgual;
    private javax.swing.JScrollPane scrollPercentagens;
    private com.github.lgooddatepicker.components.DatePicker selecionadorData;
    private javax.swing.JTable tabelaMetodoIgual;
    private javax.swing.JTable tabelaPercentagens;
    // End of variables declaration//GEN-END:variables
}
