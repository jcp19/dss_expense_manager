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
public class PainelDespesas extends javax.swing.JPanel {

    /**
     * Creates new form PainelDespesas
     */
    public PainelDespesas() {
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

        scrollPainelDespesas = new javax.swing.JScrollPane();
        listaDespesas = new javax.swing.JList<>();
        painelPesquisaDespesa = new javax.swing.JPanel();
        labelTermoPesquisaDespesa = new javax.swing.JLabel();
        campoTermoPesquisaDespesa = new javax.swing.JTextField();
        labelDataInicioDespesa = new javax.swing.JLabel();
        selecionadorDataInicioDespesa = new com.github.lgooddatepicker.components.DatePicker();
        labelDataFimDespesa = new javax.swing.JLabel();
        selecionadorDataFimCC1 = new com.github.lgooddatepicker.components.DatePicker();
        butaoPesquisaDespesa = new javax.swing.JButton();

        listaDespesas.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Despesa 1", "Despesa 2", "Despesa 3", "Despesa 4", "Despesa 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        listaDespesas.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        scrollPainelDespesas.setViewportView(listaDespesas);

        painelPesquisaDespesa.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        painelPesquisaDespesa.setLayout(new java.awt.GridBagLayout());

        labelTermoPesquisaDespesa.setText("Termo de pesquisa:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 0, 0);
        painelPesquisaDespesa.add(labelTermoPesquisaDespesa, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 2, 0, 2);
        painelPesquisaDespesa.add(campoTermoPesquisaDespesa, gridBagConstraints);

        labelDataInicioDespesa.setText("Data de início:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 0, 0);
        painelPesquisaDespesa.add(labelDataInicioDespesa, gridBagConstraints);

        selecionadorDataInicioDespesa.setToolTipText("Data de início");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 0, 0);
        painelPesquisaDespesa.add(selecionadorDataInicioDespesa, gridBagConstraints);

        labelDataFimDespesa.setText("Data de fim:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 0, 0);
        painelPesquisaDespesa.add(labelDataFimDespesa, gridBagConstraints);

        selecionadorDataFimCC1.setToolTipText("Data de fim");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 0, 0);
        painelPesquisaDespesa.add(selecionadorDataFimCC1, gridBagConstraints);

        butaoPesquisaDespesa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dss/g22/presentation/images/SearchIcon.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(0, 6, 0, 0);
        painelPesquisaDespesa.add(butaoPesquisaDespesa, gridBagConstraints);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollPainelDespesas)
                    .addComponent(painelPesquisaDespesa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollPainelDespesas, javax.swing.GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelPesquisaDespesa, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton butaoPesquisaDespesa;
    private javax.swing.JTextField campoTermoPesquisaDespesa;
    private javax.swing.JLabel labelDataFimDespesa;
    private javax.swing.JLabel labelDataInicioDespesa;
    private javax.swing.JLabel labelTermoPesquisaDespesa;
    private javax.swing.JList<String> listaDespesas;
    private javax.swing.JPanel painelPesquisaDespesa;
    private javax.swing.JScrollPane scrollPainelDespesas;
    private com.github.lgooddatepicker.components.DatePicker selecionadorDataFimCC1;
    private com.github.lgooddatepicker.components.DatePicker selecionadorDataInicioDespesa;
    // End of variables declaration//GEN-END:variables
}
