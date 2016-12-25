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
public class DialogDadosDespesa extends javax.swing.JDialog {

    /**
     * Creates new form DialogDadosDespesa
     */
    public DialogDadosDespesa(java.awt.Frame parent, boolean modal) {
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

        labelNomeDespesa = new javax.swing.JLabel();
        campoNomeDespesa = new javax.swing.JTextField();
        labelDescricaoDespesa = new javax.swing.JLabel();
        scrollDescricaoDespesa = new javax.swing.JScrollPane();
        areaTextoDescricao = new javax.swing.JTextArea();
        iconeDespesa = new javax.swing.JLabel();
        labelErroNomeObrigatorio = new javax.swing.JLabel();
        painelPeriodicidade = new javax.swing.JPanel();
        labelOcorre = new javax.swing.JLabel();
        labelPeriodicidade = new javax.swing.JLabel();
        painelAtiva = new javax.swing.JPanel();
        labelDataProximaFatura = new javax.swing.JLabel();
        dataProximaFatura = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        labelAtiva = new javax.swing.JLabel();
        checkboxAtiva = new javax.swing.JCheckBox();
        labelFaturasPagas = new javax.swing.JLabel();
        scrollFaturasPagas = new javax.swing.JScrollPane();
        listaFaturasPagas = new javax.swing.JList<>();
        botaoAdicionarFatura = new javax.swing.JButton();
        painelMetodoDivisaoOmissao = new javax.swing.JPanel();
        botaoAlterarMetodoDivisaoOmissao = new javax.swing.JButton();
        labelClique = new javax.swing.JLabel();
        labelAlterarMetodoDivisaoOmissao = new javax.swing.JLabel();
        painelBotoesEdicao = new javax.swing.JPanel();
        botaoAtivarEdicao = new javax.swing.JToggleButton();
        jButton1 = new javax.swing.JButton();
        botaoSubmeter = new javax.swing.JButton();
        botaoDesfazerAlteracoes = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        labelNomeDespesa.setText("Nome:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 6, 0, 0);
        getContentPane().add(labelNomeDespesa, gridBagConstraints);

        campoNomeDespesa.setText("Luz");
        campoNomeDespesa.setEnabled(false);
        campoNomeDespesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoNomeDespesaActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 0, 0);
        getContentPane().add(campoNomeDespesa, gridBagConstraints);

        labelDescricaoDespesa.setText("Descrição:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 0, 0);
        getContentPane().add(labelDescricaoDespesa, gridBagConstraints);

        areaTextoDescricao.setEditable(false);
        areaTextoDescricao.setColumns(15);
        areaTextoDescricao.setLineWrap(true);
        areaTextoDescricao.setRows(4);
        areaTextoDescricao.setTabSize(4);
        areaTextoDescricao.setText("Depesa da luz");
        areaTextoDescricao.setWrapStyleWord(true);
        areaTextoDescricao.setEnabled(false);
        scrollDescricaoDespesa.setViewportView(areaTextoDescricao);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(4, 6, 0, 4);
        getContentPane().add(scrollDescricaoDespesa, gridBagConstraints);

        iconeDespesa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dss/g22/presentation/images/ExpenseIcon.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 0, 0);
        getContentPane().add(iconeDespesa, gridBagConstraints);

        labelErroNomeObrigatorio.setForeground(new java.awt.Color(255, 0, 0));
        labelErroNomeObrigatorio.setText("A despesa tem de ter um nome.");
        labelErroNomeObrigatorio.setOpaque(true);
        labelErroNomeObrigatorio.setVisible(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 6, 0, 0);
        getContentPane().add(labelErroNomeObrigatorio, gridBagConstraints);

        painelPeriodicidade.setLayout(new java.awt.GridBagLayout());

        labelOcorre.setText("Ocorre: ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        painelPeriodicidade.add(labelOcorre, gridBagConstraints);

        labelPeriodicidade.setText("Semanalmente");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        painelPeriodicidade.add(labelPeriodicidade, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 0, 0);
        getContentPane().add(painelPeriodicidade, gridBagConstraints);

        painelAtiva.setLayout(new java.awt.GridBagLayout());

        labelDataProximaFatura.setText("Data da próxima fatura: ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(0, 12, 0, 0);
        painelAtiva.add(labelDataProximaFatura, gridBagConstraints);

        dataProximaFatura.setText("dd/MM/yyyy");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        painelAtiva.add(dataProximaFatura, gridBagConstraints);

        jPanel1.setLayout(new java.awt.GridBagLayout());

        labelAtiva.setText("Ativa:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        jPanel1.add(labelAtiva, gridBagConstraints);

        checkboxAtiva.setSelected(true);
        checkboxAtiva.setEnabled(false);
        checkboxAtiva.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        checkboxAtiva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkboxAtivaActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel1.add(checkboxAtiva, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        painelAtiva.add(jPanel1, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 0, 0);
        getContentPane().add(painelAtiva, gridBagConstraints);

        labelFaturasPagas.setText("Fatura(s) paga(s):");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 3, 0);
        getContentPane().add(labelFaturasPagas, gridBagConstraints);

        listaFaturasPagas.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "12/11/2016", "12/12/2016", "12/1/2017", "12/2/2017" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        listaFaturasPagas.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        listaFaturasPagas.setVisibleRowCount(4);
        scrollFaturasPagas.setViewportView(listaFaturasPagas);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 0);
        getContentPane().add(scrollFaturasPagas, gridBagConstraints);

        botaoAdicionarFatura.setText("+");
        botaoAdicionarFatura.setToolTipText("Adicionar uma fatura");
        botaoAdicionarFatura.setPreferredSize(new java.awt.Dimension(45, 29));
        botaoAdicionarFatura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAdicionarFaturaActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 2, 0, 0);
        getContentPane().add(botaoAdicionarFatura, gridBagConstraints);

        painelMetodoDivisaoOmissao.setLayout(new java.awt.GridBagLayout());

        botaoAlterarMetodoDivisaoOmissao.setText("aqui");
        botaoAlterarMetodoDivisaoOmissao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAlterarMetodoDivisaoOmissaoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        painelMetodoDivisaoOmissao.add(botaoAlterarMetodoDivisaoOmissao, gridBagConstraints);

        labelClique.setText("Clique ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        painelMetodoDivisaoOmissao.add(labelClique, gridBagConstraints);

        labelAlterarMetodoDivisaoOmissao.setText("para ver/alterar o método de divisão por omissão.");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        painelMetodoDivisaoOmissao.add(labelAlterarMetodoDivisaoOmissao, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 0, 0);
        getContentPane().add(painelMetodoDivisaoOmissao, gridBagConstraints);

        painelBotoesEdicao.setLayout(new java.awt.GridLayout(2, 2));

        botaoAtivarEdicao.setText("Ativar edição");
        painelBotoesEdicao.add(botaoAtivarEdicao);

        jButton1.setForeground(new java.awt.Color(205, 0, 0));
        jButton1.setText("Eliminar despesa");
        painelBotoesEdicao.add(jButton1);

        botaoSubmeter.setText("Submeter alterações");
        botaoSubmeter.setEnabled(false);
        painelBotoesEdicao.add(botaoSubmeter);

        botaoDesfazerAlteracoes.setText("Desfazer alterações");
        botaoDesfazerAlteracoes.setEnabled(false);
        botaoDesfazerAlteracoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoDesfazerAlteracoesActionPerformed(evt);
            }
        });
        painelBotoesEdicao.add(botaoDesfazerAlteracoes);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.insets = new java.awt.Insets(15, 0, 0, 0);
        getContentPane().add(painelBotoesEdicao, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campoNomeDespesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoNomeDespesaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoNomeDespesaActionPerformed

    private void botaoDesfazerAlteracoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoDesfazerAlteracoesActionPerformed
        dispose();
    }//GEN-LAST:event_botaoDesfazerAlteracoesActionPerformed

    private void botaoAdicionarFaturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAdicionarFaturaActionPerformed
        if(botaoAdicionarFatura.getText().equals("Associar fatura")) {
            DialogDadosFatura dialogDadosFatura = new DialogDadosFatura(this, true);

            dialogDadosFatura.setLocationRelativeTo(this);
            dialogDadosFatura.setVisible(true);
        } else {
            // COMPLETAR
        }
    }//GEN-LAST:event_botaoAdicionarFaturaActionPerformed

    private void checkboxAtivaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkboxAtivaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkboxAtivaActionPerformed

    private void botaoAlterarMetodoDivisaoOmissaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAlterarMetodoDivisaoOmissaoActionPerformed

        // TODO add your handling code here:
    }//GEN-LAST:event_botaoAlterarMetodoDivisaoOmissaoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areaTextoDescricao;
    private javax.swing.JButton botaoAdicionarFatura;
    private javax.swing.JButton botaoAlterarMetodoDivisaoOmissao;
    private javax.swing.JToggleButton botaoAtivarEdicao;
    private javax.swing.JButton botaoDesfazerAlteracoes;
    private javax.swing.JButton botaoSubmeter;
    private javax.swing.JTextField campoNomeDespesa;
    private javax.swing.JCheckBox checkboxAtiva;
    private javax.swing.JLabel dataProximaFatura;
    private javax.swing.JLabel iconeDespesa;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelAlterarMetodoDivisaoOmissao;
    private javax.swing.JLabel labelAtiva;
    private javax.swing.JLabel labelClique;
    private javax.swing.JLabel labelDataProximaFatura;
    private javax.swing.JLabel labelDescricaoDespesa;
    private javax.swing.JLabel labelErroNomeObrigatorio;
    private javax.swing.JLabel labelFaturasPagas;
    private javax.swing.JLabel labelNomeDespesa;
    private javax.swing.JLabel labelOcorre;
    private javax.swing.JLabel labelPeriodicidade;
    private javax.swing.JList<String> listaFaturasPagas;
    private javax.swing.JPanel painelAtiva;
    private javax.swing.JPanel painelBotoesEdicao;
    private javax.swing.JPanel painelMetodoDivisaoOmissao;
    private javax.swing.JPanel painelPeriodicidade;
    private javax.swing.JScrollPane scrollDescricaoDespesa;
    private javax.swing.JScrollPane scrollFaturasPagas;
    // End of variables declaration//GEN-END:variables
}