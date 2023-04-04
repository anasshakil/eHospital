package BackendPackage;

import java.sql.*;
import java.util.ArrayList;
import javax.swing.*;

public class appointment_class {

    private String serverIpAddress = DatabaseClass.serverAddress;
    private String username = "anas";
    private String hostPassword = "anas@";
    private String ServerDetails = "jdbc:mysql://" + serverIpAddress + ":3306/ehospital_db?VerifyServerCertificate=false&useSSL=false";
    private Connection connection;
    private Statement statement;
    private ResultSet result;

    public appointment_class() {
        try {
            connection = DriverManager.getConnection(ServerDetails, username, hostPassword);
            statement = connection.createStatement();
        } catch (Exception e) {
        }
    }

    boolean search(String search) {
        try {
            int count = 0;
            ArrayList<String> name = new ArrayList<>();
            ArrayList<String> email = new ArrayList<>();
            String query = "select * from accounts where name = '" + search + "' and accountType= 'Doctor';";
            result = statement.executeQuery(query);
            while (result.next()) {
                email.add(result.getString("email"));
                name.add(result.getString("name"));
                count++;
            }
            if (count != 0) {
                SearchProfileGUI_.names.clear();
                SearchProfileGUI_.emails.clear();
                SearchProfileGUI_.names = name;
                SearchProfileGUI_.emails = email;
                return true;
            }
        } catch (Exception e) {e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Something went wrong!");
        }
        return false;
    }
}
