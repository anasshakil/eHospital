package BackendPackage;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class MenuGUI extends javax.swing.JFrame {
    
    public static MenuGUI staticObject;
    protected static boolean emergency = false;
    protected static boolean alert = false;
    private String email, pass, name, AccountType;
    protected static boolean exit = false;
    private boolean isDoctor = false;
    private boolean isAdmin = false;
    private Thread threadAdminUpdate;
    private Thread threadDoctorUpdate;
    private static boolean oneRegularCheck = true;
    
    public MenuGUI() {
        initComponents();
        this.setSize(919, 382);
        getContentPane().setBackground(Color.white);
    }
    
    public MenuGUI(String email, String name, String acctype, boolean isDoctor, boolean isAdmin) {
        initComponents();
        try {
            BufferedImage img1 = ImageIO.read(getClass().getResource("/Icons/Hospital_3_48px.png"));
            setIconImage(img1);
        } catch (IOException e) {
        }
        getContentPane().setBackground(Color.WHITE);
        pack();
        this.setSize(908, 322);
        setLocationRelativeTo(null);
        lblSirenImage.setVisible(false);
        btnDRPrescription.setEnabled(false);
        lblAccountName.setText(name);
        btnNewPharmacyInventory.setVisible(false);
        Login_Signup_GUI.isEndSplashDisplay = true;
        menuItemChangeDayLimit.setEnabled(false);
        menuItemChangeDayLimit.setVisible(false);
        this.email = email;
        this.name = name;
        this.AccountType = acctype;
        if (isDoctor) {
            this.isDoctor = isDoctor;
            btnDRPrescription.setEnabled(true);
            menuItemChangeDayLimit.setEnabled(true);
            menuItemChangeDayLimit.setVisible(true);
            lblSirenImage.setToolTipText("Emergency");
            lblSirenImage.setVisible(true);
            doctorUpdates();
        }
        if (isAdmin) {
            setSize(908, 525);
            this.isAdmin = isAdmin;
            btnNewPharmacyInventory.setVisible(true);
            lblSirenImage.setIcon(new ImageIcon(getClass().getResource("/Icons/alert_off.png")));
            lblSirenImage.setToolTipText("Alerts");
            lblSirenImage.setVisible(true);
//            btnFeedback.setEnabled(false);
//            btnFeedback.setVisible(false);
            adminUpdates();
        }
        setResizable(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        btnEmergency = new javax.swing.JButton();
        btnPharmacy = new javax.swing.JButton();
        btnDRPrescription = new javax.swing.JButton();
        btnSchedule = new javax.swing.JButton();
        btnAbout = new javax.swing.JButton();
        btnPrescriptionHisptory = new javax.swing.JButton();
        btnNewPharmacyInventory = new javax.swing.JButton();
        btnEmergency2 = new javax.swing.JButton();
        btnUpdateDayAppointmentLimit = new javax.swing.JButton();
        btnFeedback = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        AccPictureLbl = new javax.swing.JLabel();
        lblAccountName = new javax.swing.JLabel();
        lblSirenImage = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        menuItemChangePassword = new javax.swing.JMenuItem();
        menuItemResponses = new javax.swing.JMenuItem();
        menuItemChangeDayLimit = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("eHospital");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new java.awt.BorderLayout(0, 5));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        btnEmergency.setBackground(new java.awt.Color(255, 255, 255));
        btnEmergency.setFont(new java.awt.Font("Segoe UI Light", 0, 15)); // NOI18N
        btnEmergency.setForeground(new java.awt.Color(0, 51, 255));
        btnEmergency.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Ambulance_96px.png"))); // NOI18N
        btnEmergency.setText("Emergency");
        btnEmergency.setToolTipText("Emergency");
        btnEmergency.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(85, 85, 85), 1, true));
        btnEmergency.setContentAreaFilled(false);
        btnEmergency.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEmergency.setIconTextGap(40);
        btnEmergency.setOpaque(true);
        btnEmergency.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEmergency.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEmergencyMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEmergencyMouseExited(evt);
            }
        });
        btnEmergency.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmergencyActionPerformed(evt);
            }
        });

        btnPharmacy.setBackground(new java.awt.Color(255, 255, 255));
        btnPharmacy.setFont(new java.awt.Font("Segoe UI Light", 0, 15)); // NOI18N
        btnPharmacy.setForeground(new java.awt.Color(0, 51, 255));
        btnPharmacy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Pill_96px_1.png"))); // NOI18N
        btnPharmacy.setText("Online Pharmacy");
        btnPharmacy.setToolTipText("Online Pharmacy");
        btnPharmacy.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(85, 85, 85), 1, true));
        btnPharmacy.setContentAreaFilled(false);
        btnPharmacy.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPharmacy.setIconTextGap(40);
        btnPharmacy.setOpaque(true);
        btnPharmacy.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnPharmacy.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnPharmacyMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnPharmacyMouseExited(evt);
            }
        });
        btnPharmacy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPharmacyActionPerformed(evt);
            }
        });

        btnDRPrescription.setBackground(new java.awt.Color(255, 255, 255));
        btnDRPrescription.setFont(new java.awt.Font("Segoe UI Light", 0, 15)); // NOI18N
        btnDRPrescription.setForeground(new java.awt.Color(0, 51, 255));
        btnDRPrescription.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Create_Prescription_96px.png"))); // NOI18N
        btnDRPrescription.setText("Issue Prescription");
        btnDRPrescription.setToolTipText("Issue Prescription");
        btnDRPrescription.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(85, 85, 85), 1, true));
        btnDRPrescription.setContentAreaFilled(false);
        btnDRPrescription.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDRPrescription.setIconTextGap(40);
        btnDRPrescription.setOpaque(true);
        btnDRPrescription.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnDRPrescription.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDRPrescriptionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDRPrescriptionMouseExited(evt);
            }
        });
        btnDRPrescription.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDRPrescriptionActionPerformed(evt);
            }
        });

        btnSchedule.setBackground(new java.awt.Color(255, 255, 255));
        btnSchedule.setFont(new java.awt.Font("Segoe UI Light", 0, 15)); // NOI18N
        btnSchedule.setForeground(new java.awt.Color(0, 51, 255));
        btnSchedule.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Schedule_96px.png"))); // NOI18N
        btnSchedule.setText("Schedule Appointment");
        btnSchedule.setToolTipText("Schedule Appointment");
        btnSchedule.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(85, 85, 85), 1, true));
        btnSchedule.setContentAreaFilled(false);
        btnSchedule.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSchedule.setIconTextGap(40);
        btnSchedule.setOpaque(true);
        btnSchedule.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSchedule.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnScheduleMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnScheduleMouseExited(evt);
            }
        });
        btnSchedule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnScheduleActionPerformed(evt);
            }
        });

        btnAbout.setBackground(new java.awt.Color(255, 255, 255));
        btnAbout.setFont(new java.awt.Font("Segoe UI Light", 0, 15)); // NOI18N
        btnAbout.setForeground(new java.awt.Color(0, 51, 255));
        btnAbout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Info_96px.png"))); // NOI18N
        btnAbout.setText("About");
        btnAbout.setToolTipText("About");
        btnAbout.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(85, 85, 85), 1, true));
        btnAbout.setContentAreaFilled(false);
        btnAbout.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAbout.setIconTextGap(40);
        btnAbout.setOpaque(true);
        btnAbout.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAbout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAboutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAboutMouseExited(evt);
            }
        });
        btnAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAboutActionPerformed(evt);
            }
        });

        btnPrescriptionHisptory.setBackground(new java.awt.Color(255, 255, 255));
        btnPrescriptionHisptory.setFont(new java.awt.Font("Segoe UI Light", 0, 15)); // NOI18N
        btnPrescriptionHisptory.setForeground(new java.awt.Color(0, 51, 255));
        btnPrescriptionHisptory.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Prescription_History_96px.png"))); // NOI18N
        btnPrescriptionHisptory.setText("Prescription History");
        btnPrescriptionHisptory.setToolTipText("Prescription History");
        btnPrescriptionHisptory.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(85, 85, 85), 1, true));
        btnPrescriptionHisptory.setContentAreaFilled(false);
        btnPrescriptionHisptory.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPrescriptionHisptory.setIconTextGap(40);
        btnPrescriptionHisptory.setOpaque(true);
        btnPrescriptionHisptory.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnPrescriptionHisptory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnPrescriptionHisptoryMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnPrescriptionHisptoryMouseExited(evt);
            }
        });
        btnPrescriptionHisptory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrescriptionHisptoryActionPerformed(evt);
            }
        });

        btnNewPharmacyInventory.setBackground(new java.awt.Color(255, 255, 255));
        btnNewPharmacyInventory.setFont(new java.awt.Font("Segoe UI Light", 0, 15)); // NOI18N
        btnNewPharmacyInventory.setForeground(new java.awt.Color(0, 51, 255));
        btnNewPharmacyInventory.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Ambulance_96px.png"))); // NOI18N
        btnNewPharmacyInventory.setText("Add Pharmacy Inventory");
        btnNewPharmacyInventory.setToolTipText("Add New Medicines");
        btnNewPharmacyInventory.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(85, 85, 85), 1, true));
        btnNewPharmacyInventory.setContentAreaFilled(false);
        btnNewPharmacyInventory.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnNewPharmacyInventory.setIconTextGap(40);
        btnNewPharmacyInventory.setOpaque(true);
        btnNewPharmacyInventory.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnNewPharmacyInventory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnNewPharmacyInventoryMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnNewPharmacyInventoryMouseExited(evt);
            }
        });
        btnNewPharmacyInventory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewPharmacyInventoryActionPerformed(evt);
            }
        });

        btnEmergency2.setBackground(new java.awt.Color(255, 255, 255));
        btnEmergency2.setFont(new java.awt.Font("Segoe UI Light", 0, 15)); // NOI18N
        btnEmergency2.setForeground(new java.awt.Color(0, 51, 255));
        btnEmergency2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Ambulance_96px.png"))); // NOI18N
        btnEmergency2.setText("All Pharmacy Inventory");
        btnEmergency2.setToolTipText("FeedBack/Complains");
        btnEmergency2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(85, 85, 85), 1, true));
        btnEmergency2.setContentAreaFilled(false);
        btnEmergency2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEmergency2.setIconTextGap(40);
        btnEmergency2.setOpaque(true);
        btnEmergency2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEmergency2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEmergency2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEmergency2MouseExited(evt);
            }
        });
        btnEmergency2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmergency2ActionPerformed(evt);
            }
        });

        btnUpdateDayAppointmentLimit.setBackground(new java.awt.Color(255, 255, 255));
        btnUpdateDayAppointmentLimit.setFont(new java.awt.Font("Segoe UI Light", 0, 15)); // NOI18N
        btnUpdateDayAppointmentLimit.setForeground(new java.awt.Color(0, 51, 255));
        btnUpdateDayAppointmentLimit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Ambulance_96px.png"))); // NOI18N
        btnUpdateDayAppointmentLimit.setText("Udpate Appointment Limit");
        btnUpdateDayAppointmentLimit.setToolTipText("Appointment Day Limit");
        btnUpdateDayAppointmentLimit.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(85, 85, 85), 1, true));
        btnUpdateDayAppointmentLimit.setContentAreaFilled(false);
        btnUpdateDayAppointmentLimit.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnUpdateDayAppointmentLimit.setIconTextGap(30);
        btnUpdateDayAppointmentLimit.setOpaque(true);
        btnUpdateDayAppointmentLimit.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnUpdateDayAppointmentLimit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnUpdateDayAppointmentLimitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnUpdateDayAppointmentLimitMouseExited(evt);
            }
        });
        btnUpdateDayAppointmentLimit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateDayAppointmentLimitActionPerformed(evt);
            }
        });

        btnFeedback.setBackground(new java.awt.Color(255, 255, 255));
        btnFeedback.setFont(new java.awt.Font("Segoe UI Light", 0, 15)); // NOI18N
        btnFeedback.setForeground(new java.awt.Color(0, 51, 255));
        btnFeedback.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Ambulance_96px.png"))); // NOI18N
        btnFeedback.setText("Feedback");
        btnFeedback.setToolTipText("Appointment Day Limit");
        btnFeedback.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(85, 85, 85), 1, true));
        btnFeedback.setContentAreaFilled(false);
        btnFeedback.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnFeedback.setIconTextGap(30);
        btnFeedback.setOpaque(true);
        btnFeedback.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnFeedback.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnFeedbackMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnFeedbackMouseExited(evt);
            }
        });
        btnFeedback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFeedbackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnNewPharmacyInventory, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEmergency, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnEmergency2, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                    .addComponent(btnPharmacy, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnDRPrescription, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnUpdateDayAppointmentLimit, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE))
                .addGap(0, 0, 0)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnSchedule, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                    .addComponent(btnFeedback, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0)
                .addComponent(btnPrescriptionHisptory, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnAbout, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnEmergency, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                    .addComponent(btnPharmacy, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDRPrescription, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSchedule, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPrescriptionHisptory, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAbout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnNewPharmacyInventory, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEmergency2, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpdateDayAppointmentLimit, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFeedback, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jPanel2.setMinimumSize(new java.awt.Dimension(50, 50));

        AccPictureLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/User_50px.png"))); // NOI18N

        lblAccountName.setFont(new java.awt.Font("Segoe UI Light", 0, 17)); // NOI18N
        lblAccountName.setText("Account");

        lblSirenImage.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblSirenImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/siren_off.png"))); // NOI18N
        lblSirenImage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSirenImageMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(AccPictureLbl)
                .addGap(5, 5, 5)
                .addComponent(lblAccountName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 757, Short.MAX_VALUE)
                .addComponent(lblSirenImage)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lblAccountName))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSirenImage)
                    .addComponent(AccPictureLbl)))
        );

        getContentPane().add(jPanel2, java.awt.BorderLayout.PAGE_START);

        jMenu1.setText("File");

        jMenuItem1.setBackground(new java.awt.Color(255, 255, 255));
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/User_32px.png"))); // NOI18N
        jMenuItem1.setText("Logout");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");

        menuItemChangePassword.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        menuItemChangePassword.setBackground(new java.awt.Color(255, 255, 255));
        menuItemChangePassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Key_32px.png"))); // NOI18N
        menuItemChangePassword.setText("Change password");
        menuItemChangePassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemChangePasswordActionPerformed(evt);
            }
        });
        jMenu2.add(menuItemChangePassword);

        menuItemResponses.setText("Responses");
        menuItemResponses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemResponsesActionPerformed(evt);
            }
        });
        jMenu2.add(menuItemResponses);

        menuItemChangeDayLimit.setText("Request Appointment Limit Update");
        menuItemChangeDayLimit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemChangeDayLimitActionPerformed(evt);
            }
        });
        jMenu2.add(menuItemChangeDayLimit);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEmergencyMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEmergencyMouseEntered
        mouseFocusGained(btnEmergency);
    }//GEN-LAST:event_btnEmergencyMouseEntered

    private void btnEmergencyMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEmergencyMouseExited
        mouseFocusLost(btnEmergency);
    }//GEN-LAST:event_btnEmergencyMouseExited

    private void btnPharmacyMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPharmacyMouseEntered
        mouseFocusGained(btnPharmacy);
    }//GEN-LAST:event_btnPharmacyMouseEntered

    private void btnPharmacyMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPharmacyMouseExited
        mouseFocusLost(btnPharmacy);
    }//GEN-LAST:event_btnPharmacyMouseExited

    private void btnScheduleMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnScheduleMouseEntered
        mouseFocusGained(btnSchedule);
    }//GEN-LAST:event_btnScheduleMouseEntered

    private void btnScheduleMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnScheduleMouseExited
        mouseFocusLost(btnSchedule);
    }//GEN-LAST:event_btnScheduleMouseExited

    private void btnAboutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAboutMouseEntered
        mouseFocusGained(btnAbout);
    }//GEN-LAST:event_btnAboutMouseEntered

    private void btnAboutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAboutMouseExited
        mouseFocusLost(btnAbout);
    }//GEN-LAST:event_btnAboutMouseExited

    private void btnPharmacyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPharmacyActionPerformed
        Pharmacy_GUI.staticObject = new Pharmacy_GUI(email, name);
        Pharmacy_GUI.staticObject.setVisible(true);
        MenuGUI.staticObject.setVisible(false);
    }//GEN-LAST:event_btnPharmacyActionPerformed

    private void btnDRPrescriptionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDRPrescriptionMouseEntered
        mouseFocusGained(btnDRPrescription);
    }//GEN-LAST:event_btnDRPrescriptionMouseEntered

    private void btnDRPrescriptionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDRPrescriptionMouseExited
        mouseFocusLost(btnDRPrescription);
    }//GEN-LAST:event_btnDRPrescriptionMouseExited

    private void btnDRPrescriptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDRPrescriptionActionPerformed
        CreatePrescriptionGUI.staticObject = new CreatePrescriptionGUI(email, name);
        CreatePrescriptionGUI.staticObject.setVisible(true);
        MenuGUI.staticObject.setVisible(false);
    }//GEN-LAST:event_btnDRPrescriptionActionPerformed

    private void btnAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAboutActionPerformed
        JOptionPane.showMessageDialog(this, "Developed & created by\nAhmed Anas Shakil\nDaniyal Ahmed Malik\nAbdullah Bin Hussain", "About", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnAboutActionPerformed

    private void btnEmergencyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmergencyActionPerformed
        new PatientEmergencyGUI(email, name).setVisible(true);
    }//GEN-LAST:event_btnEmergencyActionPerformed

    private void menuItemChangePasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemChangePasswordActionPerformed
        new ChangePasswordGUI(email, name).setVisible(true);
        MenuGUI.staticObject.setVisible(false);
    }//GEN-LAST:event_menuItemChangePasswordActionPerformed

    private void lblSirenImageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSirenImageMouseClicked
        if (isDoctor) {
            if (emergency) {
                new EmergencyCasesDetailsDoctor(email, name).setVisible(true);
                MenuGUI.staticObject.setVisible(false);
            } else {
                JOptionPane.showMessageDialog(this, "No emergency case", "EMERGENCY", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        if (isAdmin) {
            if (alert) {
                new AdminAlertDisplayGUI(email, name).setVisible(true);
                MenuGUI.staticObject.setVisible(false);
            } else {
                JOptionPane.showMessageDialog(this, "No Alerts", "ALERTS", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_lblSirenImageMouseClicked

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        int optn = JOptionPane.showConfirmDialog(this, "Do you want to logout ?", "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
        if (optn == JOptionPane.YES_OPTION) {
            if (isDoctor || isAdmin) {
                exit = true;
                threadAdminUpdate = null;
                threadDoctorUpdate = null;
            }
            MenuGUI.staticObject.dispose();
            new Login_Signup_GUI().setVisible(true);
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        close();
    }//GEN-LAST:event_formWindowClosing

    private void btnPrescriptionHisptoryMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPrescriptionHisptoryMouseEntered
        mouseFocusGained(btnPrescriptionHisptory);
    }//GEN-LAST:event_btnPrescriptionHisptoryMouseEntered

    private void btnPrescriptionHisptoryMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPrescriptionHisptoryMouseExited
        mouseFocusLost(btnPrescriptionHisptory);
    }//GEN-LAST:event_btnPrescriptionHisptoryMouseExited

    private void btnPrescriptionHisptoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrescriptionHisptoryActionPerformed
        MenuGUI.staticObject.setVisible(false);
        PrescriptionsHistoryGUI.staticObject = new PrescriptionsHistoryGUI(email, name);
        PrescriptionsHistoryGUI.staticObject.setVisible(true);
    }//GEN-LAST:event_btnPrescriptionHisptoryActionPerformed

    private void btnScheduleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnScheduleActionPerformed
        if (AccountType.equalsIgnoreCase("doctor")) {
//            new appointmentstoday(email).setVisible(true);
            new AppointmentDoctorGUI(email, name).setVisible(true);
        } else {
            new AppointmentPatientGUI(email, name).setVisible(true);
        }
        MenuGUI.staticObject.setVisible(false);
    }//GEN-LAST:event_btnScheduleActionPerformed

    private void btnNewPharmacyInventoryMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNewPharmacyInventoryMouseEntered
        mouseFocusGained(btnNewPharmacyInventory);
    }//GEN-LAST:event_btnNewPharmacyInventoryMouseEntered

    private void btnNewPharmacyInventoryMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNewPharmacyInventoryMouseExited
        mouseFocusLost(btnNewPharmacyInventory);
    }//GEN-LAST:event_btnNewPharmacyInventoryMouseExited

    private void btnNewPharmacyInventoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewPharmacyInventoryActionPerformed
        new PharmacyInventoryGUI(email, name).setVisible(true);
        staticObject.setVisible(false);
    }//GEN-LAST:event_btnNewPharmacyInventoryActionPerformed

    private void btnEmergency2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEmergency2MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEmergency2MouseEntered

    private void btnEmergency2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEmergency2MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEmergency2MouseExited

    private void btnEmergency2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmergency2ActionPerformed
        if (isAdmin) {
            new DisplayAllMedicinesListGUI(email, name).setVisible(true);
            staticObject.setVisible(false);
        }
    }//GEN-LAST:event_btnEmergency2ActionPerformed

    private void btnUpdateDayAppointmentLimitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdateDayAppointmentLimitMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUpdateDayAppointmentLimitMouseEntered

    private void btnUpdateDayAppointmentLimitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdateDayAppointmentLimitMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUpdateDayAppointmentLimitMouseExited

    private void btnUpdateDayAppointmentLimitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateDayAppointmentLimitActionPerformed
        if (isAdmin) {
            new AdminRequestReceptionGUI(this, email, name).setVisible(true);
//new ChangeAppointmentDayLimitGUI(this, email, name).setVisible(true);
            setVisible(false);
        }
    }//GEN-LAST:event_btnUpdateDayAppointmentLimitActionPerformed

    private void menuItemChangeDayLimitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemChangeDayLimitActionPerformed
        if (isDoctor) {
            new RequestAppointmentLimitChangeGUI(this, email, name).setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_menuItemChangeDayLimitActionPerformed

    private void menuItemResponsesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemResponsesActionPerformed
        new ResponsesFetchGUI(this, email, name).setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_menuItemResponsesActionPerformed

    private void btnFeedbackMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFeedbackMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnFeedbackMouseEntered

    private void btnFeedbackMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFeedbackMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnFeedbackMouseExited

    private void btnFeedbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFeedbackActionPerformed
        if(!isAdmin){
            new FeedbackGUI(this, email, name).setVisible(true);
        }else{
            new FeedbackFetcherGUI(this, email, name).setVisible(true);
        }
        setVisible(false);
    }//GEN-LAST:event_btnFeedbackActionPerformed
    
    private void close() {
        exit = true;
        threadAdminUpdate = null;
        threadDoctorUpdate = null;
        staticObject.dispose();
        new SplashPackage.ClosingSplashGUI().setVisible(true);
    }
    
    private void mouseFocusGained(JButton btn) {
        btn.setContentAreaFilled(true);
    }
    
    private void mouseFocusLost(JButton btn) {
        btn.setContentAreaFilled(false);
        btn.setOpaque(true);
    }
    
    protected void doctorUpdates() {
        try {
            threadDoctorUpdate = new Thread() {
                @Override
                public void run() {
                    while (true) {
                        if (exit) {
                            break;
                        }
                        DatabaseClass db = new DatabaseClass(null);
                        try {
                            boolean status = db.emergency_update(email, false);
                            if (status) {
                                lblSirenImage.setIcon(new ImageIcon(getClass().getResource("/Icons/siren.gif")));
                                emergency = true;
                                JOptionPane.showMessageDialog(staticObject, "Dr. " + name + " you've recived an emergency case", "EMERGENCY", JOptionPane.WARNING_MESSAGE);
                                break;
                            } else {
                                emergency = false;
                                lblSirenImage.setIcon((new ImageIcon(getClass().getResource("/Icons/siren_off.png"))));
                            }
                            db.closeConnection();
                            try {
                                Thread.sleep(15000); // 15 seconds delay interval after every refresh
                            } catch (Exception e) {
                            }
                        } catch (Exception e) {
                            db.closeConnection();
                        }
                    }
                }
            };
            threadDoctorUpdate.start();
        } catch (Exception e) {
        }
    }
    
    protected void adminUpdates() {
        try {
            threadAdminUpdate = new Thread() {
                @Override
                public void run() {
                    while (true) {
                        if (exit) {
                            break;
                        }
                        DatabaseClass db = new DatabaseClass(null);
                        try {
                            boolean status = db.alertUpdate(email, false, oneRegularCheck);
                            oneRegularCheck = false;
                            if (status) {
                                lblSirenImage.setIcon(new ImageIcon(getClass().getResource("/Icons/alert_on.gif")));
                                alert = true;
                                db.closeConnection();
                                JOptionPane.showMessageDialog(staticObject, "Admin you've recived an alert", "ALERT", JOptionPane.WARNING_MESSAGE);
                                break;
                            } else {
                                alert = false;
                                lblSirenImage.setIcon((new ImageIcon(getClass().getResource("/Icons/alert_off.png"))));
                            }
                            db.closeConnection();
                            try {
                                Thread.sleep(15000); // 15 seconds delay interval after every refresh
                            } catch (Exception e) {
                            }
                        } catch (Exception e) {
                            db.closeConnection();
                        }
                    }
                }
            };
            threadAdminUpdate.start();
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
            java.util.logging.Logger.getLogger(MenuGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                MenuGUI.staticObject = new MenuGUI();
                staticObject.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AccPictureLbl;
    private javax.swing.JButton btnAbout;
    private javax.swing.JButton btnDRPrescription;
    private javax.swing.JButton btnEmergency;
    private javax.swing.JButton btnEmergency2;
    private javax.swing.JButton btnFeedback;
    private javax.swing.JButton btnNewPharmacyInventory;
    private javax.swing.JButton btnPharmacy;
    private javax.swing.JButton btnPrescriptionHisptory;
    private javax.swing.JButton btnSchedule;
    private javax.swing.JButton btnUpdateDayAppointmentLimit;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    public static javax.swing.JLabel lblAccountName;
    public static javax.swing.JLabel lblSirenImage;
    private javax.swing.JMenuItem menuItemChangeDayLimit;
    private javax.swing.JMenuItem menuItemChangePassword;
    private javax.swing.JMenuItem menuItemResponses;
    // End of variables declaration//GEN-END:variables
}
