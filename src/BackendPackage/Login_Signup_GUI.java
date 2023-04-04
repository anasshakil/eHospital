package BackendPackage;

import static BackendPackage.MenuGUI.staticObject;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Calendar;
import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class Login_Signup_GUI extends javax.swing.JFrame {

    public static boolean isEndSplashDisplay = false;
    private int accType, sex;
    private boolean choice;
    private String vn, days = "", time = "";

    public Login_Signup_GUI() {
        initComponents();
        try {
            BufferedImage img1 = ImageIO.read(getClass().getResource("/Icons/Hospital_3_48px.png"));
            setIconImage(img1);
        } catch (IOException e) {
        }
        setSize(980, 700);
        setResizable(false);
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.decode("#2D2D30"));
        jTabbedPane1.remove(jPanel2);
    }

    public Login_Signup_GUI(boolean choose, boolean isAdmin) { // only for signup
        initComponents();
        choice = choose;
        try {
            BufferedImage img1 = ImageIO.read(getClass().getResource("/Icons/Hospital_3_48px.png"));
            setIconImage(img1);
        } catch (IOException e) {
        }
        setSize(980, 700);
        setResizable(false);
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.decode("#2D2D30"));
        if (!isAdmin) {
            if (choose == false) {
                accType = 1; // when a patient
                jTabbedPane1.remove(jPanel1);
                verifyTxtbox.setVisible(false);
                professionComboBox.setVisible(false);
                qualificationTxtbox.setVisible(false);
                vlabel.setVisible(false);
                jTabbedPane1.add(jPanel2);
                jTabbedPane1.setTitleAt(0, "SIGN UP");
                days = "";
                time = "";
                day2.setVisible(false);
                day3.setVisible(false);
                day4.setVisible(false);
                day5.setVisible(false);
                day6.setVisible(false);
                jLabel2.setVisible(false);
                day7.setVisible(false);
                timeTxtbox.setVisible(false);
                jLabel3.setVisible(false);
                dayLimitTxtbox.setVisible(false);

            } else {
                accType = 2; // when a doctor             
                jTabbedPane1.remove(jPanel1);
                jTabbedPane1.add(jPanel2);
                jTabbedPane1.setTitleAt(0, "SIGN UP");
                days = "";
                time = "";
            }
        } else {
            accType = 3;
            jTabbedPane1.remove(jPanel1);
//            vlabel.setEnabled(true);
//            verifyTxtbox.setEnabled(true);
            days = "";
            time = "";
            dayLimitTxtbox.setVisible(false);
            jLabel3.setVisible(false);
            professionComboBox.setVisible(false);
            qualificationTxtbox.setVisible(false);
            day2.setVisible(false);
            day3.setVisible(false);
            day4.setVisible(false);
            day5.setVisible(false);
            day6.setVisible(false);
            jLabel2.setVisible(false);
            day7.setVisible(false);
            timeTxtbox.setVisible(false);
            jTabbedPane1.add(jPanel2);
            jTabbedPane1.setTitleAt(0, "SIGN UP");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButton9 = new javax.swing.JRadioButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        txtboxUser = new javax.swing.JTextField();
        txtboxPass = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JButton();
        btnSignup = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnCreateAcc = new javax.swing.JButton();
        txtboxPassSignUp = new javax.swing.JPasswordField();
        txtboxUserSignup = new javax.swing.JTextField();
        btnCancel = new javax.swing.JButton();
        txtboxName = new javax.swing.JTextField();
        verifyTxtbox = new javax.swing.JTextField();
        numbertxtbox = new javax.swing.JTextField();
        radioBtnMale = new javax.swing.JRadioButton();
        radioBtnFemale = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        qualificationTxtbox = new javax.swing.JTextField();
        ageTxtbox = new javax.swing.JTextField();
        vlabel = new javax.swing.JTextField();
        cnictxtbox = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        timeTxtbox = new javax.swing.JTextField();
        day2 = new javax.swing.JRadioButton();
        day3 = new javax.swing.JRadioButton();
        day4 = new javax.swing.JRadioButton();
        day5 = new javax.swing.JRadioButton();
        day6 = new javax.swing.JRadioButton();
        day7 = new javax.swing.JRadioButton();
        professionComboBox = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        dayLimitTxtbox = new javax.swing.JTextField();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();

        jRadioButton9.setText("jRadioButton9");

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Action Required");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jTabbedPane1.setBackground(new java.awt.Color(45, 45, 48));
        jTabbedPane1.setForeground(new java.awt.Color(237, 123, 0));
        jTabbedPane1.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jTabbedPane1.setMaximumSize(new java.awt.Dimension(81, 66));

        jPanel1.setBackground(new java.awt.Color(45, 45, 48));

        txtboxUser.setBackground(new java.awt.Color(45, 45, 48));
        txtboxUser.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        txtboxUser.setForeground(new java.awt.Color(255, 255, 255));
        txtboxUser.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtboxUser.setText("Email");
        txtboxUser.setCaretColor(new java.awt.Color(255, 255, 255));
        txtboxUser.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtboxUserFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtboxUserFocusLost(evt);
            }
        });

        txtboxPass.setBackground(new java.awt.Color(45, 45, 48));
        txtboxPass.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        txtboxPass.setForeground(new java.awt.Color(255, 255, 255));
        txtboxPass.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtboxPass.setText("Password");
        txtboxPass.setCaretColor(new java.awt.Color(255, 255, 255));
        txtboxPass.setPreferredSize(new java.awt.Dimension(91, 31));
        txtboxPass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtboxPassFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtboxPassFocusLost(evt);
            }
        });

        btnLogin.setBackground(new java.awt.Color(45, 45, 48));
        btnLogin.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setText("LOG IN");
        btnLogin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btnLogin.setContentAreaFilled(false);
        btnLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnLoginMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnLoginMouseExited(evt);
            }
        });
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        btnSignup.setBackground(new java.awt.Color(45, 45, 48));
        btnSignup.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        btnSignup.setForeground(new java.awt.Color(255, 255, 255));
        btnSignup.setText("SIGN UP");
        btnSignup.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btnSignup.setContentAreaFilled(false);
        btnSignup.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSignupMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSignupMouseExited(evt);
            }
        });
        btnSignup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignupActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(316, 316, 316)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtboxPass, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtboxUser, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(380, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(btnSignup, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(375, 375, 375))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(208, Short.MAX_VALUE)
                .addComponent(txtboxUser, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(txtboxPass, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSignup, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(195, 195, 195))
        );

        jTabbedPane1.addTab("LOG IN", jPanel1);

        jPanel2.setBackground(new java.awt.Color(45, 45, 48));
        jPanel2.setMaximumSize(new java.awt.Dimension(700, 600));
        jPanel2.setMinimumSize(new java.awt.Dimension(700, 600));

        btnCreateAcc.setBackground(new java.awt.Color(45, 45, 48));
        btnCreateAcc.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        btnCreateAcc.setForeground(new java.awt.Color(255, 255, 255));
        btnCreateAcc.setText("Create Account");
        btnCreateAcc.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btnCreateAcc.setContentAreaFilled(false);
        btnCreateAcc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCreateAccMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCreateAccMouseExited(evt);
            }
        });
        btnCreateAcc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateAccActionPerformed(evt);
            }
        });

        txtboxPassSignUp.setBackground(new java.awt.Color(45, 45, 48));
        txtboxPassSignUp.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        txtboxPassSignUp.setForeground(new java.awt.Color(255, 255, 255));
        txtboxPassSignUp.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtboxPassSignUp.setText("Password");
        txtboxPassSignUp.setCaretColor(new java.awt.Color(255, 255, 255));
        txtboxPassSignUp.setNextFocusableComponent(numbertxtbox);
        txtboxPassSignUp.setPreferredSize(new java.awt.Dimension(91, 31));
        txtboxPassSignUp.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtboxPassSignUpFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtboxPassSignUpFocusLost(evt);
            }
        });

        txtboxUserSignup.setBackground(new java.awt.Color(45, 45, 48));
        txtboxUserSignup.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        txtboxUserSignup.setForeground(new java.awt.Color(255, 255, 255));
        txtboxUserSignup.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtboxUserSignup.setText("Email");
        txtboxUserSignup.setCaretColor(new java.awt.Color(255, 255, 255));
        txtboxUserSignup.setNextFocusableComponent(txtboxPassSignUp);
        txtboxUserSignup.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtboxUserSignupFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtboxUserSignupFocusLost(evt);
            }
        });

        btnCancel.setBackground(new java.awt.Color(45, 45, 48));
        btnCancel.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        btnCancel.setForeground(new java.awt.Color(255, 255, 255));
        btnCancel.setText("Cancel");
        btnCancel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
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

        txtboxName.setBackground(new java.awt.Color(45, 45, 48));
        txtboxName.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        txtboxName.setForeground(new java.awt.Color(255, 255, 255));
        txtboxName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtboxName.setText("Name");
        txtboxName.setCaretColor(new java.awt.Color(255, 255, 255));
        txtboxName.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtboxName.setNextFocusableComponent(txtboxUserSignup);
        txtboxName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtboxNameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtboxNameFocusLost(evt);
            }
        });

        verifyTxtbox.setBackground(new java.awt.Color(51, 51, 51));
        verifyTxtbox.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        verifyTxtbox.setForeground(new java.awt.Color(255, 255, 255));
        verifyTxtbox.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        verifyTxtbox.setText("Verify Code");
        verifyTxtbox.setNextFocusableComponent(radioBtnMale);
        verifyTxtbox.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                verifyTxtboxFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                verifyTxtboxFocusLost(evt);
            }
        });

        numbertxtbox.setBackground(new java.awt.Color(51, 51, 51));
        numbertxtbox.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        numbertxtbox.setForeground(new java.awt.Color(255, 255, 255));
        numbertxtbox.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        numbertxtbox.setText("Contact Number");
        numbertxtbox.setNextFocusableComponent(cnictxtbox);
        numbertxtbox.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                numbertxtboxFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                numbertxtboxFocusLost(evt);
            }
        });

        radioBtnMale.setBackground(new java.awt.Color(45, 45, 48));
        radioBtnMale.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        radioBtnMale.setForeground(new java.awt.Color(255, 255, 255));
        radioBtnMale.setText("Male");
        radioBtnMale.setNextFocusableComponent(professionComboBox);
        radioBtnMale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioBtnMaleActionPerformed(evt);
            }
        });

        radioBtnFemale.setBackground(new java.awt.Color(45, 45, 48));
        radioBtnFemale.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        radioBtnFemale.setForeground(new java.awt.Color(255, 255, 255));
        radioBtnFemale.setText("Female");
        radioBtnFemale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioBtnFemaleActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(51, 51, 51));
        jLabel1.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Sex:");

        qualificationTxtbox.setBackground(new java.awt.Color(51, 51, 51));
        qualificationTxtbox.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        qualificationTxtbox.setForeground(new java.awt.Color(255, 255, 255));
        qualificationTxtbox.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        qualificationTxtbox.setText("Qualification (e.g. MBBS, Ph.D)");
        qualificationTxtbox.setNextFocusableComponent(dayLimitTxtbox);
        qualificationTxtbox.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                qualificationTxtboxFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                qualificationTxtboxFocusLost(evt);
            }
        });

        ageTxtbox.setBackground(new java.awt.Color(51, 51, 51));
        ageTxtbox.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        ageTxtbox.setForeground(new java.awt.Color(255, 255, 255));
        ageTxtbox.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ageTxtbox.setText("Age");
        ageTxtbox.setNextFocusableComponent(verifyTxtbox);
        ageTxtbox.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                ageTxtboxFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                ageTxtboxFocusLost(evt);
            }
        });

        vlabel.setEditable(false);
        vlabel.setBackground(new java.awt.Color(45, 45, 48));
        vlabel.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        vlabel.setForeground(new java.awt.Color(255, 0, 51));
        vlabel.setBorder(null);

        cnictxtbox.setBackground(new java.awt.Color(51, 51, 51));
        cnictxtbox.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        cnictxtbox.setForeground(new java.awt.Color(255, 255, 255));
        cnictxtbox.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cnictxtbox.setText("CNIC Number");
        cnictxtbox.setNextFocusableComponent(jDateChooser1);
        cnictxtbox.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cnictxtboxFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                cnictxtboxFocusLost(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Appointment days and timing:");

        timeTxtbox.setBackground(new java.awt.Color(51, 51, 51));
        timeTxtbox.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        timeTxtbox.setForeground(new java.awt.Color(255, 255, 255));
        timeTxtbox.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        timeTxtbox.setText("Timing (24-hour format(e.g. 23:15))");
        timeTxtbox.setNextFocusableComponent(btnCreateAcc);
        timeTxtbox.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                timeTxtboxFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                timeTxtboxFocusLost(evt);
            }
        });

        day2.setBackground(new java.awt.Color(45, 45, 48));
        day2.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        day2.setForeground(new java.awt.Color(255, 255, 255));
        day2.setText("Monday");
        day2.setNextFocusableComponent(day3);
        day2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                day2ActionPerformed(evt);
            }
        });

        day3.setBackground(new java.awt.Color(45, 45, 48));
        day3.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        day3.setForeground(new java.awt.Color(255, 255, 255));
        day3.setText("Tuesday");
        day3.setNextFocusableComponent(day4);
        day3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                day3ActionPerformed(evt);
            }
        });

        day4.setBackground(new java.awt.Color(45, 45, 48));
        day4.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        day4.setForeground(new java.awt.Color(255, 255, 255));
        day4.setText("Wednesday");
        day4.setNextFocusableComponent(timeTxtbox);
        day4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                day4ActionPerformed(evt);
            }
        });

        day5.setBackground(new java.awt.Color(45, 45, 48));
        day5.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        day5.setForeground(new java.awt.Color(255, 255, 255));
        day5.setText("Thursday");
        day5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                day5ActionPerformed(evt);
            }
        });

        day6.setBackground(new java.awt.Color(45, 45, 48));
        day6.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        day6.setForeground(new java.awt.Color(255, 255, 255));
        day6.setText("Friday");
        day6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                day6ActionPerformed(evt);
            }
        });

        day7.setBackground(new java.awt.Color(45, 45, 48));
        day7.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        day7.setForeground(new java.awt.Color(255, 255, 255));
        day7.setText("Saturday");
        day7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                day7ActionPerformed(evt);
            }
        });

        professionComboBox.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        professionComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Profession (e.g. Physician, Simple doctor)", "Cardiac and circulatory", "Oncologist", "Physician", "Psychologist", "ENT" }));
        professionComboBox.setNextFocusableComponent(qualificationTxtbox);

        jLabel3.setBackground(new java.awt.Color(51, 51, 51));
        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 51));
        jLabel3.setText("Time Example 12:00-14:00");

        dayLimitTxtbox.setBackground(new java.awt.Color(51, 51, 51));
        dayLimitTxtbox.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        dayLimitTxtbox.setForeground(new java.awt.Color(255, 255, 255));
        dayLimitTxtbox.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        dayLimitTxtbox.setText("Day Limit For Appointments");
        dayLimitTxtbox.setNextFocusableComponent(day2);
        dayLimitTxtbox.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                dayLimitTxtboxFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                dayLimitTxtboxFocusLost(evt);
            }
        });

        jDateChooser1.setBackground(new java.awt.Color(255, 255, 255));
        jDateChooser1.setToolTipText("Date Of Birth");
        jDateChooser1.setMaxSelectableDate(new java.util.Date());
        jDateChooser1.setNextFocusableComponent(ageTxtbox);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(numbertxtbox)
                        .addComponent(txtboxUserSignup)
                        .addComponent(txtboxName)
                        .addComponent(txtboxPassSignUp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cnictxtbox)
                        .addComponent(ageTxtbox)
                        .addComponent(verifyTxtbox)
                        .addComponent(professionComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(qualificationTxtbox)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(radioBtnMale)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(radioBtnFemale))
                        .addComponent(dayLimitTxtbox)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(172, 172, 172)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(day2)
                                    .addComponent(day5))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(day6)
                                    .addComponent(day3))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(day7)
                                    .addComponent(day4)))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(btnCreateAcc, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(timeTxtbox, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addComponent(jLabel3))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(vlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(120, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(txtboxName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtboxUserSignup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(day2)
                    .addComponent(day4)
                    .addComponent(day3))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtboxPassSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(day5)
                    .addComponent(day6)
                    .addComponent(day7))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numbertxtbox, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(timeTxtbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 111, Short.MAX_VALUE)
                        .addComponent(vlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(222, 222, 222))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(cnictxtbox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnCreateAcc, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(ageTxtbox, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(verifyTxtbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(radioBtnMale)
                                    .addComponent(radioBtnFemale))
                                .addGap(18, 18, 18)
                                .addComponent(professionComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(qualificationTxtbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(dayLimitTxtbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 25, Short.MAX_VALUE)))))
                .addContainerGap(105, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("SIGN UP", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1019, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 750, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        close(evt);
    }//GEN-LAST:event_formWindowClosing

    private void txtboxUserFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtboxUserFocusGained
        if (txtboxUser.getText().equals("Email")) {
            txtboxUser.setText("");
        }
    }//GEN-LAST:event_txtboxUserFocusGained

    private void txtboxUserFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtboxUserFocusLost
        if (txtboxUser.getText().equals("")) {
            txtboxUser.setText("Email");
        }
    }//GEN-LAST:event_txtboxUserFocusLost

    private void txtboxPassFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtboxPassFocusGained
        if (txtboxPass.getText().equals("Password")) {
            txtboxPass.setText("");
        }
    }//GEN-LAST:event_txtboxPassFocusGained

    private void txtboxPassFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtboxPassFocusLost
        if (txtboxPass.getText().equals("")) {
            txtboxPass.setText("Password");
        }
    }//GEN-LAST:event_txtboxPassFocusLost

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        DatabaseClass.loginStatusRun = 1;
        boolean loginStatus = new DatabaseClass(this).login(txtboxUser.getText().toLowerCase(), txtboxPass.getText()); // code link here
        if (loginStatus) {
            JOptionPane.showMessageDialog(this, "Login Successful", "Login status", JOptionPane.INFORMATION_MESSAGE);
            MenuGUI.staticObject.setVisible(true);
            dispose();
        } else {
            if (DatabaseClass.loginStatusRun == 1) {
                JOptionPane.showMessageDialog(this, "Email or Password is incorrect", "No Account Found", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnSignupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignupActionPerformed
        new Signup_Type_GUI().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnSignupActionPerformed

    private void btnCreateAccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateAccActionPerformed
        createAccount();
    }//GEN-LAST:event_btnCreateAccActionPerformed

    private void txtboxPassSignUpFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtboxPassSignUpFocusGained
        if (txtboxPassSignUp.getText().equals("Password")) {
            txtboxPassSignUp.setText("");
        }
    }//GEN-LAST:event_txtboxPassSignUpFocusGained

    private void txtboxPassSignUpFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtboxPassSignUpFocusLost
        if (txtboxPassSignUp.getText().equals("")) {
            txtboxPassSignUp.setText("Password");
        }
    }//GEN-LAST:event_txtboxPassSignUpFocusLost

    private void txtboxUserSignupFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtboxUserSignupFocusGained
        if (txtboxUserSignup.getText().equals("Email")) {
            txtboxUserSignup.setText("");
        }
    }//GEN-LAST:event_txtboxUserSignupFocusGained

    private void txtboxUserSignupFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtboxUserSignupFocusLost
        if (txtboxUserSignup.getText().equals("")) {
            txtboxUserSignup.setText("Email");
        }
    }//GEN-LAST:event_txtboxUserSignupFocusLost

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        jTabbedPane1.remove(jPanel2);
        txtboxName.setText("Name");
        txtboxUserSignup.setText("Email");
        txtboxPassSignUp.setText("");
        numbertxtbox.setText("Contact Number");
        verifyTxtbox.setText("Verify Code");
        qualificationTxtbox.setText("Qualification(e.g. MBBS, Ph.D)");
        vlabel.setText("");
        cnictxtbox.setText("CNIC #");
        ageTxtbox.setText("Age");
        jTabbedPane1.add(jPanel1);
        jTabbedPane1.setTitleAt(0, "LOG IN");
    }//GEN-LAST:event_btnCancelActionPerformed

    private void txtboxNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtboxNameFocusGained
        if (txtboxName.getText().equals("Name")) {
            txtboxName.setText("");
        }
    }//GEN-LAST:event_txtboxNameFocusGained

    private void txtboxNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtboxNameFocusLost
        if (txtboxName.getText().equals("")) {
            txtboxName.setText("Name");
        }
    }//GEN-LAST:event_txtboxNameFocusLost

    private void radioBtnMaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioBtnMaleActionPerformed
        sex = 1;
        if (radioBtnFemale.isSelected()) {
            radioBtnFemale.setSelected(false);
        }
    }//GEN-LAST:event_radioBtnMaleActionPerformed

    private void radioBtnFemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioBtnFemaleActionPerformed
        sex = 2;
        if (radioBtnMale.isSelected()) {
            radioBtnMale.setSelected(false);
        }
    }//GEN-LAST:event_radioBtnFemaleActionPerformed

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

    private void btnLoginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginMouseEntered
        mouseFocusGained(btnLogin);
    }//GEN-LAST:event_btnLoginMouseEntered

    private void btnLoginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginMouseExited
        mouseFocusLost(btnLogin);
    }//GEN-LAST:event_btnLoginMouseExited

    private void btnSignupMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSignupMouseEntered
        mouseFocusGained(btnSignup);
    }//GEN-LAST:event_btnSignupMouseEntered

    private void btnSignupMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSignupMouseExited
        mouseFocusLost(btnSignup);
    }//GEN-LAST:event_btnSignupMouseExited

    private void btnCancelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelMouseEntered
        mouseFocusGained(btnCancel);
    }//GEN-LAST:event_btnCancelMouseEntered

    private void btnCancelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelMouseExited
        mouseFocusLost(btnCancel);
    }//GEN-LAST:event_btnCancelMouseExited

    private void btnCreateAccMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCreateAccMouseEntered
        mouseFocusGained(btnCreateAcc);
    }//GEN-LAST:event_btnCreateAccMouseEntered

    private void btnCreateAccMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCreateAccMouseExited
        mouseFocusLost(btnCreateAcc);
    }//GEN-LAST:event_btnCreateAccMouseExited

    private void numbertxtboxFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_numbertxtboxFocusGained
        if (numbertxtbox.getText().equals("Contact Number")) {
            numbertxtbox.setText("");
        }
    }//GEN-LAST:event_numbertxtboxFocusGained

    private void numbertxtboxFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_numbertxtboxFocusLost
        if (numbertxtbox.getText().equals("")) {
            numbertxtbox.setText("Contact Number");
        }
    }//GEN-LAST:event_numbertxtboxFocusLost

    private void cnictxtboxFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cnictxtboxFocusGained
        if (cnictxtbox.getText().equals("CNIC Number")) {
            cnictxtbox.setText("");
        }
    }//GEN-LAST:event_cnictxtboxFocusGained

    private void cnictxtboxFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cnictxtboxFocusLost
        if (cnictxtbox.getText().equals("")) {
            cnictxtbox.setText("CNIC Number");
        }
    }//GEN-LAST:event_cnictxtboxFocusLost

    private void ageTxtboxFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ageTxtboxFocusGained
        if (ageTxtbox.getText().equals("Age")) {
            ageTxtbox.setText("");
        }
    }//GEN-LAST:event_ageTxtboxFocusGained

    private void ageTxtboxFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ageTxtboxFocusLost
        if (ageTxtbox.getText().equals("")) {
            ageTxtbox.setText("Age");
        }
    }//GEN-LAST:event_ageTxtboxFocusLost

    private void verifyTxtboxFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_verifyTxtboxFocusGained
        if (verifyTxtbox.getText().equals("Verify Code")) {
            verifyTxtbox.setText("");
        }
    }//GEN-LAST:event_verifyTxtboxFocusGained

    private void verifyTxtboxFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_verifyTxtboxFocusLost
        if (verifyTxtbox.getText().equals("")) {
            verifyTxtbox.setText("Verify Code");
        }
    }//GEN-LAST:event_verifyTxtboxFocusLost

    private void qualificationTxtboxFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_qualificationTxtboxFocusGained
        if (qualificationTxtbox.getText().equals("Qualification (e.g. MBBS, Ph.D)")) {
            qualificationTxtbox.setText("");
        }
    }//GEN-LAST:event_qualificationTxtboxFocusGained

    private void qualificationTxtboxFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_qualificationTxtboxFocusLost
        if (qualificationTxtbox.getText().equals("")) {
            qualificationTxtbox.setText("Qualification (e.g. MBBS, Ph.D)");
        }
    }//GEN-LAST:event_qualificationTxtboxFocusLost

    private void timeTxtboxFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_timeTxtboxFocusGained
        if (timeTxtbox.getText().equals("Timing (24-hour format(e.g. 23:15))")) {
            timeTxtbox.setText("");
        }
    }//GEN-LAST:event_timeTxtboxFocusGained

    private void timeTxtboxFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_timeTxtboxFocusLost
        if (timeTxtbox.getText().equals("")) {
            timeTxtbox.setText("Timing (24-hour format(e.g. 23:15))");
        }
    }//GEN-LAST:event_timeTxtboxFocusLost

    private void dayLimitTxtboxFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dayLimitTxtboxFocusGained
        if (dayLimitTxtbox.getText().equalsIgnoreCase("Day Limit For Appointments")) {
            dayLimitTxtbox.setText("");
        }
    }//GEN-LAST:event_dayLimitTxtboxFocusGained

    private void dayLimitTxtboxFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dayLimitTxtboxFocusLost
        if (dayLimitTxtbox.getText().equals("")) {
            dayLimitTxtbox.setText("Day Limit For Appointments");
        }
    }//GEN-LAST:event_dayLimitTxtboxFocusLost

    private void createAccount() {
        String dob = "";
        try {
            int d_ = jDateChooser1.getCalendar().get(Calendar.DAY_OF_MONTH);
            int m_ = jDateChooser1.getCalendar().get(Calendar.MONTH) + 1;
            int y_ = jDateChooser1.getCalendar().get(Calendar.YEAR);
            dob = y_ + "-" + m_ + "-" + d_;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Invalid Date of Birth", "DOB Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (accType != 3) {
            if (!choice) {
                if (!txtboxName.getText().equals("Name") && !txtboxUserSignup.getText().equals("Email")
                        && !txtboxPassSignUp.getText().equals("") && !ageTxtbox.getText().equals("Age") && !numbertxtbox.getText().equals("Contact Number")
                        && !cnictxtbox.getText().equals("CNIC #") && (radioBtnFemale.isSelected() || radioBtnMale.isSelected())) {
                    if (!txtboxName.getText().matches("\\s+") && !txtboxUserSignup.getText().matches("\\s+")
                            && !txtboxPassSignUp.getText().matches("\\s+") && !verifyTxtbox.getText().matches("\\s+")
                            && !qualificationTxtbox.getText().matches("\\s+") && !ageTxtbox.getText().matches("\\s+") && !numbertxtbox.getText().matches("\\s+")
                            && !cnictxtbox.getText().equals("\\s+")) {
                        boolean signUpStatus = new DatabaseClass(this).signup(txtboxName.getText(), txtboxUserSignup.getText().toLowerCase(), txtboxPassSignUp.getText(), accType,
                                ageTxtbox.getText(), numbertxtbox.getText(), sex, professionComboBox.getSelectedItem().toString(), qualificationTxtbox.getText(),
                                cnictxtbox.getText(), days, timeTxtbox.getText(), verifyTxtbox.getText(), -1, dob);
                        if (signUpStatus) {
                            jTabbedPane1.remove(jPanel2);
                            txtboxName.setText("Name");
                            txtboxUserSignup.setText("Email");
                            txtboxPassSignUp.setText("Password");
                            jTabbedPane1.add(jPanel1);
                            jTabbedPane1.setTitleAt(0, "LOG IN");
                            JOptionPane.showMessageDialog(this, "Account created successfully", "Success", JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(this, "Some error occurred, while creating account", "Error code 201", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Invalid details", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
            if (choice) {
                int limit = -1;
                try {
                    limit = Integer.parseInt(dayLimitTxtbox.getText().replaceAll("\\s+", ""));
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(this, "Invalid Day limit", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                if (!txtboxName.getText().equals("Name") && !txtboxUserSignup.getText().equals("Email")
                        && !txtboxPassSignUp.getText().equals("") && !verifyTxtbox.getText().equals("Verify Code")
                        && !professionComboBox.getSelectedItem().toString().equals("Profession(e.g. Physician, Simple doctor)")
                        && !qualificationTxtbox.getText().equals("Qualification(e.g. MBBS, Ph.D)") && !ageTxtbox.getText().equals("Age")
                        && !numbertxtbox.getText().equals("Contact Number") && !cnictxtbox.getText().equals("CNIC #")
                        && !timeTxtbox.getText().equals("Timing (24-hour format(e.g. 23:15))") && (radioBtnFemale.isSelected() || radioBtnMale.isSelected())) {
                    if (!txtboxName.getText().matches("\\s+") && !txtboxUserSignup.getText().matches("\\s+")
                            && !txtboxPassSignUp.getText().matches("\\s+") && !verifyTxtbox.getText().matches("\\s+")
                            && !qualificationTxtbox.getText().matches("\\s+") && !ageTxtbox.getText().matches("\\s+") && !numbertxtbox.getText().matches("\\s+")
                            && !cnictxtbox.getText().equals("\\s+") && !timeTxtbox.getText().matches("\\s+")) {
                        boolean signUpStatus = new DatabaseClass(this).signup(txtboxName.getText(), txtboxUserSignup.getText().toLowerCase(), txtboxPassSignUp.getText(),
                                accType, ageTxtbox.getText(), numbertxtbox.getText(), sex, professionComboBox.getSelectedItem().toString(),
                                qualificationTxtbox.getText(), cnictxtbox.getText(), days, timeTxtbox.getText(), verifyTxtbox.getText(), limit, dob);
                        if (signUpStatus) {
                            vlabel.setText("Code verified!");
                            jTabbedPane1.remove(jPanel2);
                            txtboxName.setText("Name");
                            txtboxUserSignup.setText("Email");
                            txtboxPassSignUp.setText("Password");
                            jTabbedPane1.add(jPanel1);
                            jTabbedPane1.setTitleAt(0, "LOG IN");
                            JOptionPane.showMessageDialog(this, "Account created successfully", "Success", JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            vlabel.setText("Incorrect code!");
                            JOptionPane.showMessageDialog(this, "Some error occurred, while creating account", "Error code 201", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Invalid details", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        } else {
            if (!txtboxName.getText().equals("Name") && !txtboxUserSignup.getText().equals("Email")
                    && !txtboxPassSignUp.getText().equals("") && !verifyTxtbox.getText().equals("Verify Code")
                    && !ageTxtbox.getText().equals("Age")
                    && !numbertxtbox.getText().equals("Contact Number") && !cnictxtbox.getText().equals("CNIC #")
                    && (radioBtnFemale.isSelected() || radioBtnMale.isSelected())) {
                if (!txtboxName.getText().matches("\\s+") && !txtboxUserSignup.getText().matches("\\s+")
                        && !txtboxPassSignUp.getText().matches("\\s+") && !verifyTxtbox.getText().matches("\\s+")
                        && !ageTxtbox.getText().matches("\\s+") && !numbertxtbox.getText().matches("\\s+")
                        && !cnictxtbox.getText().equals("\\s+")) {
                    boolean signupStatus = new DatabaseClass(this).signup(txtboxName.getText(), txtboxUserSignup.getText().toLowerCase(),
                            txtboxPassSignUp.getText(), accType, ageTxtbox.getText(),
                            numbertxtbox.getText(), sex, null, null, cnictxtbox.getText(), null, null, verifyTxtbox.getText(), -1, dob);
                    if (signupStatus) {
                        vlabel.setText("Code verified!");
                        jTabbedPane1.remove(jPanel2);
                        txtboxName.setText("Name");
                        txtboxUserSignup.setText("Email");
                        txtboxPassSignUp.setText("Password");
                        jTabbedPane1.add(jPanel1);
                        jTabbedPane1.setTitleAt(0, "LOG IN");
                        JOptionPane.showMessageDialog(this, "Account created successfully", "Success", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        vlabel.setText("Incorrect code!");
                        JOptionPane.showMessageDialog(this, "Some error occurred, while creating account", "Error code 201", JOptionPane.ERROR_MESSAGE);
                    }
                }

            }
        }
    }

    private void close(java.awt.event.WindowEvent evt) {
        if (!jTabbedPane1.getTitleAt(0).equals("SIGN UP")) {
            this.dispose();
            if (isEndSplashDisplay) {
                BackendPackage.MenuGUI.exit = true;
                BackendPackage.MenuGUI.staticObject.dispose();
                new SplashPackage.ClosingSplashGUI().setVisible(true);
            }
        } else {
            jTabbedPane1.remove(jPanel2);
            txtboxName.setText("Name");
            txtboxUserSignup.setText("Email");
            txtboxPassSignUp.setText("");
            numbertxtbox.setText("Contact Number");
            verifyTxtbox.setText("Verify Code");
            qualificationTxtbox.setText("Qualification(e.g. MBBS, Ph.D)");
            vlabel.setText("");
            cnictxtbox.setText("CNIC #");
            ageTxtbox.setText("Age");
            jTabbedPane1.add(jPanel1);
            jTabbedPane1.setTitleAt(0, "LOG IN");
        }
    }

    private void mouseFocusGained(JButton btn) {
        btn.setForeground(Color.black);
        btn.setContentAreaFilled(true);
    }

    private void mouseFocusLost(JButton btn) {
        btn.setForeground(Color.white);
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
            java.util.logging.Logger.getLogger(Login_Signup_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login_Signup_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login_Signup_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login_Signup_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            boolean choice1;

            @Override
            public void run() {
                new Login_Signup_GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ageTxtbox;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnCreateAcc;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnSignup;
    private javax.swing.JTextField cnictxtbox;
    private javax.swing.JRadioButton day2;
    private javax.swing.JRadioButton day3;
    private javax.swing.JRadioButton day4;
    private javax.swing.JRadioButton day5;
    private javax.swing.JRadioButton day6;
    private javax.swing.JRadioButton day7;
    private javax.swing.JTextField dayLimitTxtbox;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButton9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField numbertxtbox;
    private javax.swing.JComboBox<String> professionComboBox;
    private javax.swing.JTextField qualificationTxtbox;
    private javax.swing.JRadioButton radioBtnFemale;
    private javax.swing.JRadioButton radioBtnMale;
    private javax.swing.JTextField timeTxtbox;
    private javax.swing.JTextField txtboxName;
    private javax.swing.JPasswordField txtboxPass;
    private javax.swing.JPasswordField txtboxPassSignUp;
    private javax.swing.JTextField txtboxUser;
    private javax.swing.JTextField txtboxUserSignup;
    private javax.swing.JTextField verifyTxtbox;
    public static javax.swing.JTextField vlabel;
    // End of variables declaration//GEN-END:variables
}
