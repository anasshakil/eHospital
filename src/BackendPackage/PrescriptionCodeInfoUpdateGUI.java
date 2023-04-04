package BackendPackage;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class PrescriptionCodeInfoUpdateGUI extends javax.swing.JFrame {

    private String email, name, pcode;
    public static PrescriptionCodeInfoUpdateGUI staticObject;
    public static int[] validStatus = new int[2];
    public static int[] reusableStatus = new int[2];

    public PrescriptionCodeInfoUpdateGUI() {
        initComponents();
    }

    public PrescriptionCodeInfoUpdateGUI(String email, String name, String pcode) {
        initComponents();
        this.pack();
        try {
            BufferedImage img1 = ImageIO.read(getClass().getResource("/Icons/Hospital_3_48px.png"));
            setIconImage(img1);
        } catch (IOException e) {
        }
        getContentPane().setBackground(Color.WHITE);
        //this.setSize(560, 600);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.email = email;
        this.pcode = pcode;
        this.name = name;
        lblAccName.setText(name);
        this.email = email;
        this.pcode = pcode;
        txtboxPrescriptionCode.setText(this.pcode);
        lblAccName.requestFocus();
        searchMethod();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        AccPictureLbl = new javax.swing.JLabel();
        lblAccName = new javax.swing.JLabel();
        lblPatientName = new javax.swing.JLabel();
        lblIssuingTo = new javax.swing.JLabel();
        txtboxPrescriptionCode = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        lblHelpInfoBtn = new javax.swing.JLabel();
        validCheckBox = new javax.swing.JCheckBox();
        reusableCheckbox = new javax.swing.JCheckBox();
        btnUpdate = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Prescription Update");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        AccPictureLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/User_50px.png"))); // NOI18N

        lblAccName.setFont(new java.awt.Font("Segoe UI Light", 0, 17)); // NOI18N
        lblAccName.setText("Account Name");

        lblPatientName.setFont(new java.awt.Font("Segoe UI Light", 0, 17)); // NOI18N
        lblPatientName.setText("No patient specified...");

        lblIssuingTo.setFont(new java.awt.Font("Segoe UI Light", 0, 17)); // NOI18N
        lblIssuingTo.setText("Prescription's Patient name:");

        txtboxPrescriptionCode.setFont(new java.awt.Font("Segoe UI Light", 0, 15)); // NOI18N
        txtboxPrescriptionCode.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtboxPrescriptionCode.setText("Enter Prescription code");
        txtboxPrescriptionCode.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        txtboxPrescriptionCode.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtboxPrescriptionCodeFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtboxPrescriptionCodeFocusLost(evt);
            }
        });

        btnSearch.setBackground(new java.awt.Color(255, 255, 255));
        btnSearch.setFont(new java.awt.Font("Segoe UI Light", 0, 15)); // NOI18N
        btnSearch.setText("Search");
        btnSearch.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btnSearch.setContentAreaFilled(false);
        btnSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSearchMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSearchMouseExited(evt);
            }
        });
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        lblHelpInfoBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Info_32px.png"))); // NOI18N
        lblHelpInfoBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblHelpInfoBtnMouseClicked(evt);
            }
        });

        validCheckBox.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        validCheckBox.setText("Valid");
        validCheckBox.setEnabled(false);
        validCheckBox.setNextFocusableComponent(reusableCheckbox);
        validCheckBox.setOpaque(false);
        validCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                validCheckBoxActionPerformed(evt);
            }
        });

        reusableCheckbox.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        reusableCheckbox.setText("Reusable");
        reusableCheckbox.setEnabled(false);
        reusableCheckbox.setNextFocusableComponent(btnUpdate);
        reusableCheckbox.setOpaque(false);
        reusableCheckbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reusableCheckboxActionPerformed(evt);
            }
        });

        btnUpdate.setBackground(new java.awt.Color(255, 255, 255));
        btnUpdate.setFont(new java.awt.Font("Segoe UI Light", 0, 15)); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btnUpdate.setContentAreaFilled(false);
        btnUpdate.setEnabled(false);
        btnUpdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnUpdateMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnUpdateMouseExited(evt);
            }
        });
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtboxPrescriptionCode)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblIssuingTo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblPatientName, javax.swing.GroupLayout.DEFAULT_SIZE, 331, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(AccPictureLbl)
                                .addGap(18, 18, 18)
                                .addComponent(lblAccName))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblHelpInfoBtn)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(139, 139, 139)
                                        .addComponent(validCheckBox)
                                        .addGap(27, 27, 27)
                                        .addComponent(reusableCheckbox))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(181, 181, 181)
                                        .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AccPictureLbl)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lblAccName)
                        .addGap(11, 11, 11)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtboxPrescriptionCode, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIssuingTo)
                    .addComponent(lblPatientName))
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(validCheckBox)
                    .addComponent(reusableCheckbox))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblHelpInfoBtn, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtboxPrescriptionCodeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtboxPrescriptionCodeFocusGained
        if (txtboxPrescriptionCode.getText().equals("Enter Prescription code")) {
            txtboxPrescriptionCode.setText("");
        }
    }//GEN-LAST:event_txtboxPrescriptionCodeFocusGained

    private void txtboxPrescriptionCodeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtboxPrescriptionCodeFocusLost
        if (txtboxPrescriptionCode.getText().equals("")) {
            txtboxPrescriptionCode.setText("Enter Prescription code");
        }
    }//GEN-LAST:event_txtboxPrescriptionCodeFocusLost

    private void btnSearchMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSearchMouseEntered
        mouseFocusGained(btnSearch);
    }//GEN-LAST:event_btnSearchMouseEntered

    private void btnSearchMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSearchMouseExited
        mouseFocusLost(btnSearch);
    }//GEN-LAST:event_btnSearchMouseExited

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        searchMethod();
    }//GEN-LAST:event_btnSearchActionPerformed

    private void lblHelpInfoBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHelpInfoBtnMouseClicked
        JOptionPane.showMessageDialog(this, "Dr." + name + " please be sure that you can not update the info\n"
                + "of expired prescription, beacuse some files of expired\n"
                + "prescription are deleted at time they were expired.", "Help info", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_lblHelpInfoBtnMouseClicked

    private void btnUpdateMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdateMouseEntered
        mouseFocusGained(btnUpdate);
    }//GEN-LAST:event_btnUpdateMouseEntered

    private void btnUpdateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdateMouseExited
        mouseFocusLost(btnUpdate);
    }//GEN-LAST:event_btnUpdateMouseExited

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        if (validStatus[0] == validStatus[1] && reusableStatus[0] == reusableStatus[1]) {
            JOptionPane.showMessageDialog(this, "Nothing to update", "no value changed", JOptionPane.ERROR_MESSAGE);
        } else {
            boolean status = (validStatus[1] == 1);
            boolean reusable = (reusableStatus[1] == 1);
            boolean response = new DatabaseClass(this).updatePrescriptionCodeInfo(email, pcode, reusable, status);
            if (response) {
                JOptionPane.showMessageDialog(this, "Changes have been done successfully", "Status", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Changes does not been done successfully", "Status", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        close();
    }//GEN-LAST:event_formWindowClosing

    private void validCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_validCheckBoxActionPerformed
        if (validCheckBox.isSelected()) {
            validStatus[1] = 1;
        } else {
            validStatus[1] = 0;
        }
    }//GEN-LAST:event_validCheckBoxActionPerformed

    private void reusableCheckboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reusableCheckboxActionPerformed
        if (reusableCheckbox.isSelected()) {
            reusableStatus[1] = 1;
        } else {
            reusableStatus[1] = 0;
        }
    }//GEN-LAST:event_reusableCheckboxActionPerformed

    private void searchMethod() {
        if (!txtboxPrescriptionCode.getText().equals("Enter Prescription code") && !txtboxPrescriptionCode.getText().equals("\\s+") && !txtboxPrescriptionCode.getText().equals("")) {
            pcode = txtboxPrescriptionCode.getText().replaceAll("\\s+", "");
            boolean status = new DatabaseClass(this).searchPrescriptionCode(email, pcode);
            if (!status) {
                if (validStatus[0] == 1) {
                    validStatus[1] = 1;
                } else {
                    validStatus[1] = 0;
                }
                btnUpdate.setEnabled(false);
                validCheckBox.setEnabled(false);
                validCheckBox.setSelected(false);
                reusableCheckbox.setEnabled(false);
                reusableCheckbox.setSelected(false);
                JOptionPane.showMessageDialog(this, "No prescription list found against this code\nor maybe this prescription has been expired", "Error 100", JOptionPane.ERROR_MESSAGE);
            } else {
                
                btnUpdate.setEnabled(true);
                validCheckBox.setEnabled(true);
                validCheckBox.setSelected(true);
                if (reusableStatus[0] == 1) {
                    reusableStatus[1] = 1;
                    reusableCheckbox.setEnabled(true);
                    reusableCheckbox.setSelected(true);
                } else {
                    reusableStatus[1] = 0;
                    reusableCheckbox.setEnabled(true);
                    reusableCheckbox.setSelected(false);
                }
            }
        }
    }

    private void close() {
        PrescriptionsHistoryGUI.staticObject.setVisible(true);
        this.dispose();
    }

    private void mouseFocusGained(JButton btn) {
        btn.setContentAreaFilled(true);
    }

    private void mouseFocusLost(JButton btn) {
        btn.setContentAreaFilled(false);
        btn.setOpaque(true);
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
            java.util.logging.Logger.getLogger(PrescriptionCodeInfoUpdateGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrescriptionCodeInfoUpdateGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrescriptionCodeInfoUpdateGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrescriptionCodeInfoUpdateGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrescriptionCodeInfoUpdateGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AccPictureLbl;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblAccName;
    private javax.swing.JLabel lblHelpInfoBtn;
    private javax.swing.JLabel lblIssuingTo;
    public static javax.swing.JLabel lblPatientName;
    private javax.swing.JCheckBox reusableCheckbox;
    private javax.swing.JTextField txtboxPrescriptionCode;
    private javax.swing.JCheckBox validCheckBox;
    // End of variables declaration//GEN-END:variables
}
