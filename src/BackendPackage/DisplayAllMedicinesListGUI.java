package BackendPackage;

import java.awt.*;
import java.awt.datatransfer.*;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class DisplayAllMedicinesListGUI extends javax.swing.JFrame {

    private ArrayList<String> medicinesName = new ArrayList<>();
    private ArrayList<String> ManufacturerName = new ArrayList<>();
    private ArrayList<String> medicineStrengths = new ArrayList<>();
    private ArrayList<Float> medicinesPrice = new ArrayList<>();
    private ArrayList<String> medicinesStockAmount = new ArrayList<>();
    private ArrayList<String> medicinesManufactureDate = new ArrayList<>();
    private ArrayList<String> medicinesExpiryDate = new ArrayList<>();
    private ArrayList<String> medicinesBatchNo = new ArrayList<>();
    private ArrayList<String> supplierName = new ArrayList<>();
    private boolean isEnterKey = false;
    private boolean isEditable = false;
    private String email, name;
    private int totalRowCount = 0;

    public DisplayAllMedicinesListGUI() {
        initComponents();
    }

    public DisplayAllMedicinesListGUI(String email, String name) {
        initComponents();
        try {
            BufferedImage img1 = ImageIO.read(getClass().getResource("/Icons/Hospital_3_48px.png"));
            setIconImage(img1);
        } catch (IOException e) {
        }
        setSize(1794, 805);
        setResizable(false);
        setLocationRelativeTo(null);
        this.email = email;
        this.name = name;
        btnAddRows.setEnabled(false);
        btnAddRows.setVisible(false);
        lblAccName.setText(this.name);
        inventoryListTable.getTableHeader().setFont(new Font("Segoe UI Semilight", Font.PLAIN, 20));
        inventoryListTable.setFont(new Font("Segoe UI Light", Font.PLAIN, 18));
        refresh();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnUpdateInventory = new javax.swing.JButton();
        lblAccName = new javax.swing.JLabel();
        AccPictureLbl = new javax.swing.JLabel();
        lblMain = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        inventoryListTable = new javax.swing.JTable();
        btnCancel = new javax.swing.JButton();
        btnEditData = new javax.swing.JButton();
        btnAddRows = new javax.swing.JButton();
        lblRefresh = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Medicines Inventory");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        btnUpdateInventory.setBackground(new java.awt.Color(255, 255, 255));
        btnUpdateInventory.setFont(new java.awt.Font("Segoe UI Light", 0, 15)); // NOI18N
        btnUpdateInventory.setText("Update Inventory");
        btnUpdateInventory.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btnUpdateInventory.setContentAreaFilled(false);
        btnUpdateInventory.setEnabled(false);
        btnUpdateInventory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnUpdateInventoryMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnUpdateInventoryMouseExited(evt);
            }
        });
        btnUpdateInventory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateInventoryActionPerformed(evt);
            }
        });

        lblAccName.setFont(new java.awt.Font("Segoe UI Light", 0, 17)); // NOI18N
        lblAccName.setText("Account Name");

        AccPictureLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/User_50px.png"))); // NOI18N

        lblMain.setFont(new java.awt.Font("Segoe UI Light", 0, 36)); // NOI18N
        lblMain.setText("Pharmacy Inventory List");

        inventoryListTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "S. No", "Medicine Name", "Manufacturer Name", "Medicine Strength", "Price", "Stock Amount", "Manufacture Date", "Expiry Date", "Batch No.", "Supplier Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        inventoryListTable.setFillsViewportHeight(true);
        inventoryListTable.setRowHeight(35);
        inventoryListTable.setSelectionBackground(new java.awt.Color(255, 255, 204));
        inventoryListTable.setSelectionForeground(new java.awt.Color(0, 0, 0));
        inventoryListTable.getTableHeader().setReorderingAllowed(false);
        inventoryListTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                inventoryListTableMouseClicked(evt);
            }
        });
        inventoryListTable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                inventoryListTableKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                inventoryListTableKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(inventoryListTable);
        if (inventoryListTable.getColumnModel().getColumnCount() > 0) {
            inventoryListTable.getColumnModel().getColumn(0).setMinWidth(60);
            inventoryListTable.getColumnModel().getColumn(0).setPreferredWidth(60);
            inventoryListTable.getColumnModel().getColumn(0).setMaxWidth(60);
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

        btnEditData.setBackground(new java.awt.Color(255, 255, 255));
        btnEditData.setFont(new java.awt.Font("Segoe UI Light", 0, 15)); // NOI18N
        btnEditData.setText("Edit Data");
        btnEditData.setActionCommand("AddRows");
        btnEditData.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btnEditData.setContentAreaFilled(false);
        btnEditData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEditDataMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEditDataMouseExited(evt);
            }
        });
        btnEditData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditDataActionPerformed(evt);
            }
        });

        btnAddRows.setBackground(new java.awt.Color(255, 255, 255));
        btnAddRows.setFont(new java.awt.Font("Segoe UI Light", 0, 15)); // NOI18N
        btnAddRows.setText("Add Rows");
        btnAddRows.setActionCommand("AddRows");
        btnAddRows.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btnAddRows.setContentAreaFilled(false);
        btnAddRows.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAddRowsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAddRowsMouseExited(evt);
            }
        });
        btnAddRows.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddRowsActionPerformed(evt);
            }
        });

        lblRefresh.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRefresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Refresh_32px.png"))); // NOI18N
        lblRefresh.setToolTipText("Refresh");
        lblRefresh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRefreshMouseClicked(evt);
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
                        .addComponent(lblAccName)
                        .addGap(517, 517, 517)
                        .addComponent(lblMain)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1770, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lblRefresh)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEditData, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAddRows, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnUpdateInventory, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblAccName)
                        .addComponent(lblMain))
                    .addComponent(AccPictureLbl))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 591, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnUpdateInventory, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                            .addComponent(btnCancel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEditData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAddRows, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(lblRefresh)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateInventoryMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdateInventoryMouseEntered
        mouseFocusGained(btnUpdateInventory);
    }//GEN-LAST:event_btnUpdateInventoryMouseEntered

    private void btnUpdateInventoryMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdateInventoryMouseExited
        mouseFocusLost(btnUpdateInventory);
    }//GEN-LAST:event_btnUpdateInventoryMouseExited

    private void btnUpdateInventoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateInventoryActionPerformed
        if (inventoryListTable.getModel().getValueAt(0, 1) != null && isEditable) {
            medicinesName.clear();
            ManufacturerName.clear();
            medicineStrengths.clear();
            medicinesPrice.clear();
            medicinesStockAmount.clear();
            medicinesManufactureDate.clear();
            medicinesExpiryDate.clear();
            medicinesBatchNo.clear();
            supplierName.clear();
            boolean dataErrorCheckStatus = fetchDataFromTable();
            if (dataErrorCheckStatus) {
                boolean newEntryStatus = new DatabaseClassExtended(this).newPharmacyInventoryEntry(medicinesName, ManufacturerName, medicineStrengths, medicinesPrice,
                        medicinesStockAmount, medicinesManufactureDate, medicinesExpiryDate, medicinesBatchNo, supplierName, false);
                if (newEntryStatus) {
                    medicinesName.clear();
                    ManufacturerName.clear();
                    medicineStrengths.clear();
                    medicinesPrice.clear();
                    medicinesStockAmount.clear();
                    medicinesManufactureDate.clear();
                    medicinesExpiryDate.clear();
                    medicinesBatchNo.clear();
                    supplierName.clear();
                    JOptionPane.showMessageDialog(this, "New Pharmacy Inventory added successfully", "Done", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Can not not update inventory using empty table", "Error empty inventory", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnUpdateInventoryActionPerformed

    private void inventoryListTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inventoryListTableMouseClicked
        checkEmptyFieldError(false);
    }//GEN-LAST:event_inventoryListTableMouseClicked

    private void inventoryListTableKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inventoryListTableKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_V && evt.getModifiers() == KeyEvent.CTRL_MASK) {
            try {
                String tempData = (String) Toolkit.getDefaultToolkit().getSystemClipboard().getData(DataFlavor.stringFlavor);
                String[] tempDataArray = tempData.split("\t");
                inventoryListTable.getModel().setValueAt(tempDataArray[inventoryListTable.getSelectedColumn()], inventoryListTable.getSelectedRow(), inventoryListTable.getSelectedColumn());
            } catch (Exception e) {
            }
        }
        if (evt.getKeyCode() == KeyEvent.VK_C && evt.getModifiers() == KeyEvent.CTRL_MASK) {
            if (inventoryListTable.getSelectedColumn() != 0) {
                try {
                    String tempData = (String) inventoryListTable.getModel().getValueAt(inventoryListTable.getSelectedRow(), inventoryListTable.getSelectedColumn());
                    Transferable transfer = new StringSelection(tempData);
                    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(transfer, null);
                } catch (Exception e) {
                }
            }
        }
    }//GEN-LAST:event_inventoryListTableKeyPressed

    private void inventoryListTableKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inventoryListTableKeyReleased
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_TAB || evt.getKeyCode() == java.awt.event.KeyEvent.VK_RIGHT) {
            isEnterKey = false;
            checkEmptyFieldError(false);
        }
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER || evt.getKeyCode() == java.awt.event.KeyEvent.VK_DOWN) {
            isEnterKey = true;
            checkEmptyFieldError(false);
        }
    }//GEN-LAST:event_inventoryListTableKeyReleased

    private void btnCancelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelMouseEntered
        mouseFocusGained(btnCancel);
    }//GEN-LAST:event_btnCancelMouseEntered

    private void btnCancelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelMouseExited
        mouseFocusLost(btnCancel);
    }//GEN-LAST:event_btnCancelMouseExited

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        close();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnEditDataMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditDataMouseEntered
        mouseFocusGained(btnEditData);
    }//GEN-LAST:event_btnEditDataMouseEntered

    private void btnEditDataMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditDataMouseExited
        mouseFocusLost(btnEditData);
    }//GEN-LAST:event_btnEditDataMouseExited

    private void btnEditDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditDataActionPerformed
        if (!isEditable) {
            btnUpdateInventory.setEnabled(true);
            isEditable = true;
            DefaultTableModel tempModel = new DefaultTableModel() {
                @Override
                public boolean isCellEditable(int row, int col) {
                    if (col > 0) {
                        return true;
                    }
                    return false;
                }

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
            };
            tempModel.addColumn("S. No");
            tempModel.addColumn("Delete");
            tempModel.addColumn("Medicine Name");
            tempModel.addColumn("Manufacturer Name");
            tempModel.addColumn("Medicine Strength");
            tempModel.addColumn("Price");
            tempModel.addColumn("Stock Amount");
            tempModel.addColumn("Manufacture Date");
            tempModel.addColumn("Expiry Date");
            tempModel.addColumn("Batch No.");
            tempModel.addColumn("Supplier Name");
            for (int i = 0; i < inventoryListTable.getModel().getRowCount(); i++) {
                tempModel.addRow(new Object[]{inventoryListTable.getModel().getValueAt(i, 0), false,
                    inventoryListTable.getModel().getValueAt(i, 2),
                    inventoryListTable.getModel().getValueAt(i, 3),
                    inventoryListTable.getModel().getValueAt(i, 4),
                    inventoryListTable.getModel().getValueAt(i, 5),
                    inventoryListTable.getModel().getValueAt(i, 6),
                    inventoryListTable.getModel().getValueAt(i, 7),
                    inventoryListTable.getModel().getValueAt(i, 8),
                    inventoryListTable.getModel().getValueAt(i, 9),
                    inventoryListTable.getModel().getValueAt(i, 10)});
            }
            inventoryListTable.setModel(tempModel);
            inventoryListTable.getColumnModel().getColumn(0).setMinWidth(60);
            inventoryListTable.getColumnModel().getColumn(0).setMaxWidth(60);
            inventoryListTable.getColumnModel().getColumn(0).setResizable(false);
            inventoryListTable.getColumnModel().getColumn(1).setMinWidth(90);
            inventoryListTable.getColumnModel().getColumn(1).setMaxWidth(90);
            inventoryListTable.getColumnModel().getColumn(1).setResizable(false);
            totalRowCount = inventoryListTable.getModel().getRowCount();
            addNewRows(true);
            btnAddRows.setEnabled(true);
            btnAddRows.setVisible(true);
            setTitle("Pharmacy Inventory List (Editing mode)");
        } else {
            JOptionPane.showMessageDialog(this, "you are already in editable mode", "Message", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnEditDataActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        close();
    }//GEN-LAST:event_formWindowClosing

    private void btnAddRowsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddRowsMouseEntered
        mouseFocusGained(btnAddRows);
    }//GEN-LAST:event_btnAddRowsMouseEntered

    private void btnAddRowsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddRowsMouseExited
        mouseFocusLost(btnAddRows);
    }//GEN-LAST:event_btnAddRowsMouseExited

    private void btnAddRowsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddRowsActionPerformed
        addNewRows(true);
    }//GEN-LAST:event_btnAddRowsActionPerformed

    private void lblRefreshMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRefreshMouseClicked
        isEditable = false;
        refresh();
    }//GEN-LAST:event_lblRefreshMouseClicked

    private void addNewRows(boolean isAppendRows) {
        if (isAppendRows) {
            DefaultTableModel tempTableModel = (DefaultTableModel) inventoryListTable.getModel();
            for (int i = 0; i < 100; i++) {
                totalRowCount += 1;
                tempTableModel.addRow(new Object[]{totalRowCount, false, null, null, null, null, null, null, null, null, null});
            }
            inventoryListTable.setModel(tempTableModel);
        } else {
            for (int i = 0; i < 100; i++) {
                totalRowCount += 1;
                inventoryListTable.getModel().setValueAt(totalRowCount, i, 0);
                inventoryListTable.getModel().setValueAt(false, i, 1);
            }
        }
    }

    private void checkEmptyFieldError(boolean isFinalErrorCheck) {
        if (!isFinalErrorCheck) {
            if (inventoryListTable.isCellEditable(0, 2)) {
                if (inventoryListTable.getSelectedColumn() == inventoryListTable.getModel().getColumnCount() - 1) {
                    setAutomaticSupplierName();
                }
                int col = inventoryListTable.getSelectedColumn() - 1;
                if (inventoryListTable.getSelectedRow() - 1 >= 0 && inventoryListTable.getSelectedRow() > 1) {
                    if (inventoryListTable.getModel().getValueAt(inventoryListTable.getSelectedRow() - 1, inventoryListTable.getSelectedColumn()) == null
                            || inventoryListTable.getModel().getValueAt(inventoryListTable.getSelectedRow() - 1, inventoryListTable.getSelectedColumn()).toString().equals("")
                            || inventoryListTable.getModel().getValueAt(inventoryListTable.getSelectedRow() - 1, inventoryListTable.getSelectedColumn()).toString().matches("\\s+")) {
                        boolean temp1 = (boolean) inventoryListTable.getModel().getValueAt(inventoryListTable.getSelectedRow() - 1, 1);
                        if (!temp1) {
                            inventoryListTable.changeSelection(inventoryListTable.getSelectedRow() - 1, inventoryListTable.getSelectedColumn(), false, false);
                            JOptionPane.showMessageDialog(this, "you can not leave any field empty", "Error Empty Field", JOptionPane.ERROR_MESSAGE);
                            return;
                        }
                    }
                }
                if (inventoryListTable.getSelectedColumn() >= 1) {
                    if (col >= 1) {
                        if (inventoryListTable.getModel().getValueAt(inventoryListTable.getSelectedRow(), inventoryListTable.getSelectedColumn() - 1) == null
                                || inventoryListTable.getModel().getValueAt(inventoryListTable.getSelectedRow(), inventoryListTable.getSelectedColumn() - 1).toString().matches("\\s+")
                                || inventoryListTable.getModel().getValueAt(inventoryListTable.getSelectedRow(), inventoryListTable.getSelectedColumn() - 1).toString().equals("")) {
                            boolean tempCheck = (boolean) inventoryListTable.getModel().getValueAt(inventoryListTable.getSelectedRow(), 1);
                            if (!tempCheck) {
                                if (inventoryListTable.getModel().getValueAt(inventoryListTable.getSelectedRow(), inventoryListTable.getSelectedColumn() - 1) != null
                                        && inventoryListTable.getModel().getValueAt(inventoryListTable.getSelectedRow(), inventoryListTable.getSelectedColumn() - 1).toString().matches("\\s+")) {
                                    inventoryListTable.getModel().setValueAt("", inventoryListTable.getSelectedRow(), inventoryListTable.getSelectedColumn() - 1);
                                }
                                JOptionPane.showMessageDialog(this, "you can not leave any field empty", "Error Empty Field", JOptionPane.ERROR_MESSAGE);
                                if (!isEnterKey) {
                                    inventoryListTable.changeSelection(inventoryListTable.getSelectedRow(), inventoryListTable.getSelectedColumn() - 1, false, false);
                                } else {
                                    inventoryListTable.changeSelection(inventoryListTable.getSelectedRow() - 1, inventoryListTable.getSelectedColumn(), false, false);
                                }
                            }
                        }
                    } else {
                        int row = inventoryListTable.getSelectedRow() - 1;
                        if (row >= 0) {
                            if (inventoryListTable.getModel().getValueAt(row, inventoryListTable.getModel().getColumnCount() - 1) == null
                                    || inventoryListTable.getModel().getValueAt(row, inventoryListTable.getModel().getColumnCount() - 1).toString().matches("\\s+")
                                    || inventoryListTable.getModel().getValueAt(row, inventoryListTable.getModel().getColumnCount() - 1).toString().equals("")) {
                                boolean tempCheck1 = (boolean) inventoryListTable.getModel().getValueAt(row, 1);
                                if (!tempCheck1) {
                                    if (inventoryListTable.getModel().getValueAt(row, inventoryListTable.getModel().getColumnCount() - 1) != null
                                            && inventoryListTable.getModel().getValueAt(row, inventoryListTable.getModel().getColumnCount() - 1).toString().matches("\\s+")) {
                                        inventoryListTable.getModel().setValueAt("", row, inventoryListTable.getModel().getColumnCount() - 1);
                                    }
                                    JOptionPane.showMessageDialog(this, "you can not leave any field empty", "Error Empty Field", JOptionPane.ERROR_MESSAGE);

                                    if (!isEnterKey) {
                                        inventoryListTable.changeSelection(row, inventoryListTable.getModel().getColumnCount() - 1, false, false);
                                    } else {
                                        inventoryListTable.changeSelection(row, inventoryListTable.getSelectedColumn(), false, false);
                                    }
                                }
                            }
                        }
                    }
                } else {
                    if (inventoryListTable.getSelectedColumn() == 0 && inventoryListTable.getSelectedRow() > 0) {
                        if (inventoryListTable.getModel().getValueAt(inventoryListTable.getSelectedRow() - 1, inventoryListTable.getModel().getColumnCount() - 1) == null
                                || inventoryListTable.getModel().getValueAt(inventoryListTable.getSelectedRow() - 1, inventoryListTable.getModel().getColumnCount() - 1).toString().equals("")
                                || inventoryListTable.getModel().getValueAt(inventoryListTable.getSelectedRow() - 1, inventoryListTable.getModel().getColumnCount() - 1).toString().matches("\\s+")) {
                            boolean temp1 = (boolean) inventoryListTable.getModel().getValueAt(inventoryListTable.getSelectedRow() - 1, 1);
                            if (!temp1) {
                                if (inventoryListTable.getModel().getValueAt(inventoryListTable.getSelectedRow() - 1, inventoryListTable.getModel().getColumnCount() - 1) != null
                                        && inventoryListTable.getModel().getValueAt(inventoryListTable.getSelectedRow() - 1, inventoryListTable.getModel().getColumnCount() - 1).toString().matches("\\s+")) {
                                    inventoryListTable.getModel().setValueAt("", inventoryListTable.getSelectedRow() - 1, inventoryListTable.getModel().getColumnCount() - 1);
                                }
                                inventoryListTable.changeSelection(inventoryListTable.getSelectedRow() - 1, inventoryListTable.getModel().getColumnCount() - 1, false, false);
                                JOptionPane.showMessageDialog(this, "you can not leave any field empty", "Error Empty Field", JOptionPane.ERROR_MESSAGE);
                                return;
                            }
                        }
                        inventoryListTable.changeSelection(inventoryListTable.getSelectedRow(), inventoryListTable.getSelectedColumn() + 2, false, false);
                    }
                }
            }
        } else {
            // currently discontinued
        }
    }

    private boolean fetchDataFromTable() {
        for (int i = 0; i < inventoryListTable.getModel().getRowCount(); i++) {
            boolean tempCheck = (boolean) inventoryListTable.getModel().getValueAt(i, 1);
            if (!tempCheck) {
                for (int j = 2; j < inventoryListTable.getModel().getColumnCount(); j++) {
                    Object tempObject = inventoryListTable.getModel().getValueAt(i, j);
                    if (tempObject != null && !tempObject.toString().equals("") && !tempObject.toString().matches("\\s+")) {
                        switch (j) {
                            case 2:
                                medicinesName.add((String) tempObject);
                                break;
                            case 3:
                                ManufacturerName.add((String) tempObject);
                                break;
                            case 4:
                                medicineStrengths.add((String) tempObject);
                                break;
                            case 5:
                                medicinesPrice.add(extractFloatingNumbers((String) tempObject));
                                break;
                            case 6:
                                medicinesStockAmount.add(extractIntegerNumbers((String) tempObject));
                                break;
                            case 7:
                                medicinesManufactureDate.add((String) tempObject);
                                break;
                            case 8:
                                medicinesExpiryDate.add((String) tempObject);
                                break;
                            case 9:
                                medicinesBatchNo.add((String) tempObject);
                                break;
                            case 10:
                                supplierName.add((String) tempObject);
                                break;
                        }
                    }
                }
            }
        }
        if (medicinesName.size() == ManufacturerName.size() && ManufacturerName.size() == medicineStrengths.size() && medicineStrengths.size() == medicinesPrice.size()
                && medicinesPrice.size() == medicinesStockAmount.size() && medicinesStockAmount.size() == medicinesManufactureDate.size()
                && medicinesManufactureDate.size() == medicinesExpiryDate.size() && medicinesExpiryDate.size() == medicinesBatchNo.size()
                && medicinesBatchNo.size() == supplierName.size() && medicinesName.size() > 0) {
            return true;
        } else {
            medicinesName.clear();
            ManufacturerName.clear();
            medicineStrengths.clear();
            medicinesPrice.clear();
            medicinesStockAmount.clear();
            medicinesManufactureDate.clear();
            medicinesExpiryDate.clear();
            medicinesBatchNo.clear();
            supplierName.clear();
            JOptionPane.showMessageDialog(this, "you can not leave any field empty", "Error Empty Field", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    private float extractFloatingNumbers(String rawData) {
        char[] tempCharList = rawData.toCharArray();
        String tempString = "";
        for (int j = 0; j < tempCharList.length; j++) {
            if (tempCharList[j] == '.' || tempCharList[j] >= '0' && tempCharList[j] <= '9') {
                tempString += tempCharList[j];
            }
        }
        float tempFloat = Float.parseFloat(tempString);
        return tempFloat;
    }

    private String extractIntegerNumbers(String rawData) {
        char[] tempCharList = rawData.toCharArray();
        String tempString = "";
        for (int j = 0; j < tempCharList.length; j++) {
            if (tempCharList[j] >= '0' && tempCharList[j] <= '9') {
                tempString += tempCharList[j];
            }
        }
        return tempString;
    }

    private void setAutomaticSupplierName() {
        try {
            if (inventoryListTable.getSelectedRow() > 0 && inventoryListTable.getModel().getValueAt(inventoryListTable.getSelectedRow() - 1, inventoryListTable.getModel().getColumnCount() - 1) != null) {
                Object temp_ = inventoryListTable.getModel().getValueAt(inventoryListTable.getSelectedRow(), inventoryListTable.getModel().getColumnCount() - 1);
                if (temp_ == null && temp_.toString().equals("")) {
                    String tempSupplierName = (String) inventoryListTable.getModel().getValueAt(inventoryListTable.getSelectedRow() - 1, inventoryListTable.getModel().getColumnCount() - 1);
                    if (!tempSupplierName.equals("") && !tempSupplierName.matches("\\s+")) {
                        inventoryListTable.getModel().setValueAt(tempSupplierName, inventoryListTable.getSelectedRow(), inventoryListTable.getModel().getColumnCount() - 1);
                    }
                }
            }
        } catch (Exception e) {
        }
    }

    private void refresh() {
        boolean status = new DatabaseClassExtended(this).pharmacyMedicinesList(!isEditable);
        if (!status) {

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
        try {
            if (inventoryListTable.getModel().getValueAt(0, 1) != null && isEditable) {
                int optn = JOptionPane.showConfirmDialog(this, "Are you sure you want to Exit,\nThe changes will be lost", "Warning Data Lost",
                        JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE);
                if (optn != JOptionPane.YES_OPTION) {
                    return;
                }
            }
            this.dispose();
            MenuGUI.staticObject.setVisible(true);
        } catch (Exception e) {
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
            java.util.logging.Logger.getLogger(DisplayAllMedicinesListGUI.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DisplayAllMedicinesListGUI.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DisplayAllMedicinesListGUI.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DisplayAllMedicinesListGUI.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DisplayAllMedicinesListGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AccPictureLbl;
    private javax.swing.JButton btnAddRows;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnEditData;
    private javax.swing.JButton btnUpdateInventory;
    protected static javax.swing.JTable inventoryListTable;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAccName;
    private javax.swing.JLabel lblMain;
    private javax.swing.JLabel lblRefresh;
    // End of variables declaration//GEN-END:variables
}
