package BackendPackage;

import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import javax.imageio.ImageIO;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class CreatePrescriptionGUI extends javax.swing.JFrame {

    public static CreatePrescriptionGUI staticObject;
    private String email, name, uniqueCode;
    public static String patientEmail = "", patientName = "";
    private ArrayList<String> medicineNamesList = new ArrayList<>();
    private ArrayList<String> medicineStrengthList = new ArrayList<>();
    private ArrayList<Integer> medicineDurationList = new ArrayList<>();
    private ArrayList<String> medicineDayDuration = new ArrayList<>();
    int totalCycleDays; 

    public CreatePrescriptionGUI() {
        initComponents();
        uniqueCode = generateRandomPrescriptionCode();
    }

    public CreatePrescriptionGUI(String email, String name) {
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
        uniqueCode = generateRandomPrescriptionCode();
        lblAccName.setText(this.name);
        lblAccName.requestFocusInWindow();
    }

    private String generateRandomPrescriptionCode() {
        Random random = new Random();
        long number = random.nextLong();
        String convert = Long.toString(number);
        String c_ = "";
        int i = 0;
        for (char i_ : convert.toCharArray()) {

            if (i == 3) {
                c_ += "-";
                i = 0;
            }
            c_ += i_;
            i++;

        }
        return c_;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        AccPictureLbl = new javax.swing.JLabel();
        lblAccName = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtareaMedicineListWrited = new javax.swing.JTextArea();
        txtboxPatientNameSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        btnCreatePrescription = new javax.swing.JButton();
        lblIssuingTo = new javax.swing.JLabel();
        lblPatientNameEmail = new javax.swing.JLabel();
        btnCancel = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtareaMedicineStrength = new javax.swing.JTextArea();
        lblPrescriptionBtn = new javax.swing.JLabel();
        reuseableCheckbox = new javax.swing.JCheckBox();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtareaMedicineDuration = new javax.swing.JTextArea();
        txtboxTotalDurationCycle = new javax.swing.JTextField();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Issue Prescription");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        AccPictureLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/User_50px.png"))); // NOI18N

        lblAccName.setFont(new java.awt.Font("Segoe UI Light", 0, 17)); // NOI18N
        lblAccName.setText("Account Name");

        txtareaMedicineListWrited.setColumns(20);
        txtareaMedicineListWrited.setFont(new java.awt.Font("Segoe UI Light", 0, 15)); // NOI18N
        txtareaMedicineListWrited.setRows(5);
        txtareaMedicineListWrited.setText("Write Medicine name here...");
        txtareaMedicineListWrited.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtareaMedicineListWritedFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtareaMedicineListWritedFocusLost(evt);
            }
        });
        txtareaMedicineListWrited.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtareaMedicineListWritedKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(txtareaMedicineListWrited);

        txtboxPatientNameSearch.setFont(new java.awt.Font("Segoe UI Light", 0, 15)); // NOI18N
        txtboxPatientNameSearch.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtboxPatientNameSearch.setText("Type patient name to search...");
        txtboxPatientNameSearch.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtboxPatientNameSearchFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtboxPatientNameSearchFocusLost(evt);
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

        btnCreatePrescription.setBackground(new java.awt.Color(255, 255, 255));
        btnCreatePrescription.setFont(new java.awt.Font("Segoe UI Light", 0, 15)); // NOI18N
        btnCreatePrescription.setText("Create prescription");
        btnCreatePrescription.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btnCreatePrescription.setContentAreaFilled(false);
        btnCreatePrescription.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCreatePrescriptionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCreatePrescriptionMouseExited(evt);
            }
        });
        btnCreatePrescription.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreatePrescriptionActionPerformed(evt);
            }
        });

        lblIssuingTo.setFont(new java.awt.Font("Segoe UI Light", 0, 17)); // NOI18N
        lblIssuingTo.setText("Issuing to:");

        lblPatientNameEmail.setFont(new java.awt.Font("Segoe UI Light", 0, 17)); // NOI18N
        lblPatientNameEmail.setText("No patient specified...");

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

        txtareaMedicineStrength.setColumns(20);
        txtareaMedicineStrength.setFont(new java.awt.Font("Segoe UI Light", 0, 15)); // NOI18N
        txtareaMedicineStrength.setLineWrap(true);
        txtareaMedicineStrength.setRows(5);
        txtareaMedicineStrength.setText("Strength...");
        txtareaMedicineStrength.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtareaMedicineStrengthFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtareaMedicineStrengthFocusLost(evt);
            }
        });
        txtareaMedicineStrength.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtareaMedicineStrengthKeyPressed(evt);
            }
        });
        jScrollPane3.setViewportView(txtareaMedicineStrength);

        lblPrescriptionBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Info_32px.png"))); // NOI18N
        lblPrescriptionBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblPrescriptionBtnMouseClicked(evt);
            }
        });

        reuseableCheckbox.setBackground(new java.awt.Color(255, 255, 255));
        reuseableCheckbox.setFont(new java.awt.Font("Segoe UI Light", 0, 15)); // NOI18N
        reuseableCheckbox.setText("Reusable");

        txtareaMedicineDuration.setColumns(20);
        txtareaMedicineDuration.setFont(new java.awt.Font("Segoe UI Light", 0, 15)); // NOI18N
        txtareaMedicineDuration.setLineWrap(true);
        txtareaMedicineDuration.setRows(5);
        txtareaMedicineDuration.setText("Day Duration...");
        txtareaMedicineDuration.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtareaMedicineDurationFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtareaMedicineDurationFocusLost(evt);
            }
        });
        txtareaMedicineDuration.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtareaMedicineDurationKeyPressed(evt);
            }
        });
        jScrollPane4.setViewportView(txtareaMedicineDuration);

        txtboxTotalDurationCycle.setFont(new java.awt.Font("Segoe UI Light", 0, 15)); // NOI18N
        txtboxTotalDurationCycle.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtboxTotalDurationCycle.setText("Total duration cycle...");
        txtboxTotalDurationCycle.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtboxTotalDurationCycleFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtboxTotalDurationCycleFocusLost(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(AccPictureLbl)
                        .addGap(18, 18, 18)
                        .addComponent(lblAccName))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(txtboxPatientNameSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(lblIssuingTo)
                        .addGap(7, 7, 7)
                        .addComponent(lblPatientNameEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(reuseableCheckbox))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(lblPrescriptionBtn)
                        .addGap(280, 280, 280)
                        .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(btnCreatePrescription, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtboxTotalDurationCycle, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AccPictureLbl)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(lblAccName)))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtboxPatientNameSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblIssuingTo)
                    .addComponent(lblPatientNameEmail))
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addComponent(txtboxTotalDurationCycle, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(reuseableCheckbox)
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(lblPrescriptionBtn))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnCreatePrescription, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtboxPatientNameSearchFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtboxPatientNameSearchFocusGained
        if (txtboxPatientNameSearch.getText().equals("Type patient name to search...")) {
            txtboxPatientNameSearch.setText("");
        }
    }//GEN-LAST:event_txtboxPatientNameSearchFocusGained

    private void txtboxPatientNameSearchFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtboxPatientNameSearchFocusLost
        if (txtboxPatientNameSearch.getText().equals("")) {
            txtboxPatientNameSearch.setText("Type patient name to search...");
        }
    }//GEN-LAST:event_txtboxPatientNameSearchFocusLost

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        close();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        close();
    }//GEN-LAST:event_formWindowClosing

    private void btnCreatePrescriptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreatePrescriptionActionPerformed
        if (!patientEmail.equals("") && !patientName.equals("")) {
            boolean status1 = getMedicinesIssued();
            if (!status1) {
                return;
            }
            boolean reusable = false;
            if (reuseableCheckbox.isSelected()) {
                reusable = true;
            }
            boolean creationStatus = new DatabaseClass(this).createPrescription(email, patientEmail, name, patientName, medicineNamesList,
                    medicineStrengthList, medicineDayDuration, medicineDurationList, totalCycleDays, uniqueCode, reusable);
            if (creationStatus) {
                uniqueCode = generateRandomPrescriptionCode();
                JOptionPane.showMessageDialog(this, "Prescription issued successfully to " + patientName, "Prescription status", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Prescription does not issued successfully to " + patientName, "Prescription status", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Please select a patient to issue prescription!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnCreatePrescriptionActionPerformed

    private void txtareaMedicineListWritedFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtareaMedicineListWritedFocusGained
        if (txtareaMedicineListWrited.getText().equals("Write Medicine name here...")) {
            txtareaMedicineListWrited.setText("");
        }
    }//GEN-LAST:event_txtareaMedicineListWritedFocusGained

    private void txtareaMedicineListWritedFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtareaMedicineListWritedFocusLost
        if (txtareaMedicineListWrited.getText().equals("")) {
            txtareaMedicineListWrited.setText("Write Medicine name here...");
        }
        String temp = txtareaMedicineListWrited.getText().replaceAll("\t", "");
        txtareaMedicineListWrited.setText(temp);
    }//GEN-LAST:event_txtareaMedicineListWritedFocusLost

    private void txtareaMedicineStrengthFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtareaMedicineStrengthFocusGained
        if (txtareaMedicineStrength.getText().equals("Strength...")) {
            txtareaMedicineStrength.setText("");
        }
    }//GEN-LAST:event_txtareaMedicineStrengthFocusGained

    private void txtareaMedicineStrengthFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtareaMedicineStrengthFocusLost
        if (txtareaMedicineStrength.getText().equals("")) {
            txtareaMedicineStrength.setText("Strength...");
        }
        String temp = txtareaMedicineStrength.getText().replaceAll("\t", "");
        txtareaMedicineStrength.setText(temp);
    }//GEN-LAST:event_txtareaMedicineStrengthFocusLost

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        if (!txtboxPatientNameSearch.getText().equals("Type patient name to search...") && !txtboxPatientNameSearch.getText().equals("")) {
            if (!txtboxPatientNameSearch.getText().matches("\\s+")) {
                DefaultListModel list = new DatabaseClass(this).searchProfile(txtboxPatientNameSearch.getText(), false);
                new SearchProfileGUI(name, list, true).setVisible(true);
                staticObject.setVisible(false);
            } else {
                JOptionPane.showMessageDialog(this, "Invalid patient name", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Invalid patient name", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void lblPrescriptionBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPrescriptionBtnMouseClicked
        JOptionPane.showMessageDialog(this, "The unique I.D for this prescription is :\n " + uniqueCode, "Prescription ID info", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_lblPrescriptionBtnMouseClicked

    private void btnCreatePrescriptionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCreatePrescriptionMouseEntered
        mouseFocusGained(btnCreatePrescription);
    }//GEN-LAST:event_btnCreatePrescriptionMouseEntered

    private void btnCreatePrescriptionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCreatePrescriptionMouseExited
        mouseFocusLost(btnCreatePrescription);
    }//GEN-LAST:event_btnCreatePrescriptionMouseExited

    private void btnCancelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelMouseEntered
        mouseFocusGained(btnCancel);
    }//GEN-LAST:event_btnCancelMouseEntered

    private void btnCancelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelMouseExited
        mouseFocusLost(btnCancel);
    }//GEN-LAST:event_btnCancelMouseExited

    private void btnSearchMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSearchMouseEntered
        mouseFocusGained(btnSearch);
    }//GEN-LAST:event_btnSearchMouseEntered

    private void btnSearchMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSearchMouseExited
        mouseFocusLost(btnSearch);
    }//GEN-LAST:event_btnSearchMouseExited

    private void txtareaMedicineStrengthKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtareaMedicineStrengthKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_TAB) {
            if (!txtareaMedicineDuration.getText().equals("Day Duration...")) {
                String temp = txtareaMedicineDuration.getText();
                txtareaMedicineDuration.setText(temp + "\n");
            }
            txtareaMedicineDuration.requestFocus();
        }
    }//GEN-LAST:event_txtareaMedicineStrengthKeyPressed

    private void txtareaMedicineListWritedKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtareaMedicineListWritedKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_TAB) {
            if (!txtareaMedicineStrength.getText().equals("Strength...")) {
                String temp = txtareaMedicineStrength.getText();
                txtareaMedicineStrength.setText(temp + "\n");
            }
            txtareaMedicineStrength.requestFocus();
        }
    }//GEN-LAST:event_txtareaMedicineListWritedKeyPressed

    private void txtareaMedicineDurationFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtareaMedicineDurationFocusGained
        if (txtareaMedicineDuration.getText().equals("Day Duration...")) {
            txtareaMedicineDuration.setText("");
        }
    }//GEN-LAST:event_txtareaMedicineDurationFocusGained

    private void txtareaMedicineDurationFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtareaMedicineDurationFocusLost
        if (txtareaMedicineDuration.getText().equals("")) {
            txtareaMedicineDuration.setText("Day Duration...");
        }
        String temp = txtareaMedicineDuration.getText().replaceAll("\t", "");
        txtareaMedicineDuration.setText(temp);
    }//GEN-LAST:event_txtareaMedicineDurationFocusLost

    private void txtareaMedicineDurationKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtareaMedicineDurationKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_TAB) {
            String temp = txtareaMedicineListWrited.getText();
            txtareaMedicineListWrited.setText(temp + "\n");
            txtareaMedicineListWrited.requestFocus();
        }
    }//GEN-LAST:event_txtareaMedicineDurationKeyPressed

    private void txtboxTotalDurationCycleFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtboxTotalDurationCycleFocusGained
        if (txtboxTotalDurationCycle.getText().equals("Total duration cycle...")) {
            txtboxTotalDurationCycle.setText("");
        }
    }//GEN-LAST:event_txtboxTotalDurationCycleFocusGained

    private void txtboxTotalDurationCycleFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtboxTotalDurationCycleFocusLost
        if (txtboxTotalDurationCycle.getText().equals("")) {
            txtboxTotalDurationCycle.setText("Total duration cycle...");
        }
    }//GEN-LAST:event_txtboxTotalDurationCycleFocusLost

    private boolean getMedicinesIssued() {
        try {
            medicineNamesList.clear();
            medicineStrengthList.clear();
            medicineDurationList.clear();
            medicineDayDuration.clear();
            String[] medicinesName = txtareaMedicineListWrited.getText().split("\n");
            String[] medicineStrength = txtareaMedicineStrength.getText().split("\n");
            String[] medicineDurationCount = txtareaMedicineDuration.getText().split("\n");
            totalCycleDays = Integer.parseInt(extractNumbers(txtboxTotalDurationCycle.getText()));
            for (String i : medicinesName) {
                medicineNamesList.add(i);
            }
            for (String i : medicineStrength) {
                medicineStrengthList.add(i);
            }
            for (String i : medicineDurationCount) {
                int temp = Integer.parseInt(extractNumbers(i));
                int tempFinalInt = totalCycleDays * temp;
                medicineDurationList.add(tempFinalInt);
                medicineDayDuration.add(Integer.toString(temp));
            }
            return true;
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Dr." + name + ", Please first fill duration field", "Duration Field Empty", JOptionPane.ERROR_MESSAGE);
        }
        return false;
    }

    private String extractNumbers(String rawData) {
        char[] tempCharList = rawData.toCharArray();
        String tempString = "";
        for (int j = 0; j < tempCharList.length; j++) {
            if (tempCharList[j] >= '0' && tempCharList[j] <= '9') {
                tempString += tempCharList[j];
            }
        }
        return tempString;
    }

    private void mouseFocusGained(JButton btn) {
        btn.setContentAreaFilled(true);
    }

    private void mouseFocusLost(JButton btn) {
        btn.setContentAreaFilled(false);
        btn.setOpaque(true);
    }

    private void close() {
        staticObject.dispose();
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
            java.util.logging.Logger.getLogger(CreatePrescriptionGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreatePrescriptionGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreatePrescriptionGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreatePrescriptionGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreatePrescriptionGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AccPictureLbl;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnCreatePrescription;
    private javax.swing.JButton btnSearch;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lblAccName;
    private javax.swing.JLabel lblIssuingTo;
    public static javax.swing.JLabel lblPatientNameEmail;
    private javax.swing.JLabel lblPrescriptionBtn;
    private javax.swing.JCheckBox reuseableCheckbox;
    private javax.swing.JTextArea txtareaMedicineDuration;
    private javax.swing.JTextArea txtareaMedicineListWrited;
    private javax.swing.JTextArea txtareaMedicineStrength;
    private javax.swing.JTextField txtboxPatientNameSearch;
    private javax.swing.JTextField txtboxTotalDurationCycle;
    // End of variables declaration//GEN-END:variables
}
