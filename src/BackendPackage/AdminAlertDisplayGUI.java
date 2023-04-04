package BackendPackage;

import java.awt.Color;
import java.awt.Font;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class AdminAlertDisplayGUI extends javax.swing.JFrame {

    private String email, name;
    public static ArrayList<String> alertOriginator = new ArrayList<>();
    public static ArrayList<String> alertType = new ArrayList<>();
    public static ArrayList<String> alertDetail = new ArrayList<>();
    public static ArrayList<String> alertStatus = new ArrayList<>();
    public static ArrayList<String> alertSeenTime = new ArrayList<>();

    public AdminAlertDisplayGUI() {
        initComponents();
    }

    public AdminAlertDisplayGUI(String email, String name) {
        initComponents();
        this.pack();
        try {
            BufferedImage img1 = ImageIO.read(getClass().getResource("/Icons/Hospital_3_48px.png"));
            setIconImage(img1);
        } catch (IOException e) {
        }
        getContentPane().setBackground(Color.WHITE);
//        this.setSize(1270, 610);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.email = email;
        this.name = name;
        lblAccName.setText(this.name);
        alertsTable.getTableHeader().setFont(new Font("Segoe UI Semilight", Font.PLAIN, 20));
        alertsTable.setFont(new Font("Segoe UI Light", Font.PLAIN, 18));
        refresh();
        alertSeen();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        AccPictureLbl = new javax.swing.JLabel();
        lblAccName = new javax.swing.JLabel();
        lblMain = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        alertsTable = new javax.swing.JTable();
        btnDeleteAlert = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Alerts");
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
        lblMain.setText("Alerts");

        alertsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Alert Originator", "Account Type", "Details", "Status"
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
        alertsTable.setFillsViewportHeight(true);
        alertsTable.setRowHeight(40);
        alertsTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        alertsTable.getTableHeader().setReorderingAllowed(false);
        alertsTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                alertsTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(alertsTable);
        if (alertsTable.getColumnModel().getColumnCount() > 0) {
            alertsTable.getColumnModel().getColumn(0).setMinWidth(200);
            alertsTable.getColumnModel().getColumn(0).setPreferredWidth(200);
            alertsTable.getColumnModel().getColumn(0).setMaxWidth(200);
            alertsTable.getColumnModel().getColumn(1).setMinWidth(150);
            alertsTable.getColumnModel().getColumn(1).setPreferredWidth(150);
            alertsTable.getColumnModel().getColumn(1).setMaxWidth(150);
            alertsTable.getColumnModel().getColumn(3).setMinWidth(90);
            alertsTable.getColumnModel().getColumn(3).setPreferredWidth(90);
            alertsTable.getColumnModel().getColumn(3).setMaxWidth(90);
        }

        btnDeleteAlert.setBackground(new java.awt.Color(255, 255, 255));
        btnDeleteAlert.setFont(new java.awt.Font("Segoe UI Light", 0, 15)); // NOI18N
        btnDeleteAlert.setText("Delete Alerts");
        btnDeleteAlert.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btnDeleteAlert.setContentAreaFilled(false);
        btnDeleteAlert.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDeleteAlertMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDeleteAlertMouseExited(evt);
            }
        });
        btnDeleteAlert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteAlertActionPerformed(evt);
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

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setWrapStyleWord(true);
        jScrollPane3.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(AccPictureLbl)
                                .addGap(18, 18, 18)
                                .addComponent(lblAccName)
                                .addGap(239, 239, 239)
                                .addComponent(lblMain))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 727, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnDeleteAlert, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                                    .addComponent(btnCancel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AccPictureLbl)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblMain)
                        .addComponent(lblAccName)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnDeleteAlert, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE))
                .addContainerGap())
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeleteAlertMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteAlertMouseEntered
        mouseFocusGained(btnDeleteAlert);
    }//GEN-LAST:event_btnDeleteAlertMouseEntered

    private void btnDeleteAlertMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteAlertMouseExited
        mouseFocusLost(btnDeleteAlert);
    }//GEN-LAST:event_btnDeleteAlertMouseExited

    private void btnDeleteAlertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteAlertActionPerformed
        int optn = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete alerts ?\nPlease note that System generated alerts\n"
                + "will re-appeare again", "Delete Alerts", JOptionPane.YES_NO_OPTION);
        if (optn == JOptionPane.YES_OPTION) {
            boolean deleteStatus = new DatabaseClassExtended(this).deleteAlerts(email);
            if (deleteStatus) {
                JOptionPane.showMessageDialog(this, "Alerts deleted successfully", "Alerts Delete", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Alerts does not deleted successfully", "Alerts Delete", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnDeleteAlertActionPerformed

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

    private void alertsTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_alertsTableMouseClicked
        try {
            if (alertsTable.getModel().getValueAt(alertsTable.getSelectedRow(), 2) != null) {
                String text = (String) alertsTable.getModel().getValueAt(alertsTable.getSelectedRow(), 2);
                jTextArea1.setText(text);
            }
            if (evt.getClickCount() == 2) {
                if (alertsTable.getSelectedColumn() == (alertsTable.getColumnCount() - 1)
                        && !alertsTable.getModel().getValueAt(alertsTable.getSelectedRow(), alertsTable.getColumnCount() - 1).toString().equalsIgnoreCase("unread")) {
                    JOptionPane.showMessageDialog(this, "       Alert seen at\n" + alertSeenTime.get(alertsTable.getSelectedRow()), "Seen Info",
                            JOptionPane.INFORMATION_MESSAGE);
                }
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_alertsTableMouseClicked

    private void refresh() {
        new DatabaseClass(this).alertUpdate(email, true, false);
    }

    private void alertSeen() {
        new DatabaseClassExtended(this).alertStatusSeen(email);
    }

    private void mouseFocusGained(JButton btn) {
        btn.setContentAreaFilled(true);
    }

    private void mouseFocusLost(JButton btn) {
        btn.setContentAreaFilled(false);
        btn.setOpaque(true);
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
            java.util.logging.Logger.getLogger(AdminAlertDisplayGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminAlertDisplayGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminAlertDisplayGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminAlertDisplayGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminAlertDisplayGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AccPictureLbl;
    protected static javax.swing.JTable alertsTable;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDeleteAlert;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lblAccName;
    private javax.swing.JLabel lblMain;
    // End of variables declaration//GEN-END:variables
}
