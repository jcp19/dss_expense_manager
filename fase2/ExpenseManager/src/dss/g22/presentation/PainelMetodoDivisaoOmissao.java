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
public class PainelMetodoDivisaoOmissao extends javax.swing.JPanel {

    /**
     * Creates new form PainelMetodoDivisaoOmissao
     */
    public PainelMetodoDivisaoOmissao() {
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

        selecionadorPrimeiraData = new com.github.lgooddatepicker.components.DatePicker();
        labelDivisaoPorOmissao = new javax.swing.JLabel();
        labelPrimeiraDataPagamento = new javax.swing.JLabel();
        metodosDivisaoOmissao = new javax.swing.JComboBox<>();
        painelMetodosDivisaoOmissao = new javax.swing.JPanel();
        painelMetodoIgualOmissao = new javax.swing.JPanel();
        scrollMetodoIgualOmissao = new javax.swing.JScrollPane();
        tabelaMetodoIgualOmissao = new javax.swing.JTable();
        labelErroMetodoIgualOmissao = new javax.swing.JLabel();
        painelMetodoPercentagensOmissao = new javax.swing.JPanel();
        scrollPercentagensOmissao = new javax.swing.JScrollPane();
        tabelaPercentagensOmissao = new javax.swing.JTable();
        painelErrosPercentagensOmissao = new javax.swing.JPanel();
        erroTotalPercentagensOmissao = new javax.swing.JLabel();
        erroPercentagemNegativaOmissao = new javax.swing.JLabel();
        painelPercentagemTotalOmissao = new javax.swing.JPanel();
        labelPercentagemTotalOmissao = new javax.swing.JLabel();
        labelValorPercentagemTotalOmissao = new javax.swing.JLabel();
        labelCaraterPercentagemOmissao = new javax.swing.JLabel();

        setLayout(new java.awt.GridBagLayout());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(3, 6, 0, 0);
        add(selecionadorPrimeiraData, gridBagConstraints);

        labelDivisaoPorOmissao.setText("Por omissão, como deve ser dividido o valor da cada fatura?");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 0, 0);
        add(labelDivisaoPorOmissao, gridBagConstraints);

        labelPrimeiraDataPagamento.setText("Data da próxima fatura:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 0, 0);
        add(labelPrimeiraDataPagamento, gridBagConstraints);

        metodosDivisaoOmissao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Igualmente", "Por percentagens" }));
        metodosDivisaoOmissao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                metodosDivisaoOmissaoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(3, 1, 0, 0);
        add(metodosDivisaoOmissao, gridBagConstraints);

        painelMetodosDivisaoOmissao.setLayout(new java.awt.CardLayout());

        painelMetodoIgualOmissao.setLayout(new java.awt.GridBagLayout());

        scrollMetodoIgualOmissao.setPreferredSize(new java.awt.Dimension(382, 10));

        tabelaMetodoIgualOmissao.setModel(new javax.swing.table.DefaultTableModel(
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
        tabelaMetodoIgualOmissao.setColumnSelectionAllowed(true);
        tabelaMetodoIgualOmissao.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        scrollMetodoIgualOmissao.setViewportView(tabelaMetodoIgualOmissao);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        painelMetodoIgualOmissao.add(scrollMetodoIgualOmissao, gridBagConstraints);

        labelErroMetodoIgualOmissao.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        labelErroMetodoIgualOmissao.setForeground(new java.awt.Color(255, 0, 0));
        labelErroMetodoIgualOmissao.setText("Deve selecionar pelo menos um morador.");
        labelErroMetodoIgualOmissao.setVisible(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        painelMetodoIgualOmissao.add(labelErroMetodoIgualOmissao, gridBagConstraints);

        painelMetodosDivisaoOmissao.add(painelMetodoIgualOmissao, "painelMetodoIgual");

        painelMetodoPercentagensOmissao.setLayout(new java.awt.GridBagLayout());

        scrollPercentagensOmissao.setPreferredSize(new java.awt.Dimension(382, 100));

        tabelaPercentagensOmissao.setModel(new javax.swing.table.DefaultTableModel(
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
        tabelaPercentagensOmissao.setColumnSelectionAllowed(true);
        tabelaPercentagensOmissao.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        scrollPercentagensOmissao.setViewportView(tabelaPercentagensOmissao);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        painelMetodoPercentagensOmissao.add(scrollPercentagensOmissao, gridBagConstraints);

        painelErrosPercentagensOmissao.setLayout(new javax.swing.OverlayLayout(painelErrosPercentagensOmissao));

        erroTotalPercentagensOmissao.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        erroTotalPercentagensOmissao.setForeground(new java.awt.Color(255, 0, 0));
        erroTotalPercentagensOmissao.setText("O total tem de ser 100%.");
        erroTotalPercentagensOmissao.setVisible(false);
        painelErrosPercentagensOmissao.add(erroTotalPercentagensOmissao);

        erroPercentagemNegativaOmissao.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        erroPercentagemNegativaOmissao.setForeground(new java.awt.Color(255, 0, 0));
        erroPercentagemNegativaOmissao.setText("As percentagens devem ser não negativas.");
        erroPercentagemNegativaOmissao.setVisible(false);
        painelErrosPercentagensOmissao.add(erroPercentagemNegativaOmissao);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        painelMetodoPercentagensOmissao.add(painelErrosPercentagensOmissao, gridBagConstraints);

        painelPercentagemTotalOmissao.setLayout(new java.awt.GridBagLayout());

        labelPercentagemTotalOmissao.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        labelPercentagemTotalOmissao.setText("Total: ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        painelPercentagemTotalOmissao.add(labelPercentagemTotalOmissao, gridBagConstraints);

        labelValorPercentagemTotalOmissao.setText("0.00");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        painelPercentagemTotalOmissao.add(labelValorPercentagemTotalOmissao, gridBagConstraints);

        labelCaraterPercentagemOmissao.setText("%");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        painelPercentagemTotalOmissao.add(labelCaraterPercentagemOmissao, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(3, 0, 0, 0);
        painelMetodoPercentagensOmissao.add(painelPercentagemTotalOmissao, gridBagConstraints);

        painelMetodosDivisaoOmissao.add(painelMetodoPercentagensOmissao, "painelMetodoPercentagens");

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 0, 0);
        add(painelMetodosDivisaoOmissao, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void metodosDivisaoOmissaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_metodosDivisaoOmissaoActionPerformed
        String opcao = (String) metodosDivisaoOmissao.getSelectedItem();
        CardLayout cardLayout = (CardLayout) painelMetodosDivisaoOmissao.getLayout();

        switch (opcao) {
            case "Igualmente":
                cardLayout.show(painelMetodosDivisaoOmissao, "painelMetodoIgual");
                break;
            default: // por percentagens
                cardLayout.show(painelMetodosDivisaoOmissao, "painelMetodoPercentagens");
                break;
        }
    }//GEN-LAST:event_metodosDivisaoOmissaoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel erroPercentagemNegativaOmissao;
    private javax.swing.JLabel erroTotalPercentagensOmissao;
    private javax.swing.JLabel labelCaraterPercentagemOmissao;
    private javax.swing.JLabel labelDivisaoPorOmissao;
    private javax.swing.JLabel labelErroMetodoIgualOmissao;
    private javax.swing.JLabel labelPercentagemTotalOmissao;
    private javax.swing.JLabel labelPrimeiraDataPagamento;
    private javax.swing.JLabel labelValorPercentagemTotalOmissao;
    private javax.swing.JComboBox<String> metodosDivisaoOmissao;
    private javax.swing.JPanel painelErrosPercentagensOmissao;
    private javax.swing.JPanel painelMetodoIgualOmissao;
    private javax.swing.JPanel painelMetodoPercentagensOmissao;
    private javax.swing.JPanel painelMetodosDivisaoOmissao;
    private javax.swing.JPanel painelPercentagemTotalOmissao;
    private javax.swing.JScrollPane scrollMetodoIgualOmissao;
    private javax.swing.JScrollPane scrollPercentagensOmissao;
    private com.github.lgooddatepicker.components.DatePicker selecionadorPrimeiraData;
    private javax.swing.JTable tabelaMetodoIgualOmissao;
    private javax.swing.JTable tabelaPercentagensOmissao;
    // End of variables declaration//GEN-END:variables
}
