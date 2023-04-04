package BackendPackage;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.*;

public class PatientEmergencyGUI extends javax.swing.JFrame {

    private String email, name;
    protected static ArrayList<Integer> priority = new ArrayList<>();
    protected static ArrayList<String> caseProfession = new ArrayList<>();
    private boolean clicked = false;

    public PatientEmergencyGUI() {
        initComponents();
    }

    public PatientEmergencyGUI(String patientEmail, String patientName) {
        initComponents();
        getEmergencyCasesList();
        this.pack();
        try {
            BufferedImage img1 = ImageIO.read(getClass().getResource("/Icons/Hospital_3_48px.png"));
            setIconImage(img1);
        } catch (IOException e) {
        }
        getContentPane().setBackground(Color.WHITE);
        setSize(536, 469);
        setTitle("Emergency");
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        email = patientEmail;
        name = patientName;
        lblAccName.setText(name);
        emergencyCasesListComboBox.getEditor().getEditorComponent().setBackground(Color.WHITE);
        getEmergencyCasesList();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        emergencyCasesListComboBox = new javax.swing.JComboBox<>();
        lblAccName = new javax.swing.JLabel();
        AccPictureLbl = new javax.swing.JLabel();
        btnConfirm = new javax.swing.JButton();
        btnConfirm1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        emergencyCasesListComboBox.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        emergencyCasesListComboBox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                emergencyCasesListComboBoxMouseClicked(evt);
            }
        });

        lblAccName.setFont(new java.awt.Font("Segoe UI Light", 0, 17)); // NOI18N
        lblAccName.setText("Account Name");

        AccPictureLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/User_50px.png"))); // NOI18N

        btnConfirm.setBackground(new java.awt.Color(255, 255, 255));
        btnConfirm.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        btnConfirm.setText("Confirm");
        btnConfirm.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btnConfirm.setContentAreaFilled(false);
        btnConfirm.setOpaque(false);
        btnConfirm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnConfirmMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnConfirmMouseExited(evt);
            }
        });
        btnConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmActionPerformed(evt);
            }
        });

        btnConfirm1.setBackground(new java.awt.Color(255, 255, 255));
        btnConfirm1.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        btnConfirm1.setText("Cancel");
        btnConfirm1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btnConfirm1.setContentAreaFilled(false);
        btnConfirm1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnConfirm1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnConfirm1MouseExited(evt);
            }
        });
        btnConfirm1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirm1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(AccPictureLbl)
                                .addGap(18, 18, 18)
                                .addComponent(lblAccName))
                            .addComponent(emergencyCasesListComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 509, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(btnConfirm1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AccPictureLbl)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(lblAccName)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(emergencyCasesListComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(115, 115, 115)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConfirm1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void emergencyCasesListComboBoxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_emergencyCasesListComboBoxMouseClicked
        clicked = true;
    }//GEN-LAST:event_emergencyCasesListComboBoxMouseClicked

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        close();
    }//GEN-LAST:event_formWindowClosing

    private void btnConfirmMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConfirmMouseEntered
        mouseFocusGained(btnConfirm);
    }//GEN-LAST:event_btnConfirmMouseEntered

    private void btnConfirmMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConfirmMouseExited
        mouseFocusLost(btnConfirm);
    }//GEN-LAST:event_btnConfirmMouseExited

    private void btnConfirm1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConfirm1MouseEntered
        mouseFocusGained(btnConfirm1);
    }//GEN-LAST:event_btnConfirm1MouseEntered

    private void btnConfirm1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConfirm1MouseExited
        mouseFocusLost(btnConfirm1);
    }//GEN-LAST:event_btnConfirm1MouseExited

    private void btnConfirm1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirm1ActionPerformed
        close();
    }//GEN-LAST:event_btnConfirm1ActionPerformed

    private void btnConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmActionPerformed
        if (clicked) {
            boolean status = new DatabaseClass(this).register_emergency(email, emergencyCasesListComboBox.getSelectedItem().toString(),
                    caseProfession.get(emergencyCasesListComboBox.getSelectedIndex()),
                    priority.get(emergencyCasesListComboBox.getSelectedIndex()));
            if (status) {
                JOptionPane.showMessageDialog(this, "Emergency case registered successfully", "EMERGENCY", JOptionPane.INFORMATION_MESSAGE);
                close();
            } else {
                JOptionPane.showMessageDialog(this, "Some errror occurred while registering emergency case", "Error 205", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Please select an emergency case", "Error at case selection", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnConfirmActionPerformed

    private void mouseFocusGained(JButton btn) {
        btn.setContentAreaFilled(true);
    }

    private void mouseFocusLost(JButton btn) {
        btn.setContentAreaFilled(false);
        btn.setOpaque(true);
    }

    private void getEmergencyCasesList() {
        try {
            emergencyCasesListComboBox.setModel(new DefaultComboBoxModel(new DatabaseClass(this).emergencyCasesList()));
        } catch (Exception e) {
        }
    }

    private void close() {
        this.dispose();
        MenuGUI.staticObject.setVisible(true);
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
            java.util.logging.Logger.getLogger(PatientEmergencyGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PatientEmergencyGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PatientEmergencyGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PatientEmergencyGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PatientEmergencyGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AccPictureLbl;
    private javax.swing.JButton btnConfirm;
    private javax.swing.JButton btnConfirm1;
    private javax.swing.JComboBox<String> emergencyCasesListComboBox;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblAccName;
    // End of variables declaration//GEN-END:variables
}
