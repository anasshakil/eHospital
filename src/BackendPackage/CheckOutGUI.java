package BackendPackage;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.*;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.*;

public class CheckOutGUI extends javax.swing.JFrame {

    protected static ArrayList<String> mustSaleMedName = new ArrayList<>();
    protected static ArrayList<String> mustSaleMedStrength = new ArrayList<>();
    protected static ArrayList<String> mustSaleMedBatchNo = new ArrayList<>();
    protected static ArrayList<Integer> mustSaleMedTotalCount = new ArrayList<>();
    protected static ArrayList<Integer> mustSaleMedStockLeft = new ArrayList<>();
    protected static ArrayList<Float> mustSaleMedPrice = new ArrayList<>();
    ArrayList<String> names = new ArrayList<>();
    ArrayList<String> strength = new ArrayList<>();
    ArrayList<Integer> totalMedicine = new ArrayList<>();
    ArrayList<Integer> stockLeft = new ArrayList<>();
    ArrayList<String> dayDuration = new ArrayList<>();
    ArrayList<String> daysCycle = new ArrayList<>();
    ArrayList<String> batchNo = new ArrayList<>();
    private String email, name, pcode;
    private float amount;

    public CheckOutGUI() {
        initComponents();
    }

    public CheckOutGUI(String email, String name, String pcode, float amount,
            ArrayList<String> names, ArrayList<String> strength, ArrayList<Integer> totalMedicine, ArrayList<Integer> stockLeft, ArrayList<String> batchFinal,
            ArrayList<String> dayDuration, ArrayList<String> totalDaysCycle) {
        initComponents();
        this.pack();
        try {
            BufferedImage img1 = ImageIO.read(getClass().getResource("/Icons/Hospital_3_48px.png"));
            setIconImage(img1);
        } catch (IOException e) {
        }
        getContentPane().setBackground(Color.WHITE);
        this.setSize(560, 600);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.email = email;
        this.pcode = pcode;
        this.name = name;
        this.amount = amount;
        this.names = names;
        this.strength = strength;
        this.totalMedicine = totalMedicine;
        this.stockLeft = stockLeft;
        batchNo = batchFinal;
        this.dayDuration = dayDuration;
        this.daysCycle = daysCycle;
        lblAccName.setText(name);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtboxShippingAddress = new javax.swing.JTextField();
        txtboxBillingAddress = new javax.swing.JTextField();
        AccPictureLbl = new javax.swing.JLabel();
        lblAccName = new javax.swing.JLabel();
        sameAddressCheckbox = new javax.swing.JCheckBox();
        btnPlaceOrder = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Check out");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        txtboxShippingAddress.setFont(new java.awt.Font("Segoe UI Light", 0, 15)); // NOI18N
        txtboxShippingAddress.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtboxShippingAddress.setText("Enter Shipping Address");
        txtboxShippingAddress.setToolTipText("");
        txtboxShippingAddress.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        txtboxShippingAddress.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtboxShippingAddressFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtboxShippingAddressFocusLost(evt);
            }
        });

        txtboxBillingAddress.setFont(new java.awt.Font("Segoe UI Light", 0, 15)); // NOI18N
        txtboxBillingAddress.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtboxBillingAddress.setText("Enter Billing Address");
        txtboxBillingAddress.setToolTipText("");
        txtboxBillingAddress.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        txtboxBillingAddress.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtboxBillingAddressFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtboxBillingAddressFocusLost(evt);
            }
        });

        AccPictureLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/User_50px.png"))); // NOI18N

        lblAccName.setFont(new java.awt.Font("Segoe UI Light", 0, 17)); // NOI18N
        lblAccName.setText("jLabel2");

        sameAddressCheckbox.setBackground(new java.awt.Color(255, 255, 255));
        sameAddressCheckbox.setFont(new java.awt.Font("Segoe UI Light", 0, 15)); // NOI18N
        sameAddressCheckbox.setText("Same billing address");
        sameAddressCheckbox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                sameAddressCheckboxItemStateChanged(evt);
            }
        });

        btnPlaceOrder.setBackground(new java.awt.Color(255, 255, 255));
        btnPlaceOrder.setFont(new java.awt.Font("Segoe UI Light", 0, 15)); // NOI18N
        btnPlaceOrder.setText("Place order");
        btnPlaceOrder.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btnPlaceOrder.setContentAreaFilled(false);
        btnPlaceOrder.setOpaque(true);
        btnPlaceOrder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnPlaceOrderMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnPlaceOrderMouseExited(evt);
            }
        });
        btnPlaceOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlaceOrderActionPerformed(evt);
            }
        });

        btnCancel.setBackground(new java.awt.Color(255, 255, 255));
        btnCancel.setFont(new java.awt.Font("Segoe UI Light", 0, 15)); // NOI18N
        btnCancel.setText("Cancel");
        btnCancel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btnCancel.setContentAreaFilled(false);
        btnCancel.setOpaque(true);
        btnCancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCancelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCancelMouseExited(evt);
            }
        });
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(AccPictureLbl)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sameAddressCheckbox)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtboxBillingAddress)
                        .addComponent(txtboxShippingAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblAccName))
                .addContainerGap(95, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPlaceOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AccPictureLbl)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(lblAccName)))
                .addGap(29, 29, 29)
                .addComponent(txtboxShippingAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(sameAddressCheckbox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtboxBillingAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPlaceOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtboxShippingAddressFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtboxShippingAddressFocusGained
        if (txtboxShippingAddress.getText().equals("Enter Shipping Address")) {
            txtboxShippingAddress.setText("");
        }
    }//GEN-LAST:event_txtboxShippingAddressFocusGained

    private void txtboxShippingAddressFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtboxShippingAddressFocusLost
        if (txtboxShippingAddress.getText().equals("")) {
            txtboxShippingAddress.setText("Enter Shipping Address");
        }
    }//GEN-LAST:event_txtboxShippingAddressFocusLost

    private void txtboxBillingAddressFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtboxBillingAddressFocusGained
        if (txtboxBillingAddress.getText().equals("Enter Billing Address")) {
            txtboxBillingAddress.setText("");
        }
    }//GEN-LAST:event_txtboxBillingAddressFocusGained

    private void txtboxBillingAddressFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtboxBillingAddressFocusLost
        if (txtboxBillingAddress.getText().equals("")) {
            txtboxBillingAddress.setText("Enter Billing Address");
        }
    }//GEN-LAST:event_txtboxBillingAddressFocusLost

    private void sameAddressCheckboxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_sameAddressCheckboxItemStateChanged
        if (sameAddressCheckbox.isSelected()) {
            txtboxBillingAddress.setEnabled(false);
            txtboxBillingAddress.setText(txtboxShippingAddress.getText());
        } else {
            txtboxBillingAddress.setEnabled(true);
            txtboxBillingAddress.setText("Enter Billing Address");
        }
    }//GEN-LAST:event_sameAddressCheckboxItemStateChanged

    private void btnPlaceOrderMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPlaceOrderMouseEntered
        mouseFocusGained(btnPlaceOrder);
    }//GEN-LAST:event_btnPlaceOrderMouseEntered

    private void btnPlaceOrderMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPlaceOrderMouseExited
        mouseFocusLost(btnPlaceOrder);
    }//GEN-LAST:event_btnPlaceOrderMouseExited

    private void btnPlaceOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlaceOrderActionPerformed
        if (!txtboxBillingAddress.getText().equals("Enter Billing Address") && !txtboxBillingAddress.getText().equals("\\s+")
                && !txtboxBillingAddress.getText().equals("") && !txtboxShippingAddress.getText().equals("Enter Shipping Address")
                && !txtboxShippingAddress.getText().equals("\\s+") && !txtboxShippingAddress.getText().equals("")) {
            float tempAm = 0f;
            for (int i = 0; i < mustSaleMedName.size(); i++) {
                tempAm += (float) mustSaleMedTotalCount.get(i) * mustSaleMedPrice.get(i);
            }
            boolean status = new DatabaseClass(this).checkOut(email, pcode, txtboxBillingAddress.getText(), txtboxShippingAddress.getText(), amount);
            if (!status) {
                JOptionPane.showMessageDialog(this, "Some error occurred while placing your order", "Error 101", JOptionPane.ERROR_MESSAGE);
            } else {
                Pharmacy_GUI.staticObject.btnCheckout.setEnabled(false);
                new DatabaseClass(this).stockDecrementDueToPurchases(names, strength, totalMedicine, stockLeft, batchNo);
                int count = 0;
                for (int i = 0; i < names.size(); i++) {
                    for (int j = 0; j < mustSaleMedName.size(); j++) {
                        if (mustSaleMedName.get(j) != null && names.get(i).equalsIgnoreCase(mustSaleMedName.get(j))
                                && strength.get(i).equalsIgnoreCase(mustSaleMedStrength.get(j))) {
                            count++;
                            int temp_ = totalMedicine.get(i) + mustSaleMedTotalCount.get(j);
                            totalMedicine.set(i, temp_);
                            mustSaleMedName.set(j, null);
                        }
                    }
                }
                if (count != 0) {
                    new DatabaseClassExtended(this).deleteMedicineDuetoStockFinished(mustSaleMedName, mustSaleMedStrength, mustSaleMedBatchNo);
                    amount += tempAm;
                }
                int optn = JOptionPane.showConfirmDialog(this, "Do you want to save offline copy of the prescription", "Save Prescription",
                        JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
                if (optn == JOptionPane.YES_OPTION) {
                    new FileStreamingClass(this).offlineSavePrescription(names, strength, dayDuration, daysCycle);
                }
                new DatabaseClassExtended(this).createPurchaseInvoice(email, name, names, strength, totalMedicine, batchNo, txtboxShippingAddress.getText(),
                        txtboxBillingAddress.getText(), amount);
                JOptionPane.showMessageDialog(this, "Your order has been placed successfully", "Order placed", JOptionPane.INFORMATION_MESSAGE);

                close();
            }
        } else {
            JOptionPane.showMessageDialog(this, "Invalid details", "User input error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnPlaceOrderActionPerformed

    private void btnCancelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelMouseEntered
        mouseFocusGained(btnCancel);
    }//GEN-LAST:event_btnCancelMouseEntered

    private void btnCancelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelMouseExited
        mouseFocusLost(btnCancel);
    }//GEN-LAST:event_btnCancelMouseExited

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        close();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        close();
    }//GEN-LAST:event_formWindowClosing

    private void mouseFocusGained(JButton btn) {
        btn.setContentAreaFilled(true);
    }

    private void mouseFocusLost(JButton btn) {
        btn.setContentAreaFilled(false);
        btn.setOpaque(true);
    }

    private void close() {
        this.dispose();
        Pharmacy_GUI.staticObject.setVisible(true);
    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CheckOutGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CheckOutGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CheckOutGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CheckOutGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CheckOutGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AccPictureLbl;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnPlaceOrder;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblAccName;
    private javax.swing.JCheckBox sameAddressCheckbox;
    private javax.swing.JTextField txtboxBillingAddress;
    private javax.swing.JTextField txtboxShippingAddress;
    // End of variables declaration//GEN-END:variables
}
