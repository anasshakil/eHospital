package BackendPackage;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;

public class appointment_GUI extends javax.swing.JFrame {

    public static appointment_GUI staticObject;
    private String serverAddress = DatabaseClass.serverAddress;
    private String hostName = "anas";
    private String hostPassword = "anas@";
    private Connection connection;
    private boolean correct1 = true;
    private Statement statement;
    private ResultSet result;
    private String day = "";
    int count = 0;

    public appointment_GUI() {
        initComponents();
        setLocationRelativeTo(null);
        try {
            BufferedImage img1 = ImageIO.read(getClass().getResource("/Icons/Hospital_3_48px.png"));
            setIconImage(img1);
        } catch (IOException e) {
        }
        try {
            connection = DriverManager.getConnection("jdbc:mysql://" + serverAddress + ":3306/ehospital_db?verifyServerCertificate=false&useSSL=false", hostName, hostPassword);
            statement = connection.createStatement();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(MenuGUI.staticObject, "Connection lost with server", "No internet connection", JOptionPane.ERROR_MESSAGE);
        }
        tab.remove(tab2);
        tab.add(tab1);
    }

    public appointment_GUI(String email) {
        initComponents();
        setLocationRelativeTo(null);
        try {
            connection = DriverManager.getConnection("jdbc:mysql://" + serverAddress + ":3306/ehospital_db?verifyServerCertificate=false&useSSL=false", hostName, hostPassword);
            statement = connection.createStatement();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(MenuGUI.staticObject, "Connection lost with server", "No internet connection", JOptionPane.ERROR_MESSAGE);
        }
        try {
            BufferedImage img1 = ImageIO.read(getClass().getResource("/Icons/Hospital_3_48px.png"));
            setIconImage(img1);
        } catch (IOException e) {
        }
        try {
            String query = "Select * from `" + email + "_appointment_schedule`;";
            String dayandtime = "";
            result = statement.executeQuery(query);
            while (result.next()) {
                dayandtime += result.getString("time");
                dayandtime += "    ";
                dayandtime += result.getString("days");
            }
            tab.remove(tab1);
            tab.add(tab2);
            time.setText(dayandtime);
        } catch (Exception ex) {
        }
    }

    public appointment_GUI(boolean correct) {
        initComponents();
        setLocationRelativeTo(null);
        try {
            BufferedImage img1 = ImageIO.read(getClass().getResource("/Icons/Hospital_3_48px.png"));
            setIconImage(img1);
        } catch (IOException e) {
        }
        try {
            connection = DriverManager.getConnection("jdbc:mysql://" + serverAddress + ":3306/ehospital_db?verifyServerCertificate=false&useSSL=false", hostName, hostPassword);
            statement = connection.createStatement();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(MenuGUI.staticObject, "Connection lost with server", "No internet connection", JOptionPane.ERROR_MESSAGE);
        }
        tab.remove(tab2);
        tab.add(tab1);
        correct1 = correct;
        if (correct1 = false) {
            found.setText("Name not found!");
        } else {
            found.setText("Name found!");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tab = new javax.swing.JTabbedPane();
        tab1 = new javax.swing.JPanel();
        searchtxtbox = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        prolist = new javax.swing.JComboBox<>();
        searchbtn = new javax.swing.JButton();
        backbtn = new javax.swing.JButton();
        found = new javax.swing.JTextField();
        tab2 = new javax.swing.JPanel();
        name = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        savebtn = new javax.swing.JButton();
        cancelbtn = new javax.swing.JButton();
        time = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        day1btn = new javax.swing.JRadioButton();
        day2btn = new javax.swing.JRadioButton();
        day3btn = new javax.swing.JRadioButton();
        day4btn = new javax.swing.JRadioButton();
        day5btn = new javax.swing.JRadioButton();
        day6btn = new javax.swing.JRadioButton();
        day7btn = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Search");
        setBackground(new java.awt.Color(51, 51, 51));
        setForeground(new java.awt.Color(51, 51, 51));

        tab1.setBackground(new java.awt.Color(51, 51, 51));

        searchtxtbox.setBackground(new java.awt.Color(51, 51, 51));
        searchtxtbox.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        searchtxtbox.setForeground(new java.awt.Color(255, 255, 255));
        searchtxtbox.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        searchtxtbox.setText("Search");

        jLabel1.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Choose doctor's profession:");

        prolist.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        prolist.setForeground(new java.awt.Color(51, 51, 51));
        prolist.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dentist", "Dermatologist", "Gynecologist", "Orthopedic surgeon", "Physiologist", "Surgeon" }));

        searchbtn.setBackground(new java.awt.Color(51, 51, 51));
        searchbtn.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        searchbtn.setText("Search");
        searchbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchbtnActionPerformed(evt);
            }
        });

        backbtn.setBackground(new java.awt.Color(51, 51, 51));
        backbtn.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        backbtn.setText("Back");
        backbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbtnActionPerformed(evt);
            }
        });

        found.setEditable(false);
        found.setBackground(new java.awt.Color(51, 51, 51));
        found.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        found.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout tab1Layout = new javax.swing.GroupLayout(tab1);
        tab1.setLayout(tab1Layout);
        tab1Layout.setHorizontalGroup(
            tab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab1Layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addGroup(tab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tab1Layout.createSequentialGroup()
                        .addGroup(tab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(tab1Layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(searchbtn))
                            .addComponent(searchtxtbox, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(60, 60, 60)
                        .addGroup(tab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(backbtn))
                        .addContainerGap(34, Short.MAX_VALUE))
                    .addGroup(tab1Layout.createSequentialGroup()
                        .addComponent(found, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(prolist, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(72, 72, 72))))
        );
        tab1Layout.setVerticalGroup(
            tab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab1Layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addGroup(tab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchtxtbox, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(tab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(found, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(prolist, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 142, Short.MAX_VALUE)
                .addGroup(tab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchbtn)
                    .addComponent(backbtn))
                .addGap(91, 91, 91))
        );

        tab.addTab("tab1", tab1);

        tab2.setBackground(new java.awt.Color(51, 51, 51));

        name.setBackground(new java.awt.Color(51, 51, 51));
        name.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        name.setForeground(new java.awt.Color(255, 255, 255));
        name.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        name.setText("Name of patient");

        email.setBackground(new java.awt.Color(51, 51, 51));
        email.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        email.setForeground(new java.awt.Color(255, 255, 255));
        email.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        email.setText("Email of patient");

        jLabel2.setBackground(new java.awt.Color(51, 51, 51));
        jLabel2.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Enter details for the appiontment:");

        savebtn.setBackground(new java.awt.Color(51, 51, 51));
        savebtn.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        savebtn.setForeground(new java.awt.Color(51, 51, 51));
        savebtn.setText("Save");
        savebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savebtnActionPerformed(evt);
            }
        });

        cancelbtn.setBackground(new java.awt.Color(51, 51, 51));
        cancelbtn.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        cancelbtn.setForeground(new java.awt.Color(51, 51, 51));
        cancelbtn.setText("Cancel");
        cancelbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelbtnActionPerformed(evt);
            }
        });

        time.setEditable(false);
        time.setBackground(new java.awt.Color(51, 51, 51));
        time.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        time.setForeground(new java.awt.Color(255, 255, 255));
        time.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        time.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timeActionPerformed(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Choose a day:");

        day1btn.setBackground(new java.awt.Color(51, 51, 51));
        day1btn.setForeground(new java.awt.Color(255, 255, 255));
        day1btn.setText("Sunday");
        day1btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                day1btnActionPerformed(evt);
            }
        });

        day2btn.setBackground(new java.awt.Color(51, 51, 51));
        day2btn.setForeground(new java.awt.Color(255, 255, 255));
        day2btn.setText("Monday");
        day2btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                day2btnActionPerformed(evt);
            }
        });

        day3btn.setBackground(new java.awt.Color(51, 51, 51));
        day3btn.setForeground(new java.awt.Color(255, 255, 255));
        day3btn.setText("Tuesday");
        day3btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                day3btnActionPerformed(evt);
            }
        });

        day4btn.setBackground(new java.awt.Color(51, 51, 51));
        day4btn.setForeground(new java.awt.Color(255, 255, 255));
        day4btn.setText("Wednesday");
        day4btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                day4btnActionPerformed(evt);
            }
        });

        day5btn.setBackground(new java.awt.Color(51, 51, 51));
        day5btn.setForeground(new java.awt.Color(255, 255, 255));
        day5btn.setText("Thursday");
        day5btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                day5btnActionPerformed(evt);
            }
        });

        day6btn.setBackground(new java.awt.Color(51, 51, 51));
        day6btn.setForeground(new java.awt.Color(255, 255, 255));
        day6btn.setText("Friday");
        day6btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                day6btnActionPerformed(evt);
            }
        });

        day7btn.setBackground(new java.awt.Color(51, 51, 51));
        day7btn.setForeground(new java.awt.Color(255, 255, 255));
        day7btn.setText("Saturday");
        day7btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                day7btnActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Timings:");

        javax.swing.GroupLayout tab2Layout = new javax.swing.GroupLayout(tab2);
        tab2.setLayout(tab2Layout);
        tab2Layout.setHorizontalGroup(
            tab2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab2Layout.createSequentialGroup()
                .addGap(137, 137, 137)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tab2Layout.createSequentialGroup()
                .addGroup(tab2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tab2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(tab2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(time, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tab2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(savebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)))
                .addGroup(tab2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tab2Layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addGroup(tab2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(day4btn)
                            .addComponent(day2btn)
                            .addComponent(day6btn)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tab2Layout.createSequentialGroup()
                        .addComponent(cancelbtn)
                        .addGap(92, 92, 92)))
                .addGap(14, 14, 14))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tab2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(tab2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(day7btn)
                    .addComponent(day1btn)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(day3btn)
                    .addComponent(day5btn))
                .addGap(85, 85, 85))
        );
        tab2Layout.setVerticalGroup(
            tab2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(tab2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(tab2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(tab2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(day1btn)
                        .addComponent(day2btn)))
                .addGap(25, 25, 25)
                .addGroup(tab2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tab2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(day3btn)
                        .addComponent(day4btn))
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(tab2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(time, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(tab2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(day5btn)
                        .addComponent(day6btn)))
                .addGap(18, 18, 18)
                .addComponent(day7btn)
                .addGap(39, 39, 39)
                .addGroup(tab2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(savebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(75, Short.MAX_VALUE))
        );

        tab.addTab("tab2", tab2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tab)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tab, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void day7btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_day7btnActionPerformed
        day = "Saturday";
    }//GEN-LAST:event_day7btnActionPerformed

    private void day6btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_day6btnActionPerformed
        day = "Friday";
    }//GEN-LAST:event_day6btnActionPerformed

    private void day5btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_day5btnActionPerformed
        day = "Thursday";
    }//GEN-LAST:event_day5btnActionPerformed

    private void day4btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_day4btnActionPerformed
        day = "Wednesday";
    }//GEN-LAST:event_day4btnActionPerformed

    private void day3btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_day3btnActionPerformed
        day = "Tuesday";
    }//GEN-LAST:event_day3btnActionPerformed

    private void day2btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_day2btnActionPerformed
        day = "Monday";
    }//GEN-LAST:event_day2btnActionPerformed

    private void day1btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_day1btnActionPerformed
        day = "Sunday";
    }//GEN-LAST:event_day1btnActionPerformed

    private void cancelbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelbtnActionPerformed
        tab.remove(tab2);
        tab.add(tab1);
    }//GEN-LAST:event_cancelbtnActionPerformed

    void Enqueue() {
        int limit = 30;
        if (count != limit) {
            count++;
        } else {
            JOptionPane.showMessageDialog(null, "You cannot appoint this doctor!");
        }
    }
    private void savebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savebtnActionPerformed
        String dayandtime = "";
        dayandtime += time.getText();
        dayandtime += day;
        try {
            if (count == 0) {
                String query = "create table `" + email + "_appointment`(ID varchar(10) not null, primary key(ID), patientemail varchar(50) not null, patientname varchar(50) not null, dayandtime varchar(70) not null);";
                String query1 = "insert into `" + email + "_appointment`(ID, patientemail, patientname, dayandtime) and values('" + count + "', '" + email.getText() + "', '" + name.getText() + "', '" + dayandtime + "');";
                statement.execute(query);
                statement.execute(query1);
                Enqueue();
            }
            if (count > 0) {
                if (count != 30) {
                    String query1 = "insert into `" + email + "_appointment`(ID, patientemail, patientname, dayandtime) and values('" + count + "', '" + email.getText() + "', '" + name.getText() + "', '" + dayandtime + "');";
                    statement.execute(query1);
                    Enqueue();
                }
            }
            close();
        } catch (Exception ex) {
        }
    }//GEN-LAST:event_savebtnActionPerformed

    private void searchbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchbtnActionPerformed
        found.setText("");
        if (!searchtxtbox.equals("search")) {
            new SearchProfileGUI_(searchtxtbox.getText(), false).setVisible(true);
        } else {
            found.setText("Fill the search box!");
        }
    }//GEN-LAST:event_searchbtnActionPerformed

    private void backbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtnActionPerformed
        close();
    }//GEN-LAST:event_backbtnActionPerformed

    private void timeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_timeActionPerformed

    private void close() {
        dispose();
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
            java.util.logging.Logger.getLogger(appointment_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(appointment_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(appointment_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(appointment_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                boolean correct2 = true;
                new appointment_GUI(correct2).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backbtn;
    private javax.swing.JButton cancelbtn;
    private javax.swing.JRadioButton day1btn;
    private javax.swing.JRadioButton day2btn;
    private javax.swing.JRadioButton day3btn;
    private javax.swing.JRadioButton day4btn;
    private javax.swing.JRadioButton day5btn;
    private javax.swing.JRadioButton day6btn;
    private javax.swing.JRadioButton day7btn;
    private javax.swing.JTextField email;
    private javax.swing.JTextField found;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField name;
    private javax.swing.JComboBox<String> prolist;
    private javax.swing.JButton savebtn;
    private javax.swing.JButton searchbtn;
    private javax.swing.JTextField searchtxtbox;
    private javax.swing.JTabbedPane tab;
    private javax.swing.JPanel tab1;
    private javax.swing.JPanel tab2;
    private javax.swing.JTextField time;
    // End of variables declaration//GEN-END:variables
}
