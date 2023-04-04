package BackendPackage;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class CalendarDatePickerGUI extends javax.swing.JFrame {

    protected static ArrayList<String> reservedDates = new ArrayList<>();
    private JFrame parentFrame;
    private String doctorEmail;

    public CalendarDatePickerGUI() {
        initComponents();
    }

    public CalendarDatePickerGUI(JFrame frame, int[] days, String drEmail) {
        try {
            initComponents();
            try {
                BufferedImage img1 = ImageIO.read(getClass().getResource("/Icons/Hospital_3_48px.png"));
                setIconImage(img1);
            } catch (IOException e) {
            }
            //setSize(560, 590);
            setTitle("Select Appointment Date");
            setResizable(false);
            setLocationRelativeTo(null);
            parentFrame = frame;
            doctorEmail = drEmail;
            boolean status = refresh();
            if (status) {
                DateValidatorClass date = new DateValidatorClass(days, reservedDates);
                calendar.setMinSelectableDate(new Date());
                calendar.getDayChooser().addDateEvaluator(date);
                calendar.updateUI();
                calendar.repaint();
                calendar.revalidate();
            } else {
                close();
            }
        } catch (Exception ex) {
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        calendar = new com.toedter.calendar.JCalendar();
        btnConfirm = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Select Appointment Date");
        setBackground(new java.awt.Color(255, 255, 255));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        calendar.setBackground(new java.awt.Color(255, 255, 255));
        calendar.setDecorationBackgroundColor(new java.awt.Color(255, 204, 204));
        calendar.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        calendar.setWeekOfYearVisible(false);
        calendar.setWeekdayForeground(new java.awt.Color(0, 0, 153));
        calendar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                calendarMouseClicked(evt);
            }
        });

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(221, 221, 221)
                .addComponent(btnConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(224, Short.MAX_VALUE))
            .addComponent(calendar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(calendar, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(btnConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void calendarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calendarMouseClicked
        System.out.println(calendar.getDate().toString());
        System.out.println("work");
    }//GEN-LAST:event_calendarMouseClicked

    private void btnConfirmMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConfirmMouseEntered
        mouseFocusGained(btnConfirm);
    }//GEN-LAST:event_btnConfirmMouseEntered

    private void btnConfirmMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConfirmMouseExited
        mouseFocusLost(btnConfirm);
    }//GEN-LAST:event_btnConfirmMouseExited

    private void btnConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmActionPerformed
        int year = calendar.getCalendar().get(Calendar.YEAR);
        int month = calendar.getCalendar().get(Calendar.MONTH) + 1;
        int day = calendar.getCalendar().get(Calendar.DAY_OF_MONTH);
        String finalDate = year + "-" + month + "-" + day;
        for (String i : reservedDates) {
            if (finalDate.equals(i)) {
                return;
            }
        }
        int optn = JOptionPane.showConfirmDialog(this, "Are you sure you want to schedule appointment on date " + finalDate, "Confirm ?", JOptionPane.YES_NO_OPTION,
                JOptionPane.WARNING_MESSAGE);
        if (optn == JOptionPane.YES_OPTION) {
            AppointmentPatientGUI.appointmentDate = finalDate;
            close();
        }
    }//GEN-LAST:event_btnConfirmActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        close();
    }//GEN-LAST:event_formWindowClosing

    private boolean refresh() {
        return new DatabaseClassExtended(this).getReservedDates(doctorEmail);
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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CalendarDatePickerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalendarDatePickerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalendarDatePickerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalendarDatePickerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalendarDatePickerGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConfirm;
    private static com.toedter.calendar.JCalendar calendar;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

}
