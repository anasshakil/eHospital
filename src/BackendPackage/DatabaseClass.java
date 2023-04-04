package BackendPackage;

import com.mysql.cj.jdbc.exceptions.CommunicationsException;
import java.sql.*;
import java.time.LocalDateTime;
import java.util.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class DatabaseClass {

    protected static int loginStatusRun = 1;
    private ArrayList<String> sameProductExpiryCompare = new ArrayList<>();
    private ArrayList<String> sameProductSupplier = new ArrayList<>();
    private ArrayList<String> sameProductBatchNo = new ArrayList<>();
    private ArrayList<String> sameProductName = new ArrayList<>();
    private ArrayList<String> sameProductStrength = new ArrayList<>();
    private ArrayList<Float> sameProductPrice = new ArrayList<>();
    private ArrayList<Integer> sameProductStock = new ArrayList<>();
    private ArrayList<String> sameProductCycle = new ArrayList<>();
    private ArrayList<String> sameProductDayCount = new ArrayList<>();
    private ArrayList<Integer> sameProductTotalMed = new ArrayList<>();
    ArrayList<String> alreadyAdded = new ArrayList<>();
    String split1;
    String split2;
    boolean isSplit1 = true;
    private JFrame parentComponent;
    protected ResultSet result;
    protected Connection connection;
    protected Statement statement;
    protected static String serverAddress = "192.xxx.xxx.xxx";
    private String hostName = "anas";
    private String hostPassword = "anas@";

    public DatabaseClass(JFrame parentFrame) {
        try {
            serverAddress = new FileStreamingClass(null).loadOldIp();
            connection = DriverManager.getConnection("jdbc:mysql://" + serverAddress + ":3306/ehospital_db?verifyServerCertificate=false&useSSL=false",
                    hostName, hostPassword);
            statement = connection.createStatement();
            this.parentComponent = parentFrame;
        } catch (CommunicationsException ce) {
            loginStatusRun = 0;
            int optn = JOptionPane.showConfirmDialog(parentFrame, "It seems to be an error occurred in server Ip settings.\n"
                    + "Do you want to configure server Ip settings now ?", "Server Ip Error", JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE);
            if (optn == JOptionPane.YES_OPTION) {
                new ServerIpAddressGUI(parentFrame).setVisible(true);
                parentFrame.setVisible(false);
            }
        } catch (Exception e) {
            if (parentFrame != null) {
                JOptionPane.showMessageDialog(parentFrame, "Connection lost with server", "No internet connection", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public boolean login(String email, String pass) {
        try {
            if (loginStatusRun == 1) {
                int count = 0;
                String accountType = "", name = "";
                String query = "select * from accounts where email = '" + email + "' and binary password = '" + pass + "';";
                result = statement.executeQuery(query);
                while (result.next()) {
                    accountType = result.getString("accountType");
                    name = capitalizeName(result.getString("name"));
                    count++;
                }
                if (count == 0) {
                    return false;
                }
                boolean isDoctor = false;
                boolean isAdmin = false;
                if (accountType.equalsIgnoreCase("doctor")) {
                    isDoctor = true;
                }
                if (accountType.equalsIgnoreCase("admin")) {
                    isAdmin = true;
                }
                MenuGUI.staticObject = new MenuGUI(email, name, accountType, isDoctor, isAdmin);
                return true;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(parentComponent, "Something went wrong!", "Login Failed", JOptionPane.ERROR_MESSAGE);
        }
        return false;
    }

    public boolean signup(String name, String email, String pass, int accType, String age, String contctnum, int sex, String profession,
            String Qualify, String cnic, String days, String time, String code, int dayLimit, String dob) {
        try {
            email = email.toLowerCase();
            String gender = "";
            if (sex == 1) {
                gender = "Male";
            } else {
                gender = "Female";
            }
            String accounttype = "";
            if (accType == 1) {
                accounttype = "Patient";
                String query1 = "create table `" + email + "` (name varchar(50) not null, accountType varchar(10) not null,"
                        + " age varchar(5) not null, contactnumber varchar(20) not null, cnic varchar(50) not null, sex varchar(20) not null, dob date not null)";
                String query2 = "insert into accounts (email, password, name, accountType) values('" + email + "', '" + pass
                        + "', '" + name + "', '" + accounttype + "')";
                String query3 = "insert into `" + email + "` (name, accountType, age, contactnumber, cnic, sex, dob) values('" + name
                        + "', '" + accType + "', '" + age + "', '" + contctnum + "', '" + cnic + "', '" + gender + "', '" + dob + "')";
                String query4 = "CREATE TABLE `" + email + "_pcode` (pcode varchar(50) NOT NULL, issue_date varchar(50) NOT NULL, PRIMARY KEY(pcode))";
                String query5 = "CREATE TABLE `" + email + "_appointments` (doctor_name varchar(100), doctor_email varchar(100),"
                        + " date DATE, appointment_no int)";
                String query6 = "CREATE TABLE `" + email + "_responses` (email varchar(100), type varchar(100), details text, response text)";
                statement.execute(query2);
                statement.execute(query1);
                statement.execute(query3);
                statement.execute(query4);
                statement.execute(query5);
                statement.execute(query6);
                return true;
            }
            if (accType == 2) {
                accounttype = "Doctor";
                int count = 0;
                String query = "select * from verify where code = '" + code + "' and status = 'valid' and type = 'dr'";
                result = statement.executeQuery(query);
                while (result.next()) {
                    count++;
                }
                if (count == 0) {
                    return false;
                }
                String query1 = "create table `" + email + "`(name varchar(50) not null, accountType varchar(10) not null,"
                        + " age varchar(5) not null, contactnumber varchar(20) not null, cnic varchar(50) not null, sex varchar(20) not null, dob date not null,"
                        + " profession varchar(100) not null, qualification varchar(100) not null)";
                String query2 = "create table `" + email + "_appointment_schedule` (appointment_no int auto_increment, patient_name varchar(100),"
                        + "patient_email varchar(100), date date, primary key(patient_email), key(appointment_no))";
                String query3 = "INSERT INTO accounts (email, password, name, accountType, profession) VALUES ('" + email + "', '" + pass
                        + "', '" + name + "', '" + accounttype + "', '" + profession + "')";
                String query4 = "insert into `" + email + "`(name, accountType, age, contactnumber, cnic, sex, dob, profession, qualification)"
                        + " values('" + name + "', '" + accType + "', '" + age + "', '" + contctnum + "', '" + cnic + "', '" + gender + "', '" + dob
                        + "', '" + profession + "', '" + Qualify + "')";
                String query5 = "CREATE TABLE `" + email + "_pcode` (pcode varchar(50) NOT NULL, issue_date varchar(50) NOT NULL, PRIMARY KEY(pcode))";
                String query6 = "CREATE TABLE `" + email + "_pcode_doctorcopy` (pcode varchar(50) NOT NULL, issue_date varchar(50) NOT NULL,"
                        + " PRIMARY KEY(pcode))";
                String query7 = "INSERT INTO doctor_details (name, email, profession, qualification, time, days, day_limit) VALUES ('" + name
                        + "', '" + email + "', '" + profession + "', '" + Qualify + "', '" + time + "', '" + days + "', " + dayLimit + ")";
                String query8 = "CREATE TABLE `" + email + "_appointments` (doctor_name varchar(100), doctor_email varchar(100), day varchar(50),"
                        + " appointment_no int)";
                String query9 = "CREATE TABLE `" + email + "_responses` (email varchar(100), type varchar(100), details text, response text)";
                statement.execute(query3);
                statement.execute(query1);
                statement.execute(query2);
                statement.execute(query4);
                statement.execute(query5);
                statement.execute(query6);
                statement.execute(query7);
                statement.execute(query8);
                statement.execute(query9);
                return true;
            }
            if (accType == 3) {
                accounttype = "Admin";
                int count = 0;
                String query = "select * from verify where code = '" + code + "' and status = 'valid' and type ='admin'";
                result = statement.executeQuery(query);
                while (result.next()) {
                    count++;
                }
                if (count == 0) {
                    return false;
                }
                String query1 = "create table `" + email + "`(name varchar(50) not null, accountType varchar(10) not null, age varchar(5) not null,"
                        + " contactnumber varchar(20) not null, cnic varchar(50) not null, sex varchar(20) not null, dob date not null)";
                String query2 = "insert into accounts (email, password, name, accountType) values('" + email + "', '" + pass + "', '"
                        + name + "', '" + accounttype + "')";
                String query3 = "insert into `" + email + "`(name, accountType, age, contactnumber, cnic, sex) values('" + name + "', '" + accType + "', '"
                        + age + "', '" + contctnum + "', '" + cnic + "', '" + gender + "', '" + dob + "')";
                String query4 = "CREATE TABLE `" + email + "_pcode` (pcode varchar(50) NOT NULL, issue_date varchar(50) NOT NULL, PRIMARY KEY(pcode))";
                String query5 = "CREATE TABLE `" + email + "_complains` (email VARCHAR(100) NOT NULL, name VARCHAR(100) NOT NULL,"
                        + " account_type VARCHAR(50) NOT NULL, message TEXT NOT NULL)";
                String query6 = "CREATE TABLE `" + email + "_alerts` (alert_originator VARCHAR(100) NOT NULL, alert_type VARCHAR(100) NOT NULL,"
                        + " alert_detail TEXT NOT NULL, status_ VARCHAR(20) DEFAULT 'unread', seen_time VARCHAR(100))";
                String query7 = "CREATE TABLE `" + email + "_appointments` (doctor_name varchar(100), doctor_email varchar(100),"
                        + " date date, appointment_no int)";
                String query8 = "CREATE TABLE `" + email + "_fullfillrequest` (name VARCHAR(100) NOT NULL, email VARCHAR(100) NOT NULL,"
                        + " type VARCHAR(100) NOT NULL, details TEXT NOT NULL)";
                String query9 = "CREATE TABLE `" + email + "_responses` (email varchar(100), type varchar(100), details text, response text)";
                String query10 = "CREATE TABLE `" + email + "_feedbacks` (name varchar(100), email varchar(100), subject varchar(150), details TEXT)";
                statement.execute(query2);
                statement.execute(query1);
                statement.execute(query3);
                statement.execute(query4);
                statement.execute(query5);
                statement.execute(query6);
                statement.execute(query7);
                statement.execute(query8);
                statement.execute(query9);
                statement.execute(query10);
                return true;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(parentComponent, "Something went wrong!", "Sign up Failed", JOptionPane.ERROR_MESSAGE);
        }
        return false;
    }

    public boolean changePassword(String email, String oldPass, String newPass) {
        try {
            String query1 = "SELECT password FROM accounts WHERE email = '" + email + "' AND password = '" + oldPass + "'";
            int count = 0;
            result = statement.executeQuery(query1);
            while (result.next()) {
                count++;
            }
            if (count > 0) {
                String query2 = "UPDATE accounts SET password = '" + newPass + "' WHERE email = '" + email + "'";
                statement.execute(query2);
            } else {
                return false;
            }
            return true;
        } catch (Exception e) {
        }
        return false;
    }

    public boolean pharmacy(String email, String prescription_code, boolean isHistoryRequired) {
        try {
            if (!isHistoryRequired) {
                CheckOutGUI.mustSaleMedName.clear();
                CheckOutGUI.mustSaleMedBatchNo.clear();
                CheckOutGUI.mustSaleMedPrice.clear();
                CheckOutGUI.mustSaleMedStockLeft.clear();
                CheckOutGUI.mustSaleMedStrength.clear();
                CheckOutGUI.mustSaleMedTotalCount.clear();
                Pharmacy_GUI.batchNo.clear();
                sameProductExpiryCompare.clear();
                sameProductBatchNo.clear();
                sameProductName.clear();
                sameProductStrength.clear();
                sameProductPrice.clear();
                sameProductStock.clear();
                sameProductCycle.clear();
                sameProductDayCount.clear();
                sameProductTotalMed.clear();
                String query1 = "SELECT pcode FROM `" + email + "_pcode` WHERE pcode = '" + prescription_code + "'";
                result = statement.executeQuery(query1);
                int x_ = 0;
                while (result.next()) {
                    x_++;
                }
                if (x_ > 0) {
                    String queryCheckStatus = "SELECT status FROM pcode_history WHERE pcode = '" + prescription_code + "' AND status = 'valid'";
                    result = statement.executeQuery(queryCheckStatus);
                    x_ = 0;
                    while (result.next()) {
                        x_++;
                    }
                    if (x_ == 0) {
                        JOptionPane.showMessageDialog(parentComponent, "This prescription code has been expired", "Prescription ID rejected",
                                JOptionPane.ERROR_MESSAGE);
                        return true;
                    }
                    String query2 = "SELECT * FROM `" + prescription_code + "_list`";
                    result = statement.executeQuery(query2);
                    DefaultTableModel tableModel = new DefaultTableModel() {
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
                            return col == 1;
                        }
                    };
                    tableModel.addColumn("S. No");
                    tableModel.addColumn("Buy");
                    tableModel.addColumn("Name");
                    tableModel.addColumn("Strength");
                    tableModel.addColumn("Day Duration");
                    tableModel.addColumn("Total Days Cycle");
                    tableModel.addColumn("Total Medicines");
                    tableModel.addColumn("Price");
                    tableModel.addColumn("Stock left");
                    ArrayList<String> med_names = new ArrayList<>();
                    ArrayList<String> med_strength = new ArrayList<>();
                    ArrayList<String> medDayDuration = new ArrayList<>();
                    ArrayList<Integer> medTotalCount = new ArrayList<>();
                    ArrayList<String> medTotalCycle = new ArrayList<>();
                    ArrayList<String> FinalMedDayDuration = new ArrayList<>();
                    ArrayList<Integer> FinalMedTotalCount = new ArrayList<>();
                    ArrayList<String> FinalMedTotalCycle = new ArrayList<>();
                    ArrayList<String> medNamesFromDB = new ArrayList<>();
                    ArrayList<String> medStrengthFromDB = new ArrayList<>();
                    ArrayList<String> medExpiryDateFromDB = new ArrayList<>();
                    ArrayList<String> medBatchNoFromDB = new ArrayList<>();
                    ArrayList<String> medSupplierNameFromDB = new ArrayList<>();
                    ArrayList<Float> medPriceFromDB = new ArrayList<>();
                    ArrayList<Integer> medStockLeftFromDB = new ArrayList<>();
                    boolean isStockOut = false;
                    boolean isExipired = false;
                    while (result.next()) {
                        med_names.add(result.getString("med_name"));
                        med_strength.add(result.getString("med_strength"));
                        medDayDuration.add(result.getString("day_duration"));
                        medTotalCount.add(result.getInt("total_med_count"));
                        medTotalCycle.add(result.getString("total_day_count"));
                    }
                    for (int i = 0; i < med_names.size(); i++) {
                        String query3 = "SELECT * FROM pharmacy WHERE name_ = '" + med_names.get(i) + "' AND strength = '" + med_strength.get(i) + "'";
                        result = statement.executeQuery(query3);
                        while (result.next()) {
                            medNamesFromDB.add(result.getString("name_"));
                            medStrengthFromDB.add(result.getString("strength"));
                            medExpiryDateFromDB.add(result.getString("expiry_date"));
                            medBatchNoFromDB.add(result.getString("batch_no"));
                            medSupplierNameFromDB.add(result.getString("supplier_name"));
                            medPriceFromDB.add(result.getFloat("price"));
                            medStockLeftFromDB.add(result.getInt("stock_left"));
                            FinalMedDayDuration.add(medDayDuration.get(i));
                            FinalMedTotalCount.add(medTotalCount.get(i));
                            FinalMedTotalCycle.add(medTotalCycle.get(i));
                        }
                    }
                    for (int j = 0; j < medNamesFromDB.size(); j++) {
                        int tempInt = medStockLeftFromDB.get(j) - FinalMedTotalCount.get(j);
                        if (tempInt >= 0) {
                            if (!"false".equals(medicineExpiryValidator(medExpiryDateFromDB.get(j), medBatchNoFromDB.get(j),
                                    medSupplierNameFromDB.get(j), false, true))) {
                                sameProductStrength.add(medStrengthFromDB.get(j).toLowerCase());
                                sameProductName.add(medNamesFromDB.get(j).toLowerCase());
                                sameProductBatchNo.add(medBatchNoFromDB.get(j));
                                sameProductPrice.add(medPriceFromDB.get(j));
                                sameProductStock.add(medStockLeftFromDB.get(j));
                                sameProductTotalMed.add(FinalMedTotalCount.get(j));
                                sameProductDayCount.add(FinalMedDayDuration.get(j));
                                sameProductCycle.add(FinalMedTotalCycle.get(j));
                                sameProductExpiryCompare.add(medExpiryDateFromDB.get(j));
                                sameProductSupplier.add(medSupplierNameFromDB.get(j));
                            } else {
                                isExipired = true;
                            }
                        } else if (tempInt < 0) {
                            if (!"false".equals(medicineExpiryValidator(medExpiryDateFromDB.get(j), medBatchNoFromDB.get(j),
                                    medSupplierNameFromDB.get(j), false, true))) {
                                int temp_ = FinalMedTotalCount.get(j) - medStockLeftFromDB.get(j);
                                try {
                                    for (int i = 0; i < medNamesFromDB.size(); i++) {
                                        if (medNamesFromDB.get(i).equalsIgnoreCase(medNamesFromDB.get(j))
                                                && medStrengthFromDB.get(i).equalsIgnoreCase(medStrengthFromDB.get(j))) {
                                            FinalMedTotalCount.set(i, temp_);
                                            FinalMedTotalCount.set(j, temp_);
                                            for (int j_ = 0; j_ < sameProductTotalMed.size(); j_++) {
                                                if (sameProductName.get(j_).equalsIgnoreCase(medNamesFromDB.get(i))
                                                        && sameProductStrength.get(j_).equalsIgnoreCase(medStrengthFromDB.get(i))) {
                                                    sameProductTotalMed.set(j_, temp_);
                                                }
                                            }
                                        }
                                    }
                                } catch (Exception e) {
                                    e.printStackTrace();
                                }
                                CheckOutGUI.mustSaleMedName.add(medNamesFromDB.get(j));
                                CheckOutGUI.mustSaleMedStrength.add(medStrengthFromDB.get(j));
                                CheckOutGUI.mustSaleMedBatchNo.add(medBatchNoFromDB.get(j));
                                CheckOutGUI.mustSaleMedTotalCount.add(temp_);
                                CheckOutGUI.mustSaleMedStockLeft.add(0);
                                CheckOutGUI.mustSaleMedPrice.add(medPriceFromDB.get(j));
                            } else {
                                isExipired = true;
                            }
                            if (CheckOutGUI.mustSaleMedName.isEmpty()) {
                                isStockOut = true;
                            }
                        }
                    }
                    tableModel = medicinesExpirySort(tableModel);
//                    for (int i = 0; i < sameProductName.size(); i++) {
//                        Float finalPrice = sameProductPrice.get(i) * (float) sameProductTotalMed.get(i);
//                        float tempFinalPrice_ = Math.round(finalPrice * 100f) / 100f;
//                        if (!alreadyAdded.contains(sameProductName.get(i).toLowerCase() + sameProductStrength.get(i).toLowerCase())) {
//                            alreadyAdded.add(sameProductName.get(i).toLowerCase() + sameProductStrength.get(i).toLowerCase());
//                        }
//                    }
                    if (isStockOut) {
                        JOptionPane.showMessageDialog(parentComponent, "Some medicines are not displaying due to they are out of stock", "Out of Stock",
                                JOptionPane.WARNING_MESSAGE);
                    }
                    if (isExipired) {
                        JOptionPane.showMessageDialog(parentComponent, "Some medicines are not displaying due to they are Expired", "Medicine Expired",
                                JOptionPane.WARNING_MESSAGE);
                    }
//                    float tempFinalPrice = Math.round(totalCheckoutPrice * 100f) / 100f;
                    Pharmacy_GUI.lblAmount.setText("Rs 0.0");
                    Pharmacy_GUI.medicinesListTable.setModel(tableModel);
                    Pharmacy_GUI.medicinesListTable.getColumnModel().getColumn(0).setMaxWidth(60);
                    Pharmacy_GUI.medicinesListTable.getColumnModel().getColumn(0).setMinWidth(60);
                    Pharmacy_GUI.medicinesListTable.getColumnModel().getColumn(0).setResizable(false);
                    Pharmacy_GUI.medicinesListTable.getColumnModel().getColumn(1).setMaxWidth(60);
                    Pharmacy_GUI.medicinesListTable.getColumnModel().getColumn(1).setMinWidth(60);
                    Pharmacy_GUI.medicinesListTable.getColumnModel().getColumn(1).setResizable(false);
                    closeConnection();
                    return true;
                }
            } else {
                String query1 = "SELECT * FROM pcode_history WHERE patient_email = '" + email + "' OR doctor_email='" + email + "'";
                result = statement.executeQuery(query1);
                DefaultTableModel tableModel = new DefaultTableModel() {
                    @Override
                    public boolean isCellEditable(int row, int col) {
                        return false;
                    }
                };
                tableModel.addColumn("Prescription Code");
                tableModel.addColumn("Issued By");
                tableModel.addColumn("Issue Date");
                tableModel.addColumn("Status");
                while (result.next()) {
                    if (email.equals(result.getString("doctor_email"))) {
                        tableModel.addRow(new Object[]{result.getString("pcode"), "Me",
                            result.getString("issue_date"), result.getString("status")});
                    } else {
                        tableModel.addRow(new Object[]{result.getString("pcode"), "Dr." + capitalizeName(result.getString("doctor_name")),
                            result.getString("issue_date"), result.getString("status")});
                    }
                }
                PrescriptionsHistoryGUI.listTable.setModel(tableModel);
                closeConnection();
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(parentComponent, "Entered prescription code seems to be invalid", "error 201", JOptionPane.ERROR_MESSAGE);
        }
        closeConnection();
        return false;
    }

    public String emergency(String paitentID) {
        return null;
    }

    public Object[] emergencyCasesList() {
        try {
            String query = "SELECT * FROM emergency_list";
            ArrayList<String> list_ = new ArrayList<>();
            ArrayList<Integer> priority = new ArrayList<>();
            ArrayList<String> caseProfession = new ArrayList<>();
            result = statement.executeQuery(query);
            list_.add("Select emergency case type...");
            while (result.next()) {
                list_.add(result.getString("case_name"));
                priority.add(result.getInt("priority"));
                caseProfession.add(result.getString("case_type"));
            }
            Object[] array_ = list_.toArray();
            PatientEmergencyGUI.priority = priority;
            PatientEmergencyGUI.caseProfession = caseProfession;
            return array_;
        } catch (Exception e) {
        }
        return null;
    }

    public boolean emergency_update(String doctorEmail, boolean isDoctorDisplay) {
        try {
            String query1 = "SELECT * FROM emergency_update WHERE doctor_email = '" + doctorEmail + "'";
            ArrayList<String> caseName = new ArrayList<>();
            ArrayList<String> patientEmail = new ArrayList<>();
            ArrayList<Integer> casePriority = new ArrayList<>();
            result = statement.executeQuery(query1);
            int count = 0;
            while (result.next()) {
                patientEmail.add(result.getString("patient_email"));
                caseName.add(result.getString("case_name"));
                casePriority.add(result.getInt("priority"));
                count++;
            }
            if (isDoctorDisplay) {
                if (count != 0) {
                    EmergencyCasesDetailsDoctor.caseName.clear();
                    EmergencyCasesDetailsDoctor.patientEmail.clear();
                    EmergencyCasesDetailsDoctor.casePriority.clear();
                    EmergencyCasesDetailsDoctor.caseName = caseName;
                    EmergencyCasesDetailsDoctor.patientEmail = patientEmail;
                    EmergencyCasesDetailsDoctor.casePriority = casePriority;
                    DefaultListModel list = new DefaultListModel();
                    for (int i = 0; i < caseName.size(); i++) {
                        list.addElement(patientEmail.get(i) + "     (" + caseName.get(i) + ")");
                    }
                    EmergencyCasesDetailsDoctor.jList1.setModel(list);
                    HashMap<Integer, ArrayList<String>> map = new HashMap<>();
                    for (int i : casePriority) {
                        map.put(i, caseName);
                    }
                    closeConnection();
                    return true;
                } else {
                    MenuGUI.staticObject.doctorUpdates();
                }
            }
            if (count != 0) {
                closeConnection();
                return true;
            }
        } catch (Exception e) {
        }
        closeConnection();
        return false;
    }

    public boolean alertUpdate(String adminEmail, boolean isAdminDisplay, boolean oneRegularCheck) {
        try {
            if (oneRegularCheck) {
                medicineExpiryValidator(null, null, null, true, false);
            }
            String query1 = "SELECT * FROM `" + adminEmail + "_alerts`";
            ArrayList<String> alertOriginator = new ArrayList<>();
            ArrayList<String> alertType = new ArrayList<>();
            ArrayList<String> alertDetail = new ArrayList<>();
            ArrayList<String> alertStatus = new ArrayList<>();
            ArrayList<String> alertSeenTime = new ArrayList<>();
            result = statement.executeQuery(query1);
            int count = 0;
            while (result.next()) {
                alertOriginator.add(result.getString("alert_originator"));
                alertType.add(result.getString("alert_type"));
                alertDetail.add(result.getString("alert_detail"));
                alertStatus.add(result.getString("status_"));
                alertSeenTime.add(result.getString("seen_time"));
                count++;
            }
            if (isAdminDisplay) {
                if (count != 0) {
                    AdminAlertDisplayGUI.alertOriginator.clear();
                    AdminAlertDisplayGUI.alertType.clear();
                    AdminAlertDisplayGUI.alertDetail.clear();
                    AdminAlertDisplayGUI.alertStatus.clear();
                    AdminAlertDisplayGUI.alertOriginator = alertOriginator;
                    AdminAlertDisplayGUI.alertType = alertType;
                    AdminAlertDisplayGUI.alertDetail = alertDetail;
                    AdminAlertDisplayGUI.alertStatus = alertStatus;
                    AdminAlertDisplayGUI.alertSeenTime = alertSeenTime;
                    DefaultTableModel tempTableModel = (DefaultTableModel) AdminAlertDisplayGUI.alertsTable.getModel();
                    for (int i = 0; i < alertOriginator.size(); i++) {
                        tempTableModel.addRow(new Object[]{alertOriginator.get(i), alertType.get(i), alertDetail.get(i), alertStatus.get(i)});
                    }
                    AdminAlertDisplayGUI.alertsTable.setModel(tempTableModel);
                    closeConnection();
                    return true;
                } else {
                    connection.close();
                    MenuGUI.staticObject.adminUpdates();
                }
            }
            if (count != 0) {
                closeConnection();
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        closeConnection();
        return false;
    }

    public boolean register_emergency(String email, String case_name, String caseType, int priority) {
        try {
            ArrayList<String> names = new ArrayList<>();
            ArrayList<String> emails = new ArrayList<>();
            String query1 = "SELECT * FROM doctor_details WHERE email <> '" + email + "'";
            result = statement.executeQuery(query1);
            int totalDoctorSuitableForThisCase = 0;
            while (result.next()) {
                names.add(result.getString("name"));
                emails.add(result.getString("email"));
                totalDoctorSuitableForThisCase++;
            }
            if (totalDoctorSuitableForThisCase < 1){
                javax.swing.JOptionPane.showMessageDialog(parentComponent, "Sorry, we've no suitable doctor for your emergency case\nPlease contact us at: 0800-HOSPITAL",
                        "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
                return false;
            }
            Random randomDoctorForThisCase = new Random();
            int getIndex = randomDoctorForThisCase.nextInt(totalDoctorSuitableForThisCase) + 0;
            String query2 = "INSERT INTO emergency_update (doctor_email, patient_email, case_name, priority) VALUES ('" + emails.get(getIndex)
                    + "', '" + email + "', '" + case_name + "', '" + priority + "')";
            statement.execute(query2);
            return true;
        } catch (Exception e) {
        }
        return false;
    }

    public boolean removeEmergencyCase(String patientEmail, String doctorEmail, String caseName) {
        try {
            String query1 = "DELETE FROM emergency_update WHERE doctor_email = '" + doctorEmail + "' AND patient_email = '" + patientEmail
                    + "' AND case_name = '" + caseName + "'";
            statement.execute(query1);
            return true;
        } catch (Exception e) {
        }
        return false;
    }

    public boolean createPrescription(String doctor_email, String patientEmail, String doctor_name, String patientName, ArrayList<String> medicineNamesList,
            ArrayList<String> medicineStrengthList, ArrayList<String> medDayDuration, ArrayList<Integer> medTotalCount, int totalCycle,
            String prescriptionCode, boolean reusable_) {
        try {
            String totalCycleMsg = (totalCycle > 1 ? " days" : " day");
            String reusable = (reusable_ ? "true" : "false");
            String query1 = "CREATE TABLE `" + prescriptionCode + "_info` (doctor_email VARCHAR(100) NOT NULL, doctor_name VARCHAR(100) NOT NULL,"
                    + " patient_email VARCHAR(100) NOT NULL, patient_name VARCHAR(100) NOT NULL, issue_date VARCHAR(100) NOT NULL,"
                    + " reusable VARCHAR(10) NOT NULL)";
            String query2 = "CREATE TABLE `" + prescriptionCode + "_list` (med_name VARCHAR(100), med_strength VARCHAR(100), day_duration VARCHAR(20),"
                    + " total_med_count INT," + "total_day_count VARCHAR(50))";
            String query3 = "INSERT INTO pcode_history (pcode , patient_name , patient_email , doctor_name , doctor_email , issue_date , status) VALUES ('"
                    + prescriptionCode + "', '" + patientName + "', '" + patientEmail + "', '" + doctor_name + "', '" + doctor_email + "', '" + getDateTime()
                    + "', 'valid')";
            statement.execute(query3);
            statement.execute(query1);
            statement.execute(query2);
            String query4 = "INSERT INTO `" + prescriptionCode + "_info` (doctor_email, doctor_name, patient_email, patient_name, issue_date, "
                    + "reusable) VALUES ('" + doctor_email + "', '" + doctor_name + "', '" + patientEmail + "','" + patientName + "', '"
                    + getDateTime() + "', '" + reusable + "')";
            statement.execute(query4);
            String query5 = "INSERT INTO `" + doctor_email + "_pcode_doctorcopy` (pcode, issue_date) VALUES ('" + prescriptionCode + "', '"
                    + getDateTime() + "')";
            statement.execute(query5);
            String query6 = "INSERT INTO `" + patientEmail + "_pcode` (pcode, issue_date) VALUES ('" + prescriptionCode + "', '" + getDateTime() + "')";
            statement.execute(query6);
            for (int i = 0; i < medicineNamesList.size(); i++) {
                String tempTime_ = (Integer.parseInt(medDayDuration.get(i)) > 1 ? " times" : " time");
                String query7 = "INSERT INTO `" + prescriptionCode + "_list` (med_name, med_strength, day_duration, total_med_count, total_day_count)"
                        + " VALUES ('" + medicineNamesList.get(i) + "', '" + medicineStrengthList.get(i) + "', '" + medDayDuration.get(i) + tempTime_
                        + "', " + medTotalCount.get(i) + ", '" + totalCycle + totalCycleMsg + "')";
                statement.execute(query7);
            }
            return true;
        } catch (Exception e) {
        }
        return false;
    }

    public boolean checkOut(String email, String prescription_code, String billing_address, String shipping_address, float amount) {
        try {
            String checktable = "SELECT pcode FROM purchase_history WHERE email = '" + email + "'";
            try {
                result = statement.executeQuery(checktable);
                while (result.next()) {
                    break;
                }
            } catch (Exception e) {
                statement.execute("CREATE TABLE purchase_history (email VARCHAR(100), pcode VARCHAR(100), date VARCHAR(50), billing_address VARCHAR(100),"
                        + " shipping_address VARCHAR(100), amount VARCHAR(50))");
            }
            String placeOrder = "INSERT INTO purchase_history (email, pcode, date, billing_address, shipping_address, amount) VALUES ("
                    + "'" + email + "', '" + prescription_code + "', '" + getDateTime() + "', '" + billing_address + "', '" + shipping_address
                    + "', '" + amount + "')";
            statement.execute(placeOrder);
            String checkReusablitiy = "SELECT reusable FROM `" + prescription_code + "_info`";
            boolean getReusable = false;
            result = statement.executeQuery(checkReusablitiy);
            while (result.next()) {
                getReusable = result.getBoolean("reusable");
            }
            if (!getReusable) {
                String disposePrescriptionCode = "UPDATE pcode_history SET status = 'expired' WHERE pcode = '" + prescription_code + "'";
                String deleteThisPrescription1 = "DROP TABLE `" + prescription_code + "_info`";
                String deleteThisPrescription2 = "DROP TABLE `" + prescription_code + "_list`";
                statement.execute(disposePrescriptionCode);
                statement.execute(deleteThisPrescription1);
                statement.execute(deleteThisPrescription2);
            }
            return true;
        } catch (Exception e) {
        }
        return false;
    }

    public void stockDecrementDueToPurchases(ArrayList<String> names, ArrayList<String> strength, ArrayList<Integer> totalMedicine,
            ArrayList<Integer> stockLeft, ArrayList<String> batchNo) {
        for (int i = 0; i < names.size(); i++) {
            try {
                String query1 = "SELECT stock_left FROM pharmacy WHERE name_ = '" + names.get(i) + "' AND strength = '" + strength.get(i)
                        + "' AND batch_no='" + batchNo.get(i) + "'";
                int stockLeftInDB = 0;
                result = statement.executeQuery(query1);
                while (result.next()) {
                    stockLeftInDB = result.getInt("stock_left");
                }
                stockLeftInDB -= totalMedicine.get(i);
                String query2 = "UPDATE pharmacy SET stock_left = " + stockLeftInDB + " WHERE name_ = '" + names.get(i) + "' AND strength = '"
                        + strength.get(i) + "' AND batch_no='" + batchNo.get(i) + "'";
                statement.execute(query2);
            } catch (Exception e) {
            }
        }
    }

    public DefaultListModel searchProfile(String searchName, boolean isSearchingDoctor) {
        String accountType = (isSearchingDoctor ? "doctor" : "patient");
        try {
            ArrayList<String> names = new ArrayList<>();
            ArrayList<String> emails = new ArrayList<>();
            DefaultListModel list = new DefaultListModel();
            String query1 = "SELECT * FROM accounts WHERE name LIKE '%" + searchName + "%' AND accountType = '" + accountType + "'";
            result = statement.executeQuery(query1);
            while (result.next()) {
                String name = capitalizeName(result.getString("name"));
                String email = result.getString("email");
                names.add(name);
                emails.add(email);
                list.addElement(name + "\t(" + email + ")");
            }
            SearchProfileGUI.names = names;
            SearchProfileGUI.emails = emails;
            closeConnection();
            return list;
        } catch (Exception e) {
        }
        closeConnection();
        return null;
    }

    public boolean updatePrescriptionCodeInfo(String email, String pcode, boolean isReusable, boolean isValid) {
        try {
            String reusable = (isReusable ? "true" : "false");
            String valid = (isValid ? "valid" : "Disposed by doctor");
            String query1 = "UPDATE `" + pcode + "_info` SET reusable = '" + reusable + "'";
            String query2 = "UPDATE pcode_history SET status = '" + valid + "' WHERE doctor_email = '" + email + "' AND pcode = '" + pcode + "'";
            String query3 = "DROP TABLE `" + pcode + "_info`";
            String query4 = "DROP TABLE `" + pcode + "_list`";
            if (!isValid) {
                statement.execute(query3);
                statement.execute(query4);
            } else {
                statement.execute(query1);
            }
            statement.execute(query2);
            closeConnection();
            return true;
        } catch (Exception e) {
        }
        closeConnection();
        return false;
    }

    public boolean searchPrescriptionCode(String email, String pcode) {
        try {
            String query1 = "SELECT * FROM pcode_history WHERE doctor_email='" + email + "' AND status='valid'";
            result = statement.executeQuery(query1);
            boolean foundCode = false;
            String name = "";
            while (result.next()) {
                if (pcode.equals(result.getString("pcode"))) {
                    foundCode = true;
                    name = result.getString("patient_name");
                }
            }
            if (foundCode) {
                PrescriptionCodeInfoUpdateGUI.lblPatientName.setText(name);
                PrescriptionCodeInfoUpdateGUI.validStatus[0] = 1;
                PrescriptionCodeInfoUpdateGUI.validStatus[1] = 1;
                String query2 = "SELECT reusable FROM `" + pcode + "_info`";
                boolean isReusable = false;
                result = statement.executeQuery(query2);
                while (result.next()) {
                    isReusable = ("true".equals(result.getString("reusable")));
                }
                if (isReusable) {
                    PrescriptionCodeInfoUpdateGUI.reusableStatus[0] = 1;
                    PrescriptionCodeInfoUpdateGUI.reusableStatus[1] = 1;
                } else {
                    PrescriptionCodeInfoUpdateGUI.reusableStatus[0] = 0;
                    PrescriptionCodeInfoUpdateGUI.reusableStatus[1] = 0;
                }
                closeConnection();
                return true;
            } else {
                PrescriptionCodeInfoUpdateGUI.validStatus[0] = 0;
                PrescriptionCodeInfoUpdateGUI.validStatus[1] = 0;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        closeConnection();
        return false;
    }

    protected void closeConnection() {
        try {
            statement.close();
            result.close();
            connection.close();
        } catch (Exception e) {
        }
    }

    protected String capitalizeName(String rawName) {
        String[] nameSplit = rawName.split("\\s+");
        String capitalizeNewName = "";
        for (String i : nameSplit) {
            char[] moreSplits = i.toCharArray();
            if (moreSplits[0] <= 'Z') {
                capitalizeNewName = (capitalizeNewName.equals("") ? "" : capitalizeNewName + " ");
                capitalizeNewName += String.copyValueOf(moreSplits);
            } else {
                capitalizeNewName = (capitalizeNewName.equals("") ? "" : capitalizeNewName + " ");
                moreSplits[0] = (char) (moreSplits[0] - 32);
                capitalizeNewName += String.copyValueOf(moreSplits);
            }
        }
        return capitalizeNewName;
    }

    protected String getDateForExpiryAndManufacture() {
        LocalDateTime ldt = LocalDateTime.now();
        String date = ldt.getMonthValue() + "/" + ldt.getYear();
        return date;
    }

    protected String getDateTime() {
        LocalDateTime ldt = LocalDateTime.now();
        String amPm;
        String hour;
        String dateTime = ldt.getDayOfMonth() + "/" + ldt.getMonth().name().toLowerCase() + "/" + ldt.getYear();
        if (ldt.getHour() > 12) {
            hour = (ldt.getHour() - 12) + "";
            amPm = "PM";
        } else {
            hour = ldt.getHour() + "";
            amPm = "AM";
        }
        String minute = "";
        if (ldt.getMinute() < 10) {
            minute += "0" + ldt.getMinute();
        } else {
            minute += ldt.getMinute();
        }
        dateTime += " , " + hour + ":" + minute + " " + amPm;
        return dateTime;
    }

    protected String medicineExpiryValidator(String medicineExiryDate, String batch_no, String supplier_name, boolean isRegularCheck,
            boolean isCompare) {
        if (!isRegularCheck) {
            String todayDate = getDateForExpiryAndManufacture();
            String[] months = new String[]{"jan", "feb", "mar", "apr", "may", "jun", "jul", "aug", "sep", "oct", "nov", "dec"};
            String[] monthAndYearFromExpiryDate;
            String[] monthAndYearFromCurrentDate = todayDate.split("/");
            if (medicineExiryDate.contains("/")) {
                monthAndYearFromExpiryDate = medicineExiryDate.split("/");
            } else if (medicineExiryDate.contains("\\")) {
                monthAndYearFromExpiryDate = medicineExiryDate.split("\\");
            } else {
                monthAndYearFromExpiryDate = medicineExiryDate.split("-");
            }
            for (int i = 0; i < months.length; i++) {
                monthAndYearFromExpiryDate[0] = monthAndYearFromExpiryDate[0].toLowerCase();
                if (monthAndYearFromExpiryDate[0].contains(months[i])) {
                    monthAndYearFromExpiryDate[0] = Integer.toString(i + 1);
                    break;
                }
            }
            if (Integer.parseInt(monthAndYearFromExpiryDate[1]) < 2000) {
                monthAndYearFromExpiryDate[1] = Integer.toString(Integer.parseInt(monthAndYearFromExpiryDate[1]) + 2000);
            }
            int tempYear = Integer.parseInt(monthAndYearFromExpiryDate[1]) - Integer.parseInt(monthAndYearFromCurrentDate[1]);
            int tempMonth = Integer.parseInt(monthAndYearFromExpiryDate[0]) - Integer.parseInt(monthAndYearFromCurrentDate[0]);
            if (tempYear < 0 || (tempYear == 0 && tempMonth == 0)) {
                String grammerCheck = (tempYear < 0 ? "was expired on date " : "expired this month as of date ");
                DatabaseClass db_1 = new DatabaseClass(null);
                try {
                    ArrayList<String> emailList = new ArrayList<>();
                    String query1 = "SELECT email FROM accounts WHERE accountType ='admin'";
                    db_1.result = db_1.statement.executeQuery(query1);
                    while (db_1.result.next()) {
                        emailList.add(db_1.result.getString("email"));
                    }
                    for (String i : emailList) {
                        boolean writeToThisAdmin = true;
                        String query2 = "SELECT alert_detail FROM `" + i + "_alerts`";
                        db_1.result = db_1.statement.executeQuery(query2);
                        String detail = "Medicines with batch number (" + batch_no + ") supplied by (" + supplier_name + ") "
                                + grammerCheck + medicineExiryDate;
                        while (db_1.result.next()) {
                            if (detail.equalsIgnoreCase(db_1.result.getString("alert_detail"))) {
                                writeToThisAdmin = false;
                            }
                        }
                        if (writeToThisAdmin) {
                            String query3 = "INSERT INTO `" + i + "_alerts` VALUES('System', 'System', '" + detail + "', 'Unread', 'NULL')";
                            db_1.statement.execute(query3);
                        }
                    }
                } catch (Exception e) {
                }
//                if (isCompare) {
//                    sameProductExpiryCompare.add("expired");
//                    sameProductBatchNo.add(batch_no);
//                    sameProductName.add(medicineName);
//                }
                db_1.closeConnection();
                return "false";
            }
            if (tempYear == 0 && tempMonth <= 6) {
                DatabaseClass db_1 = new DatabaseClass(null);
                try {
                    ArrayList<String> emailList = new ArrayList<>();
                    String query1 = "SELECT email FROM accounts WHERE accountType ='admin'";
                    db_1.result = db_1.statement.executeQuery(query1);
                    while (db_1.result.next()) {
                        emailList.add(db_1.result.getString("email"));
                    }
                    for (String i : emailList) {
                        boolean writeToThisAdmin = true;
                        String query2 = "SELECT alert_detail FROM `" + i + "_alerts`";
                        db_1.result = db_1.statement.executeQuery(query2);
                        String detail = "Medicines with batch number (" + batch_no + ") supplied by (" + supplier_name + ") are going to expired soon "
                                + "on date " + medicineExiryDate;
                        while (db_1.result.next()) {
                            if (detail.equalsIgnoreCase(db_1.result.getString("alert_detail"))) {
                                writeToThisAdmin = false;
                            }
                        }
                        if (writeToThisAdmin) {
                            String query3 = "INSERT INTO `" + i + "_alerts` VALUES('System', 'System', '" + detail + "', 'Unread', 'NULL')";
                            db_1.statement.execute(query3);
                        }

                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                if (isCompare) {
                    if (isSplit1) {
                        isSplit1 = false;
                        split1 = tempMonth + "," + tempYear;
                    } else {
                        isSplit1 = true;
                        split2 = tempMonth + "," + tempYear;
                    }
                }
//                if (isCompare) {
//                    sameProductName.add(medicineName);
//                    sameProductExpiryCompare.add(tempMonth + ",0");
//                    sameProductBatchNo.add(batch_no);
//                    sameProductPrice.add(productPrice);
//                    sameProductCycle.add(productCycle);
//                    sameProductDayCount.add(dayCount);
//                    sameProductStock.add(productStock);
//                    sameProductTotalMed.add(productTotalMed);
//                    sameProductStrength.add(productStrength);
//                }
                db_1.closeConnection();
                return "alert";
            }
            if (tempYear > 0) {
                if (isCompare) {
                    if (isSplit1) {
                        isSplit1 = false;
                        split1 = tempMonth + "," + tempYear;
                    } else {
                        isSplit1 = true;
                        split2 = tempMonth + "," + tempYear;
                    }
//                    sameProductName.add(medicineName);
//                    sameProductExpiryCompare.add(tempMonth + "," + tempYear);
//                    sameProductBatchNo.add(batch_no);
//                    sameProductPrice.add(productPrice);
//                    sameProductCycle.add(productCycle);
//                    sameProductDayCount.add(dayCount);
//                    sameProductStock.add(productStock);
//                    sameProductTotalMed.add(productTotalMed);
//                    sameProductStrength.add(productStrength);
                }
                return "true";
            }
            return "false";
        } else {
            try {
                ArrayList<String> batchNo = new ArrayList<>();
                ArrayList<String> supplierName = new ArrayList<>();
                ArrayList<String> expiry = new ArrayList<>();
                String query1 = "SELECT expiry_date, batch_no, supplier_name FROM pharmacy";
                DatabaseClass db_1 = new DatabaseClass(null);
                try {
                    db_1.result = db_1.statement.executeQuery(query1);
                    while (db_1.result.next()) {
                        expiry.add(db_1.result.getString("expiry_date"));
                        batchNo.add(db_1.result.getString("batch_no"));
                        supplierName.add(db_1.result.getString("supplier_name"));
                    }
                    for (int i = 0; i < expiry.size(); i++) {
                        medicineExpiryValidator(expiry.get(i), batchNo.get(i), supplierName.get(i), false, false);
                    }
                    db_1.closeConnection();
                } catch (Exception e) {
                    db_1.closeConnection();
                }
            } catch (Exception e) {
            }
            return null;
        }
    }

    protected String convertTimeToStandard(String rawTime) {
        String[] splitedRawTime = rawTime.split("-");
        String[] moreSplits1 = splitedRawTime[0].split(":");
        String[] moreSplits2 = splitedRawTime[1].split(":");
        int tempInt1 = Integer.parseInt(moreSplits1[0]);
        int tempInt2 = Integer.parseInt(moreSplits2[0]);
        String am1 = " AM";
        String am2 = " AM";
        if (tempInt1 > 12) {
            tempInt1 -= 12;
            am1 = " PM";
        }
        if (tempInt2 > 12) {
            tempInt2 -= 12;
            am2 = " PM";
        }
        String finalTime = tempInt1 + ":" + moreSplits1[1] + am1 + " - " + tempInt2 + ":" + moreSplits2[1] + am2;
        return finalTime;
    }

    private DefaultTableModel medicinesExpirySort(DefaultTableModel rawTable) {
        ArrayList<String> name1 = new ArrayList<>();
        ArrayList<String> supplier1 = new ArrayList<>();
        ArrayList<String> strength1 = new ArrayList<>();
        ArrayList<String> expiry1 = new ArrayList<>();
        ArrayList<Float> price1 = new ArrayList<>();
        ArrayList<Integer> stock1 = new ArrayList<>();
        ArrayList<String> batch1 = new ArrayList<>();
        ArrayList<String> dayduration1 = new ArrayList<>();
        ArrayList<String> totalcycle1 = new ArrayList<>();
        ArrayList<Integer> totalMed1 = new ArrayList<>();
        for (int i = 0; i < sameProductName.size(); i++) {
            for (int j = i + 1; j < sameProductName.size(); j++) {
                if (sameProductName.get(i).equalsIgnoreCase(sameProductName.get(j))
                        && sameProductStrength.get(i).equalsIgnoreCase(sameProductStrength.get(j))) {
                    name1.add(sameProductName.get(i));
                    strength1.add(sameProductStrength.get(i));
                    price1.add(sameProductPrice.get(i));
                    stock1.add(sameProductStock.get(i));
                    batch1.add(sameProductBatchNo.get(i));
                    dayduration1.add(sameProductDayCount.get(i));
                    totalcycle1.add(sameProductCycle.get(i));
                    totalMed1.add(sameProductTotalMed.get(i));
                    expiry1.add(sameProductExpiryCompare.get(i));
                    supplier1.add(sameProductSupplier.get(i));
                    sameProductName.set(i, "");
                    sameProductStrength.set(i, "");
                    sameProductPrice.set(i, -1f);
                    sameProductStock.set(i, -1);
                    sameProductDayCount.set(i, "");
                    sameProductCycle.set(i, "");
                    sameProductTotalMed.set(i, -1);
                    sameProductExpiryCompare.set(i, "");
                    sameProductBatchNo.set(i, "");
                    sameProductSupplier.set(i, "");
                }
            }
        }
        for (int i = 0; i < sameProductName.size(); i++) {
            if (name1.contains(sameProductName.get(i)) && strength1.contains(sameProductStrength.get(i))) {
                name1.add(sameProductName.get(i));
                strength1.add(sameProductStrength.get(i));
                price1.add(sameProductPrice.get(i));
                stock1.add(sameProductStock.get(i));
                batch1.add(sameProductBatchNo.get(i));
                dayduration1.add(sameProductDayCount.get(i));
                totalcycle1.add(sameProductCycle.get(i));
                totalMed1.add(sameProductTotalMed.get(i));
                expiry1.add(sameProductExpiryCompare.get(i));
                supplier1.add(sameProductSupplier.get(i));
                sameProductName.set(i, "");
                sameProductStrength.set(i, "");
                sameProductPrice.set(i, -1f);
                sameProductStock.set(i, -1);
                sameProductDayCount.set(i, "");
                sameProductCycle.set(i, "");
                sameProductTotalMed.set(i, -1);
                sameProductExpiryCompare.set(i, "");
                sameProductBatchNo.set(i, "");
                sameProductSupplier.set(i, "");
            }
        }
        Pharmacy_GUI.staticObject.batchNo.clear();
        int count = 1;
        for (int i = 0; i < sameProductName.size(); i++) {
            if (!sameProductName.get(i).equals("")) {
                Float finalPrice = sameProductPrice.get(i) * (float) sameProductTotalMed.get(i);
                float tempFinalPrice_ = Math.round(finalPrice * 100f) / 100f;
                rawTable.addRow(new Object[]{count++, false, capitalizeName(sameProductName.get(i)), sameProductStrength.get(i),
                    sameProductDayCount.get(i), sameProductCycle.get(i), sameProductTotalMed.get(i), tempFinalPrice_, sameProductStock.get(i)});
                Pharmacy_GUI.staticObject.batchNo.add(sameProductBatchNo.get(i));
            }
        }
        for (int i = 0; i < name1.size(); i++) {
            for (int j = i + 1; j < name1.size(); j++) {
                if (!name1.get(i).equals("") && !name1.get(j).equals("") && name1.get(i).equals(name1.get(j))
                        && strength1.get(i).equals(strength1.get(j))) {
                    isSplit1 = true;
                    medicineExpiryValidator(expiry1.get(i), batch1.get(i), supplier1.get(i), false, true);
                    String[] split1 = this.split1.split(",");// m, 1 y
                    medicineExpiryValidator(expiry1.get(j), batch1.get(j), supplier1.get(j), false, true);
                    String[] split2 = this.split2.split(",");
                    int tempMonthI = Integer.parseInt(split1[0]) - Integer.parseInt(split2[0]);
                    int tempYearI = Integer.parseInt(split1[1]) - Integer.parseInt(split2[1]);
                    if (tempYearI == 0) {
                        if (tempMonthI <= 0) { // del j
                            name1.set(j, "");
                            supplier1.set(j, "");
                            strength1.set(j, "");
                            price1.set(j, -1f);
                            dayduration1.set(j, "");
                            expiry1.set(j, "");
                            batch1.set(j, "");
                            totalMed1.set(j, -1);
                            totalcycle1.set(j, "");
                        } else { // del i
                            name1.set(i, "");
                            supplier1.set(i, "");
                            strength1.set(i, "");
                            price1.set(i, -1f);
                            dayduration1.set(i, "");
                            expiry1.set(i, "");
                            batch1.set(i, "");
                            totalMed1.set(i, -1);
                            totalcycle1.set(i, "");
                        }
                    }
                    if (tempYearI < 0) { // delete j
                        name1.set(j, "");
                        supplier1.set(j, "");
                        strength1.set(j, "");
                        price1.set(j, -1f);
                        dayduration1.set(j, "");
                        expiry1.set(j, "");
                        batch1.set(j, "");
                        totalMed1.set(j, -1);
                        totalcycle1.set(j, "");
                    }
                    if (tempYearI > 0) { // delete i
                        name1.set(i, "");
                        supplier1.set(i, "");
                        strength1.set(i, "");
                        price1.set(i, -1f);
                        dayduration1.set(i, "");
                        expiry1.set(i, "");
                        batch1.set(i, "");
                        totalMed1.set(i, -1);
                        totalcycle1.set(i, "");
                    }
                }
            }
        }
        for (int i = 0; i < name1.size(); i++) {
            if (!name1.get(i).equals("")) {
                Float finalPrice = price1.get(i) * (float) totalMed1.get(i);
                float tempFinalPrice_ = Math.round(finalPrice * 100f) / 100f;
                rawTable.addRow(new Object[]{
                    count++, false, capitalizeName(name1.get(i)), strength1.get(i), dayduration1.get(i),
                    totalcycle1.get(i), totalMed1.get(i), tempFinalPrice_, stock1.get(i)
                });
                Pharmacy_GUI.staticObject.batchNo.add(batch1.get(i));
            }
        }
        return rawTable;
    }
}
