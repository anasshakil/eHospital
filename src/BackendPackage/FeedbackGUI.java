package BackendPackage;

import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FeedbackGUI extends javax.swing.JFrame {

    private JFrame parentFrame;
    private String name, email;

    public FeedbackGUI() {
        initComponents();
    }

    public FeedbackGUI(JFrame frame, String email, String name) {
        initComponents();
        try {
            BufferedImage img1 = ImageIO.read(getClass().getResource("/Icons/Hospital_3_48px.png"));
            setIconImage(img1);
        } catch (IOException e) {
        }
        //setSize(560, 590);
        setTitle("Feedback");
        setResizable(false);
        setLocationRelativeTo(null);
        parentFrame = frame;
        this.email = email;
        this.name = name;
        lblAccName.setText(this.name);
        lblAccName.requestFocus();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        AccPictureLbl = new javax.swing.JLabel();
        lblAccName = new javax.swing.JLabel();
        lblMain = new javax.swing.JLabel();
        txtboxSubject = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtboxDetails = new javax.swing.JTextArea();
        lblMain2 = new javax.swing.JLabel();
        lblMain3 = new javax.swing.JLabel();
        btnCancel = new javax.swing.JButton();
        btnSendFeedback = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        AccPictureLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/User_50px.png"))); // NOI18N

        lblAccName.setFont(new java.awt.Font("Segoe UI Light", 0, 17)); // NOI18N
        lblAccName.setText("Account Name");

        lblMain.setFont(new java.awt.Font("Segoe UI Light", 0, 36)); // NOI18N
        lblMain.setText("Feedback/Complain");

        txtboxSubject.setFont(new java.awt.Font("Segoe UI Semilight", 0, 15)); // NOI18N
        txtboxSubject.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtboxSubject.setText("Write feedback subject here...");
        txtboxSubject.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtboxSubjectFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtboxSubjectFocusLost(evt);
            }
        });

        txtboxDetails.setColumns(20);
        txtboxDetails.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        txtboxDetails.setLineWrap(true);
        txtboxDetails.setRows(4);
        txtboxDetails.setText("Write feedback details here...");
        txtboxDetails.setWrapStyleWord(true);
        txtboxDetails.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtboxDetailsFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtboxDetailsFocusLost(evt);
            }
        });
        jScrollPane4.setViewportView(txtboxDetails);

        lblMain2.setFont(new java.awt.Font("Segoe UI Semilight", 0, 24)); // NOI18N
        lblMain2.setText("Feedback Subject");

        lblMain3.setFont(new java.awt.Font("Segoe UI Semilight", 0, 24)); // NOI18N
        lblMain3.setText("Feedback Details");

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

        btnSendFeedback.setBackground(new java.awt.Color(255, 255, 255));
        btnSendFeedback.setFont(new java.awt.Font("Segoe UI Light", 0, 15)); // NOI18N
        btnSendFeedback.setText("Send Feedback");
        btnSendFeedback.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btnSendFeedback.setContentAreaFilled(false);
        btnSendFeedback.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSendFeedbackMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSendFeedbackMouseExited(evt);
            }
        });
        btnSendFeedback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendFeedbackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtboxSubject, javax.swing.GroupLayout.PREFERRED_SIZE, 517, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblMain2)))
                    .addComponent(jScrollPane4)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblAccName)
                            .addComponent(lblMain3)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(AccPictureLbl)
                                .addGap(53, 53, 53)
                                .addComponent(lblMain)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSendFeedback, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AccPictureLbl)
                    .addComponent(lblMain))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblAccName)
                .addGap(18, 18, 18)
                .addComponent(lblMain2)
                .addGap(6, 6, 6)
                .addComponent(txtboxSubject, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblMain3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSendFeedback, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtboxSubjectFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtboxSubjectFocusGained
        if (txtboxSubject.getText().equalsIgnoreCase("Write feedback subject here...")) {
            txtboxSubject.setText("");
        }
    }//GEN-LAST:event_txtboxSubjectFocusGained

    private void txtboxSubjectFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtboxSubjectFocusLost
        if (txtboxSubject.getText().equals("")) {
            txtboxSubject.setText("Write feedback subject here...");
        }
    }//GEN-LAST:event_txtboxSubjectFocusLost

    private void txtboxDetailsFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtboxDetailsFocusGained
        if (txtboxDetails.getText().equalsIgnoreCase("Write feedback details here...")) {
            txtboxDetails.setText("");
        }
    }//GEN-LAST:event_txtboxDetailsFocusGained

    private void txtboxDetailsFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtboxDetailsFocusLost
        if (txtboxDetails.getText().equals("") || txtboxDetails.getText().matches("\\s+")) {
            txtboxDetails.setText("Write feedback details here...");
        }
    }//GEN-LAST:event_txtboxDetailsFocusLost

    private void btnCancelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelMouseEntered
        mouseFocusGained(btnCancel);
    }//GEN-LAST:event_btnCancelMouseEntered

    private void btnCancelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelMouseExited
        mouseFocusLost(btnCancel);
    }//GEN-LAST:event_btnCancelMouseExited

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        close();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnSendFeedbackMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSendFeedbackMouseEntered
        mouseFocusGained(btnSendFeedback);
    }//GEN-LAST:event_btnSendFeedbackMouseEntered

    private void btnSendFeedbackMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSendFeedbackMouseExited
        mouseFocusLost(btnSendFeedback);
    }//GEN-LAST:event_btnSendFeedbackMouseExited

    private void btnSendFeedbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendFeedbackActionPerformed
        if (!txtboxDetails.getText().equalsIgnoreCase("Write feedback details here...") && !txtboxDetails.getText().matches("\\s+") && !txtboxDetails.getText().equals("")
                && !txtboxSubject.getText().equalsIgnoreCase("Write feedback subject here...") && !txtboxSubject.getText().equals("") && !txtboxSubject.getText().matches("\\s+")) {
            boolean status = new DatabaseClassExtended(this).sendFeedback(name, email, txtboxSubject.getText(), txtboxDetails.getText());
            if (status) {
                JOptionPane.showMessageDialog(this, name + ", Thank you for your Feedback/Complain. Soon we will reach you",
                        "Feedback/Complain Info", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, name + ", Sorry but your Feedback/Complain has not sent.",
                        "Feedback/Complain Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, name + ", Sorry but first write sonething useful that makes sense.",
                    "Feedback/Complain Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnSendFeedbackActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        close();
    }//GEN-LAST:event_formWindowClosing

    private void close() {
        parentFrame.setVisible(true);
        dispose();
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
            java.util.logging.Logger.getLogger(FeedbackGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FeedbackGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FeedbackGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FeedbackGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FeedbackGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AccPictureLbl;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnSendFeedback;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel lblAccName;
    private javax.swing.JLabel lblMain;
    private javax.swing.JLabel lblMain2;
    private javax.swing.JLabel lblMain3;
    private javax.swing.JTextArea txtboxDetails;
    private javax.swing.JTextField txtboxSubject;
    // End of variables declaration//GEN-END:variables
}
