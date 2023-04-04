package BackendPackage;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;

public class ChangePasswordGUI extends javax.swing.JFrame {

    private String email, oldPass, newPass;

    public ChangePasswordGUI() {
        initComponents();
    }

    public ChangePasswordGUI(String email, String name) {
        initComponents();
        try {
            BufferedImage img1 = ImageIO.read(getClass().getResource("/Icons/Hospital_3_48px.png"));
            setIconImage(img1);
        } catch (IOException e) {
        }
        getContentPane().setBackground(Color.WHITE);
        this.setSize(578, 350);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        lblAccName.setText(name);
        lblAccName.requestFocusInWindow();
        this.email = email;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        AccPictureLbl = new javax.swing.JLabel();
        lblAccName = new javax.swing.JLabel();
        btnChangePassword = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        txtboxCurrentPassword = new javax.swing.JPasswordField();
        txtboxCurrentPassword1 = new javax.swing.JPasswordField();
        txtboxCurrentPassword2 = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Change Password");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        AccPictureLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/User_50px.png"))); // NOI18N

        lblAccName.setFont(new java.awt.Font("Segoe UI Light", 0, 17)); // NOI18N
        lblAccName.setText("Account Name");

        btnChangePassword.setBackground(new java.awt.Color(255, 255, 255));
        btnChangePassword.setFont(new java.awt.Font("Segoe UI Light", 0, 15)); // NOI18N
        btnChangePassword.setText("Change password");
        btnChangePassword.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btnChangePassword.setContentAreaFilled(false);
        btnChangePassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnChangePasswordMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnChangePasswordMouseExited(evt);
            }
        });
        btnChangePassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangePasswordActionPerformed(evt);
            }
        });

        btnCancel.setBackground(new java.awt.Color(255, 255, 255));
        btnCancel.setFont(new java.awt.Font("Segoe UI Light", 0, 15)); // NOI18N
        btnCancel.setText("Cancel");
        btnCancel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btnCancel.setContentAreaFilled(false);
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

        txtboxCurrentPassword.setFont(new java.awt.Font("Segoe UI Light", 0, 17)); // NOI18N
        txtboxCurrentPassword.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtboxCurrentPassword.setText("Enter your current password"); // NOI18N
        txtboxCurrentPassword.setEchoChar((char) 0);
        txtboxCurrentPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtboxCurrentPasswordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtboxCurrentPasswordFocusLost(evt);
            }
        });

        txtboxCurrentPassword1.setFont(new java.awt.Font("Segoe UI Light", 0, 17)); // NOI18N
        txtboxCurrentPassword1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtboxCurrentPassword1.setText("Enter new password"); // NOI18N
        txtboxCurrentPassword1.setEchoChar((char) 0);
        txtboxCurrentPassword1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtboxCurrentPassword1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtboxCurrentPassword1FocusLost(evt);
            }
        });

        txtboxCurrentPassword2.setFont(new java.awt.Font("Segoe UI Light", 0, 17)); // NOI18N
        txtboxCurrentPassword2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtboxCurrentPassword2.setText("Confirm new password"); // NOI18N
        txtboxCurrentPassword2.setEchoChar((char) 0);
        txtboxCurrentPassword2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtboxCurrentPassword2FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtboxCurrentPassword2FocusLost(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnChangePassword, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(AccPictureLbl)
                        .addGap(18, 18, 18)
                        .addComponent(lblAccName))
                    .addComponent(txtboxCurrentPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtboxCurrentPassword1, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtboxCurrentPassword2, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(91, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AccPictureLbl)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lblAccName)
                        .addGap(11, 11, 11)))
                .addGap(18, 18, 18)
                .addComponent(txtboxCurrentPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtboxCurrentPassword1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtboxCurrentPassword2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnChangePassword, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnChangePasswordMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnChangePasswordMouseEntered
        mouseFocusGained(btnChangePassword);
    }//GEN-LAST:event_btnChangePasswordMouseEntered

    private void btnChangePasswordMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnChangePasswordMouseExited
        mouseFocusLost(btnChangePassword);
    }//GEN-LAST:event_btnChangePasswordMouseExited

    private void btnChangePasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangePasswordActionPerformed
        oldPass = txtboxCurrentPassword.getText();
        newPass = txtboxCurrentPassword1.getText();
        if (newPass.equals(txtboxCurrentPassword2.getText())) {
            boolean status = new DatabaseClass(this).changePassword(email, oldPass, newPass);
            if (status) {
                JOptionPane.showMessageDialog(this, "Password changed successfully\nLogging out you need to login again", "Password change", JOptionPane.INFORMATION_MESSAGE);
                MenuGUI.staticObject.dispose();
                new Login_Signup_GUI().setVisible(true);
                dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Password does not changed successfully\nSome error encountered", "Password change", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "New password does not match", "Incorrect new password", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnChangePasswordActionPerformed

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

    private void txtboxCurrentPasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtboxCurrentPasswordFocusGained
        if (txtboxCurrentPassword.getText().equals("Enter your current password")) {
            txtboxCurrentPassword.setText("");
            txtboxCurrentPassword.setEchoChar('*');
        }
    }//GEN-LAST:event_txtboxCurrentPasswordFocusGained

    private void txtboxCurrentPasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtboxCurrentPasswordFocusLost
        if (txtboxCurrentPassword.getText().equals("")) {
            txtboxCurrentPassword.setEchoChar((char) 0);
            txtboxCurrentPassword.setText("Enter your current password");
        }
    }//GEN-LAST:event_txtboxCurrentPasswordFocusLost

    private void txtboxCurrentPassword1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtboxCurrentPassword1FocusGained
        if(txtboxCurrentPassword1.getText().equals("Enter new password")){
            txtboxCurrentPassword1.setText("");
            txtboxCurrentPassword1.setEchoChar('*');
        }
    }//GEN-LAST:event_txtboxCurrentPassword1FocusGained

    private void txtboxCurrentPassword1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtboxCurrentPassword1FocusLost
        if (txtboxCurrentPassword1.getText().equals("")) {
            txtboxCurrentPassword1.setEchoChar((char) 0);
            txtboxCurrentPassword1.setText("Enter new password");
        }
    }//GEN-LAST:event_txtboxCurrentPassword1FocusLost

    private void txtboxCurrentPassword2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtboxCurrentPassword2FocusGained
        if(txtboxCurrentPassword2.getText().equals("Confirm new password")){
            txtboxCurrentPassword2.setText("");
            txtboxCurrentPassword2.setEchoChar('*');
        }
    }//GEN-LAST:event_txtboxCurrentPassword2FocusGained

    private void txtboxCurrentPassword2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtboxCurrentPassword2FocusLost
        if (txtboxCurrentPassword2.getText().equals("")) {
            txtboxCurrentPassword2.setEchoChar((char) 0);
            txtboxCurrentPassword2.setText("Confirm new password");
        }
    }//GEN-LAST:event_txtboxCurrentPassword2FocusLost

    private void mouseFocusGained(JButton btn) {
        btn.setContentAreaFilled(true);
    }

    private void mouseFocusLost(JButton btn) {
        btn.setContentAreaFilled(false);
        btn.setOpaque(true);
    }

    private void close() {
        MenuGUI.staticObject.setVisible(true);
        this.dispose();
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
            java.util.logging.Logger.getLogger(ChangePasswordGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChangePasswordGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChangePasswordGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChangePasswordGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChangePasswordGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AccPictureLbl;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnChangePassword;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblAccName;
    private javax.swing.JPasswordField txtboxCurrentPassword;
    private javax.swing.JPasswordField txtboxCurrentPassword1;
    private javax.swing.JPasswordField txtboxCurrentPassword2;
    // End of variables declaration//GEN-END:variables
}
