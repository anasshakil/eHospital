package BackendPackage;

import java.awt.*;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import sun.awt.datatransfer.ClipboardTransferable;

public class PharmacyInventoryGUI extends javax.swing.JFrame {

    private int totalRowCount = 0;
    private String email, name;
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

    public PharmacyInventoryGUI() {
        initComponents();
    }

    public PharmacyInventoryGUI(String email, String name) {
        initComponents();
        try {
            BufferedImage img1 = ImageIO.read(getClass().getResource("/Icons/Hospital_3_48px.png"));
            setIconImage(img1);
        } catch (IOException e) {
        }
        setSize(1753, 805);
        setResizable(false);
        setLocationRelativeTo(null);
        addNewRows(false);
        this.email = email;
        this.name = name;
        lblAccName.setText(this.name);
        newInventoryEntryTable.getTableHeader().setFont(new Font("Segoe UI Semilight", Font.PLAIN, 20));
        newInventoryEntryTable.setFont(new Font("Segoe UI Light", Font.PLAIN, 18));
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
        newInventoryEntryTable = new javax.swing.JTable();
        btnCancel = new javax.swing.JButton();
        btnAddRows = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Pharmacy Inventory");
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
        lblMain.setText("New Pharmacy Inventory");

        newInventoryEntryTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "S. No", "Medicine Name", "Manufacturer Name", "Medicine Strength", "Price", "Stock Amount", "Manufacture Date", "Expiry Date", "Batch No.", "Supplier Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true, true, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        newInventoryEntryTable.setFillsViewportHeight(true);
        newInventoryEntryTable.setRowHeight(35);
        newInventoryEntryTable.setSelectionBackground(new java.awt.Color(255, 255, 204));
        newInventoryEntryTable.setSelectionForeground(new java.awt.Color(0, 0, 0));
        newInventoryEntryTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        newInventoryEntryTable.getTableHeader().setReorderingAllowed(false);
        newInventoryEntryTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                newInventoryEntryTableMouseClicked(evt);
            }
        });
        newInventoryEntryTable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                newInventoryEntryTableKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                newInventoryEntryTableKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(newInventoryEntryTable);
        if (newInventoryEntryTable.getColumnModel().getColumnCount() > 0) {
            newInventoryEntryTable.getColumnModel().getColumn(0).setMinWidth(60);
            newInventoryEntryTable.getColumnModel().getColumn(0).setPreferredWidth(60);
            newInventoryEntryTable.getColumnModel().getColumn(0).setMaxWidth(60);
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

        btnAddRows.setBackground(new java.awt.Color(255, 255, 255));
        btnAddRows.setFont(new java.awt.Font("Segoe UI Light", 0, 15)); // NOI18N
        btnAddRows.setText("Add Rows");
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
                        .addGap(453, 453, 453)
                        .addComponent(lblMain)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1729, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnAddRows, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnUpdateInventory, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblAccName)
                        .addComponent(lblMain))
                    .addComponent(AccPictureLbl))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 591, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnUpdateInventory, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                    .addComponent(btnCancel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAddRows, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void newInventoryEntryTableKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_newInventoryEntryTableKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_V && evt.getModifiers() == KeyEvent.CTRL_MASK) {
            try {
                String tempData = (String) Toolkit.getDefaultToolkit().getSystemClipboard().getData(DataFlavor.stringFlavor);
                String[] tempDataArray = tempData.split("\t");
                newInventoryEntryTable.getModel().setValueAt(tempDataArray[newInventoryEntryTable.getSelectedColumn()], newInventoryEntryTable.getSelectedRow(), newInventoryEntryTable.getSelectedColumn());
            } catch (Exception e) {
            }
        }
        if (evt.getKeyCode() == KeyEvent.VK_C && evt.getModifiers() == KeyEvent.CTRL_MASK) {
            if (newInventoryEntryTable.getSelectedColumn() != 0) {
                try {
                    String tempData = (String) newInventoryEntryTable.getModel().getValueAt(newInventoryEntryTable.getSelectedRow(), newInventoryEntryTable.getSelectedColumn());
                    Transferable transfer = new StringSelection(tempData);
                    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(transfer, null);
                } catch (Exception e) {
                }
            }
        }
    }//GEN-LAST:event_newInventoryEntryTableKeyPressed

    private void newInventoryEntryTableKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_newInventoryEntryTableKeyReleased
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_TAB || evt.getKeyCode() == java.awt.event.KeyEvent.VK_RIGHT) {
            isEnterKey = false;
            checkEmptyFieldError(false);
        }
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER || evt.getKeyCode() == java.awt.event.KeyEvent.VK_DOWN) {
            isEnterKey = true;
            checkEmptyFieldError(false);
        }
    }//GEN-LAST:event_newInventoryEntryTableKeyReleased

    private void btnUpdateInventoryMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdateInventoryMouseEntered
        mouseFocusGained(btnUpdateInventory);
    }//GEN-LAST:event_btnUpdateInventoryMouseEntered

    private void btnUpdateInventoryMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdateInventoryMouseExited
        mouseFocusLost(btnUpdateInventory);
    }//GEN-LAST:event_btnUpdateInventoryMouseExited

    private void btnUpdateInventoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateInventoryActionPerformed
        if (newInventoryEntryTable.getModel().getValueAt(0, 1) != null) {
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
                        medicinesStockAmount, medicinesManufactureDate, medicinesExpiryDate, medicinesBatchNo, supplierName, true);
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

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        close();
    }//GEN-LAST:event_formWindowClosing

    private void btnCancelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelMouseEntered
        mouseFocusGained(btnCancel);
    }//GEN-LAST:event_btnCancelMouseEntered

    private void btnCancelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelMouseExited
        mouseFocusLost(btnCancel);
    }//GEN-LAST:event_btnCancelMouseExited

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        close();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void newInventoryEntryTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newInventoryEntryTableMouseClicked
        checkEmptyFieldError(false);
    }//GEN-LAST:event_newInventoryEntryTableMouseClicked

    private void btnAddRowsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddRowsMouseEntered
        mouseFocusGained(btnAddRows);
    }//GEN-LAST:event_btnAddRowsMouseEntered

    private void btnAddRowsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddRowsMouseExited
        mouseFocusLost(btnAddRows);
    }//GEN-LAST:event_btnAddRowsMouseExited

    private void btnAddRowsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddRowsActionPerformed
        addNewRows(true);
    }//GEN-LAST:event_btnAddRowsActionPerformed

    private void addNewRows(boolean isAppendRows) {
        if (isAppendRows) {
            DefaultTableModel tempTableModel = (DefaultTableModel) newInventoryEntryTable.getModel();
            for (int i = 0; i < 100; i++) {
                totalRowCount += 1;
                tempTableModel.addRow(new Object[]{totalRowCount, null, null, null, null, null, null, null, null});
            }
            newInventoryEntryTable.setModel(tempTableModel);
        } else {
            for (int i = 0; i < 100; i++) {
                totalRowCount += 1;
                newInventoryEntryTable.getModel().setValueAt(totalRowCount, i, 0);
            }
        }
    }

    private void checkEmptyFieldError(boolean isFinalErrorCheck) {
        if (!isFinalErrorCheck) {
            if (newInventoryEntryTable.getSelectedColumn() == newInventoryEntryTable.getModel().getColumnCount() - 1) {
                setAutomaticSupplierName();
            }
            int col = newInventoryEntryTable.getSelectedColumn() - 1;
            if (newInventoryEntryTable.getSelectedColumn() >= 1) {
                if (col >= 1) {
                    if (newInventoryEntryTable.getModel().getValueAt(newInventoryEntryTable.getSelectedRow(), newInventoryEntryTable.getSelectedColumn() - 1) == null
                            || newInventoryEntryTable.getModel().getValueAt(newInventoryEntryTable.getSelectedRow(), newInventoryEntryTable.getSelectedColumn() - 1).toString().matches("\\s+")
                            || newInventoryEntryTable.getModel().getValueAt(newInventoryEntryTable.getSelectedRow(), newInventoryEntryTable.getSelectedColumn() - 1).toString().equals("")) {
                        if (newInventoryEntryTable.getModel().getValueAt(newInventoryEntryTable.getSelectedRow(), newInventoryEntryTable.getSelectedColumn() - 1) != null
                                && newInventoryEntryTable.getModel().getValueAt(newInventoryEntryTable.getSelectedRow(), newInventoryEntryTable.getSelectedColumn() - 1).toString().matches("\\s+")) {
                            newInventoryEntryTable.getModel().setValueAt("", newInventoryEntryTable.getSelectedRow(), newInventoryEntryTable.getSelectedColumn() - 1);
                        }
                        if (!isEnterKey) {
                            newInventoryEntryTable.changeSelection(newInventoryEntryTable.getSelectedRow(), newInventoryEntryTable.getSelectedColumn() - 1, false, false);
                        } else {
                            newInventoryEntryTable.changeSelection(newInventoryEntryTable.getSelectedRow() - 1,
                                    newInventoryEntryTable.getSelectedColumn(), false, false);
                        }
                        JOptionPane.showMessageDialog(this, "you can not leave any field empty", "Error Empty Field", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    int row = newInventoryEntryTable.getSelectedRow() - 1;
                    if (row >= 0) {
                        if (newInventoryEntryTable.getModel().getValueAt(row, newInventoryEntryTable.getModel().getColumnCount() - 1) == null
                                || newInventoryEntryTable.getModel().getValueAt(row, newInventoryEntryTable.getModel().getColumnCount() - 1).toString().matches("\\s+")
                                || newInventoryEntryTable.getModel().getValueAt(row, newInventoryEntryTable.getModel().getColumnCount() - 1).toString().equals("")) {
                            if (newInventoryEntryTable.getModel().getValueAt(row, newInventoryEntryTable.getModel().getColumnCount() - 1) != null
                                    && newInventoryEntryTable.getModel().getValueAt(row, newInventoryEntryTable.getModel().getColumnCount() - 1).toString().matches("\\s+")) {
                                newInventoryEntryTable.getModel().setValueAt("", row, newInventoryEntryTable.getModel().getColumnCount() - 1);
                            }
                            if (!isEnterKey) {
                                newInventoryEntryTable.changeSelection(row, newInventoryEntryTable.getModel().getColumnCount() - 1, false, false);
                            } else {
                                newInventoryEntryTable.changeSelection(row,
                                        newInventoryEntryTable.getSelectedColumn(), false, false);
                            }
                            JOptionPane.showMessageDialog(this, "you can not leave any field empty", "Error Empty Field", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                }
            } else {
                if (newInventoryEntryTable.getSelectedColumn() == 0 && newInventoryEntryTable.getSelectedRow() > 0) {
                    if (newInventoryEntryTable.getModel().getValueAt(newInventoryEntryTable.getSelectedRow() - 1, newInventoryEntryTable.getModel().getColumnCount() - 1) == null
                            || newInventoryEntryTable.getModel().getValueAt(newInventoryEntryTable.getSelectedRow() - 1, newInventoryEntryTable.getModel().getColumnCount() - 1).toString().equals("")
                            || newInventoryEntryTable.getModel().getValueAt(newInventoryEntryTable.getSelectedRow() - 1, newInventoryEntryTable.getModel().getColumnCount() - 1).toString().matches("\\s+")) {
                        if (newInventoryEntryTable.getModel().getValueAt(newInventoryEntryTable.getSelectedRow() - 1, newInventoryEntryTable.getModel().getColumnCount() - 1) != null
                                && newInventoryEntryTable.getModel().getValueAt(newInventoryEntryTable.getSelectedRow() - 1, newInventoryEntryTable.getModel().getColumnCount() - 1).toString().matches("\\s+")) {
                            newInventoryEntryTable.getModel().setValueAt("", newInventoryEntryTable.getSelectedRow() - 1, newInventoryEntryTable.getModel().getColumnCount() - 1);
                        }
                        newInventoryEntryTable.changeSelection(newInventoryEntryTable.getSelectedRow() - 1, newInventoryEntryTable.getModel().getColumnCount() - 1, false, false);
                        JOptionPane.showMessageDialog(this, "you can not leave any field empty", "Error Empty Field", JOptionPane.ERROR_MESSAGE);
                    } else {
                        newInventoryEntryTable.changeSelection(newInventoryEntryTable.getSelectedRow(), newInventoryEntryTable.getSelectedColumn() + 1, false, false);
                    }
                }
            }
        } else {
            // currently discontinued
        }
    }

    private boolean fetchDataFromTable() {
        for (int i = 0; i < newInventoryEntryTable.getModel().getRowCount(); i++) {
            for (int j = 1; j < newInventoryEntryTable.getModel().getColumnCount(); j++) {
                Object tempObject = newInventoryEntryTable.getModel().getValueAt(i, j);
                if (tempObject != null && !tempObject.toString().equals("") && !tempObject.toString().matches("\\s+")) {
                    switch (j) {
                        case 1:
                            medicinesName.add((String) tempObject);
                            break;
                        case 2:
                            ManufacturerName.add((String) tempObject);
                            break;
                        case 3:
                            medicineStrengths.add((String) tempObject);
                            break;
                        case 4:
                            medicinesPrice.add(extractFloatingNumbers((String) tempObject));
                            break;
                        case 5:
                            medicinesStockAmount.add(extractIntegerNumbers((String) tempObject));
                            break;
                        case 6:
                            medicinesManufactureDate.add((String) tempObject);
                            break;
                        case 7:
                            medicinesExpiryDate.add((String) tempObject);
                            break;
                        case 8:
                            medicinesBatchNo.add((String) tempObject);
                            break;
                        case 9:
                            supplierName.add((String) tempObject);
                            break;
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
            if (newInventoryEntryTable.getSelectedRow() > 0 && newInventoryEntryTable.getModel().getValueAt(newInventoryEntryTable.getSelectedRow() - 1, newInventoryEntryTable.getModel().getColumnCount() - 1) != null) {
                String tempSupplierName = (String) newInventoryEntryTable.getModel().getValueAt(newInventoryEntryTable.getSelectedRow() - 1, newInventoryEntryTable.getModel().getColumnCount() - 1);
                if (!tempSupplierName.equals("") && !tempSupplierName.matches("\\s+")) {
                    Object temp_ = newInventoryEntryTable.getModel().getValueAt(newInventoryEntryTable.getSelectedRow() - 1, newInventoryEntryTable.getModel().getColumnCount() - 1);
                    if (temp_ != null && !temp_.toString().equals("")) {
                        newInventoryEntryTable.getModel().setValueAt(tempSupplierName, newInventoryEntryTable.getSelectedRow(), newInventoryEntryTable.getModel().getColumnCount() - 1);
                    }
                }
            }
        } catch (Exception e) {
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
        if (newInventoryEntryTable.getModel().getValueAt(0, 1) != null) {
            int optn = JOptionPane.showConfirmDialog(this, "Are you sure you want to Exit,\nThe unsaved data will be lost", "Warning Data Lost",
                    JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE);
            if (optn != JOptionPane.YES_OPTION) {
                return;
            }
        }
        this.dispose();
        MenuGUI.staticObject.setVisible(true);
    }

    class unFocusable extends DefaultTableCellRenderer // Currently unused class
    {
        /*
        @Override
        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
            Component comp = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
            if (hasFocus) {
                if (errorInt == 0) {
                    table.changeSelection(row, column + 1, false, false);
                } else {
                    table.changeSelection(row, table.getModel().getColumnCount() - 1, false, false);
                }
            }
            return comp;
        }
         */
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
            java.util.logging.Logger.getLogger(PharmacyInventoryGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PharmacyInventoryGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PharmacyInventoryGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PharmacyInventoryGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PharmacyInventoryGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AccPictureLbl;
    private javax.swing.JButton btnAddRows;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnUpdateInventory;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAccName;
    private javax.swing.JLabel lblMain;
    private static javax.swing.JTable newInventoryEntryTable;
    // End of variables declaration//GEN-END:variables
}
