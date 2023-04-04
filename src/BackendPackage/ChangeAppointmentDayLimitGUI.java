package BackendPackage;

import java.awt.Font;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ChangeAppointmentDayLimitGUI extends javax.swing.JFrame {

    private JFrame parentFrame;
    private String email, name, days = "";
    private String type, details;

    public ChangeAppointmentDayLimitGUI() {
        initComponents();
    }

    public ChangeAppointmentDayLimitGUI(JFrame frame, String email, String name) {
        initComponents();
        try {
            BufferedImage img1 = ImageIO.read(getClass().getResource("/Icons/Hospital_3_48px.png"));
            setIconImage(img1);
        } catch (IOException e) {
        }
        //setSize(560, 590);
        setTitle("Change Doctor Appointment Limit");
        setResizable(false);
        setLocationRelativeTo(null);
        parentFrame = frame;
        this.email = email;
        this.name = name;
        lblAccName.setText(this.name);
        lblAccName.requestFocus();
        doctorsListTable.getTableHeader().setFont(new Font("Segoe UI Semilight", Font.PLAIN, 20));
        doctorsListTable.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 18));
    }

    public ChangeAppointmentDayLimitGUI(JFrame frame, String email, String name, String searchKey, String type, String details) {
        initComponents();
        try {
            BufferedImage img1 = ImageIO.read(getClass().getResource("/Icons/Hospital_3_48px.png"));
            setIconImage(img1);
        } catch (IOException e) {
        }
        //setSize(560, 590);
        setTitle("Change Doctor Appointment Limit");
        setResizable(false);
        setLocationRelativeTo(null);
        parentFrame = frame;
        this.email = email;
        this.name = name;
        this.type = type;
        this.details = details;
        lblAccName.setText(this.name);
        lblAccName.requestFocus();
        txtboxDoctorSearch.setText(searchKey);
        doctorsListTable.getTableHeader().setFont(new Font("Segoe UI Semilight", Font.PLAIN, 20));
        doctorsListTable.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 18));
        search();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnSearch = new javax.swing.JButton();
        txtboxDoctorSearch = new javax.swing.JTextField();
        AccPictureLbl = new javax.swing.JLabel();
        lblAccName = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        doctorsListTable = new javax.swing.JTable();
        btnUpdate = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        lbInfoBtn = new javax.swing.JLabel();
        lblMain = new javax.swing.JLabel();
        lblMain1 = new javax.swing.JLabel();
        day2 = new javax.swing.JRadioButton();
        day5 = new javax.swing.JRadioButton();
        day3 = new javax.swing.JRadioButton();
        day6 = new javax.swing.JRadioButton();
        day4 = new javax.swing.JRadioButton();
        day7 = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        btnSearch.setBackground(new java.awt.Color(255, 255, 255));
        btnSearch.setFont(new java.awt.Font("Segoe UI Light", 0, 15)); // NOI18N
        btnSearch.setText("Search");
        btnSearch.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btnSearch.setContentAreaFilled(false);
        btnSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSearchMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSearchMouseExited(evt);
            }
        });
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        txtboxDoctorSearch.setFont(new java.awt.Font("Segoe UI Light", 0, 15)); // NOI18N
        txtboxDoctorSearch.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtboxDoctorSearch.setText("Type doctor name or email to search...");
        txtboxDoctorSearch.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtboxDoctorSearchFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtboxDoctorSearchFocusLost(evt);
            }
        });

        AccPictureLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/User_50px.png"))); // NOI18N

        lblAccName.setFont(new java.awt.Font("Segoe UI Light", 0, 17)); // NOI18N
        lblAccName.setText("Account Name");

        doctorsListTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Doctor Name", "Doctor Email", "Days", "Timing", "Appointment Limit"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        doctorsListTable.setFillsViewportHeight(true);
        doctorsListTable.setRowHeight(40);
        doctorsListTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(doctorsListTable);

        btnUpdate.setBackground(new java.awt.Color(255, 255, 255));
        btnUpdate.setFont(new java.awt.Font("Segoe UI Light", 0, 15)); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btnUpdate.setContentAreaFilled(false);
        btnUpdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnUpdateMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnUpdateMouseExited(evt);
            }
        });
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
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

        lbInfoBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Info_32px.png"))); // NOI18N
        lbInfoBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbInfoBtnMouseClicked(evt);
            }
        });

        lblMain.setFont(new java.awt.Font("Segoe UI Light", 0, 36)); // NOI18N
        lblMain.setText("Appointment Changes");

        lblMain1.setFont(new java.awt.Font("Segoe UI Semilight", 0, 24)); // NOI18N
        lblMain1.setText("New Days");

        day2.setBackground(new java.awt.Color(255, 255, 255));
        day2.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        day2.setText("Monday");
        day2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                day2ActionPerformed(evt);
            }
        });

        day5.setBackground(new java.awt.Color(255, 255, 255));
        day5.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        day5.setText("Thursday");
        day5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                day5ActionPerformed(evt);
            }
        });

        day3.setBackground(new java.awt.Color(255, 255, 255));
        day3.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        day3.setText("Tuesday");
        day3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                day3ActionPerformed(evt);
            }
        });

        day6.setBackground(new java.awt.Color(255, 255, 255));
        day6.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        day6.setText("Friday");
        day6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                day6ActionPerformed(evt);
            }
        });

        day4.setBackground(new java.awt.Color(255, 255, 255));
        day4.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        day4.setText("Wednesday");
        day4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                day4ActionPerformed(evt);
            }
        });

        day7.setBackground(new java.awt.Color(255, 255, 255));
        day7.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        day7.setText("Saturday");
        day7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                day7ActionPerformed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(51, 51, 51));
        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 51));
        jLabel3.setText("Time Example 12:00-14:00");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtboxDoctorSearch)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbInfoBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(AccPictureLbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblAccName)
                                .addGap(303, 303, 303)
                                .addComponent(lblMain))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblMain1)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(day2)
                                        .addGap(18, 18, 18)
                                        .addComponent(day3)
                                        .addGap(18, 18, 18)
                                        .addComponent(day4)
                                        .addGap(18, 18, 18)
                                        .addComponent(day5)
                                        .addGap(18, 18, 18)
                                        .addComponent(day6)))
                                .addGap(18, 18, 18)
                                .addComponent(day7)))
                        .addGap(0, 548, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(325, 325, 325))
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
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtboxDoctorSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 281, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblMain1)
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(day2)
                            .addComponent(day3)
                            .addComponent(day4)
                            .addComponent(day5)
                            .addComponent(day6)
                            .addComponent(day7))
                        .addGap(18, 18, 18)
                        .addComponent(lbInfoBtn))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSearchMouseEntered
        mouseFocusGained(btnSearch);
    }//GEN-LAST:event_btnSearchMouseEntered

    private void btnSearchMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSearchMouseExited
        mouseFocusLost(btnSearch);
    }//GEN-LAST:event_btnSearchMouseExited

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        search();
    }//GEN-LAST:event_btnSearchActionPerformed

    private void txtboxDoctorSearchFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtboxDoctorSearchFocusGained
        if (txtboxDoctorSearch.getText().equalsIgnoreCase("Type doctor name or email to search...")) {
            txtboxDoctorSearch.setText("");
        }
    }//GEN-LAST:event_txtboxDoctorSearchFocusGained

    private void txtboxDoctorSearchFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtboxDoctorSearchFocusLost
        if (txtboxDoctorSearch.getText().equals("")) {
            txtboxDoctorSearch.setText("Type doctor name or email to search...");
        }
    }//GEN-LAST:event_txtboxDoctorSearchFocusLost

    private void btnUpdateMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdateMouseEntered
        mouseFocusGained(btnUpdate);
    }//GEN-LAST:event_btnUpdateMouseEntered

    private void btnUpdateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdateMouseExited
        mouseFocusLost(btnUpdate);
    }//GEN-LAST:event_btnUpdateMouseExited

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        try {
            if (days.length() < 5) {
                days = doctorsListTable.getModel().getValueAt(doctorsListTable.getSelectedRow(), 2).toString();
            }
            if (days.length() > 5) {
                String email_ = doctorsListTable.getModel().getValueAt(doctorsListTable.getSelectedRow(), 1).toString();
                String timing = doctorsListTable.getModel().getValueAt(doctorsListTable.getSelectedRow(), 3).toString();
                String limit = doctorsListTable.getModel().getValueAt(doctorsListTable.getSelectedRow(), 4).toString();
                String name = doctorsListTable.getModel().getValueAt(doctorsListTable.getSelectedRow(), 0).toString();
                if (email != null) {
                    int optn = JOptionPane.showConfirmDialog(this, "Are you sure you want to update appointment settings\n"
                            + "this action will delete all previous appointments", "Confirm proceeding ?", JOptionPane.YES_NO_OPTION,
                            JOptionPane.WARNING_MESSAGE);
                    if (optn == JOptionPane.YES_OPTION) {
                        boolean status = new DatabaseClassExtended(this).updateAppointmentSettings(email_, days, timing, limit);
                        if (status) {
                            if (details != null) {
                                new DatabaseClassExtended(this).deleteRequest(email, email_, type, details, true);
                            }
                            JOptionPane.showMessageDialog(this, "Dr." + name + " appointment schedule has been updated successfully", "Changes done",
                                    JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(this, "Dr." + name + " appointment schedule has not been updated successfully", "Changes failed",
                                    JOptionPane.ERROR_MESSAGE);
                        }
                    }
                }
            }
        } catch (Exception e) {
        }

    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnCancelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelMouseEntered
        mouseFocusGained(btnCancel);
    }//GEN-LAST:event_btnCancelMouseEntered

    private void btnCancelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelMouseExited
        mouseFocusLost(btnCancel);
    }//GEN-LAST:event_btnCancelMouseExited

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        close();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void lbInfoBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbInfoBtnMouseClicked
        JOptionPane.showMessageDialog(this, "Please keep in mind that, All old appointments will be discarded", "Important Info", JOptionPane.WARNING_MESSAGE);
    }//GEN-LAST:event_lbInfoBtnMouseClicked

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        close();
    }//GEN-LAST:event_formWindowClosing

    private void day2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_day2ActionPerformed
        if (!days.contains("Monday")) {
            if (days.equals("")) {
                days += "Monday";
            } else {
                days += ",Monday";
            }
        }
        if (!day2.isSelected()) {
            if (days.contains(",Monday")) {
                days = days.replace(",Monday", "");
            } else if (days.contains("Monday,")) {
                days = days.replace("Monday,", "");
            } else {
                days = days.replace("Monday", "");
            }
        }
    }//GEN-LAST:event_day2ActionPerformed

    private void day5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_day5ActionPerformed
        if (!days.contains("Thursday")) {
            if (days.equals("")) {
                days += "Thursday";
            } else {
                days += ",Thursday";
            }
        }
        if (!day5.isSelected()) {
            if (days.contains(",Thursday")) {
                days = days.replace(",Thursday", "");
            } else if (days.contains("Thursday,")) {
                days = days.replace("Thursday,", "");
            } else {
                days = days.replace("Thursday", "");
            }
        }
    }//GEN-LAST:event_day5ActionPerformed

    private void day3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_day3ActionPerformed
        if (!days.contains("Tuesday")) {
            if (days.equals("")) {
                days += "Tuesday";
            } else {
                days += ",Tuesday";
            }
        }
        if (!day3.isSelected()) {
            if (days.contains(",Tuesday")) {
                days = days.replace(",Tuesday", "");
            } else if (days.contains("Tuesday,")) {
                days = days.replace("Tuesday,", "");
            } else {
                days = days.replace("Tuesday", "");
            }
        }
    }//GEN-LAST:event_day3ActionPerformed

    private void day6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_day6ActionPerformed
        if (!days.contains("Friday")) {
            if (days.equals("")) {
                days += "Friday";
            } else {
                days += ",Friday";
            }
        }
        if (!day6.isSelected()) {
            if (days.contains(",Friday")) {
                days = days.replace(",Friday", "");
            } else if (days.contains("Friday,")) {
                days = days.replace("Friday,", "");
            } else {
                days = days.replace("Friday", "");
            }
        }
    }//GEN-LAST:event_day6ActionPerformed

    private void day4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_day4ActionPerformed
        if (!days.contains("Wednesday")) {
            if (days.equals("")) {
                days += "Wednesday";
            } else {
                days += ",Wednesday";
            }
        }
        if (!day4.isSelected()) {
            if (days.contains(",Wednesday")) {
                days = days.replace(",Wednesday", "");
            } else if (days.contains("Wednesday,")) {
                days = days.replace("Wednesday,", "");
            } else {
                days = days.replace("Wednesday", "");
            }
        }
    }//GEN-LAST:event_day4ActionPerformed

    private void day7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_day7ActionPerformed
        if (!days.contains("Saturday")) {
            if (days.equals("")) {
                days += "Saturday";
            } else {
                days += ",Saturday";
            }
        }
        if (!day7.isSelected()) {
            if (days.contains(",Saturday")) {
                days = days.replace(",Saturday", "");
            } else if (days.contains("Saturday,")) {
                days = days.replace("Saturday,", "");
            } else {
                days = days.replace("Saturday", "");
            }
        }
    }//GEN-LAST:event_day7ActionPerformed

    private void search() {
        if (!txtboxDoctorSearch.getText().equalsIgnoreCase("Type doctor name or email to search...") && !txtboxDoctorSearch.getText().equals("")) {
            txtboxDoctorSearch.setText(txtboxDoctorSearch.getText().toLowerCase());
            boolean isEmail = txtboxDoctorSearch.getText().contains("@");
            new DatabaseClassExtended(this).searchDoctorsFromDBForAppointmentsLimitUpdate(txtboxDoctorSearch.getText(), isEmail);
        } else {
            JOptionPane.showMessageDialog(this, "Invalid patient name", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void close() {
        parentFrame.setVisible(true);
        this.dispose();
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
                if ("Windows".equalsIgnoreCase(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ChangeAppointmentDayLimitGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChangeAppointmentDayLimitGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChangeAppointmentDayLimitGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChangeAppointmentDayLimitGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChangeAppointmentDayLimitGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AccPictureLbl;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JRadioButton day2;
    private javax.swing.JRadioButton day3;
    private javax.swing.JRadioButton day4;
    private javax.swing.JRadioButton day5;
    private javax.swing.JRadioButton day6;
    private javax.swing.JRadioButton day7;
    protected static javax.swing.JTable doctorsListTable;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbInfoBtn;
    private javax.swing.JLabel lblAccName;
    private javax.swing.JLabel lblMain;
    private javax.swing.JLabel lblMain1;
    private javax.swing.JTextField txtboxDoctorSearch;
    // End of variables declaration//GEN-END:variables
}
