package BackendPackage;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class SearchProfileGUI_ extends javax.swing.JFrame {

    public static ArrayList<String> names = new ArrayList<>();
    public static ArrayList<String> emails = new ArrayList<>();
    private boolean calledFromCreatePrescription;
    private static DefaultListModel list = new DefaultListModel();
    private String name;
    private String profession;
    private Statement statement;
    private boolean correct;
    private ResultSet result;
    private String email = "";
    private String serverAddress = DatabaseClass.serverAddress;
    private String hostName = "anas";
    private String hostPassword = "anas@";
    private Connection connection;

    public SearchProfileGUI_(String name, String email) {
        try {
            connection = DriverManager.getConnection("jdbc:mysql://" + serverAddress + ":3306/ehospital_db?verifyServerCertificate=false&useSSL=false", hostName, hostPassword);
            statement = connection.createStatement();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(MenuGUI.staticObject, "Connection lost with server", "No internet connection", JOptionPane.ERROR_MESSAGE);
        }
        try {
            btnSelect.setEnabled(false);
            confirmbtn.setEnabled(true);
            this.email = email;
            int count = 0;
            String name_ = "";
            String query = "select * from `" + this.email + "`";
            result = statement.executeQuery(query);
            while (result.next()) {
                list.addElement(result.getString("name"));
                list.addElement(result.getString("accounType"));
                list.addElement(result.getString("age"));
                list.addElement(result.getString("contactnumber"));
                list.addElement(result.getString("cnic"));
                list.addElement(result.getString("sex"));
                list.addElement(result.getString("profession"));
                list.addElement(result.getString("qualification"));
                count++;
            }
            listDisplay.setModel(list);
            if (count == 0) {
                JOptionPane.showMessageDialog(null, "No data found related selected doctor!");
            }
        } catch (Exception e) {e.printStackTrace();
        }
    }

    public SearchProfileGUI_(String name, boolean x) {
        initComponents();
        try {
            connection = DriverManager.getConnection("jdbc:mysql://" + serverAddress + ":3306/ehospital_db?verifyServerCertificate=false&useSSL=false", hostName, hostPassword);
            statement = connection.createStatement();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(MenuGUI.staticObject, "Connection lost with server", "No internet connection", JOptionPane.ERROR_MESSAGE);
        }
        this.pack();
        try {
            BufferedImage img1 = ImageIO.read(getClass().getResource("/Icons/Hospital_3_48px.png"));
            setIconImage(img1);
        } catch (IOException e) {
        }
        getContentPane().setBackground(Color.WHITE);
        this.setSize(690, 428);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        confirmbtn.setEnabled(false);
        boolean get = new appointment_class().search(name);
        if (get) {
            try {
                for(int i = 0;i<names.size();i++){
                    list.addElement(names.get(i) + "    (" + emails.get(i) + ")");
                }
                listDisplay.setModel(list);
            } catch (Exception e) {

            }
        } else {
            correct = false;
            new appointment_GUI(correct).setVisible(true);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblAccName = new javax.swing.JLabel();
        AccPictureLbl = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listDisplay = new javax.swing.JList<>();
        btnSelect = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        confirmbtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Search Profile");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        lblAccName.setFont(new java.awt.Font("Segoe UI Light", 0, 17)); // NOI18N
        lblAccName.setForeground(new java.awt.Color(255, 255, 255));
        lblAccName.setText("Select a doctor");

        AccPictureLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/User_50px.png"))); // NOI18N

        listDisplay.setBackground(new java.awt.Color(51, 51, 51));
        listDisplay.setFont(new java.awt.Font("Segoe UI Light", 0, 15)); // NOI18N
        listDisplay.setForeground(new java.awt.Color(255, 255, 255));
        listDisplay.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        listDisplay.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listDisplayMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(listDisplay);

        btnSelect.setBackground(new java.awt.Color(51, 51, 51));
        btnSelect.setFont(new java.awt.Font("Segoe UI Light", 0, 15)); // NOI18N
        btnSelect.setForeground(new java.awt.Color(255, 255, 255));
        btnSelect.setText("Select");
        btnSelect.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btnSelect.setContentAreaFilled(false);
        btnSelect.setOpaque(true);
        btnSelect.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSelectMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSelectMouseExited(evt);
            }
        });
        btnSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectActionPerformed(evt);
            }
        });

        btnCancel.setBackground(new java.awt.Color(51, 51, 51));
        btnCancel.setFont(new java.awt.Font("Segoe UI Light", 0, 15)); // NOI18N
        btnCancel.setForeground(new java.awt.Color(255, 255, 255));
        btnCancel.setText("Back'");
        btnCancel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btnCancel.setContentAreaFilled(false);
        btnCancel.setOpaque(true);
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

        confirmbtn.setBackground(new java.awt.Color(51, 51, 51));
        confirmbtn.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        confirmbtn.setForeground(new java.awt.Color(255, 255, 255));
        confirmbtn.setText("Confirm Doctor");
        confirmbtn.setEnabled(false);
        confirmbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmbtnActionPerformed(evt);
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
                        .addComponent(AccPictureLbl)
                        .addGap(18, 18, 18)
                        .addComponent(lblAccName, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(confirmbtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSelect, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 670, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(AccPictureLbl))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(lblAccName, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 295, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnSelect, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(confirmbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelectActionPerformed
        try {
            new SearchProfileGUI_(names.get(listDisplay.getSelectedIndex()), emails.get(listDisplay.getSelectedIndex())).setVisible(true);
        } catch (Exception ex) {
        }
    }//GEN-LAST:event_btnSelectActionPerformed

    private void btnSelectMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSelectMouseEntered
        mouseFocusGained(btnSelect);
    }//GEN-LAST:event_btnSelectMouseEntered

    private void btnSelectMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSelectMouseExited
        mouseFocusLost(btnSelect);
    }//GEN-LAST:event_btnSelectMouseExited

    private void btnCancelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelMouseEntered
        mouseFocusGained(btnCancel);
    }//GEN-LAST:event_btnCancelMouseEntered

    private void btnCancelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelMouseExited
        mouseFocusLost(btnCancel);
    }//GEN-LAST:event_btnCancelMouseExited

    private void listDisplayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listDisplayMouseClicked
        //if (evt.getClickCount() == 2) {
        //  selectedPatient();
        //}
    }//GEN-LAST:event_listDisplayMouseClicked

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        close();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        close();
    }//GEN-LAST:event_formWindowClosing

    private void confirmbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmbtnActionPerformed
        try {
            new appointment_GUI(email).setVisible(true);
        } catch (Exception ex) {
        }
    }//GEN-LAST:event_confirmbtnActionPerformed

    private void mouseFocusGained(JButton btn) {
        btn.setContentAreaFilled(true);
    }

    private void mouseFocusLost(JButton btn) {
        btn.setContentAreaFilled(false);
        btn.setOpaque(true);
    }

    private void close() {
        this.dispose();
        if (calledFromCreatePrescription) {
            CreatePrescriptionGUI.staticObject.setVisible(true);
        } else {
            appointment_GUI.staticObject.setVisible(true);
        }
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
            java.util.logging.Logger.getLogger(SearchProfileGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SearchProfileGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SearchProfileGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SearchProfileGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold> 
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AccPictureLbl;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnSelect;
    private javax.swing.JButton confirmbtn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAccName;
    private static javax.swing.JList<String> listDisplay;
    // End of variables declaration//GEN-END:variables
}
