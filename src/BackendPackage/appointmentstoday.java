package BackendPackage;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class appointmentstoday extends javax.swing.JFrame {

    private Statement statement;
    private ResultSet result;
    private int front = -1;
    private int count = 30;
    private DefaultListModel listed = new DefaultListModel();
    private String email1;
    private String serverAddress = DatabaseClass.serverAddress;
    private String hostName = "anas";
    private String hostPassword = "anas@";
    private Connection connection;

    public appointmentstoday(String email) {
        initComponents();
        try {
            connection = DriverManager.getConnection("jdbc:mysql://" + serverAddress + ":3306/ehospital_db?verifyServerCertificate=false&useSSL=false", hostName, hostPassword);
            statement = connection.createStatement();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(MenuGUI.staticObject, "Connection lost with server", "No internet connection", JOptionPane.ERROR_MESSAGE);
        }
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.white);
        try {
            this.email1 = email;
            String query = "", check = "";
            query = "select * from `" + email1 + "_appointment`;";
            result = statement.executeQuery(query);
            while (result.next()) {
                check += result.getString("ID");
                check += "\n";
                check += result.getString("patientemail");
                check += "\n";
                check += result.getString("patientname");
                check += "\n";
                check = result.getString("dayandtime");
                check += "\n";
                listed.addElement(check);
            }
            list.setModel(listed);
        } catch (Exception e) {
        }
    }

    void dequeue() {
        if (front <= count) {
            front++;
        } else {
            JOptionPane.showMessageDialog(null, "No more appointments for today!");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        list = new javax.swing.JList<>();
        nextbtn = new javax.swing.JButton();
        backbtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 51));

        jScrollPane1.setViewportView(list);

        nextbtn.setBackground(new java.awt.Color(255, 255, 255));
        nextbtn.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        nextbtn.setText("Next");
        nextbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextbtnActionPerformed(evt);
            }
        });

        backbtn.setBackground(new java.awt.Color(255, 255, 255));
        backbtn.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        backbtn.setText("Back");
        backbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(backbtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(nextbtn)
                .addGap(42, 42, 42))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nextbtn)
                    .addComponent(backbtn))
                .addGap(0, 10, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nextbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextbtnActionPerformed
        String query = "", check = "", query1 = "";
        try {
            dequeue();
            query1 = "delete from `" + email1 + "_appointment` where ID = '" + front + "';";
            statement.executeQuery(query1);
            query = "select * from `" + email1 + "_appointment`;";
            result = statement.executeQuery(query);
            while (result.next()) {
                listed.addElement(result.getString("ID"));
                listed.addElement(result.getString("patientemail"));
                listed.addElement(result.getString("patientname"));
                listed.addElement(result.getString("dayandtime"));                
            }
            list.setModel(listed);
        } catch (Exception ex) {
        }
    }//GEN-LAST:event_nextbtnActionPerformed

    private void backbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtnActionPerformed
        close();
    }//GEN-LAST:event_backbtnActionPerformed
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
            java.util.logging.Logger.getLogger(appointmentstoday.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(appointmentstoday.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(appointmentstoday.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(appointmentstoday.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new appointmentstoday("").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backbtn;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> list;
    private javax.swing.JButton nextbtn;
    // End of variables declaration//GEN-END:variables
}
