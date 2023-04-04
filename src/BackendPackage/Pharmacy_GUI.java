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

public class Pharmacy_GUI extends javax.swing.JFrame {

    protected static ArrayList<String> batchNo = new ArrayList<>();
    private String email, pass, name, pcode;
    public static Pharmacy_GUI staticObject;
    int click_count_to_remove_hint_text = 0;
    boolean isCalledByPrescriptionHistory = false;
    float amount;
    ArrayList<Integer> priceOfRowAlreadyIncluded = new ArrayList<>();

    public Pharmacy_GUI() {
        initComponents();
        DefaultTableModel tempModel = new DefaultTableModel() {
            @Override
            public Class<?> getColumnClass(int col) {
                switch (col) {
                    case 0:
                        return Integer.class;
                    case 1:
                        return Boolean.class;
                    default:
                        return String.class;
                }
            }

            @Override
            public boolean isCellEditable(int row, int col) {
                return false;
            }
        };
        tempModel.addColumn("S. No");
        tempModel.addColumn("Buy");
        tempModel.addColumn("Name");
        tempModel.addColumn("Strength");
        tempModel.addColumn("Day Duration");
        tempModel.addColumn("Total Days Cycle");
        tempModel.addColumn("Total Medicines");
        tempModel.addColumn("Price");
        tempModel.addColumn("Stock left");
        medicinesListTable.setModel(tempModel);
        medicinesListTable.getColumnModel().getColumn(0).setMaxWidth(60);
        medicinesListTable.getColumnModel().getColumn(0).setMinWidth(60);
        medicinesListTable.getColumnModel().getColumn(0).setResizable(false);
        medicinesListTable.getColumnModel().getColumn(1).setMaxWidth(60);
        medicinesListTable.getColumnModel().getColumn(1).setMinWidth(60);
        medicinesListTable.getColumnModel().getColumn(1).setResizable(false);
    }

    public Pharmacy_GUI(String email, String accountHolderName) {
        initComponents();
        this.pack();
        try {
            BufferedImage img1 = ImageIO.read(getClass().getResource("/Icons/Hospital_3_48px.png"));
            setIconImage(img1);
        } catch (IOException e) {
        }
        getContentPane().setBackground(Color.WHITE);
        this.setSize(1270, 610);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.email = email;
        this.pass = pass;
        this.name = accountHolderName;
        lblAccName.setText(this.name);
        lblAccName.requestFocusInWindow();
        btnCheckout.setEnabled(false);
        DefaultTableModel tempModel = new DefaultTableModel() {
            @Override
            public Class<?> getColumnClass(int col) {
                switch (col) {
                    case 0:
                        return Integer.class;
                    case 1:
                        return Boolean.class;
                    default:
                        return String.class;
                }
            }

            @Override
            public boolean isCellEditable(int row, int col) {
                return false;
            }
        };
        tempModel.addColumn("S. No");
        tempModel.addColumn("Buy");
        tempModel.addColumn("Name");
        tempModel.addColumn("Strength");
        tempModel.addColumn("Day Duration");
        tempModel.addColumn("Total Days Cycle");
        tempModel.addColumn("Total Medicines");
        tempModel.addColumn("Price");
        tempModel.addColumn("Stock left");
        medicinesListTable.setModel(tempModel);
        medicinesListTable.getColumnModel().getColumn(0).setMaxWidth(60);
        medicinesListTable.getColumnModel().getColumn(0).setMinWidth(60);
        medicinesListTable.getColumnModel().getColumn(0).setResizable(false);
        medicinesListTable.getColumnModel().getColumn(1).setMaxWidth(60);
        medicinesListTable.getColumnModel().getColumn(1).setMinWidth(60);
        medicinesListTable.getColumnModel().getColumn(1).setResizable(false);
        medicinesListTable.getTableHeader().setFont(new Font("Segoe UI Semilight", Font.PLAIN, 20));
        medicinesListTable.setFont(new Font("Segoe UI Light", Font.PLAIN, 18));
    }

    public Pharmacy_GUI(String email, String accountHolderName, String pcode) {
        initComponents();
        this.pack();
        try {
            BufferedImage img1 = ImageIO.read(getClass().getResource("/Icons/Hospital_3_48px.png"));
            setIconImage(img1);
        } catch (IOException e) {
        }
        getContentPane().setBackground(Color.WHITE);
        this.setSize(1270, 610);
        // this.setSize(560, 600);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.email = email;
        this.pass = pass;
        this.pcode = pcode;
        this.name = accountHolderName;
        lblAccName.setText(this.name);
        lblAccName.requestFocusInWindow();
        txtboxPrescriptionCode.setText(pcode);
        isCalledByPrescriptionHistory = true;
        btnCheckout.setEnabled(true);
        DefaultTableModel tempModel = new DefaultTableModel() {
            @Override
            public Class<?> getColumnClass(int col) {
                switch (col) {
                    case 0:
                        return Integer.class;
                    case 1:
                        return Boolean.class;
                    default:
                        return String.class;
                }
            }

            @Override
            public boolean isCellEditable(int row, int col) {
                return false;
            }
        };
        tempModel.addColumn("S. No");
        tempModel.addColumn("Buy");
        tempModel.addColumn("Name");
        tempModel.addColumn("Strength");
        tempModel.addColumn("Day Duration");
        tempModel.addColumn("Total Days Cycle");
        tempModel.addColumn("Total Medicines");
        tempModel.addColumn("Price");
        tempModel.addColumn("Stock left");
        medicinesListTable.setModel(tempModel);
        medicinesListTable.getColumnModel().getColumn(0).setMaxWidth(60);
        medicinesListTable.getColumnModel().getColumn(0).setMinWidth(60);
        medicinesListTable.getColumnModel().getColumn(0).setResizable(false);
        medicinesListTable.getColumnModel().getColumn(1).setMaxWidth(60);
        medicinesListTable.getColumnModel().getColumn(1).setMinWidth(60);
        medicinesListTable.getColumnModel().getColumn(1).setResizable(false);
        medicinesListTable.getTableHeader().setFont(new Font("Segoe UI Semilight", Font.PLAIN, 20));
        medicinesListTable.setFont(new Font("Segoe UI Light", Font.PLAIN, 18));
        searchMethod();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        AccPictureLbl = new javax.swing.JLabel();
        lblAccName = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        medicinesListTable = new javax.swing.JTable();
        btnSearch = new javax.swing.JButton();
        btnCheckout = new javax.swing.JButton();
        txtboxPrescriptionCode = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        lblAmount = new javax.swing.JLabel();
        lblMain = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Online Pharmacy Store");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        AccPictureLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/User_50px.png"))); // NOI18N

        lblAccName.setFont(new java.awt.Font("Segoe UI Light", 0, 17)); // NOI18N
        lblAccName.setText("Account Name");

        medicinesListTable.setFont(new java.awt.Font("Segoe UI Light", 0, 17)); // NOI18N
        medicinesListTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Strength", "Price", "Stock Left"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Float.class, java.lang.Integer.class
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
        medicinesListTable.setFillsViewportHeight(true);
        medicinesListTable.setRowHeight(40);
        medicinesListTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        medicinesListTable.getTableHeader().setReorderingAllowed(false);
        medicinesListTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                medicinesListTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(medicinesListTable);
        if (medicinesListTable.getColumnModel().getColumnCount() > 0) {
            medicinesListTable.getColumnModel().getColumn(0).setMinWidth(150);
            medicinesListTable.getColumnModel().getColumn(0).setPreferredWidth(150);
            medicinesListTable.getColumnModel().getColumn(0).setMaxWidth(270);
            medicinesListTable.getColumnModel().getColumn(1).setMinWidth(70);
            medicinesListTable.getColumnModel().getColumn(1).setPreferredWidth(70);
            medicinesListTable.getColumnModel().getColumn(1).setMaxWidth(90);
            medicinesListTable.getColumnModel().getColumn(2).setMinWidth(95);
            medicinesListTable.getColumnModel().getColumn(2).setPreferredWidth(80);
            medicinesListTable.getColumnModel().getColumn(2).setMaxWidth(95);
            medicinesListTable.getColumnModel().getColumn(3).setMinWidth(80);
            medicinesListTable.getColumnModel().getColumn(3).setPreferredWidth(80);
            medicinesListTable.getColumnModel().getColumn(3).setMaxWidth(80);
        }

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

        btnCheckout.setBackground(new java.awt.Color(255, 255, 255));
        btnCheckout.setFont(new java.awt.Font("Segoe UI Light", 0, 15)); // NOI18N
        btnCheckout.setText("Check out");
        btnCheckout.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btnCheckout.setContentAreaFilled(false);
        btnCheckout.setEnabled(false);
        btnCheckout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCheckoutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCheckoutMouseExited(evt);
            }
        });
        btnCheckout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckoutActionPerformed(evt);
            }
        });

        txtboxPrescriptionCode.setFont(new java.awt.Font("Segoe UI Light", 0, 15)); // NOI18N
        txtboxPrescriptionCode.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtboxPrescriptionCode.setText("Enter Prescription code");
        txtboxPrescriptionCode.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        txtboxPrescriptionCode.setNextFocusableComponent(btnSearch);
        txtboxPrescriptionCode.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtboxPrescriptionCodeFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtboxPrescriptionCodeFocusLost(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel2.setText("Total:");

        lblAmount.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        lblAmount.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblAmount.setText("Rs 0.0");
        lblAmount.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        lblMain.setFont(new java.awt.Font("Segoe UI Light", 0, 36)); // NOI18N
        lblMain.setText("Online Pharmacy Store");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(AccPictureLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblAccName, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblMain)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1245, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnCheckout, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtboxPrescriptionCode)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AccPictureLbl)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblAccName)
                            .addComponent(lblMain, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtboxPrescriptionCode, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lblAmount))
                .addGap(12, 12, 12)
                .addComponent(btnCheckout, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        if (!isCalledByPrescriptionHistory) {
            MenuGUI.staticObject.setVisible(true);
        } else {
            PrescriptionsHistoryGUI.staticObject.setVisible(true);
        }
        staticObject.dispose();
    }//GEN-LAST:event_formWindowClosing

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        searchMethod();
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnCheckoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCheckoutMouseEntered
        mouseFocusGained(btnCheckout);
    }//GEN-LAST:event_btnCheckoutMouseEntered

    private void btnCheckoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCheckoutMouseExited
        mouseFocusLost(btnCheckout);
    }//GEN-LAST:event_btnCheckoutMouseExited

    private void txtboxPrescriptionCodeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtboxPrescriptionCodeFocusGained
        if (txtboxPrescriptionCode.getText().equals("Enter Prescription code")) {
            txtboxPrescriptionCode.setText("");
        }
    }//GEN-LAST:event_txtboxPrescriptionCodeFocusGained

    private void txtboxPrescriptionCodeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtboxPrescriptionCodeFocusLost
        if (txtboxPrescriptionCode.getText().equals("")) {
            txtboxPrescriptionCode.setText("Enter Prescription code");
        }
    }//GEN-LAST:event_txtboxPrescriptionCodeFocusLost

    private void btnCheckoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckoutActionPerformed
        amount = Float.parseFloat(extractNumbers(lblAmount.getText()));
        if (amount > 0) {
            ArrayList<String> names = new ArrayList<>();
            ArrayList<String> batchFinal = new ArrayList<>();
            ArrayList<String> strength = new ArrayList<>();
            ArrayList<String> dayDuration = new ArrayList<>();
            ArrayList<String> totalCycle = new ArrayList<>();
            ArrayList<Integer> totalMedicine = new ArrayList<>();
            ArrayList<Float> price = new ArrayList<>();
            ArrayList<Integer> stockLeft = new ArrayList<>();
            for (int i = 0; i < medicinesListTable.getRowCount(); i++) {
                if (medicinesListTable.getModel().getValueAt(i, 2) != null && !medicinesListTable.getModel().getValueAt(i, 2).toString().equals("")) {
                    if ((boolean) medicinesListTable.getModel().getValueAt(i, 1)) {
                        names.add((String) medicinesListTable.getModel().getValueAt(i, 2));
                        strength.add((String) medicinesListTable.getModel().getValueAt(i, 3));
                        dayDuration.add((String) medicinesListTable.getModel().getValueAt(i, 4));
                        totalCycle.add((String) medicinesListTable.getModel().getValueAt(i, 5));
                        totalMedicine.add((Integer) medicinesListTable.getModel().getValueAt(i, 6));
                        price.add((Float) medicinesListTable.getModel().getValueAt(i, 7));
                        stockLeft.add((Integer) medicinesListTable.getModel().getValueAt(i, 8));
                        batchFinal.add(batchNo.get(i));
                    }
                }
            }
            staticObject.setVisible(false);
            new CheckOutGUI(email, name, txtboxPrescriptionCode.getText(), amount, names, strength, totalMedicine, stockLeft, batchFinal,
                    dayDuration, totalCycle).setVisible(true);
        }
    }//GEN-LAST:event_btnCheckoutActionPerformed

    private void medicinesListTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_medicinesListTableMouseClicked
        try {
            if (medicinesListTable.getModel().getValueAt(medicinesListTable.getSelectedRow(), medicinesListTable.getSelectedColumn()) != null) {
                if ((boolean) medicinesListTable.getModel().getValueAt(medicinesListTable.getSelectedRow(), 1)) {
                    int tempCheck = medicinesListTable.getSelectedRow();
                    if (priceOfRowAlreadyIncluded.contains(tempCheck)) {
                        return;
                    }
                    priceOfRowAlreadyIncluded.add(tempCheck);
                    amount += Math.round((float) medicinesListTable.getModel().getValueAt(medicinesListTable.getSelectedRow(), 7) * 100f) / 100f;
                    if (amount > 0) {
                        btnCheckout.setEnabled(true);
                    }
                    lblAmount.setText("Rs " + Float.toString(amount));
                }
            }
            if (medicinesListTable.getModel().getValueAt(medicinesListTable.getSelectedRow(), medicinesListTable.getSelectedColumn()) != null) {
                if (!(boolean) medicinesListTable.getModel().getValueAt(medicinesListTable.getSelectedRow(), 1)) {
                    if (!priceOfRowAlreadyIncluded.contains(medicinesListTable.getSelectedRow())) {
                        return;
                    }
                    int tempIndex = priceOfRowAlreadyIncluded.indexOf(medicinesListTable.getSelectedRow());
                    priceOfRowAlreadyIncluded.remove(tempIndex);
                    amount -= (Math.round((float) medicinesListTable.getModel().getValueAt(medicinesListTable.getSelectedRow(), 7) * 100f) / 100f);
                    if (priceOfRowAlreadyIncluded.size() < 0 || amount < 0) {
                        amount = 0.0f;
                    }
                    if (amount <= 0) {
                        btnCheckout.setEnabled(false);
                    }
                    lblAmount.setText("Rs " + Float.toString(amount));
                }
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_medicinesListTableMouseClicked

    private void searchMethod() {
        if (!txtboxPrescriptionCode.getText().equals("Enter Prescription code") && !txtboxPrescriptionCode.getText().equals("\\s+") && !txtboxPrescriptionCode.getText().equals("")) {
            pcode = txtboxPrescriptionCode.getText().replaceAll("\\s+", "");
            boolean status = new DatabaseClass(this).pharmacy(email, pcode, false);
            if (!status) {
                btnCheckout.setEnabled(false);
                JOptionPane.showMessageDialog(this, "No prescription list found against this code", "Error 100", JOptionPane.ERROR_MESSAGE);
            } else {
                try {
                    if (!medicinesListTable.getModel().getValueAt(0, 2).equals("")) {
                        btnCheckout.setEnabled(false);
                    } else {
                        btnCheckout.setEnabled(false);
                    }
                } catch (Exception e) {
                }
            }
        } else {
            btnCheckout.setEnabled(false);
            JOptionPane.showMessageDialog(this, "Invalid prescription code", "User input Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private String extractNumbers(String rawData) {
        char[] tempCharList = rawData.toCharArray();
        String tempString = "";
        for (int j = 0; j < tempCharList.length; j++) {
            if (tempCharList[j] == '.' || (tempCharList[j] >= '0' && tempCharList[j] <= '9')) {
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
            java.util.logging.Logger.getLogger(Pharmacy_GUI.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pharmacy_GUI.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pharmacy_GUI.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pharmacy_GUI.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pharmacy_GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AccPictureLbl;
    protected javax.swing.JButton btnCheckout;
    private javax.swing.JButton btnSearch;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblAccName;
    public static javax.swing.JLabel lblAmount;
    private javax.swing.JLabel lblMain;
    protected static javax.swing.JTable medicinesListTable;
    private javax.swing.JTextField txtboxPrescriptionCode;
    // End of variables declaration//GEN-END:variables
}
