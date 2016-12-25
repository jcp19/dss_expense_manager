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
public class Dashboard extends javax.swing.JFrame {
    
    private DialogRegistarDespesa dialogRegistarDespesa;
    private DialogGestaoContaMorador dialogGestaoContaMorador;
    private DialogPesquisarDespesa dialogPesquisarDespesa;
    private DialogRegistarTransferencia dialogRegistarTransferencia;
    
    /**
     * Creates new form DashboardV2
     */
    public Dashboard() {
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

        labelIcon = new javax.swing.JLabel();
        botaoRegistarDespesa = new javax.swing.JButton();
        botaoRegistarFatura = new javax.swing.JButton();
        botaoRegistarTransferencia = new javax.swing.JButton();
        painelTabs = new javax.swing.JTabbedPane();
        tabGeral = new dss.g22.presentation.PainelGeral();
        tabContaCorrente = new dss.g22.presentation.PainelContaCorrente();
        painelDespesas = new dss.g22.presentation.PainelDespesas();
        painelMoradores = new javax.swing.JPanel();
        labelMoradores = new javax.swing.JLabel();
        scrollListaLateralMoradores = new javax.swing.JScrollPane();
        listaLateralMoradores = new javax.swing.JList<>();
        painelMoradorAutenticado = new javax.swing.JPanel();
        botaoTerminarSessao = new javax.swing.JButton();
        imagemMoradorAutenticado = new javax.swing.JButton();
        nomeMoradorAutenticado = new javax.swing.JLabel();
        labelSaldo = new javax.swing.JLabel();
        labelValorSaldo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Dashboard");
        setMinimumSize(new java.awt.Dimension(980, 565));
        setPreferredSize(new java.awt.Dimension(980, 565));
        getContentPane().setLayout(new java.awt.GridBagLayout());

        labelIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dss/g22/presentation/images/ExpenseManagerLogo.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.insets = new java.awt.Insets(3, 6, 2, 0);
        getContentPane().add(labelIcon, gridBagConstraints);

        botaoRegistarDespesa.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        botaoRegistarDespesa.setText("Registar despesa");
        botaoRegistarDespesa.setPreferredSize(new java.awt.Dimension(170, 60));
        botaoRegistarDespesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoRegistarDespesaActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(15, 5, 0, 0);
        getContentPane().add(botaoRegistarDespesa, gridBagConstraints);

        botaoRegistarFatura.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        botaoRegistarFatura.setText("Registar fatura");
        botaoRegistarFatura.setPreferredSize(new java.awt.Dimension(170, 60));
        botaoRegistarFatura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoRegistarFaturaActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 0, 0);
        getContentPane().add(botaoRegistarFatura, gridBagConstraints);

        botaoRegistarTransferencia.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        botaoRegistarTransferencia.setText("<html><center> Registar transferência<br>entre moradores</center></html>");
        botaoRegistarTransferencia.setPreferredSize(new java.awt.Dimension(170, 60));
        botaoRegistarTransferencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoRegistarTransferenciaActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 0, 0);
        getContentPane().add(botaoRegistarTransferencia, gridBagConstraints);

        painelTabs.setPreferredSize(new java.awt.Dimension(500, 460));
        painelTabs.addTab("Geral", tabGeral);
        painelTabs.addTab("Conta corrente", tabContaCorrente);
        painelTabs.addTab("Despesas", painelDespesas);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        getContentPane().add(painelTabs, gridBagConstraints);

        painelMoradores.setPreferredSize(new java.awt.Dimension(200, 400));

        labelMoradores.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        labelMoradores.setText("Moradores:");

        listaLateralMoradores.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "<html><b>Morador 1<br>Saldo: 1000</b></html>", "<html><b>Morador 2<br>Saldo: 2000</b></html>", " " };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        listaLateralMoradores.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        scrollListaLateralMoradores.setViewportView(listaLateralMoradores);

        javax.swing.GroupLayout painelMoradoresLayout = new javax.swing.GroupLayout(painelMoradores);
        painelMoradores.setLayout(painelMoradoresLayout);
        painelMoradoresLayout.setHorizontalGroup(
            painelMoradoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelMoradoresLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelMoradoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(scrollListaLateralMoradores)
                    .addComponent(labelMoradores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        painelMoradoresLayout.setVerticalGroup(
            painelMoradoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelMoradoresLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelMoradores)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollListaLateralMoradores, javax.swing.GroupLayout.DEFAULT_SIZE, 422, Short.MAX_VALUE)
                .addContainerGap())
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 4, 0);
        getContentPane().add(painelMoradores, gridBagConstraints);

        painelMoradorAutenticado.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        painelMoradorAutenticado.setPreferredSize(new java.awt.Dimension(215, 105));

        botaoTerminarSessao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dss/g22/presentation/images/LogoutIcon.png"))); // NOI18N
        botaoTerminarSessao.setToolTipText("Terminar sessão");
        botaoTerminarSessao.setBorder(null);
        botaoTerminarSessao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoTerminarSessao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoTerminarSessaoActionPerformed(evt);
            }
        });

        imagemMoradorAutenticado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dss/g22/presentation/images/NoImageSmall.jpeg"))); // NOI18N
        imagemMoradorAutenticado.setToolTipText("Clique aqui para aceder à gestão da sua conta de morador");
        imagemMoradorAutenticado.setBorder(null);
        imagemMoradorAutenticado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        imagemMoradorAutenticado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imagemMoradorAutenticadoActionPerformed(evt);
            }
        });

        nomeMoradorAutenticado.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        nomeMoradorAutenticado.setText("João Luís Martins");
        nomeMoradorAutenticado.setMaximumSize(new java.awt.Dimension(140, 16));
        nomeMoradorAutenticado.setPreferredSize(new java.awt.Dimension(140, 16));

        labelSaldo.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        labelSaldo.setText("Saldo:");

        labelValorSaldo.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        labelValorSaldo.setText("1000");
        labelValorSaldo.setMaximumSize(new java.awt.Dimension(97, 15));

        javax.swing.GroupLayout painelMoradorAutenticadoLayout = new javax.swing.GroupLayout(painelMoradorAutenticado);
        painelMoradorAutenticado.setLayout(painelMoradorAutenticadoLayout);
        painelMoradorAutenticadoLayout.setHorizontalGroup(
            painelMoradorAutenticadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelMoradorAutenticadoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelMoradorAutenticadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(botaoTerminarSessao)
                    .addGroup(painelMoradorAutenticadoLayout.createSequentialGroup()
                        .addComponent(imagemMoradorAutenticado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(painelMoradorAutenticadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(painelMoradorAutenticadoLayout.createSequentialGroup()
                                .addComponent(labelSaldo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelValorSaldo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(nomeMoradorAutenticado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(83, 83, 83))
        );
        painelMoradorAutenticadoLayout.setVerticalGroup(
            painelMoradorAutenticadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelMoradorAutenticadoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelMoradorAutenticadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(imagemMoradorAutenticado, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelMoradorAutenticadoLayout.createSequentialGroup()
                        .addComponent(nomeMoradorAutenticado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(painelMoradorAutenticadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelSaldo)
                            .addComponent(labelValorSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(botaoTerminarSessao)
                .addContainerGap())
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.PAGE_END;
        gridBagConstraints.insets = new java.awt.Insets(1, 8, 11, 0);
        getContentPane().add(painelMoradorAutenticado, gridBagConstraints);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botaoRegistarFaturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoRegistarFaturaActionPerformed
        dialogPesquisarDespesa = new DialogPesquisarDespesa(this, true);
        dialogPesquisarDespesa.setLocationRelativeTo(this);
        dialogPesquisarDespesa.setVisible(true);
    }//GEN-LAST:event_botaoRegistarFaturaActionPerformed

    private void botaoRegistarDespesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoRegistarDespesaActionPerformed
        dialogRegistarDespesa = new DialogRegistarDespesa(this, true);   
        dialogRegistarDespesa.setLocationRelativeTo(this);
        dialogRegistarDespesa.setVisible(true);
    }//GEN-LAST:event_botaoRegistarDespesaActionPerformed

    private void imagemMoradorAutenticadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imagemMoradorAutenticadoActionPerformed
        dialogGestaoContaMorador = new DialogGestaoContaMorador(this, true);
        dialogGestaoContaMorador.setLocationRelativeTo(null);
        dialogGestaoContaMorador.setVisible(true);
    }//GEN-LAST:event_imagemMoradorAutenticadoActionPerformed

    private void botaoRegistarTransferenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoRegistarTransferenciaActionPerformed
        dialogRegistarTransferencia = new DialogRegistarTransferencia(this, true);
        dialogRegistarTransferencia.setLocationRelativeTo(this);
        dialogRegistarTransferencia.setVisible(true);
    }//GEN-LAST:event_botaoRegistarTransferenciaActionPerformed

    private void botaoTerminarSessaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoTerminarSessaoActionPerformed
        dispose();
        new Login().setVisible(true);
    }//GEN-LAST:event_botaoTerminarSessaoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoRegistarDespesa;
    private javax.swing.JButton botaoRegistarFatura;
    private javax.swing.JButton botaoRegistarTransferencia;
    private javax.swing.JButton botaoTerminarSessao;
    private javax.swing.JButton imagemMoradorAutenticado;
    private javax.swing.JLabel labelIcon;
    private javax.swing.JLabel labelMoradores;
    private javax.swing.JLabel labelSaldo;
    private javax.swing.JLabel labelValorSaldo;
    private javax.swing.JList<String> listaLateralMoradores;
    private javax.swing.JLabel nomeMoradorAutenticado;
    private dss.g22.presentation.PainelDespesas painelDespesas;
    private javax.swing.JPanel painelMoradorAutenticado;
    private javax.swing.JPanel painelMoradores;
    private javax.swing.JTabbedPane painelTabs;
    private javax.swing.JScrollPane scrollListaLateralMoradores;
    private dss.g22.presentation.PainelContaCorrente tabContaCorrente;
    private dss.g22.presentation.PainelGeral tabGeral;
    // End of variables declaration//GEN-END:variables
}