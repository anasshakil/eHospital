package BackendPackage;

import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ServerIpAddressGUI extends javax.swing.JFrame {

    private JFrame parentFrame;

    public ServerIpAddressGUI() {
        initComponents();
    }

    public ServerIpAddressGUI(JFrame parent) {
        initComponents();
        try {
            BufferedImage img1 = ImageIO.read(getClass().getResource("/Icons/Hospital_3_48px.png"));
            setIconImage(img1);
        } catch (IOException e) {
        }
        lblMain.requestFocus();
        //setSize(560, 590);
        setResizable(false);
        setLocationRelativeTo(null);
        parentFrame = parent;
        status();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtboxOldIp = new javax.swing.JTextField();
        txtboxNewIP = new javax.swing.JTextField();
        lblMain = new javax.swing.JLabel();
        btnUpdateIP = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Server Ip Settings");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        txtboxOldIp.setFont(new java.awt.Font("Segoe UI Light", 0, 15)); // NOI18N
        txtboxOldIp.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtboxOldIp.setText("Current IP Address");
        txtboxOldIp.setEnabled(false);

        txtboxNewIP.setFont(new java.awt.Font("Segoe UI Light", 0, 15)); // NOI18N
        txtboxNewIP.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtboxNewIP.setText("Enter New IP Address...");
        txtboxNewIP.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtboxNewIPFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtboxNewIPFocusLost(evt);
            }
        });

        lblMain.setFont(new java.awt.Font("Segoe UI Light", 0, 36)); // NOI18N
        lblMain.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMain.setText("Server IP Settings");
        lblMain.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        btnUpdateIP.setBackground(new java.awt.Color(255, 255, 255));
        btnUpdateIP.setFont(new java.awt.Font("Segoe UI Light", 0, 15)); // NOI18N
        btnUpdateIP.setText("Update IP");
        btnUpdateIP.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btnUpdateIP.setContentAreaFilled(false);
        btnUpdateIP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnUpdateIPMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnUpdateIPMouseExited(evt);
            }
        });
        btnUpdateIP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateIPActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtboxOldIp, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtboxNewIP, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addComponent(lblMain))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(216, 216, 216)
                        .addComponent(btnUpdateIP, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(90, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblMain)
                .addGap(39, 39, 39)
                .addComponent(txtboxOldIp, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtboxNewIP, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnUpdateIP, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtboxNewIPFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtboxNewIPFocusGained
        if (txtboxNewIP.getText().equals("Enter New IP Address...")) {
            txtboxNewIP.setText("");
        }
    }//GEN-LAST:event_txtboxNewIPFocusGained

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        close();
    }//GEN-LAST:event_formWindowClosing

    private void txtboxNewIPFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtboxNewIPFocusLost
        if (txtboxNewIP.getText().equals("")) {
            txtboxNewIP.setText("Enter New IP Address...");
        }
    }//GEN-LAST:event_txtboxNewIPFocusLost

    private void btnUpdateIPMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdateIPMouseEntered
        mouseFocusGained(btnUpdateIP);
    }//GEN-LAST:event_btnUpdateIPMouseEntered

    private void btnUpdateIPMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdateIPMouseExited
        mouseFocusLost(btnUpdateIP);
    }//GEN-LAST:event_btnUpdateIPMouseExited

    private void btnUpdateIPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateIPActionPerformed
        if (!txtboxNewIP.getText().equalsIgnoreCase("Enter New IP Address...") && !txtboxNewIP.getText().equals("")) {
            String status = new FileStreamingClass(this).setNewIp(txtboxNewIP.getText());
            if (status.equals("false")) {
                JOptionPane.showMessageDialog(this, "some fatal error encountered", "NEw IP Error", JOptionPane.ERROR_MESSAGE);
            } else {
                txtboxOldIp.setText(status);
                JOptionPane.showMessageDialog(this, "Server Ip Address updated successfully", "Server Ip Message", JOptionPane.INFORMATION_MESSAGE);
                close();
            }
        }
    }//GEN-LAST:event_btnUpdateIPActionPerformed

    private void status() {
        String status_ = new FileStreamingClass(this).loadOldIp();
        if (status_ != null && !status_.equalsIgnoreCase("false")) {
            txtboxOldIp.setText(status_);
        } else {
            txtboxOldIp.setText("No Old IP Address Found");
        }
    }

    private void mouseFocusGained(JButton btn) {
        btn.setContentAreaFilled(true);
    }

    private void mouseFocusLost(JButton btn) {
        btn.setContentAreaFilled(false);
        btn.setOpaque(true);
    }

    private void close() {
        dispose();
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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ServerIpAddressGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ServerIpAddressGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ServerIpAddressGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ServerIpAddressGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ServerIpAddressGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnUpdateIP;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblMain;
    private javax.swing.JTextField txtboxNewIP;
    private javax.swing.JTextField txtboxOldIp;
    // End of variables declaration//GEN-END:variables
}
