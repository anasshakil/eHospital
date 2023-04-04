package BackendPackage;

import java.awt.Font;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FeedbackFetcherGUI extends javax.swing.JFrame {
    
    private JFrame parentFrame;
    private String name, email;
    
    public FeedbackFetcherGUI() {
        initComponents();
    }
    
    public FeedbackFetcherGUI(JFrame frame, String email, String name) {
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
        feedbackTable.getTableHeader().setFont(new Font("Segoe UI Semilight", Font.PLAIN, 20));
        feedbackTable.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 18));
        update();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        AccPictureLbl = new javax.swing.JLabel();
        lblAccName = new javax.swing.JLabel();
        lblMain = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        feedbackTable = new javax.swing.JTable();
        lblMain1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtAreaSubject = new javax.swing.JTextArea();
        lblMain2 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtAreaDetails = new javax.swing.JTextArea();
        btnDeleteResponse = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        lblMain3 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        txtAreaResponse = new javax.swing.JTextArea();
        btnSendResponse = new javax.swing.JButton();

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
        lblMain.setText("Feedback Area");

        feedbackTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Email", "Subject", "Details"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        feedbackTable.setFillsViewportHeight(true);
        feedbackTable.setRowHeight(40);
        feedbackTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                feedbackTableMouseClicked(evt);
            }
        });
        feedbackTable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                feedbackTableKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(feedbackTable);

        lblMain1.setFont(new java.awt.Font("Segoe UI Semilight", 0, 24)); // NOI18N
        lblMain1.setText("Feedback Subject");

        txtAreaSubject.setEditable(false);
        txtAreaSubject.setColumns(20);
        txtAreaSubject.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        txtAreaSubject.setLineWrap(true);
        txtAreaSubject.setRows(4);
        txtAreaSubject.setWrapStyleWord(true);
        jScrollPane3.setViewportView(txtAreaSubject);

        lblMain2.setFont(new java.awt.Font("Segoe UI Semilight", 0, 24)); // NOI18N
        lblMain2.setText("Feedback Details");

        txtAreaDetails.setEditable(false);
        txtAreaDetails.setColumns(20);
        txtAreaDetails.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        txtAreaDetails.setLineWrap(true);
        txtAreaDetails.setRows(4);
        txtAreaDetails.setWrapStyleWord(true);
        jScrollPane4.setViewportView(txtAreaDetails);

        btnDeleteResponse.setBackground(new java.awt.Color(255, 255, 255));
        btnDeleteResponse.setFont(new java.awt.Font("Segoe UI Light", 0, 15)); // NOI18N
        btnDeleteResponse.setText("Delete Feedback");
        btnDeleteResponse.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btnDeleteResponse.setContentAreaFilled(false);
        btnDeleteResponse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDeleteResponseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDeleteResponseMouseExited(evt);
            }
        });
        btnDeleteResponse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteResponseActionPerformed(evt);
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

        lblMain3.setFont(new java.awt.Font("Segoe UI Semilight", 0, 24)); // NOI18N
        lblMain3.setText("Write Response");

        txtAreaResponse.setColumns(20);
        txtAreaResponse.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        txtAreaResponse.setLineWrap(true);
        txtAreaResponse.setRows(4);
        txtAreaResponse.setText("Write response here...");
        txtAreaResponse.setWrapStyleWord(true);
        txtAreaResponse.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtAreaResponseFocusGained(evt);
            }
        });
        jScrollPane5.setViewportView(txtAreaResponse);

        btnSendResponse.setBackground(new java.awt.Color(255, 255, 255));
        btnSendResponse.setFont(new java.awt.Font("Segoe UI Light", 0, 15)); // NOI18N
        btnSendResponse.setText("Send Response");
        btnSendResponse.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btnSendResponse.setContentAreaFilled(false);
        btnSendResponse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSendResponseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSendResponseMouseExited(evt);
            }
        });
        btnSendResponse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendResponseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(jScrollPane3)
                    .addComponent(jScrollPane4)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(AccPictureLbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblAccName)
                                .addGap(296, 296, 296)
                                .addComponent(lblMain))
                            .addComponent(lblMain1)
                            .addComponent(lblMain2)
                            .addComponent(lblMain3))
                        .addGap(0, 497, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSendResponse, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDeleteResponse, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane5))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AccPictureLbl)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblMain)
                        .addComponent(lblAccName)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblMain1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblMain2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblMain3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDeleteResponse, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSendResponse, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void feedbackTableKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_feedbackTableKeyReleased
        try {
            String subject = feedbackTable.getModel().getValueAt(feedbackTable.getSelectedRow(), 2).toString();
            String details = feedbackTable.getModel().getValueAt(feedbackTable.getSelectedRow(), 3).toString();
            txtAreaSubject.setText(subject);
            txtAreaDetails.setText(details);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_feedbackTableKeyReleased

    private void feedbackTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_feedbackTableMouseClicked
        try {
            String subject = feedbackTable.getModel().getValueAt(feedbackTable.getSelectedRow(), 2).toString();
            String details = feedbackTable.getModel().getValueAt(feedbackTable.getSelectedRow(), 3).toString();
            txtAreaSubject.setText(subject);
            txtAreaDetails.setText(details);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_feedbackTableMouseClicked

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        close();
    }//GEN-LAST:event_formWindowClosing

    private void btnDeleteResponseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteResponseMouseEntered
        mouseFocusGained(btnDeleteResponse);
    }//GEN-LAST:event_btnDeleteResponseMouseEntered

    private void btnDeleteResponseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteResponseMouseExited
        mouseFocusLost(btnDeleteResponse);
    }//GEN-LAST:event_btnDeleteResponseMouseExited

    private void btnDeleteResponseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteResponseActionPerformed
        try {
            String email_ = feedbackTable.getModel().getValueAt(feedbackTable.getSelectedRow(), 1).toString();
            String details = feedbackTable.getModel().getValueAt(feedbackTable.getSelectedRow(), 3).toString();
            String subject = feedbackTable.getModel().getValueAt(feedbackTable.getSelectedRow(), 2).toString();
            boolean status = new DatabaseClassExtended(this).deleteFeedback(email, email_, details, subject, false);
            if (status) {
                update();
                JOptionPane.showMessageDialog(this, "Feedback deleted successfully", "Info", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Feedback does not deleted successfully", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnDeleteResponseActionPerformed

    private void btnCancelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelMouseEntered
        mouseFocusGained(btnCancel);
    }//GEN-LAST:event_btnCancelMouseEntered

    private void btnCancelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelMouseExited
        mouseFocusLost(btnCancel);
    }//GEN-LAST:event_btnCancelMouseExited

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        close();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void txtAreaResponseFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAreaResponseFocusGained
        if (txtAreaResponse.getText().equalsIgnoreCase("Write response here...")) {
            txtAreaResponse.setText("");
        }
    }//GEN-LAST:event_txtAreaResponseFocusGained

    private void btnSendResponseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSendResponseMouseEntered
        mouseFocusGained(btnSendResponse);
    }//GEN-LAST:event_btnSendResponseMouseEntered

    private void btnSendResponseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSendResponseMouseExited
        mouseFocusLost(btnSendResponse);
    }//GEN-LAST:event_btnSendResponseMouseExited

    private void btnSendResponseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendResponseActionPerformed
        try {
            String email_ = feedbackTable.getModel().getValueAt(feedbackTable.getSelectedRow(), 1).toString();
            String details = feedbackTable.getModel().getValueAt(feedbackTable.getSelectedRow(), 3).toString();
            boolean status = new DatabaseClassExtended(this).sendResponse(email, email_, "Feedback/Complain", details, txtAreaResponse.getText());
            if (status) {
                JOptionPane.showMessageDialog(this, name + " your reponse has been send successfully", "Info", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Reponse has not been send successfully", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnSendResponseActionPerformed
    
    private void update() {
        new DatabaseClassExtended(this).feedbacksFetcher(email);
        txtAreaDetails.setText("");
        txtAreaSubject.setText("");
        txtAreaResponse.setText("Write response here...");
    }
    
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
            java.util.logging.Logger.getLogger(FeedbackFetcherGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FeedbackFetcherGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FeedbackFetcherGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FeedbackFetcherGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FeedbackFetcherGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AccPictureLbl;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDeleteResponse;
    private javax.swing.JButton btnSendResponse;
    protected static javax.swing.JTable feedbackTable;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JLabel lblAccName;
    private javax.swing.JLabel lblMain;
    private javax.swing.JLabel lblMain1;
    private javax.swing.JLabel lblMain2;
    private javax.swing.JLabel lblMain3;
    private javax.swing.JTextArea txtAreaDetails;
    private javax.swing.JTextArea txtAreaResponse;
    private javax.swing.JTextArea txtAreaSubject;
    // End of variables declaration//GEN-END:variables
}
