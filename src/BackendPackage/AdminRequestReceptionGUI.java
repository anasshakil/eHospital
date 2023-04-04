package BackendPackage;

import java.awt.Font;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class AdminRequestReceptionGUI extends javax.swing.JFrame {

    private JFrame parentFrame;
    private String name, email;

    public AdminRequestReceptionGUI() {
        initComponents();
    }

    public AdminRequestReceptionGUI(JFrame frame, String email, String name) {
        initComponents();
        try {
            BufferedImage img1 = ImageIO.read(getClass().getResource("/Icons/Hospital_3_48px.png"));
            setIconImage(img1);
        } catch (IOException e) {
        }
        //setSize(560, 590);
        setTitle("Requests");
        setResizable(false);
        setLocationRelativeTo(null);
        parentFrame = frame;
        this.email = email;
        this.name = name;
        lblAccName.setText(this.name);
        lblAccName.requestFocus();
        requestListTable.getTableHeader().setFont(new Font("Segoe UI Semilight", Font.PLAIN, 20));
        requestListTable.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 18));
        update();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        requestListTable = new javax.swing.JTable();
        AccPictureLbl = new javax.swing.JLabel();
        lblAccName = new javax.swing.JLabel();
        lblMain = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        lblMain1 = new javax.swing.JLabel();
        lblMain2 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtboxResponse = new javax.swing.JTextArea();
        btnSendRespose = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        btnDeleteRequest = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        requestListTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Doctor Name", "Doctor Email", "Request Type", "Details"
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
        requestListTable.setFillsViewportHeight(true);
        requestListTable.setRowHeight(40);
        requestListTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        requestListTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                requestListTableMouseClicked(evt);
            }
        });
        requestListTable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                requestListTableKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(requestListTable);

        AccPictureLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/User_50px.png"))); // NOI18N

        lblAccName.setFont(new java.awt.Font("Segoe UI Light", 0, 17)); // NOI18N
        lblAccName.setText("Account Name");

        lblMain.setFont(new java.awt.Font("Segoe UI Light", 0, 36)); // NOI18N
        lblMain.setText("Requests");

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(4);
        jTextArea1.setWrapStyleWord(true);
        jScrollPane3.setViewportView(jTextArea1);

        lblMain1.setFont(new java.awt.Font("Segoe UI Semilight", 0, 24)); // NOI18N
        lblMain1.setText("Details");

        lblMain2.setFont(new java.awt.Font("Segoe UI Semilight", 0, 24)); // NOI18N
        lblMain2.setText("Write Response");

        txtboxResponse.setColumns(20);
        txtboxResponse.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        txtboxResponse.setLineWrap(true);
        txtboxResponse.setRows(4);
        txtboxResponse.setText("Write response here...");
        txtboxResponse.setWrapStyleWord(true);
        txtboxResponse.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtboxResponseFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtboxResponseFocusLost(evt);
            }
        });
        jScrollPane4.setViewportView(txtboxResponse);

        btnSendRespose.setBackground(new java.awt.Color(255, 255, 255));
        btnSendRespose.setFont(new java.awt.Font("Segoe UI Light", 0, 15)); // NOI18N
        btnSendRespose.setText("Send Response");
        btnSendRespose.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btnSendRespose.setContentAreaFilled(false);
        btnSendRespose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSendResposeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSendResposeMouseExited(evt);
            }
        });
        btnSendRespose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendResposeActionPerformed(evt);
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

        btnDeleteRequest.setBackground(new java.awt.Color(255, 255, 255));
        btnDeleteRequest.setFont(new java.awt.Font("Segoe UI Light", 0, 15)); // NOI18N
        btnDeleteRequest.setText("Delete Request");
        btnDeleteRequest.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btnDeleteRequest.setContentAreaFilled(false);
        btnDeleteRequest.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDeleteRequestMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDeleteRequestMouseExited(evt);
            }
        });
        btnDeleteRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteRequestActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1340, Short.MAX_VALUE)
                    .addComponent(jScrollPane3)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(AccPictureLbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblAccName)
                                .addGap(413, 413, 413)
                                .addComponent(lblMain))
                            .addComponent(lblMain1)
                            .addComponent(lblMain2))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane4)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnDeleteRequest, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSendRespose, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblMain1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblMain2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSendRespose, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDeleteRequest, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void requestListTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_requestListTableMouseClicked
        try {
            String text = requestListTable.getModel().getValueAt(requestListTable.getSelectedRow(), 3).toString();
            jTextArea1.setText(text);
            if (evt.getClickCount() == 2) {
                String email_ = requestListTable.getModel().getValueAt(requestListTable.getSelectedRow(), 1).toString();
                String type = requestListTable.getModel().getValueAt(requestListTable.getSelectedRow(), 2).toString();
                String details = requestListTable.getModel().getValueAt(requestListTable.getSelectedRow(), 3).toString();
                if (requestListTable.getModel().getValueAt(requestListTable.getSelectedRow(), 2).toString().equalsIgnoreCase("Appointment Changes Request")) {
                    new ChangeAppointmentDayLimitGUI(this, this.email, name, email_, type, details).setVisible(true);
                    setVisible(false);
                }
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_requestListTableMouseClicked

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        close();
    }//GEN-LAST:event_formWindowClosing

    private void requestListTableKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_requestListTableKeyReleased
        try {
            String text = requestListTable.getModel().getValueAt(requestListTable.getSelectedRow(), 3).toString();
            jTextArea1.setText(text);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_requestListTableKeyReleased

    private void txtboxResponseFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtboxResponseFocusGained
        if (txtboxResponse.getText().equalsIgnoreCase("Write response here...")) {
            txtboxResponse.setText("");
        }
    }//GEN-LAST:event_txtboxResponseFocusGained

    private void txtboxResponseFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtboxResponseFocusLost
        if (txtboxResponse.getText().equals("") || txtboxResponse.getText().matches("\\s+")) {
            txtboxResponse.setText("Write response here...");
        }
    }//GEN-LAST:event_txtboxResponseFocusLost

    private void btnSendResposeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSendResposeMouseEntered
        mouseFocusGained(btnSendRespose);
    }//GEN-LAST:event_btnSendResposeMouseEntered

    private void btnSendResposeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSendResposeMouseExited
        mouseFocusLost(btnSendRespose);
    }//GEN-LAST:event_btnSendResposeMouseExited

    private void btnSendResposeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendResposeActionPerformed
        if (!txtboxResponse.getText().equalsIgnoreCase("Write response here...") && !txtboxResponse.getText().matches("\\s+") && !txtboxResponse.getText().equals("")) {
            String email_ = requestListTable.getModel().getValueAt(requestListTable.getSelectedRow(), 1).toString();
            String type = requestListTable.getModel().getValueAt(requestListTable.getSelectedRow(), 2).toString();
            String details = requestListTable.getModel().getValueAt(requestListTable.getSelectedRow(), 3).toString();
            boolean status = new DatabaseClassExtended(this).sendResponse(email, email_, type, details, txtboxResponse.getText());
            if (status) {
                JOptionPane.showMessageDialog(this, name + " your reponse has been send successfully", "Info", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Reponse has not been send successfully", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnSendResposeActionPerformed

    private void btnCancelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelMouseEntered
        mouseFocusGained(btnCancel);
    }//GEN-LAST:event_btnCancelMouseEntered

    private void btnCancelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelMouseExited
        mouseFocusLost(btnCancel);
    }//GEN-LAST:event_btnCancelMouseExited

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        close();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnDeleteRequestMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteRequestMouseEntered
        mouseFocusGained(btnDeleteRequest);
    }//GEN-LAST:event_btnDeleteRequestMouseEntered

    private void btnDeleteRequestMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteRequestMouseExited
        mouseFocusLost(btnDeleteRequest);
    }//GEN-LAST:event_btnDeleteRequestMouseExited

    private void btnDeleteRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteRequestActionPerformed
        try {
            String email_ = requestListTable.getModel().getValueAt(requestListTable.getSelectedRow(), 1).toString();
            String type = requestListTable.getModel().getValueAt(requestListTable.getSelectedRow(), 2).toString();
            String details = requestListTable.getModel().getValueAt(requestListTable.getSelectedRow(), 3).toString();
            boolean status = new DatabaseClassExtended(this).deleteRequest(email, email_, type, details, false);
            if (status) {
                JOptionPane.showMessageDialog(this, "Request deleted successfully", "Delete Info", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Request can not deleted successfully", "Delete Info", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnDeleteRequestActionPerformed

    private void update() {
        new DatabaseClassExtended(this).adminRequestsFetch(email);
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
            java.util.logging.Logger.getLogger(AdminRequestReceptionGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminRequestReceptionGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminRequestReceptionGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminRequestReceptionGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminRequestReceptionGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AccPictureLbl;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDeleteRequest;
    private javax.swing.JButton btnSendRespose;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lblAccName;
    private javax.swing.JLabel lblMain;
    private javax.swing.JLabel lblMain1;
    private javax.swing.JLabel lblMain2;
    protected static javax.swing.JTable requestListTable;
    private javax.swing.JTextArea txtboxResponse;
    // End of variables declaration//GEN-END:variables
}
