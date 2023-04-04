package BackendPackage;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.*;
import javax.imageio.ImageIO;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class AppointmentPatientGUI extends javax.swing.JFrame {

    private String email, name;
    private boolean isDayConfirmedSelected = false;
    private int[] days;
    protected static ArrayList<String> namesFromDB = new ArrayList<>();
    protected static ArrayList<String> emailsFromDB = new ArrayList<>();
    protected static ArrayList<String> professionsFromDB = new ArrayList<>();
    protected static ArrayList<String> qualificationsFromDB = new ArrayList<>();
    protected static ArrayList<String> timingsFromDB = new ArrayList<>();
    protected static ArrayList<String> daysFromDB = new ArrayList<>();
    protected static String appointmentDate;

    public AppointmentPatientGUI() {
        initComponents();
    }

    public AppointmentPatientGUI(String email, String name) {
        initComponents();
        try {
            BufferedImage img1 = ImageIO.read(getClass().getResource("/Icons/Hospital_3_48px.png"));
            setIconImage(img1);
        } catch (IOException e) {
        }
        //setSize(560, 590);
        setTitle("New Appointment Schedule");
        setResizable(false);
        setLocationRelativeTo(null);
        this.email = email;
        this.name = name;
        lblAccName.setText(this.name);
        lblAccName.requestFocusInWindow();
        drListTable.getTableHeader().setFont(new Font("Segoe UI Semilight", Font.PLAIN, 20));
        drListTable.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 18));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblMain = new javax.swing.JLabel();
        txtboxSearch = new javax.swing.JTextField();
        drNameRadioBtn = new javax.swing.JRadioButton();
        lblMain1 = new javax.swing.JLabel();
        professionRadioBtn = new javax.swing.JRadioButton();
        btnSearch = new javax.swing.JButton();
        AccPictureLbl = new javax.swing.JLabel();
        lblAccName = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        drListTable = new javax.swing.JTable();
        btnConfirm = new javax.swing.JButton();
        displayAllRadioBtn = new javax.swing.JRadioButton();
        btnCancel = new javax.swing.JButton();
        btnDeleteAppointment = new javax.swing.JButton();
        lbl1 = new javax.swing.JLabel();
        btnSelectDate = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("New Appointment Schedule");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        lblMain.setFont(new java.awt.Font("Segoe UI Light", 0, 36)); // NOI18N
        lblMain.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMain.setText("Appointment");
        lblMain.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        txtboxSearch.setFont(new java.awt.Font("Segoe UI Light", 0, 15)); // NOI18N
        txtboxSearch.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtboxSearch.setText("Type doctor name to search...");
        txtboxSearch.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtboxSearchFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtboxSearchFocusLost(evt);
            }
        });

        drNameRadioBtn.setFont(new java.awt.Font("Segoe UI Semilight", 0, 16)); // NOI18N
        drNameRadioBtn.setSelected(true);
        drNameRadioBtn.setText("Doctor Name");
        drNameRadioBtn.setContentAreaFilled(false);
        drNameRadioBtn.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        drNameRadioBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        drNameRadioBtn.setIconTextGap(1);
        drNameRadioBtn.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        drNameRadioBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drNameRadioBtnActionPerformed(evt);
            }
        });

        lblMain1.setFont(new java.awt.Font("Segoe UI Light", 0, 26)); // NOI18N
        lblMain1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMain1.setText("Search By:");
        lblMain1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        professionRadioBtn.setFont(new java.awt.Font("Segoe UI Semilight", 0, 16)); // NOI18N
        professionRadioBtn.setText("Profession");
        professionRadioBtn.setContentAreaFilled(false);
        professionRadioBtn.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        professionRadioBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        professionRadioBtn.setIconTextGap(1);
        professionRadioBtn.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        professionRadioBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                professionRadioBtnActionPerformed(evt);
            }
        });

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

        AccPictureLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/User_50px.png"))); // NOI18N

        lblAccName.setFont(new java.awt.Font("Segoe UI Light", 0, 17)); // NOI18N
        lblAccName.setText("Account Name");

        drListTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "S. No", "Doctor Name", "Profession", "Qualification", "Days", "Timing"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        drListTable.setFillsViewportHeight(true);
        drListTable.setRowHeight(40);
        drListTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        drListTable.getTableHeader().setReorderingAllowed(false);
        drListTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                drListTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(drListTable);
        if (drListTable.getColumnModel().getColumnCount() > 0) {
            drListTable.getColumnModel().getColumn(0).setMinWidth(60);
            drListTable.getColumnModel().getColumn(0).setPreferredWidth(60);
            drListTable.getColumnModel().getColumn(0).setMaxWidth(60);
        }

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

        displayAllRadioBtn.setFont(new java.awt.Font("Segoe UI Semilight", 0, 16)); // NOI18N
        displayAllRadioBtn.setText("Display All");
        displayAllRadioBtn.setContentAreaFilled(false);
        displayAllRadioBtn.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        displayAllRadioBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        displayAllRadioBtn.setIconTextGap(1);
        displayAllRadioBtn.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        displayAllRadioBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayAllRadioBtnActionPerformed(evt);
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

        btnDeleteAppointment.setBackground(new java.awt.Color(255, 255, 255));
        btnDeleteAppointment.setFont(new java.awt.Font("Segoe UI Light", 0, 15)); // NOI18N
        btnDeleteAppointment.setText("Appointment Cancellation");
        btnDeleteAppointment.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btnDeleteAppointment.setContentAreaFilled(false);
        btnDeleteAppointment.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDeleteAppointmentMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDeleteAppointmentMouseExited(evt);
            }
        });
        btnDeleteAppointment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteAppointmentActionPerformed(evt);
            }
        });

        lbl1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 17)); // NOI18N
        lbl1.setText("Select Day For Appointment");

        btnSelectDate.setBackground(new java.awt.Color(255, 255, 255));
        btnSelectDate.setFont(new java.awt.Font("Segoe UI Light", 0, 15)); // NOI18N
        btnSelectDate.setText("Select Date For Appointment");
        btnSelectDate.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btnSelectDate.setContentAreaFilled(false);
        btnSelectDate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSelectDateMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSelectDateMouseExited(evt);
            }
        });
        btnSelectDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectDateActionPerformed(evt);
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
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtboxSearch)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(AccPictureLbl)
                                .addGap(18, 18, 18)
                                .addComponent(lblAccName)
                                .addGap(343, 343, 343)
                                .addComponent(lblMain))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnDeleteAppointment, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(223, 223, 223)
                                .addComponent(lblMain1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(drNameRadioBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(professionRadioBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(displayAllRadioBtn))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lbl1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnSelectDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 792, Short.MAX_VALUE)
                                .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
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
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtboxSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(drNameRadioBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                    .addComponent(professionRadioBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblMain1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnDeleteAppointment, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(displayAllRadioBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(lbl1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSelectDate, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtboxSearchFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtboxSearchFocusGained
        if (drNameRadioBtn.isSelected()) {
            if (txtboxSearch.getText().equals("Type doctor name to search...")) {
                txtboxSearch.setText("");
            }
        }
        if (professionRadioBtn.isSelected()) {
            if (txtboxSearch.getText().equals("Type profession to search...")) {
                txtboxSearch.setText("");
            }
        }
    }//GEN-LAST:event_txtboxSearchFocusGained

    private void txtboxSearchFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtboxSearchFocusLost
        if (drNameRadioBtn.isSelected()) {
            if (txtboxSearch.getText().equals("")) {
                txtboxSearch.setText("Type doctor name to search...");
            }
        }
        if (professionRadioBtn.isSelected()) {
            if (txtboxSearch.getText().equals("")) {
                txtboxSearch.setText("Type profession to search...");
            }
        }
    }//GEN-LAST:event_txtboxSearchFocusLost

    private void drNameRadioBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drNameRadioBtnActionPerformed
        if (drNameRadioBtn.isSelected()) {
            txtboxSearch.setEnabled(true);
            if (txtboxSearch.getText().equals("Type profession to search...")) {
                txtboxSearch.setText("Type doctor name to search...");
            }
        }
        if (!drNameRadioBtn.isSelected()) {
            drNameRadioBtn.setSelected(true);
        }
        professionRadioBtn.setSelected(false);
        displayAllRadioBtn.setSelected(false);
    }//GEN-LAST:event_drNameRadioBtnActionPerformed

    private void professionRadioBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_professionRadioBtnActionPerformed
        if (professionRadioBtn.isSelected()) {
            txtboxSearch.setEnabled(true);
            if (txtboxSearch.getText().equals("Type doctor name to search...")) {
                txtboxSearch.setText("Type profession to search...");
            }
        }
        if (!professionRadioBtn.isSelected()) {
            professionRadioBtn.setSelected(true);
        }
        drNameRadioBtn.setSelected(false);
        displayAllRadioBtn.setSelected(false);
    }//GEN-LAST:event_professionRadioBtnActionPerformed

    private void btnSearchMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSearchMouseEntered
        mouseFocusGained(btnSearch);
    }//GEN-LAST:event_btnSearchMouseEntered

    private void btnSearchMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSearchMouseExited
        mouseFocusLost(btnSearch);
    }//GEN-LAST:event_btnSearchMouseExited

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        if (drNameRadioBtn.isSelected()) {
            if (!txtboxSearch.getText().equals("Type doctor name to search...") && !txtboxSearch.getText().equals("")) {
                boolean status = new DatabaseClassExtended(this).searchDoctorsFromDB(txtboxSearch.getText().replaceAll("\\s+", ""), true, false);
                if (!status) {
                    isDayConfirmedSelected = false;
//                    appointmentDaysComboBox.setEnabled(false);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Invalid Name", "Name Typo", JOptionPane.ERROR_MESSAGE);
            }
        }
        if (professionRadioBtn.isSelected()) {
            if (!txtboxSearch.getText().equals("Type profession to search...") && !txtboxSearch.getText().equals("")) {
                boolean status = new DatabaseClassExtended(this).searchDoctorsFromDB(txtboxSearch.getText().replaceAll("\\s+", ""), false, false);
                if (!status) {
                    isDayConfirmedSelected = false;
//                    appointmentDaysComboBox.setEnabled(false);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Invalid Name", "Name Typo", JOptionPane.ERROR_MESSAGE);
            }
        }
        if (displayAllRadioBtn.isSelected()) {
            boolean status = new DatabaseClassExtended(this).searchDoctorsFromDB(null, false, true);
            if (!status) {
                isDayConfirmedSelected = false;
//                appointmentDaysComboBox.setEnabled(false);
            }
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        close();
    }//GEN-LAST:event_formWindowClosing

    private void btnConfirmMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConfirmMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnConfirmMouseEntered

    private void btnConfirmMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConfirmMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnConfirmMouseExited

    private void btnConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmActionPerformed
        if (isDayConfirmedSelected) {
//            boolean isPossible = confirmDayPossible((String) appointmentDaysComboBox.getSelectedItem(), timingsFromDB.get(drListTable.getSelectedRow()));
//            if (isPossible) {
            boolean status = new DatabaseClassExtended(this).sheduleAppointment(emailsFromDB.get(drListTable.getSelectedRow()), namesFromDB.get(drListTable.getSelectedRow()),
                    email, name, appointmentDate);
//                if (!status) {
//                }
//            }
        }
    }//GEN-LAST:event_btnConfirmActionPerformed

    private void displayAllRadioBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayAllRadioBtnActionPerformed
        if (displayAllRadioBtn.isSelected()) {
            txtboxSearch.setEnabled(false);
        }
        if (!displayAllRadioBtn.isSelected()) {
            displayAllRadioBtn.setSelected(true);
        }
        drNameRadioBtn.setSelected(false);
        professionRadioBtn.setSelected(false);
    }//GEN-LAST:event_displayAllRadioBtnActionPerformed

    private void drListTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_drListTableMouseClicked
        try {
            if (drListTable.getModel().getValueAt(drListTable.getSelectedRow(), drListTable.getSelectedColumn()) != null
                    && !drListTable.getModel().getValueAt(drListTable.getSelectedRow(), drListTable.getSelectedColumn()).toString().equals("")) {
                DefaultComboBoxModel tempModel = new DefaultComboBoxModel();
                String[] tempStringData = drListTable.getModel().getValueAt(drListTable.getSelectedRow(), 4).toString().split(",");
                for (String i : tempStringData) {
                    tempModel.addElement(i);
                }
                days = new int[tempStringData.length];
                for (int i = 0; i < tempStringData.length; i++) {
                    days[i] = getDayNumber(tempStringData[i]);
                }
//                appointmentDaysComboBox.setModel(tempModel);
//                appointmentDaysComboBox.setEnabled(true);
                isDayConfirmedSelected = true;
            } else {
                isDayConfirmedSelected = false;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_drListTableMouseClicked

    private void btnCancelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelMouseEntered
        mouseFocusGained(btnCancel);
    }//GEN-LAST:event_btnCancelMouseEntered

    private void btnCancelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelMouseExited
        mouseFocusLost(btnCancel);
    }//GEN-LAST:event_btnCancelMouseExited

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        close();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnDeleteAppointmentMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteAppointmentMouseEntered
        mouseFocusGained(btnDeleteAppointment);
    }//GEN-LAST:event_btnDeleteAppointmentMouseEntered

    private void btnDeleteAppointmentMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteAppointmentMouseExited
        mouseFocusLost(btnDeleteAppointment);
    }//GEN-LAST:event_btnDeleteAppointmentMouseExited

    private void btnDeleteAppointmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteAppointmentActionPerformed
        int optn = JOptionPane.showConfirmDialog(this, "Do you really want to cancel your scheduled appointment ?\nIf you want we will display the list of your appointments",
                "Confirm ?", JOptionPane.YES_NO_OPTION,
                JOptionPane.WARNING_MESSAGE);
        if (optn == JOptionPane.YES_OPTION) {
            new DeleteAppointmentGUI(this, email, name).setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_btnDeleteAppointmentActionPerformed

    private void btnSelectDateMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSelectDateMouseEntered
        mouseFocusGained(btnSelectDate);
    }//GEN-LAST:event_btnSelectDateMouseEntered

    private void btnSelectDateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSelectDateMouseExited
        mouseFocusLost(btnSelectDate);
    }//GEN-LAST:event_btnSelectDateMouseExited

    private void btnSelectDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelectDateActionPerformed
        if (isDayConfirmedSelected) {
            new CalendarDatePickerGUI(this, days, emailsFromDB.get(drListTable.getSelectedRow())).setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_btnSelectDateActionPerformed

    private String getTodayName() {
        LocalDateTime ldt = LocalDateTime.now();
        int dayNumberValue = ldt.getDayOfWeek().getValue();
        String stringDay = "";
        switch (dayNumberValue) {
            case 1:
                stringDay = "Monday";
                break;
            case 2:
                stringDay = "Tuesday";
                break;
            case 3:
                stringDay = "Wednesday";
                break;
            case 4:
                stringDay = "Thursday";
                break;
            case 5:
                stringDay = "Friday";
                break;
            case 6:
                stringDay = "Saturday";
                break;
            case 7:
                stringDay = "Sunday";
                break;
        }
        return stringDay;
    }

    private int getDayNumber(String dayName) {
        dayName = dayName.toLowerCase();
        int intDay = 0;
        switch (dayName) {
            case "monday":
                intDay = 1;
                break;
            case "tuesday":
                intDay = 2;
                break;
            case "wednesday":
                intDay = 3;
                break;
            case "thursday":
                intDay = 4;
                break;
            case "friday":
                intDay = 5;
                break;
            case "saturday":
                intDay = 6;
                break;
            case "sunday":
                intDay = 7;
                break;
        }
        return intDay;
    }

    /* private boolean confirmDayPossible(String day, String drTime) {
        LocalDateTime ldt = LocalDateTime.now();
        String[] drTimeSplit = drTime.split("-");
        String drTimeMoreSplits[] = drTimeSplit[1].split(":");
        int drHour = Integer.parseInt(drTimeMoreSplits[0].replaceAll("\\s+", ""));
        int drMinute = Integer.parseInt(drTimeMoreSplits[1].replaceAll("\\s+", ""));
        int currentHour = ldt.getHour();
        int currentMinute = ldt.getMinute();
        int finalHour = drHour - currentHour;
        int finalMinute = drMinute - currentMinute;
        finalHour *= 60;
        finalHour -= finalMinute;
        if (day.equalsIgnoreCase(getTodayName())) {
            if (finalHour >= 30) {
                return true;
            } else {
                JOptionPane.showMessageDialog(this, "Today shedule is not possible", "Shedule Error", JOptionPane.ERROR_MESSAGE);
                return false;
            }
        }
        if (getDayNumber(getTodayName()) > 1 && getDayNumber(day) < getDayNumber(getTodayName())) {
            JOptionPane.showMessageDialog(this, "Past day cannot be use for shedule", "Shedule Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (getDayNumber(getTodayName()) == 1 && getDayNumber(day) > getDayNumber(getTodayName())) {
            JOptionPane.showMessageDialog(this, "Past day cannot be use for shedule", "Shedule Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }*/
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
            java.util.logging.Logger.getLogger(AppointmentPatientGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AppointmentPatientGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AppointmentPatientGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AppointmentPatientGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AppointmentPatientGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AccPictureLbl;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnConfirm;
    private javax.swing.JButton btnDeleteAppointment;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnSelectDate;
    private javax.swing.JRadioButton displayAllRadioBtn;
    protected static javax.swing.JTable drListTable;
    private javax.swing.JRadioButton drNameRadioBtn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lblAccName;
    private javax.swing.JLabel lblMain;
    private javax.swing.JLabel lblMain1;
    private javax.swing.JRadioButton professionRadioBtn;
    private javax.swing.JTextField txtboxSearch;
    // End of variables declaration//GEN-END:variables
}
