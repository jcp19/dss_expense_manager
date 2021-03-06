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
public class PainelFatura extends javax.swing.JPanel {

    /**
     * Creates new form PainelFatura
     */
    public PainelFatura() {
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

        painelDadosFatura = new javax.swing.JPanel();
        labelDataPagamento = new javax.swing.JLabel();
        selecionadorData = new com.github.lgooddatepicker.components.DatePicker();
        labelErroSemDataPagamento = new javax.swing.JLabel();
        labelQuantoPagouCada = new javax.swing.JLabel();
        painelComoFoiPago = new javax.swing.JPanel();
        scrollComoFoiPago = new javax.swing.JScrollPane();
        tabelaComoFoiPago = new javax.swing.JTable();
        painelTotalPago = new javax.swing.JPanel();
        labelTotalPago = new javax.swing.JLabel();
        labelResultadoTotalPago = new javax.swing.JLabel();
        painelErrosTotalPago = new javax.swing.JPanel();
        erroMontanteNegativo = new javax.swing.JLabel();
        erroTotalNulo = new javax.swing.JLabel();
        labelComoDividir = new javax.swing.JLabel();
        metodosDivisao = new javax.swing.JComboBox<>();
        painelMetodosDivisao = new javax.swing.JPanel();
        painelMetodoIgual = new javax.swing.JPanel();
        scrollMetodoIgual = new javax.swing.JScrollPane();
        tabelaMetodoIgual = new javax.swing.JTable();
        labelErroMetodoIgual = new javax.swing.JLabel();
        painelMetodoDesigual = new javax.swing.JPanel();
        scrollMetodoDesigual = new javax.swing.JScrollPane();
        tabelaMetodoDesigual = new javax.swing.JTable();
        painelTotalMetodoDesigual = new javax.swing.JPanel();
        labelTotalPagar = new javax.swing.JLabel();
        labelResultadoTotalPagar = new javax.swing.JLabel();
        painelErrosMetodoDesigual = new javax.swing.JPanel();
        erroMontanteNaoNegativo = new javax.swing.JLabel();
        erroTotaisDiferem = new javax.swing.JLabel();
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

        setLayout(new java.awt.GridBagLayout());

        painelDadosFatura.setLayout(new java.awt.GridBagLayout());

        labelDataPagamento.setText("Data do pagamento:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 0, 0);
        painelDadosFatura.add(labelDataPagamento, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(3, 10, 0, 0);
        painelDadosFatura.add(selecionadorData, gridBagConstraints);

        labelErroSemDataPagamento.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        labelErroSemDataPagamento.setForeground(new java.awt.Color(255, 0, 0));
        labelErroSemDataPagamento.setText("Indique a data do pagamento.");
        labelErroSemDataPagamento.setVisible(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(2, 10, 0, 0);
        painelDadosFatura.add(labelErroSemDataPagamento, gridBagConstraints);

        labelQuantoPagouCada.setText("Montante pago por cada morador:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(6, 10, 0, 0);
        painelDadosFatura.add(labelQuantoPagouCada, gridBagConstraints);

        painelComoFoiPago.setLayout(new java.awt.GridBagLayout());

        scrollComoFoiPago.setPreferredSize(new java.awt.Dimension(382, 108));

        tabelaComoFoiPago.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Morador", "Montante pago"
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
        tabelaComoFoiPago.setColumnSelectionAllowed(true);
        tabelaComoFoiPago.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tabelaComoFoiPago.setShowGrid(false);
        scrollComoFoiPago.setViewportView(tabelaComoFoiPago);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        painelComoFoiPago.add(scrollComoFoiPago, gridBagConstraints);

        painelTotalPago.setLayout(new java.awt.GridBagLayout());

        labelTotalPago.setText("Total: ");
        labelTotalPago.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        painelTotalPago.add(labelTotalPago, gridBagConstraints);

        labelResultadoTotalPago.setText("0.00");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        painelTotalPago.add(labelResultadoTotalPago, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(2, 0, 0, 0);
        painelComoFoiPago.add(painelTotalPago, gridBagConstraints);

        painelErrosTotalPago.setLayout(new javax.swing.OverlayLayout(painelErrosTotalPago));

        erroMontanteNegativo.setText("Os montantes pagos têm de ser não negativos.");
        erroMontanteNegativo.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        erroMontanteNegativo.setForeground(new java.awt.Color(255, 0, 0));
        erroMontanteNegativo.setVisible(false);
        painelErrosTotalPago.add(erroMontanteNegativo);

        erroTotalNulo.setText("O montante total não pode ser zero.");
        erroTotalNulo.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        erroTotalNulo.setForeground(new java.awt.Color(255, 0, 0));
        erroTotalNulo.setVisible(false);
        painelErrosTotalPago.add(erroTotalNulo);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(2, 0, 0, 0);
        painelComoFoiPago.add(painelErrosTotalPago, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.insets = new java.awt.Insets(3, 10, 0, 10);
        painelDadosFatura.add(painelComoFoiPago, gridBagConstraints);

        labelComoDividir.setText("Metodo de divisao do valor pago:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(6, 10, 0, 0);
        painelDadosFatura.add(labelComoDividir, gridBagConstraints);

        metodosDivisao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Igualmente", "Desigualmente", "Por percentagens" }));
        metodosDivisao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                metodosDivisaoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(3, 5, 0, 0);
        painelDadosFatura.add(metodosDivisao, gridBagConstraints);

        painelMetodosDivisao.setLayout(new java.awt.CardLayout());

        painelMetodoIgual.setLayout(new java.awt.GridBagLayout());

        scrollMetodoIgual.setPreferredSize(new java.awt.Dimension(382, 100));

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

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        painelMetodoIgual.add(scrollMetodoIgual, gridBagConstraints);

        labelErroMetodoIgual.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        labelErroMetodoIgual.setForeground(new java.awt.Color(255, 0, 0));
        labelErroMetodoIgual.setText("Deve selecionar pelo menos um morador.");
        labelErroMetodoIgual.setVisible(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(2, 0, 0, 0);
        painelMetodoIgual.add(labelErroMetodoIgual, gridBagConstraints);

        painelMetodosDivisao.add(painelMetodoIgual, "painelMetodoIgual");

        painelMetodoDesigual.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        painelMetodoDesigual.setLayout(new java.awt.GridBagLayout());

        scrollMetodoDesigual.setPreferredSize(new java.awt.Dimension(382, 100));

        tabelaMetodoDesigual.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Morador", "Montante a pagar"
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
        tabelaMetodoDesigual.setColumnSelectionAllowed(true);
        tabelaMetodoDesigual.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        scrollMetodoDesigual.setViewportView(tabelaMetodoDesigual);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        painelMetodoDesigual.add(scrollMetodoDesigual, gridBagConstraints);

        painelTotalMetodoDesigual.setLayout(new java.awt.GridBagLayout());

        labelTotalPagar.setText("Total: ");
        labelTotalPagar.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        painelTotalMetodoDesigual.add(labelTotalPagar, gridBagConstraints);

        labelResultadoTotalPagar.setText("0.00");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        painelTotalMetodoDesigual.add(labelResultadoTotalPagar, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(2, 0, 0, 0);
        painelMetodoDesigual.add(painelTotalMetodoDesigual, gridBagConstraints);

        painelErrosMetodoDesigual.setLayout(new javax.swing.OverlayLayout(painelErrosMetodoDesigual));

        erroMontanteNaoNegativo.setText("Os montantes pagos têm de ser não negativos.");
        erroMontanteNaoNegativo.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        erroMontanteNaoNegativo.setForeground(new java.awt.Color(255, 0, 0));
        erroMontanteNaoNegativo.setVisible(false);
        painelErrosMetodoDesigual.add(erroMontanteNaoNegativo);

        erroTotaisDiferem.setText("O total a pagar difere do total pago.");
        erroTotaisDiferem.setForeground(new java.awt.Color(255, 0, 0));
        erroTotaisDiferem.setVisible(false);
        painelErrosMetodoDesigual.add(erroTotaisDiferem);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(2, 0, 0, 0);
        painelMetodoDesigual.add(painelErrosMetodoDesigual, gridBagConstraints);

        painelMetodosDivisao.add(painelMetodoDesigual, "painelMetodoDesigual");

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

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        painelMetodoPercentagens.add(scrollPercentagens, gridBagConstraints);

        painelErrosPercentagens.setLayout(new javax.swing.OverlayLayout(painelErrosPercentagens));

        erroTotalPercentagens.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        erroTotalPercentagens.setForeground(new java.awt.Color(255, 0, 0));
        erroTotalPercentagens.setText("O total tem de ser 100%.");
        erroTotalPercentagens.setVisible(false);
        painelErrosPercentagens.add(erroTotalPercentagens);

        erroPercentagemNegativa.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        erroPercentagemNegativa.setForeground(new java.awt.Color(255, 0, 0));
        erroPercentagemNegativa.setText("As percentagens devem ser não negativas.");
        erroPercentagemNegativa.setVisible(false);
        painelErrosPercentagens.add(erroPercentagemNegativa);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(2, 0, 0, 0);
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
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(3, 0, 0, 0);
        painelMetodoPercentagens.add(painelPercentagemTotal, gridBagConstraints);

        painelMetodosDivisao.add(painelMetodoPercentagens, "painelMetodoPercentagens");

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.insets = new java.awt.Insets(6, 10, 0, 10);
        painelDadosFatura.add(painelMetodosDivisao, gridBagConstraints);

        add(painelDadosFatura, new java.awt.GridBagConstraints());
    }// </editor-fold>//GEN-END:initComponents

    private void metodosDivisaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_metodosDivisaoActionPerformed
        String opcao = (String) metodosDivisao.getSelectedItem();
        CardLayout cardLayout = (CardLayout) painelMetodosDivisao.getLayout();

        switch (opcao) {
            case "Igualmente":
                cardLayout.show(painelMetodosDivisao, "painelMetodoIgual");
                break;
            case "Desigualmente":
                cardLayout.show(painelMetodosDivisao, "painelMetodoDesigual");
                break;
            default: // por percentagens
                cardLayout.show(painelMetodosDivisao, "painelMetodoPercentagens");
                break;
        }
    }//GEN-LAST:event_metodosDivisaoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel erroMontanteNaoNegativo;
    private javax.swing.JLabel erroMontanteNegativo;
    private javax.swing.JLabel erroPercentagemNegativa;
    private javax.swing.JLabel erroTotaisDiferem;
    private javax.swing.JLabel erroTotalNulo;
    private javax.swing.JLabel erroTotalPercentagens;
    private javax.swing.JLabel labelCaraterPercentagem;
    private javax.swing.JLabel labelComoDividir;
    private javax.swing.JLabel labelDataPagamento;
    private javax.swing.JLabel labelErroMetodoIgual;
    private javax.swing.JLabel labelErroSemDataPagamento;
    private javax.swing.JLabel labelPercentagemTotal;
    private javax.swing.JLabel labelQuantoPagouCada;
    private javax.swing.JLabel labelResultadoTotalPagar;
    private javax.swing.JLabel labelResultadoTotalPago;
    private javax.swing.JLabel labelTotalPagar;
    private javax.swing.JLabel labelTotalPago;
    private javax.swing.JLabel labelValorPercentagemTotal;
    private javax.swing.JComboBox<String> metodosDivisao;
    private javax.swing.JPanel painelComoFoiPago;
    private javax.swing.JPanel painelDadosFatura;
    private javax.swing.JPanel painelErrosMetodoDesigual;
    private javax.swing.JPanel painelErrosPercentagens;
    private javax.swing.JPanel painelErrosTotalPago;
    private javax.swing.JPanel painelMetodoDesigual;
    private javax.swing.JPanel painelMetodoIgual;
    private javax.swing.JPanel painelMetodoPercentagens;
    private javax.swing.JPanel painelMetodosDivisao;
    private javax.swing.JPanel painelPercentagemTotal;
    private javax.swing.JPanel painelTotalMetodoDesigual;
    private javax.swing.JPanel painelTotalPago;
    private javax.swing.JScrollPane scrollComoFoiPago;
    private javax.swing.JScrollPane scrollMetodoDesigual;
    private javax.swing.JScrollPane scrollMetodoIgual;
    private javax.swing.JScrollPane scrollPercentagens;
    private com.github.lgooddatepicker.components.DatePicker selecionadorData;
    private javax.swing.JTable tabelaComoFoiPago;
    private javax.swing.JTable tabelaMetodoDesigual;
    private javax.swing.JTable tabelaMetodoIgual;
    private javax.swing.JTable tabelaPercentagens;
    // End of variables declaration//GEN-END:variables
}
