package BackendPackage;

import java.sql.*;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.io.*;

public class DatabaseClassExtended extends DatabaseClass {

    private JFrame parentComponent;
    private Connection connection;
    private Statement statement;
    private ResultSet result;

    public DatabaseClassExtended(JFrame parentComponent) {
        super(parentComponent);
        this.parentComponent = parentComponent;
        connection = super.connection;
        statement = super.statement;
        result = super.result;
    }

    public boolean newPharmacyInventoryEntry(ArrayList<String> medicinesName, ArrayList<String> ManufacturerName, ArrayList<String> medicineStrengths,
            ArrayList<Float> medicinesPrice, ArrayList<String> medicinesStockAmount, ArrayList<String> medicinesManufactureDate, ArrayList<String> medicinesExpiryDate,
            ArrayList<String> medicinesBatchNo, ArrayList<String> supplierName, boolean isUpdatingList) {
        try {
            if (isUpdatingList) {
                ArrayList<String> tempName = new ArrayList<>();
                ArrayList<String> tempBatch = new ArrayList<>();
                ArrayList<Float> tempPrice = new ArrayList<>();
                ArrayList<String> tempSupplierName = new ArrayList<>();
                ArrayList<Integer> tempStock = new ArrayList<>();
                boolean isUpdateNeeded = false;
                for (int i = 0; i < medicinesName.size(); i++) {
                    String query1 = "SELECT * FROM pharmacy WHERE name_ = '" + medicinesName.get(i) + "' AND batch_no = '" + medicinesBatchNo.get(i) + "' AND supplier_name = '"
                            + supplierName.get(i) + "'";
                    result = statement.executeQuery(query1);
                    while (result.next()) {
                        isUpdateNeeded = true;
                        tempName.add(result.getString("name_"));
                        tempBatch.add(result.getString("batch_no"));
                        tempPrice.add(medicinesPrice.get(i));
                        tempSupplierName.add(result.getString("supplier_name"));
                        int tempNewStock = result.getInt("stock_left") + Integer.parseInt(medicinesStockAmount.get(i));
                        tempStock.add(tempNewStock);
                        medicinesName.remove(i);
                        ManufacturerName.remove(i);
                        medicineStrengths.remove(i);
                        medicinesPrice.remove(i);
                        medicinesStockAmount.remove(i);
                        medicinesManufactureDate.remove(i);
                        medicinesExpiryDate.remove(i);
                        medicinesBatchNo.remove(i);
                        supplierName.remove(i);
                    }
                }
                if (isUpdateNeeded) {
                    for (int i = 0; i < tempName.size(); i++) {
                        String query2 = "UPDATE pharmacy SET price = " + tempPrice.get(i) + ", stock_left = " + tempStock.get(i)
                                + " WHERE name_ = '" + tempName.get(i) + "' AND batch_no = '" + tempBatch.get(i) + "' AND supplier_name = '" + tempSupplierName.get(i) + "'";
                        statement.execute(query2);
                    }
                }
                for (int i = 0; i < medicinesName.size(); i++) {
                    String query3 = "INSERT INTO pharmacy (name_, manufacturer, strength, price, stock_left, manufacture_date, expiry_date, batch_no, supplier_name) VALUES ('"
                            + medicinesName.get(i) + "', '" + ManufacturerName.get(i) + "', '" + medicineStrengths.get(i) + "', " + medicinesPrice.get(i)
                            + ", " + Integer.parseInt(medicinesStockAmount.get(i)) + ", '" + medicinesManufactureDate.get(i) + "', '" + medicinesExpiryDate.get(i)
                            + "', '" + medicinesBatchNo.get(i) + "', '" + supplierName.get(i) + "')";
                    statement.execute(query3);
                }
                super.closeConnection();
                return true;
            } else {
                String query1 = "TRUNCATE TABLE pharmacy";
                statement.execute(query1);
                for (int i = 0; i < medicinesName.size(); i++) {
                    String query2 = "INSERT INTO pharmacy (name_, manufacturer, strength, price, stock_left, manufacture_date, expiry_date, batch_no, supplier_name) VALUES ('"
                            + medicinesName.get(i) + "', '" + ManufacturerName.get(i) + "', '" + medicineStrengths.get(i) + "', " + medicinesPrice.get(i)
                            + ", " + Integer.parseInt(medicinesStockAmount.get(i)) + ", '" + medicinesManufactureDate.get(i) + "', '" + medicinesExpiryDate.get(i)
                            + "', '" + medicinesBatchNo.get(i) + "', '" + supplierName.get(i) + "')";
                    statement.execute(query2);
                }
                super.closeConnection();
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        super.closeConnection();
        return false;
    }

    public boolean deleteAlerts(String email) {
        try {
            String query1 = "DELETE FROM `" + email + "_alerts`";
            statement.execute(query1);
            super.alertUpdate(email, true, false);
            super.closeConnection();
            return true;
        } catch (Exception e) {
        }
        super.closeConnection();
        return false;
    }

    public boolean pharmacyMedicinesList(boolean isUnEditable) {
        try {
            ArrayList<String> medicinesName = new ArrayList<>();
            ArrayList<String> ManufacturerName = new ArrayList<>();
            ArrayList<String> medicineStrengths = new ArrayList<>();
            ArrayList<Float> medicinesPrice = new ArrayList<>();
            ArrayList<Integer> medicinesStockAmount = new ArrayList<>();
            ArrayList<String> medicinesManufactureDate = new ArrayList<>();
            ArrayList<String> medicinesExpiryDate = new ArrayList<>();
            ArrayList<String> medicinesBatchNo = new ArrayList<>();
            ArrayList<String> supplierName = new ArrayList<>();
            String query1 = "SELECT * FROM pharmacy";
            result = statement.executeQuery(query1);
            while (result.next()) {
                medicinesName.add(result.getString("name_"));
                ManufacturerName.add(result.getString("manufacturer"));
                medicineStrengths.add(result.getString("strength"));
                medicinesPrice.add(result.getFloat("price"));
                medicinesStockAmount.add(result.getInt("stock_left"));
                medicinesManufactureDate.add(result.getString("manufacture_date"));
                medicinesExpiryDate.add(result.getString("expiry_date"));
                medicinesBatchNo.add(result.getString("batch_no"));
                supplierName.add(result.getString("supplier_name"));
            }
            DefaultTableModel tempModel = new DefaultTableModel() {
                @Override
                public boolean isCellEditable(int row, int col) {
                    if (isUnEditable) {
                        return false;
                    }
                    return col > 0;
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
            for (int i = 0; i < medicinesName.size(); i++) {
                tempModel.addRow(new Object[]{Integer.toString(i + 1), false,
                    medicinesName.get(i), ManufacturerName.get(i), medicineStrengths.get(i),
                    Float.toString(medicinesPrice.get(i)), Integer.toString(medicinesStockAmount.get(i)), medicinesManufactureDate.get(i), medicinesExpiryDate.get(i),
                    medicinesBatchNo.get(i), supplierName.get(i)});
            }
            DisplayAllMedicinesListGUI.inventoryListTable.setModel(tempModel);
            DisplayAllMedicinesListGUI.inventoryListTable.getColumnModel().getColumn(0).setMaxWidth(60);
            DisplayAllMedicinesListGUI.inventoryListTable.getColumnModel().getColumn(0).setMinWidth(60);
            DisplayAllMedicinesListGUI.inventoryListTable.getColumnModel().getColumn(0).setResizable(false);
            DisplayAllMedicinesListGUI.inventoryListTable.getColumnModel().getColumn(1).setMaxWidth(90);
            DisplayAllMedicinesListGUI.inventoryListTable.getColumnModel().getColumn(1).setMinWidth(90);
            DisplayAllMedicinesListGUI.inventoryListTable.getColumnModel().getColumn(1).setResizable(false);
            closeConnection();
            return true;
        } catch (Exception e) {
        }
        super.closeConnection();
        return false;
    }

    public boolean searchDoctorsFromDB(String searchKey, boolean isKeyTypeName, boolean isAllList) {
        DefaultTableModel tempModel = (DefaultTableModel) AppointmentPatientGUI.drListTable.getModel();
        try {
            ArrayList<String> namesFromDB = new ArrayList<>();
            ArrayList<String> emailsFromDB = new ArrayList<>();
            ArrayList<String> professionsFromDB = new ArrayList<>();
            ArrayList<String> qualificationsFromDB = new ArrayList<>();
            ArrayList<String> timingsFromDB = new ArrayList<>();
            ArrayList<String> daysFromDB = new ArrayList<>();
            if (isKeyTypeName && !isAllList) {
                int count = 0;
                String query1 = "SELECT * FROM doctor_details WHERE name LIKE '%" + searchKey + "%'";
                result = statement.executeQuery(query1);
                while (result.next()) {
                    namesFromDB.add(capitalizeName(result.getString("name")));
                    emailsFromDB.add(result.getString("email"));
                    professionsFromDB.add(result.getString("profession"));
                    qualificationsFromDB.add(result.getString("qualification"));
                    timingsFromDB.add(result.getString("time"));
                    daysFromDB.add(result.getString("days"));
                    count++;
                }
                if (count > 0) {
                    try {
                        tempModel.setRowCount(0);
                    } catch (Exception e) {
                    }
                    for (int i = 0; i < namesFromDB.size(); i++) {
                        tempModel.addRow(new Object[]{i + 1, namesFromDB.get(i), professionsFromDB.get(i), qualificationsFromDB.get(i), daysFromDB.get(i),
                            super.convertTimeToStandard(timingsFromDB.get(i))});
                    }
                    AppointmentPatientGUI.drListTable.setModel(tempModel);
                    AppointmentPatientGUI.drListTable.revalidate();
                    AppointmentPatientGUI.namesFromDB = namesFromDB;
                    AppointmentPatientGUI.emailsFromDB = emailsFromDB;
                    AppointmentPatientGUI.professionsFromDB = professionsFromDB;
                    AppointmentPatientGUI.qualificationsFromDB = qualificationsFromDB;
                    AppointmentPatientGUI.timingsFromDB = timingsFromDB;
                    AppointmentPatientGUI.daysFromDB = daysFromDB;
                    super.closeConnection();
                    return true;
                } else {
                    try {
                        tempModel.setRowCount(0);
                    } catch (Exception e) {
                    }
                }
                AppointmentPatientGUI.drListTable.setModel(tempModel);
                AppointmentPatientGUI.drListTable.revalidate();
                AppointmentPatientGUI.namesFromDB = namesFromDB;
                AppointmentPatientGUI.emailsFromDB = emailsFromDB;
                AppointmentPatientGUI.professionsFromDB = professionsFromDB;
                AppointmentPatientGUI.qualificationsFromDB = qualificationsFromDB;
                AppointmentPatientGUI.timingsFromDB = timingsFromDB;
                AppointmentPatientGUI.daysFromDB = daysFromDB;
                super.closeConnection();
                return false;
            }
            if (!isKeyTypeName && !isAllList) {
                int count = 0;
                String query1 = "SELECT * FROM doctor_details WHERE profession LIKE '%" + searchKey + "%'";
                result = statement.executeQuery(query1);
                while (result.next()) {
                    namesFromDB.add(capitalizeName(result.getString("name")));
                    emailsFromDB.add(result.getString("email"));
                    professionsFromDB.add(result.getString("profession"));
                    qualificationsFromDB.add(result.getString("qualification"));
                    timingsFromDB.add(result.getString("time"));
                    daysFromDB.add(result.getString("days"));
                    count++;
                }
                if (count > 0) {
                    try {
                        tempModel.setRowCount(0);
                    } catch (Exception e) {
                    }
                    for (int i = 0; i < namesFromDB.size(); i++) {
                        tempModel.addRow(new Object[]{i + 1, namesFromDB.get(i), professionsFromDB.get(i), qualificationsFromDB.get(i), daysFromDB.get(i),
                            super.convertTimeToStandard(timingsFromDB.get(i))});
                    }
                    AppointmentPatientGUI.drListTable.setModel(tempModel);
                    AppointmentPatientGUI.drListTable.revalidate();
                    AppointmentPatientGUI.namesFromDB = namesFromDB;
                    AppointmentPatientGUI.emailsFromDB = emailsFromDB;
                    AppointmentPatientGUI.professionsFromDB = professionsFromDB;
                    AppointmentPatientGUI.qualificationsFromDB = qualificationsFromDB;
                    AppointmentPatientGUI.timingsFromDB = timingsFromDB;
                    AppointmentPatientGUI.daysFromDB = daysFromDB;
                    super.closeConnection();
                    return true;
                } else {
                    try {
                        tempModel.setRowCount(0);
                    } catch (Exception e) {
                    }
                }
                AppointmentPatientGUI.drListTable.setModel(tempModel);
                AppointmentPatientGUI.drListTable.revalidate();
                AppointmentPatientGUI.namesFromDB = namesFromDB;
                AppointmentPatientGUI.emailsFromDB = emailsFromDB;
                AppointmentPatientGUI.professionsFromDB = professionsFromDB;
                AppointmentPatientGUI.qualificationsFromDB = qualificationsFromDB;
                AppointmentPatientGUI.timingsFromDB = timingsFromDB;
                AppointmentPatientGUI.daysFromDB = daysFromDB;
                super.closeConnection();
                return false;
            }
            if (!isKeyTypeName && isAllList) {
                int count = 0;
                String query1 = "SELECT * FROM doctor_details";
                result = statement.executeQuery(query1);
                while (result.next()) {
                    namesFromDB.add(capitalizeName(result.getString("name")));
                    emailsFromDB.add(result.getString("email"));
                    professionsFromDB.add(result.getString("profession"));
                    qualificationsFromDB.add(result.getString("qualification"));
                    timingsFromDB.add(result.getString("time"));
                    daysFromDB.add(result.getString("days"));
                    count++;
                }
                if (count > 0) {
                    try {
                        tempModel.setRowCount(0);
                    } catch (Exception e) {
                    }
                    for (int i = 0; i < namesFromDB.size(); i++) {
                        tempModel.addRow(new Object[]{i + 1, namesFromDB.get(i), professionsFromDB.get(i), qualificationsFromDB.get(i), daysFromDB.get(i),
                            super.convertTimeToStandard(timingsFromDB.get(i))});
                    }
                    AppointmentPatientGUI.drListTable.setModel(tempModel);
                    AppointmentPatientGUI.drListTable.revalidate();
                    AppointmentPatientGUI.namesFromDB = namesFromDB;
                    AppointmentPatientGUI.emailsFromDB = emailsFromDB;
                    AppointmentPatientGUI.professionsFromDB = professionsFromDB;
                    AppointmentPatientGUI.qualificationsFromDB = qualificationsFromDB;
                    AppointmentPatientGUI.timingsFromDB = timingsFromDB;
                    AppointmentPatientGUI.daysFromDB = daysFromDB;
                    super.closeConnection();
                    return true;
                } else {
                    try {
                        tempModel.setRowCount(0);
                    } catch (Exception e) {
                    }
                }
                AppointmentPatientGUI.drListTable.setModel(tempModel);
                AppointmentPatientGUI.drListTable.revalidate();
                AppointmentPatientGUI.namesFromDB = namesFromDB;
                AppointmentPatientGUI.emailsFromDB = emailsFromDB;
                AppointmentPatientGUI.professionsFromDB = professionsFromDB;
                AppointmentPatientGUI.qualificationsFromDB = qualificationsFromDB;
                AppointmentPatientGUI.timingsFromDB = timingsFromDB;
                AppointmentPatientGUI.daysFromDB = daysFromDB;
                super.closeConnection();
                return false;
            }
        } catch (Exception e) {
        }
        try {
            tempModel.setRowCount(0);
        } catch (Exception e) {
        }
        AppointmentPatientGUI.drListTable.setModel(tempModel);
        AppointmentPatientGUI.drListTable.revalidate();
        AppointmentPatientGUI.namesFromDB.clear();
        AppointmentPatientGUI.emailsFromDB.clear();
        AppointmentPatientGUI.professionsFromDB.clear();
        AppointmentPatientGUI.qualificationsFromDB.clear();
        AppointmentPatientGUI.timingsFromDB.clear();
        AppointmentPatientGUI.daysFromDB.clear();
        super.closeConnection();
        return false;
    }

    public boolean sheduleAppointment(String drEmail, String drName, String patientEmail, String patientName, String date) {
        try {
            int thisAppointmentNumber = 0;
            String query1 = "INSERT INTO `" + drEmail + "_appointment_schedule` (patient_name, patient_email, date) VALUES ('" + patientName + "', '" + patientEmail + "', '" + date + "')";
            String query3 = "SELECT appointment_no FROM `" + drEmail + "_appointment_schedule` WHERE patient_email = '" + patientEmail + "'";
            statement.execute(query1);
            result = statement.executeQuery(query3);
            while (result.next()) {
                thisAppointmentNumber = result.getInt("appointment_no");
            }
            String query2 = "INSERT INTO `" + patientEmail + "_appointments` (doctor_name, doctor_email, date, appointment_no) VALUES ('" + drName + "', '" + drEmail + "', '" + date + "', " + thisAppointmentNumber + ")";
            statement.execute(query2);
            JOptionPane.showMessageDialog(parentComponent, patientName + " your appointment is sheduled successfully.\n"
                    + "your appointment number is " + thisAppointmentNumber, "Appointment Done", JOptionPane.INFORMATION_MESSAGE);
            super.closeConnection();
            return true;
        } catch (SQLIntegrityConstraintViolationException e) {
            JOptionPane.showMessageDialog(parentComponent, patientName + " you have already appointment schedule with Dr." + drName, "Re Appointment Error",
                    JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            e.printStackTrace();
        }
        super.closeConnection();
        return false;
    }

    public boolean getAppointmentsList(String patientEmail) {
        try {
            Calendar cal = Calendar.getInstance();
            cal.setTime(new Date());
            String todayDate = cal.get(Calendar.YEAR) + "-" + (cal.get(Calendar.MONTH) + 1) + "-" + cal.get(Calendar.DAY_OF_MONTH);
            String queryDeleteMissedAppointments = "SELECT doctor_email FROM `" + patientEmail + "_appointments` WHERE date < '" + todayDate + "'";
            result = statement.executeQuery(queryDeleteMissedAppointments);
            ArrayList<String> doctorEmails_ = new ArrayList<>();
            while (result.next()) {
                doctorEmails_.add(result.getString("doctor_email"));
            }
            if (doctorEmails_.size() > 0) {
                for (int i = 0; i < doctorEmails_.size(); i++) {
                    String query1 = "DELETE FROM `" + doctorEmails_.get(i) + "_appointment_schedule` WHERE patient_email = '" + patientEmail + "'";
                    String query2 = "DELETE FROM `" + patientEmail + "_appointments` WHERE doctor_email = '" + doctorEmails_.get(i) + "'";
                    statement.execute(query1);
                    statement.execute(query2);
                }
            }
            ArrayList<String> drEmails = new ArrayList<>();
            ArrayList<String> drNames = new ArrayList<>();
            ArrayList<String> days = new ArrayList<>();
            ArrayList<Integer> appointmentNumbers = new ArrayList<>();
            String query1 = "SELECT * FROM `" + patientEmail + "_appointments`";
            result = statement.executeQuery(query1);
            int count = 0;
            while (result.next()) {
                count++;
                drEmails.add(result.getString("doctor_email"));
                drNames.add(result.getString("doctor_name"));
                days.add(result.getString("date"));
                appointmentNumbers.add(result.getInt("appointment_no"));
            }
            DefaultTableModel tempModel = (DefaultTableModel) DeleteAppointmentGUI.appointmentListTable.getModel();
            try {
                tempModel.setRowCount(0);
            } catch (Exception e) {
            }
            if (count > 0) {
                for (int i = 0; i < drNames.size(); i++) {
                    tempModel.addRow(new Object[]{i + 1, false, drNames.get(i), days.get(i), appointmentNumbers.get(i)});
                }
                DeleteAppointmentGUI.appointmentListTable.setModel(tempModel);
                DeleteAppointmentGUI.appointmentListTable.revalidate();
                DeleteAppointmentGUI.drNames = drNames;
                DeleteAppointmentGUI.drEmails = drEmails;
                DeleteAppointmentGUI.days = days;
                DeleteAppointmentGUI.appointmentNumbers = appointmentNumbers;
            } else {
                try {
                    tempModel.setRowCount(0);
                    DeleteAppointmentGUI.appointmentListTable.setModel(tempModel);
                    DeleteAppointmentGUI.appointmentListTable.revalidate();
                } catch (Exception e) {
                }
            }
            super.closeConnection();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        super.closeConnection();
        return false;
    }

    public boolean deleteAppointment(ArrayList<String> drEmails, ArrayList<String> days, ArrayList<Integer> appointmentNumber, String patientEmail) {
        try {
            int count = 0;
            for (int i = 0; i < drEmails.size(); i++) {
                count++;
                String query1 = "DELETE FROM `" + drEmails.get(i) + "_appointment_schedule` WHERE patient_email = '" + patientEmail + "' AND date ='"
                        + days.get(i) + "' AND appointment_no=" + appointmentNumber.get(i);
                String query2 = "DELETE FROM `" + patientEmail + "_appointments` WHERE doctor_email = '" + drEmails.get(i) + "' AND date ='"
                        + days.get(i) + "' AND appointment_no=" + appointmentNumber.get(i);
                statement.execute(query1);
                statement.execute(query2);
            }
            for (int i = 0; i < drEmails.size(); i++) {
                int count_ = 0;
                String query1 = "SELECT * FROM `" + drEmails.get(i) + "_appointment_schedule`";
                result = statement.executeQuery(query1);
                while (result.next()) {
                    count_++;
                }
                if (count_ == 0) {
                    String query2 = "TRUNCATE `" + drEmails.get(i) + "_appointment_schedule`";
                    statement.execute(query2);
                }
            }
            if (count >= 1) {
                String message = (count > 1 ? "Appointments" : "Appointment");
                JOptionPane.showMessageDialog(parentComponent, message + " deleted successfully", message + " Deleted", JOptionPane.INFORMATION_MESSAGE);
            }
            getAppointmentsList(patientEmail);
            super.closeConnection();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        super.closeConnection();
        return false;
    }

    public boolean getDoctorAppointmentsList(String doctorEmail) {
        try {
            Calendar cal = Calendar.getInstance();
            cal.setTime(new Date());
            String todayDate = cal.get(Calendar.YEAR) + "-" + (cal.get(Calendar.MONTH) + 1) + "-" + cal.get(Calendar.DAY_OF_MONTH);
            String queryDeleteMissedAppointments = "SELECT patient_email FROM `" + doctorEmail + "_appointment_schedule` WHERE date < '" + todayDate + "'";
            result = statement.executeQuery(queryDeleteMissedAppointments);
            ArrayList<String> patientEmail_ = new ArrayList<>();
            while (result.next()) {
                patientEmail_.add(result.getString("patient_email"));
            }
            if (patientEmail_.size() > 0) {
                for (int i = 0; i < patientEmail_.size(); i++) {
                    String query1 = "DELETE FROM `" + patientEmail_.get(i) + "_appointments` WHERE doctor_email = '" + doctorEmail + "'";
                    String query2 = "DELETE FROM `" + doctorEmail + "_appointment_schedule` WHERE patient_email = '" + patientEmail_.get(i) + "'";
                    statement.execute(query1);
                    statement.execute(query2);
                }
            }
            DefaultTableModel tempModel = (DefaultTableModel) AppointmentDoctorGUI.appointmentsListTable.getModel();
            ArrayList<String> patientNames = new ArrayList<>();
            ArrayList<String> patientEmails = new ArrayList<>();
            ArrayList<String> dates = new ArrayList<>();
            ArrayList<Integer> appointmentNumbers = new ArrayList<>();
            String query1 = "SELECT * FROM `" + doctorEmail + "_appointment_schedule`";
            result = statement.executeQuery(query1);
            int count = 0;
            while (result.next()) {
                count++;
                patientEmails.add(result.getString("patient_email"));
                patientNames.add(result.getString("patient_name"));
                dates.add(result.getString("date"));
                appointmentNumbers.add(result.getInt("appointment_no"));
            }
            if (count > 0) {
                try {
                    tempModel.setRowCount(0);
                    AppointmentDoctorGUI.appointmentsListTable.setModel(tempModel);
                    AppointmentDoctorGUI.appointmentsListTable.revalidate();
                } catch (Exception e) {
                }
                for (int i = 0; i < patientNames.size(); i++) {
                    tempModel.addRow(new Object[]{appointmentNumbers.get(i), patientNames.get(i), patientEmails.get(i), dates.get(i)});
                }
                AppointmentDoctorGUI.appointmentsListTable.setModel(tempModel);
                AppointmentDoctorGUI.appointmentsListTable.revalidate();
                super.closeConnection();
                return true;
            } else {
                try {
                    tempModel.setRowCount(0);
                    AppointmentDoctorGUI.appointmentsListTable.setModel(tempModel);
                    AppointmentDoctorGUI.appointmentsListTable.revalidate();
                } catch (Exception e) {
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        super.closeConnection();
        return false;
    }

    public boolean appointmentsListUpdateByDoctor(String doctorEmail, String patientEmail, int appointmentNumber, String date) {
        try {
            String query1 = "DELETE FROM `" + doctorEmail + "_appointment_schedule` WHERE patient_email = '" + patientEmail + "' AND appointment_no = " + appointmentNumber
                    + " AND date='" + date + "'";
            String query2 = "DELETE FROM `" + patientEmail + "_appointments` WHERE doctor_email='" + doctorEmail + "' AND appointment_no = " + appointmentNumber
                    + " AND date='" + date + "'";
            statement.execute(query1);
            statement.execute(query2);
            int count_ = 0;
            String query3 = "SELECT * FROM `" + doctorEmail + "_appointment_schedule`";
            result = statement.executeQuery(query3);
            while (result.next()) {
                count_++;
            }
            if (count_ == 0) {
                String query4 = "TRUNCATE `" + doctorEmail + "_appointment_schedule`";
                statement.execute(query4);
            }
            getDoctorAppointmentsList(doctorEmail);
            super.closeConnection();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        super.closeConnection();
        return false;
    }

    public boolean getReservedDates(String doctorEmail) {
        try {
            String query1 = "SELECT date FROM `" + doctorEmail + "_appointment_schedule`";
            String query2 = "SELECT day_limit FROM doctor_details WHERE email = '" + doctorEmail + "'";
            result = statement.executeQuery(query2);
            int limit = -1;
            while (result.next()) {
                limit = result.getInt("day_limit");
            }
            result = statement.executeQuery(query1);
            ArrayList<String> datesFromDB = new ArrayList<>();
            ArrayList<String> finalReservedDates = new ArrayList<>();
            while (result.next()) {
                datesFromDB.add(result.getString("date"));
            }
            for (int i = 0; i < datesFromDB.size(); i++) {
                int count_ = 1;
                for (int j = i + 1; j < datesFromDB.size(); j++) {
                    if (datesFromDB.get(i).equals(datesFromDB.get(j))) {
                        count_++;
                    }
                }
                if (count_ >= limit) {
                    if (!finalReservedDates.contains(datesFromDB.get(i))) {
                        finalReservedDates.add(datesFromDB.get(i));
                    }
                }
            }
            CalendarDatePickerGUI.reservedDates = finalReservedDates;
            super.closeConnection();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        super.closeConnection();
        return false;
    }

    public boolean deleteMedicineDuetoStockFinished(ArrayList<String> medName, ArrayList<String> medStrength, ArrayList<String> medBatchNo) {
        try {
            for (int i = 0; i < medName.size(); i++) {
                String query1 = "DELETE FROM pharmacy WHERE name_ = '" + medName.get(i) + "' AND strength = '" + medStrength.get(i) + "' AND batch_no = '"
                        + medBatchNo.get(i) + "'";
                statement.execute(query1);
            }
        } catch (Exception e) {
        }
        super.closeConnection();
        return false;
    }

    public boolean createPurchaseInvoice(String email, String name, ArrayList<String> names, ArrayList<String> strength, ArrayList<Integer> totalMedicine,
            ArrayList<String> batchNo, String shipping, String billing, float price) {
        try {
            String invoiceID = generateRandomInvoiceID();
            String query0 = "INSERT INTO invoice_list VALUES ('" + invoiceID + "', '" + super.getDateTime() + "')";
            String query1 = "CREATE TABLE `" + invoiceID + "_items` (name_ VARCHAR(100), strength VARCHAR(100), total_count INT, batch_no VARCHAR(100))";
            String query2 = "CREATE TABLE `" + invoiceID + "_info` (email VARCHAR(100), name VARCHAR(100), shipping_address VARCHAR(100), billing_address VARCHAR(100)"
                    + ", price FLOAT)";
            String query3 = "INSERT INTO `" + invoiceID + "_info` VALUES('" + email + "', '" + name + "', '" + shipping + "', '" + billing + "', " + price + ")";
            statement.execute(query0);
            statement.execute(query1);
            statement.execute(query2);
            statement.execute(query3);
            for (int i = 0; i < names.size(); i++) {
                String query4 = "INSERT INTO `" + invoiceID + "_items` VALUES ('" + names.get(i) + "', '" + strength.get(i) + "', " + totalMedicine.get(i) + ", '"
                        + batchNo.get(i) + "')";
                statement.execute(query4);
            }
            super.closeConnection();
            return true;
        } catch (Exception e) {
        }
        super.closeConnection();
        return false;
    }

    public boolean searchDoctorsFromDBForAppointmentsLimitUpdate(String searchKey, boolean isEmail) {
        try {
            ArrayList<String> names = new ArrayList<>();
            ArrayList<String> emails = new ArrayList<>();
            ArrayList<String> days = new ArrayList<>();
            ArrayList<String> timings = new ArrayList<>();
            ArrayList<Integer> limits = new ArrayList<>();
            if (!isEmail) {
                String query1 = "SELECT name, email, days, time, day_limit FROM doctor_details WHERE name LIKE '%" + searchKey + "%'";
                result = statement.executeQuery(query1);
                int count = 0;
                while (result.next()) {
                    count++;
                    names.add(result.getString("name"));
                    emails.add(result.getString("email"));
                    days.add(result.getString("days"));
                    timings.add(result.getString("time"));
                    limits.add(result.getInt("day_limit"));
                }
                DefaultTableModel tempModel = (DefaultTableModel) ChangeAppointmentDayLimitGUI.doctorsListTable.getModel();
                if (count > 0) {
                    tempModel.setRowCount(0);
                    for (int i = 0; i < names.size(); i++) {
                        tempModel.addRow(new Object[]{super.capitalizeName(names.get(i)), emails.get(i), days.get(i), timings.get(i), limits.get(i)});
                    }
                } else {
                    tempModel.setRowCount(0);
                }
                ChangeAppointmentDayLimitGUI.doctorsListTable.setModel(tempModel);
            } else {
                String query1 = "SELECT name, email, days, time, day_limit FROM doctor_details WHERE email = '" + searchKey + "'";
                result = statement.executeQuery(query1);
                int count = 0;
                while (result.next()) {
                    count++;
                    names.add(result.getString("name"));
                    emails.add(result.getString("email"));
                    days.add(result.getString("days"));
                    timings.add(result.getString("time"));
                    limits.add(result.getInt("day_limit"));
                }
                DefaultTableModel tempModel = (DefaultTableModel) ChangeAppointmentDayLimitGUI.doctorsListTable.getModel();
                if (count > 0) {
                    tempModel.setRowCount(0);
                    for (int i = 0; i < names.size(); i++) {
                        tempModel.addRow(new Object[]{super.capitalizeName(names.get(i)), emails.get(i), days.get(i), timings.get(i), limits.get(i)});
                    }
                } else {
                    tempModel.setRowCount(0);
                }
                ChangeAppointmentDayLimitGUI.doctorsListTable.setModel(tempModel);
            }
            super.closeConnection();
            return true;
        } catch (Exception e) {
        }
        super.closeConnection();
        return false;
    }

    public boolean alertStatusSeen(String adminEmail) {
        try {
            String query1 = "UPDATE `" + adminEmail + "_alerts` SET status_ = 'Seen', seen_time = '" + super.getDateTime() + "' WHERE status_ = 'Unread'";
            statement.execute(query1);
            super.closeConnection();
            return true;
        } catch (Exception e) {
        }
        super.closeConnection();
        return false;
    }

    public boolean loadDoctorAppointmentCurrentSettings(String drEmail) {
        try {
            ArrayList<String> days = new ArrayList<>();
            ArrayList<String> timings = new ArrayList<>();
            ArrayList<Integer> limits = new ArrayList<>();
            int count = 0;
            String query1 = "SELECT days, time, day_limit FROM doctor_details WHERE email = '" + drEmail + "'";
            result = statement.executeQuery(query1);
            while (result.next()) {
                count++;
                days.add(result.getString("days"));
                timings.add(result.getString("time"));
                limits.add(result.getInt("day_limit"));
            }
            DefaultTableModel tempModel = (DefaultTableModel) RequestAppointmentLimitChangeGUI.doctorAppointmentDetailsTable.getModel();
            tempModel.setRowCount(0);
            if (count > 0) {
                for (int i = 0; i < days.size(); i++) {
                    tempModel.addRow(new Object[]{days.get(i), timings.get(i), limits.get(i)});
                }
            }
            RequestAppointmentLimitChangeGUI.doctorAppointmentDetailsTable.setModel(tempModel);
            super.closeConnection();
            return true;
        } catch (Exception e) {
        }
        super.closeConnection();
        return false;
    }

    public boolean updateAppointmentSettings(String drEmail, String days, String timing, String limit) {
        try {
            String query2 = "SELECT patient_email FROM `" + drEmail + "_appointment_schedule`";
            result = statement.executeQuery(query2);
            ArrayList<String> emails = new ArrayList<>();
            while (result.next()) {
                emails.add(result.getString("patient_email"));
            }
            if (emails.size() > 0) {
                for (String i : emails) {
                    String query1 = "TRUNCATE `" + i + "_appointments`";
                    statement.execute(query1);
                }
            }
            String query3 = "TRUNCATE `" + drEmail + "_appointment_schedule`";
            statement.execute(query3);
            String query1 = "UPDATE doctor_details SET time = '" + timing + "', days = '" + days + "', day_limit = " + Integer.parseInt(limit) + " WHERE email = '"
                    + drEmail + "'";
            statement.execute(query1);
            super.closeConnection();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        super.closeConnection();
        return false;
    }

    public boolean requestAppointmentUpdate(String email_, String name, String details, boolean isAppointmentRequest) {
        try {
            String type_ = (isAppointmentRequest ? "Appointment Changes Request" : "General Request");
            String query1 = "SELECT email FROM accounts WHERE accountType = 'Admin'";
            ArrayList<String> emails = new ArrayList<>();
            result = statement.executeQuery(query1);
            while (result.next()) {
                emails.add(result.getString("email"));
            }
            if (emails.size() > 0) {
                for (int i = 0; i < emails.size(); i++) {
                    String query2 = "SELECT * FROM `" + emails.get(i) + "_fullfillrequest` WHERE details = '" + details + "'";
                    result = statement.executeQuery(query2);
                    boolean isFound = false;
                    while (result.next()) {
                        isFound = true;
                    }
                    if (isFound) {
                        emails.set(i, null);
                    }
                }
                for (String i : emails) {
                    if (i != null) {
                        String query2 = "INSERT INTO `" + i + "_fullfillrequest` (name, email, type, details) VALUES ('" + name + "', '" + email_ + "',"
                                + " '" + type_ + "', '" + details + "')";
                        statement.execute(query2);
                    }
                }
            }
            super.closeConnection();
            return true;
        } catch (Exception e) {
        }
        super.closeConnection();
        return false;
    }

    public boolean adminRequestsFetch(String adminEmail) {
        try {
            String query1 = "SELECT * FROM `" + adminEmail + "_fullfillrequest`";
            ArrayList<String> names = new ArrayList<>();
            ArrayList<String> emails = new ArrayList<>();
            ArrayList<String> details = new ArrayList<>();
            ArrayList<String> types = new ArrayList<>();
            result = statement.executeQuery(query1);
            while (result.next()) {
                names.add(result.getString("name"));
                emails.add(result.getString("email"));
                types.add(result.getString("type"));
                details.add(result.getString("details"));
            }
            DefaultTableModel tempModel = (DefaultTableModel) AdminRequestReceptionGUI.requestListTable.getModel();
            tempModel.setRowCount(0);
            for (int i = 0; i < names.size(); i++) {
                tempModel.addRow(new Object[]{names.get(i), emails.get(i), types.get(i), details.get(i)});
            }
            AdminRequestReceptionGUI.requestListTable.setModel(tempModel);
            super.closeConnection();
            return true;
        } catch (Exception e) {
        }
        super.closeConnection();
        return false;
    }

    public boolean deleteRequest(String adminEmail, String email, String type, String details, boolean deleteFromAllAdminAcc) {
        try {
            if (deleteFromAllAdminAcc) {
                String query1 = "SELECT email FROM accounts WHERE accountType = 'Admin'";
                ArrayList<String> emails = new ArrayList<>();
                result = statement.executeQuery(query1);
                while (result.next()) {
                    emails.add(result.getString("email"));
                }
                for (String i : emails) {
                    String query2 = "DELETE FROM `" + i + "_fullfillrequest` WHERE email = '" + email + "' AND details = '" + details + "' AND type = '" + type + "'";
                    statement.execute(query2);
                }
            } else {
                String query1 = "DELETE FROM `" + adminEmail + "_fullfillrequest` WHERE email = '" + email + "' AND details = '" + details + "' AND type = '" + type + "'";
                statement.execute(query1);
            }
            super.closeConnection();
            return true;
        } catch (Exception e) {
        }
        super.closeConnection();
        return false;
    }

    public boolean sendResponse(String email, String email_, String type, String details, String msg) {
        try {
            String query1 = "INSERT INTO `" + email_ + "_responses` (email, type, details, response) VALUES ('" + email + "', '" + type + "', '" + details + "', '" + msg + "')";
            String query2 = "INSERT INTO `" + email + "_responses` (email, type, details, response) VALUES ('" + email + "', '" + type + "', '" + details + "', '" + msg + "')";
            statement.execute(query1);
            statement.execute(query2);
            super.closeConnection();
            return true;
        } catch (Exception e) {
        }
        super.closeConnection();
        return false;
    }

    public boolean fetchResponses(String email) {
        try {
            String query1 = "SELECT * FROM `" + email + "_responses`";
            ArrayList<String> emails = new ArrayList<>();
            ArrayList<String> types = new ArrayList<>();
            ArrayList<String> details = new ArrayList<>();
            ArrayList<String> responses = new ArrayList<>();
            result = statement.executeQuery(query1);
            while (result.next()) {
                emails.add(result.getString("email"));
                types.add(result.getString("type"));
                details.add(result.getString("details"));
                responses.add(result.getString("response"));
            }
            DefaultTableModel tempModel = (DefaultTableModel) ResponsesFetchGUI.responsesTable.getModel();
            tempModel.setRowCount(0);
            for (int i = 0; i < emails.size(); i++) {
                String temp_ = (email.equalsIgnoreCase(emails.get(i)) ? "Me" : emails.get(i));
                tempModel.addRow(new Object[]{types.get(i), details.get(i), temp_, responses.get(i)});
            }
            super.closeConnection();
            return true;
        } catch (Exception e) {
        }
        super.closeConnection();
        return false;
    }

    public boolean deleteResponse(String userEmail, String email, String details, String response) {
        try {
            String query1 = "DELETE FROM `" + userEmail + "_responses` WHERE email = '" + email + "' AND details = '" + details + "' AND response = '" + response + "'";
            statement.execute(query1);
            super.closeConnection();
            return true;
        } catch (Exception e) {
        }
        super.closeConnection();
        return false;
    }

    public boolean sendFeedback(String name, String email, String subject, String details) {
        try {
            String query1 = "SELECT email FROM accounts WHERE accountType = 'Admin'";
            ArrayList<String> emails = new ArrayList<>();
            result = statement.executeQuery(query1);
            while (result.next()) {
                emails.add(result.getString("email"));
            }
            for (String i : emails) {
                String query2 = "INSERT INTO `" + i + "_feedbacks` (name, email, subject, details) VALUES ('" + name + "', '" + email + "', '" + subject + "', '" + details
                        + "')";
                statement.execute(query2);
            }
            super.closeConnection();
            return true;
        } catch (Exception e) {
        }
        super.closeConnection();
        return false;
    }

    public boolean deleteFeedback(String adminEmail, String email_, String details, String subject, boolean deleteFromAll) {
        try {
            if (deleteFromAll) {
                String query1 = "SELECT email FROM accounts WHERE accountType = 'Admin'";
                ArrayList<String> emails = new ArrayList<>();
                result = statement.executeQuery(query1);
                while (result.next()) {
                    emails.add(result.getString("email"));
                }
                for (String i : emails) {
                    String query2 = "DELETE FROM `" + i + "_feedbacks` WHERE email = '" + email_ + "' AND subject = '" + subject + "' AND details = '" + details + "'";
                    statement.execute(query2);
                }
            } else {
                String query1 = "DELETE FROM `" + adminEmail + "_feedbacks` WHERE email = '" + email_ + "' AND subject = '" + subject + "' AND details = '" + details + "'";
                statement.execute(query1);
            }
            super.closeConnection();
            return true;
        } catch (Exception e) {
        }
        super.closeConnection();
        return false;
    }

    public boolean feedbacksFetcher(String email) {
        try {
            String query1 = "SELECT * FROM `" + email + "_feedbacks`";
            ArrayList<String> names = new ArrayList<>();
            ArrayList<String> emails = new ArrayList<>();
            ArrayList<String> subjects = new ArrayList<>();
            ArrayList<String> details = new ArrayList<>();
            result = statement.executeQuery(query1);
            while (result.next()) {
                names.add(result.getString("name"));
                emails.add(result.getString("email"));
                subjects.add(result.getString("subject"));
                details.add(result.getString("details"));
            }
            DefaultTableModel tempModel = (DefaultTableModel) FeedbackFetcherGUI.feedbackTable.getModel();
            tempModel.setRowCount(0);
            for (int i = 0; i < names.size(); i++) {
                tempModel.addRow(new Object[]{names.get(i), emails.get(i), subjects.get(i), details.get(i)});
            }
            FeedbackFetcherGUI.feedbackTable.setModel(tempModel);
            super.closeConnection();
            return true;
        } catch (Exception e) {
        }
        super.closeConnection();
        return false;
    }

    public void createCasesLog(String drEmail, String patientEmail, String caseType, String dateTime) {
        try {
            String query1 = "INSERT INTO tbl_log_cases(drEmail, patientEmail, caseType, dateTime) VALUES ('" + drEmail + "', '"
                    + patientEmail + "', '" + caseType + "', '" + dateTime + "')";
            statement.execute(query1);           
        } catch (Exception e) {
        }
        super.closeConnection();
    }

    private String generateRandomInvoiceID() {
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
}
