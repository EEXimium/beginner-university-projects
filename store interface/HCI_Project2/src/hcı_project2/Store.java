/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hcı_project2;

/**
 *
 * @author efe_19comp1035
 */
public class Store extends javax.swing.JFrame {

    /**
     * Creates new form Store
     */
    public Store() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        itemBox = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtCostItem = new javax.swing.JTextPane();
        jLabelTotal = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtTotal = new javax.swing.JTextPane();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        quantitySpinner = new javax.swing.JSpinner();
        JLabelBalance = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtBalance = new javax.swing.JTextPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        textArea = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("Welcome to yes store");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setText("Item number:");

        itemBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "1-basically", "2-as", "3-many", "4-items", "5-as", "6-you", "7-want" }));
        itemBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemBoxActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setText("Item quantity:");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setText("Cost/Item:");

        txtCostItem.setEditable(false);
        txtCostItem.setFocusable(false);
        jScrollPane1.setViewportView(txtCostItem);

        jLabelTotal.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabelTotal.setText("Total:");

        txtTotal.setEditable(false);
        txtTotal.setFocusable(false);
        jScrollPane2.setViewportView(txtTotal);

        jLabel6.setText("Where we say \"yes\" to everything!");

        jButton1.setText("Add to cart");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        quantitySpinner.setModel(new javax.swing.SpinnerNumberModel(1, 0, null, 1));

        JLabelBalance.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        JLabelBalance.setText("Balance Owing:");

        txtBalance.setEditable(false);
        txtBalance.setFocusable(false);
        jScrollPane3.setViewportView(txtBalance);

        textArea.setEditable(false);
        textArea.setColumns(20);
        textArea.setRows(5);
        textArea.setFocusable(false);
        jScrollPane4.setViewportView(textArea);

        jButton2.setText("Buy");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(310, 310, 310))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jButton1)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(310, 310, 310)
                                            .addComponent(jLabel4))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(itemBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(172, 172, 172)
                                            .addComponent(JLabelBalance)))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(quantitySpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelTotal)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                        .addComponent(jScrollPane2))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(109, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67))
            .addGroup(layout.createSequentialGroup()
                .addGap(236, 236, 236)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(jLabel3)))
                .addGap(18, 18, 18)
                .addComponent(quantitySpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelTotal)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JLabelBalance)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 93, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(itemBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void itemBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemBoxActionPerformed

        if (itemBox.getSelectedItem().equals("1-basically")) {
            txtCostItem.setText("50");
            txtTotal.setText(Integer.toString((int) quantitySpinner.getValue() * 50));
        }
        if (itemBox.getSelectedItem().equals("2-as")) {
            txtCostItem.setText("25");
            txtTotal.setText(Integer.toString((int) quantitySpinner.getValue() * 25));
        }
        if (itemBox.getSelectedItem().equals("3-many")) {
            txtCostItem.setText("31");
            txtTotal.setText(Integer.toString((int) quantitySpinner.getValue() * 31));
        }
        if (itemBox.getSelectedItem().equals("4-items")) {
            txtCostItem.setText("57");
            txtTotal.setText(Integer.toString((int) quantitySpinner.getValue() * 57));
        }
        if (itemBox.getSelectedItem().equals("5-as")) {
            txtCostItem.setText("99");
            txtTotal.setText(Integer.toString((int) quantitySpinner.getValue() * 99));
        }
        if (itemBox.getSelectedItem().equals("6-you")) {
            txtCostItem.setText("85");
            txtTotal.setText(Integer.toString((int) quantitySpinner.getValue() * 85));
        }
        if (itemBox.getSelectedItem().equals("7-want")) {
            txtCostItem.setText("3");
            txtTotal.setText(Integer.toString((int) quantitySpinner.getValue() * 3));
        }

    }//GEN-LAST:event_itemBoxActionPerformed
    double balanceOwing = 0;
    double total = 0;
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        if (itemBox.getSelectedItem().equals("1-basically")) {
            total = 50 * (int) quantitySpinner.getValue();
            txtTotal.setText(Double.toString(total));
            balanceOwing += total;
            textArea.setText(textArea.getText() + "\n" + quantitySpinner.getValue() + " Product: 'basically': " + Integer.toString((int) total) + " turkish liras");
        }
        if (itemBox.getSelectedItem().equals("2-as")) {
            total = 25 * (int) quantitySpinner.getValue();
            txtTotal.setText(Double.toString(total));
            balanceOwing += total;
            textArea.setText(textArea.getText() + "\n" + quantitySpinner.getValue() + " Product 'as': " + Integer.toString((int) total) + " turkish liras");
        }
        if (itemBox.getSelectedItem().equals("3-many")) {
            total = 31 * (int) quantitySpinner.getValue();
            txtTotal.setText(Double.toString(total));
            balanceOwing += total;
            textArea.setText(textArea.getText() + "\n" + quantitySpinner.getValue() + " Product: 'many': " + Integer.toString((int) total) + " turkish liras");
        }
        if (itemBox.getSelectedItem().equals("4-items")) {
            total = 57 * (int) quantitySpinner.getValue();
            txtTotal.setText(Double.toString(total));
            balanceOwing += total;
            textArea.setText(textArea.getText() + "\n" + quantitySpinner.getValue() + " Product: 'items': " + Integer.toString((int) total) + " turkish liras");
        }
        if (itemBox.getSelectedItem().equals("5-as")) {
            total = 99 * (int) quantitySpinner.getValue();
            txtTotal.setText(Double.toString(total));
            balanceOwing += total;
            textArea.setText(textArea.getText() + "\n" + quantitySpinner.getValue() + " Product: 'as': " + Integer.toString((int) total) + " turkish liras");
        }
        if (itemBox.getSelectedItem().equals("6-you")) {
            total = 85 * (int) quantitySpinner.getValue();
            txtTotal.setText(Double.toString(total));
            balanceOwing += total;
            textArea.setText(textArea.getText() + "\n" + quantitySpinner.getValue() + "Product: 'you': " + Integer.toString((int) total) + " turkish liras");
        }
        if (itemBox.getSelectedItem().equals("7-want")) {
            total = 3 * (int) quantitySpinner.getValue();
            txtTotal.setText(Double.toString(total));
            balanceOwing += total;
            textArea.setText(textArea.getText() + "\n" + quantitySpinner.getValue() + "Product: 'want': " + Integer.toString((int) total) + " turkish liras");
        }

        txtBalance.setText(Double.toString(balanceOwing));


    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        textArea.setText(textArea.getText() + " \n----------------------------------------------------------------"
                + " \nPurchase complete!\nYour total balance owing: " + Double.toString(balanceOwing) + " turkish liras" + " \n----------------------------------------------------------------");
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Store.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Store.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Store.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Store.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Store().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLabelBalance;
    private javax.swing.JComboBox<String> itemBox;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelTotal;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSpinner quantitySpinner;
    private javax.swing.JTextArea textArea;
    private javax.swing.JTextPane txtBalance;
    private javax.swing.JTextPane txtCostItem;
    private javax.swing.JTextPane txtTotal;
    // End of variables declaration//GEN-END:variables
}
