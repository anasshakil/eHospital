package BackendPackage;

import java.awt.Font;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class DeleteAppointmentGUI extends javax.swing.JFrame {

    private JFrame parentFrame;
    private String email, name;
    private int totalSelectCount;
    protected static ArrayList<String> drEmails = new ArrayList<>();
    protected static ArrayList<String> drNames = new ArrayList<>();
    protected static ArrayList<String> days = new ArrayList<>();
    protected static ArrayList<Integer> appointmentNumbers = new ArrayList<>();

    public DeleteAppointmentGUI() {
        initComponents();
    }

    public DeleteAppointmentGUI(JFrame parentFrame, String email, String name) {
        initComponents();
        try {
            BufferedImage img1 = ImageIO.read(getClass().getResource("/Icons/Hospital_3_48px.png"));
            setIconImage(img1);
        } catch (IOException e) {
        }
        //setSize(560, 590);
        setResizable(false);
        setLocationRelativeTo(null);
        this.email = email;
        this.name = name;
        lblAccName.setText(this.name);
        lblAccName.requestFocusInWindow();
        appointmentListTable.getTableHeader().setFont(new Font("Segoe UI Semilight", Font.PLAIN, 20));
        appointmentListTable.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 18));
        this.parentFrame = parentFrame;
        loadAppointmentsList();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblMain = new javax.swing.JLabel();
        AccPictureLbl = new javax.swing.JLabel();
        lblAccName = new javax.swing.JLabel();
        btnConfirm = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        appointmentListTable = new javax.swing.JTable();
        btnCancel = new javax.swing.JButton();
        lblPrescriptionBtn2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Appointment Cancellation");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        lblMain.setFont(new java.awt.Font("Segoe UI Light", 0, 36)); // NOI18N
        lblMain.setText("Appointment Cancellation");

        AccPictureLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/User_50px.png"))); // NOI18N

        lblAccName.setFont(new java.awt.Font("Segoe UI Light", 0, 17)); // NOI18N
        lblAccName.setText("Account Name");

        btnConfirm.setBackground(new java.awt.Color(255, 255, 255));
        btnConfirm.setFont(new java.awt.Font("Segoe UI Light", 0, 15)); // NOI18N
        btnConfirm.setText("Confirm");
        btnConfirm.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btnConfirm.setContentAreaFilled(false);
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

        appointmentListTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "S. No", "Delete", "Doctor Name", "Appointment Day", "Appointment No."
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Boolean.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        appointmentListTable.setFillsViewportHeight(true);
        appointmentListTable.setRowHeight(40);
        appointmentListTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(appointmentListTable);
        if (appointmentListTable.getColumnModel().getColumnCount() > 0) {
            appointmentListTable.getColumnModel().getColumn(0).setMinWidth(60);
            appointmentListTable.getColumnModel().getColumn(0).setPreferredWidth(60);
            appointmentListTable.getColumnModel().getColumn(0).setMaxWidth(60);
            appointmentListTable.getColumnModel().getColumn(1).setMinWidth(90);
            appointmentListTable.getColumnModel().getColumn(1).setPreferredWidth(90);
            appointmentListTable.getColumnModel().getColumn(1).setMaxWidth(90);
            appointmentListTable.getColumnModel().getColumn(3).setMinWidth(230);
            appointmentListTable.getColumnModel().getColumn(3).setPreferredWidth(230);
            appointmentListTable.getColumnModel().getColumn(3).setMaxWidth(230);
            appointmentListTable.getColumnModel().getColumn(4).setMinWidth(170);
            appointmentListTable.getColumnModel().getColumn(4).setPreferredWidth(170);
            appointmentListTable.getColumnModel().getColumn(4).setMaxWidth(170);
        }

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

        lblPrescriptionBtn2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Info_32px.png"))); // NOI18N
        lblPrescriptionBtn2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblPrescriptionBtn2MouseClicked(evt);
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
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(AccPictureLbl)
                        .addGap(18, 18, 18)
                        .addComponent(lblAccName)
                        .addGap(153, 153, 153)
                        .addComponent(lblMain)
                        .addGap(0, 319, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lblPrescriptionBtn2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblPrescriptionBtn2))
                .addContainerGap())
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

    private void btnConfirmMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConfirmMouseEntered
        mouseFocusGained(btnConfirm);
    }//GEN-LAST:event_btnConfirmMouseEntered

    private void btnConfirmMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConfirmMouseExited
        mouseFocusLost(btnConfirm);
    }//GEN-LAST:event_btnConfirmMouseExited

    private void btnConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmActionPerformed
        try {
            if (appointmentListTable.getModel().getValueAt(0, 2) != null && !appointmentListTable.getModel().getValueAt(0, 2).toString().equals("")) {
                int count = 0;
                ArrayList<String> finalEmails = new ArrayList<>();
                ArrayList<String> finalDays = new ArrayList<>();
                ArrayList<Integer> finalappointmentNumbers = new ArrayList<>();
                for (int i = 0; i < appointmentListTable.getModel().getRowCount(); i++) {
                    if ((boolean) appointmentListTable.getModel().getValueAt(i, 1)) {
                        finalEmails.add(drEmails.get(i));
                        finalappointmentNumbers.add(appointmentNumbers.get(i));
                        finalDays.add(days.get(i));
                        count++;
                    }
                }
                if (count > 0) {
                    boolean status = new DatabaseClassExtended(this).deleteAppointment(finalEmails, finalDays, finalappointmentNumbers, email);
                } else {
                    JOptionPane.showMessageDialog(this, "Please first select the appointment you wish to cancel", "No Selection Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnConfirmActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        close();
    }//GEN-LAST:event_formWindowClosing

    private void lblPrescriptionBtn2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPrescriptionBtn2MouseClicked
        JOptionPane.showMessageDialog(this, "The Days showing in list are of current week", "Days Info", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_lblPrescriptionBtn2MouseClicked

    private void loadAppointmentsList() {
        new DatabaseClassExtended(this).getAppointmentsList(email);
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
        parentFrame.setVisible(true);
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
            java.util.logging.Logger.getLogger(DeleteAppointmentGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DeleteAppointmentGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DeleteAppointmentGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DeleteAppointmentGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DeleteAppointmentGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AccPictureLbl;
    protected static javax.swing.JTable appointmentListTable;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnConfirm;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAccName;
    private javax.swing.JLabel lblMain;
    private javax.swing.JLabel lblPrescriptionBtn;
    private javax.swing.JLabel lblPrescriptionBtn1;
    private javax.swing.JLabel lblPrescriptionBtn2;
    // End of variables declaration//GEN-END:variables
}
