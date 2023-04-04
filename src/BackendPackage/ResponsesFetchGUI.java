package BackendPackage;

import java.awt.Font;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ResponsesFetchGUI extends javax.swing.JFrame {

    private String name, email;
    private JFrame parentFrame;

    public ResponsesFetchGUI() {
        initComponents();
    }

    public ResponsesFetchGUI(JFrame frame, String email, String name) {
        initComponents();
        try {
            BufferedImage img1 = ImageIO.read(getClass().getResource("/Icons/Hospital_3_48px.png"));
            setIconImage(img1);
        } catch (IOException e) {
        }
        //setSize(560, 590);
        setTitle("Responses");
        setResizable(false);
        setLocationRelativeTo(null);
        parentFrame = frame;
        this.email = email;
        this.name = name;
        lblAccName.setText(this.name);
        lblAccName.requestFocus();
        responsesTable.getTableHeader().setFont(new Font("Segoe UI Semilight", Font.PLAIN, 20));
        responsesTable.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 18));
        update();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblMain = new javax.swing.JLabel();
        AccPictureLbl = new javax.swing.JLabel();
        lblAccName = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        responsesTable = new javax.swing.JTable();
        lblMain1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        lblMain2 = new javax.swing.JLabel();
        btnCancel = new javax.swing.JButton();
        btnDeleteResponse = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        lblMain.setFont(new java.awt.Font("Segoe UI Light", 0, 36)); // NOI18N
        lblMain.setText("Responses");

        AccPictureLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/User_50px.png"))); // NOI18N

        lblAccName.setFont(new java.awt.Font("Segoe UI Light", 0, 17)); // NOI18N
        lblAccName.setText("Account Name");

        responsesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Request Type", "Request Details", "Responder", "Response Details"
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
        responsesTable.setFillsViewportHeight(true);
        responsesTable.setRowHeight(40);
        responsesTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                responsesTableMouseClicked(evt);
            }
        });
        responsesTable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                responsesTableKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(responsesTable);

        lblMain1.setFont(new java.awt.Font("Segoe UI Semilight", 0, 24)); // NOI18N
        lblMain1.setText("Request Details");

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(4);
        jTextArea1.setWrapStyleWord(true);
        jScrollPane3.setViewportView(jTextArea1);

        jTextArea2.setEditable(false);
        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        jTextArea2.setLineWrap(true);
        jTextArea2.setRows(4);
        jTextArea2.setWrapStyleWord(true);
        jScrollPane4.setViewportView(jTextArea2);

        lblMain2.setFont(new java.awt.Font("Segoe UI Semilight", 0, 24)); // NOI18N
        lblMain2.setText("Response Details");

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

        btnDeleteResponse.setBackground(new java.awt.Color(255, 255, 255));
        btnDeleteResponse.setFont(new java.awt.Font("Segoe UI Light", 0, 15)); // NOI18N
        btnDeleteResponse.setText("Delete Response");
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(jScrollPane3)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(AccPictureLbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblAccName)
                                .addGap(238, 238, 238)
                                .addComponent(lblMain))
                            .addComponent(lblMain1)
                            .addComponent(lblMain2))
                        .addGap(0, 460, Short.MAX_VALUE))
                    .addComponent(jScrollPane4)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDeleteResponse, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblMain1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblMain2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDeleteResponse, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelMouseEntered
        mouseFocusGained(btnCancel);
    }//GEN-LAST:event_btnCancelMouseEntered

    private void btnCancelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelMouseExited
        mouseFocusLost(btnCancel);
    }//GEN-LAST:event_btnCancelMouseExited

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        close();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnDeleteResponseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteResponseMouseEntered
        mouseFocusGained(btnDeleteResponse);
    }//GEN-LAST:event_btnDeleteResponseMouseEntered

    private void btnDeleteResponseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteResponseMouseExited
        mouseFocusLost(btnDeleteResponse);
    }//GEN-LAST:event_btnDeleteResponseMouseExited

    private void btnDeleteResponseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteResponseActionPerformed
        try {
            String email_ = responsesTable.getModel().getValueAt(responsesTable.getSelectedRow(), 2).toString();
            email_ = (email_.equalsIgnoreCase("me") ? email : email_);
            String details = responsesTable.getModel().getValueAt(responsesTable.getSelectedRow(), 1).toString();
            String response = responsesTable.getModel().getValueAt(responsesTable.getSelectedRow(), 3).toString();
            boolean status = new DatabaseClassExtended(this).deleteResponse(email, email_, details, response);
            if (status) {
                update();
                JOptionPane.showMessageDialog(this, "Response deleted successfully", "Info", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Response does not deleted successfully", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnDeleteResponseActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        close();
    }//GEN-LAST:event_formWindowClosing

    private void responsesTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_responsesTableMouseClicked
        try {
            String text1 = responsesTable.getModel().getValueAt(responsesTable.getSelectedRow(), 1).toString();
            String text2 = responsesTable.getModel().getValueAt(responsesTable.getSelectedRow(), 3).toString();
            jTextArea1.setText(text1);
            jTextArea2.setText(text2);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_responsesTableMouseClicked

    private void responsesTableKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_responsesTableKeyReleased
        try {
            String text1 = responsesTable.getModel().getValueAt(responsesTable.getSelectedRow(), 1).toString();
            String text2 = responsesTable.getModel().getValueAt(responsesTable.getSelectedRow(), 3).toString();
            jTextArea1.setText(text1);
            jTextArea2.setText(text2);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_responsesTableKeyReleased

    private void update() {
        new DatabaseClassExtended(this).fetchResponses(email);
        jTextArea1.setText("");
        jTextArea2.setText("");
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
            java.util.logging.Logger.getLogger(ResponsesFetchGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ResponsesFetchGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ResponsesFetchGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ResponsesFetchGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ResponsesFetchGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AccPictureLbl;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDeleteResponse;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JLabel lblAccName;
    private javax.swing.JLabel lblMain;
    private javax.swing.JLabel lblMain1;
    private javax.swing.JLabel lblMain2;
    protected static javax.swing.JTable responsesTable;
    // End of variables declaration//GEN-END:variables
}
