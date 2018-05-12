/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Reg_Tools | Templates
 * and open the template in the editor.
 */
package view;

import database.MysqlConnect;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Sachintha
 */
public class Reg_Stores extends javax.swing.JFrame {

    private final MysqlConnect _dbConnection;
    private final SimpleDateFormat dateformat;
    private DefaultListModel dataModel;

    /**
     * Creates new form Stores_Registration
     */
    public Reg_Stores() {
        _dbConnection = MysqlConnect.getDbCon();
        dateformat = new SimpleDateFormat("yyyy-MM-dd");
        GetStore();
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        Clocklbl = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnEmp = new javax.swing.JButton();
        btnSto = new javax.swing.JButton();
        btnSup = new javax.swing.JButton();
        btnCli = new javax.swing.JButton();
        btnVeh = new javax.swing.JButton();
        btnToo = new javax.swing.JButton();
        btnIte = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtstoresid = new javax.swing.JTextField();
        txtname = new javax.swing.JTextField();
        txtaddress = new javax.swing.JTextField();
        txtconnumber = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jComboBox1 = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtofzin = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        store_list = new javax.swing.JList(dataModel);
        jButton8 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(3, 38, 91));

        Clocklbl.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        Clocklbl.setForeground(new java.awt.Color(255, 255, 255));
        Clocklbl.setText("jLabel2");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/Untitl1.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Arial Narrow", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 255));
        jLabel1.setText("      Bhaghya Constructions(PVT)Ltd.");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/Setting.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 166, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 595, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Clocklbl, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(Clocklbl)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(3, 38, 91));

        btnEmp.setText("Employee Registration");
        btnEmp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEmpMouseClicked(evt);
            }
        });
        btnEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmpActionPerformed(evt);
            }
        });

        btnSto.setText("Stores Registration");
        btnSto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStoActionPerformed(evt);
            }
        });

        btnSup.setText("Supplier Registration");
        btnSup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSupActionPerformed(evt);
            }
        });

        btnCli.setText("Client Registration");
        btnCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCliActionPerformed(evt);
            }
        });

        btnVeh.setText("Vehicle Registration");
        btnVeh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVehActionPerformed(evt);
            }
        });

        btnToo.setText("Tools Registration");
        btnToo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTooActionPerformed(evt);
            }
        });

        btnIte.setText("Item Registration");
        btnIte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnIte, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSto, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSup, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCli, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVeh, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnToo, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(btnEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSto, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSup, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCli, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnVeh, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnToo, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnIte, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        jLabel2.setText("Name");

        jLabel9.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        jLabel9.setText("Stores-ID");

        jLabel14.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel14.setText("Stores Registration");

        txtconnumber.setText("+94-XXXXXXXXXX");
        txtconnumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtconnumberActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        jLabel18.setText("Date of registartion");

        jLabel19.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        jLabel19.setText("Contact Number");

        jLabel20.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        jLabel20.setText("Stores Type");

        jLabel21.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        jLabel21.setText("Address");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Adz Worker", "Air Breaker Operator", "Air Drill Operator", "Air Gun Operator", "Air Hammer Operator", "Air Tool Operator", "Aluminum Pool Installer", "Asbestos Removal Worker", "Asphalt Distributor Tender", "Asphalt Heater Tender", "Asphalt Layer", "Asphalt Patcher", "Asphalt Paver", "Asphalt Raker", "Asphalt Smoother", "Asphalt Spreader", "Asphalt Tamper", "Asphalt Worker", "Auxiliary Equipment Tender", "Awning Hanger", "Awning Maker and Installer", "Axman", "Batch Dumper", "Beller", "Bellman", "Belter", "Beltman", "Biofuels Plant Construction Worker", "Black Top Raker", "Black Topper", "Bottom Man", "Bottom Worker", "Breast Worker", "Bridge Builder", "Broom Man", "Broom Worker", "Brush Cutter", "Building Cleaner", "Bull Float Finisher", "Burlap Man", "Burlap Worker", "Caisson Worker", "Cement Based Materials Pump Tender", "Cement Breake", "Cement Cutter", "Cement Mixer", "Chuck Tender", "Cinder Crew Worker", "Circular Saw Operator", "Cleaner", "Column Precaster", "Concrete Building Assembler", "Concrete Buster Operator", "Concrete Curer", "Concrete Handler", "Concrete Layer", "Concrete Mixer", "Concrete Pourer", "Concrete Puddler", "Concrete Spreader", "Concrete Vibrator Operator", "Concrete Worker", "Connection Worker", "Construction Coordinator", "Construction Craft Laborer", "Construction Inspector", "Construction Laborer", "Construction or Leak Gang Laborer", "Construction Person", "Construction Pit Worker", "Construction Trench Digger", "Construction Worker", "Core-Drill Operator", "ulvert Installer", "Curb and Gutter Laborer", "Demlition Hammer Operator", "Demolition Specialist", "Demolition Worker", "Demolitionist", "Digger", "Dirt Shoveler", "Ditch Digger", "Ditch Repairer", "Ditch Rider", "Ditcher", "Dope Pourer", "Dopeman", "Doper", "Dowel Pin Man", "Dowel Pin Worker", "Drain Layer", "Drapery Hanger", "Dredge Pipe Operator", "Dredge Pipeman", "Drifter", "Driller Helper", "Drop Crew Laborer", "Dust Handler", "Earth Mover", "Fence Post Driver", "Fire Pot Operator", "Flare Man", "Flare Worker", "Form Stripper", "General Laborer", "Grade Checker", "Grade Tamper", "Grader", "Gravel Screener", "Grit Blaster", "Grommet Man", "Grommet Worker", "Ground Hand", "Ground Worker", "Groundman", "Groundsman", "Grout Machine Operator", "Grout Worker", "Groutman", "Grunt", "Handyman", "Helper", "High Man", "High Worker", "Hod Carrier", "Hole Digger", "Home Performance Laborer", "Hose Operator", "Hoseman", "House Mover Helper", "Hydraulic Jack Adjuster", "Hydraulic Jack Operator", "Hydroblaster", "Inserter", "Jackhammer Operator", "Jet Man", "Jet Worker", "Jetting Machine Operator", "Joint Filler", "Joint Sealer", "Kettle Firer", "Kettle Operator", "Kettle Worker", "Kettleman", "Labor Operator", "Labor/Excavator", "Laborer", "Laborer-Demolition", "Laborer-Operator", "Laborer/Grade Check", "Laborer/Key Man", "Land Clearer", "Lawn Sprinkler Installer", "Liquid Floor and Wall Applier", "Macadam Raker", "Maintenance Worker", "Manhole Stripper", "Mastic Man", "Mastic Worker", "Mat Man", "Mat Weaver", "Mat Worker", "Measurer", "Mesh Man", "Mesh Worker", "Mixer", "Mixer Tender", "Mixing Plant Dumper", "Mop Man", "Mop Worker", "Mortar Carrier", "Mortar Maker", "Mortar Man", "Mortar Mixer", "Mortar Worker", "Mud Jack Nozzleman", "Municipal Maintenance Worker", "Nozzle Operator", "Nozzleman", "Nuclear Plant Construction Worker", "Oil Heater Operator", "Oil Heaterman", "Paper Steamer", "Pick and Shovel Man", "Pick and Shovel Worker", "Pile Header", "Pile Trimmer", "Piling Setter", "Pin Puller", "Pipe Cutter", "Pipe Installer", "Pipe Line Repairer", "Pitman", "Plaster Machine Tender", "Playground Equipment Erector", "Plowman", "Plug Drill Operator", "Pneumatic Riveter", "Pole Setter", "Post Framer", "Pourer", "Powder Loader", "Power Washer", "Precast Concrete Products Installer", "Pressure Washer", "Puddler", "Pumper Helper", "Punch Out Crew Member", "Rail Layer", "Rail Setter", "Right-of-Way Clearer", "Right-of-Way Cutter", "Right-of-Way Man", "Right-of-Way Worker", "Riprap Man", "Riprap Worker", "Rivet Flunky", "Riveter", "Rock Worker", "Rockman", "Rod Placer", "Rod Puller", "Roughneck", "Roustabout", "Rubble Placer", "Sand Blaster", "Sand Hog", "Sandblast Operator", "Sandblaster", "Scoop Filler", "Screed Person", "Screedman", "Screedman/Laborer", "Service Line Layer", "Sewer Builder", "Sewer Digger", "Sewer Repairer", "Shoveler", "Sidewalk Repairer", "Signaler", "Skill Labor", "Skilled Laborer", "Skip Tender", "Sledger", "Slip Dumper", "Slip Filler", "Slip Injector and Applicator", "Slipman", "Snow Fence Erecto", "Sounder", "Sprayer", "Steam Cleaning Machine Operator", "Steel Layer", "Steel Placer", "Steel Post Installer", "Stone Breaker", "Straightedge Man", "Straightedge Worker", "Straw Boss", "Stripe Marker", "Swimming Pool Installer and Servicer", "Tagman", "Tamper", "Tar Kettle Runner", "Tar Man", "Tar Pot Man", "Tar Pot Worker", "Tar Worker", "Track Repair Laborer", "Tuckpointer, Cleaner, Caulker", "Tunnel Man", "Tunnel Worker", "Turntable Man", "Turntable Worker", "Union Laborer", "Venetian Blind Installer", "Vibrator Operator", "Wagon Winder", "Wall Cleaner", "Wall Scraper", "Wall Steamer", "Wall Washer", "Wallpaper Cleaner", "Wallpaper Scraper", "Water Proofer", "Well Cleaner", "Whitewasher" }));

        jButton1.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        jButton1.setText("Register");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        jLabel5.setText("Officer incharge");

        store_list.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                store_listMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(store_list);

        jButton8.setText("X");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jButton8)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton8)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(335, 335, 335)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(244, 244, 244)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel21)
                            .addComponent(jLabel2)
                            .addComponent(jLabel9)
                            .addComponent(jLabel18)
                            .addComponent(jLabel20)
                            .addComponent(jLabel19)
                            .addComponent(jLabel5))
                        .addGap(69, 69, 69)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtaddress)
                            .addComponent(txtname)
                            .addComponent(txtstoresid)
                            .addComponent(txtconnumber, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
                            .addComponent(txtofzin)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(69, 69, 69)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtstoresid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel21)
                            .addComponent(txtaddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel20)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel19)
                            .addComponent(txtconnumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(txtofzin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(47, 47, 47)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEmpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEmpMouseClicked

        // TODO add your handling code here:

    }//GEN-LAST:event_btnEmpMouseClicked

    private void txtconnumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtconnumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtconnumberActionPerformed

    private void btnEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmpActionPerformed
        new Reg_Employee().show();
        this.dispose();
    }//GEN-LAST:event_btnEmpActionPerformed

    private void btnStoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStoActionPerformed
        new Reg_Stores().show();
        this.dispose();
    }//GEN-LAST:event_btnStoActionPerformed

    private void btnSupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSupActionPerformed
        new Reg_Supplier().show();
        this.dispose();
    }//GEN-LAST:event_btnSupActionPerformed

    private void btnCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCliActionPerformed
        new Reg_Client().show();
        this.dispose();
    }//GEN-LAST:event_btnCliActionPerformed

    private void btnVehActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVehActionPerformed
        new Reg_Vehicle().show();
        this.dispose();
    }//GEN-LAST:event_btnVehActionPerformed

    private void btnTooActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTooActionPerformed
        new Reg_Tools().show();
        this.dispose();
    }//GEN-LAST:event_btnTooActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            String sql = "INSERT INTO reg_stores (stores_id, name, address, dor,stores_type,contactno,ofz_incharge,st)  VALUES('" + txtstoresid.getText().trim() + "',"
                    + " '" + txtname.getText().trim() + "',"
                    + "'" + txtaddress.getText().trim() + "',"
                    + "'" + dateformat.format(jDateChooser1.getDate()) + "',"
                    + "'" + jComboBox1.getSelectedItem() + "',"
                    + "'" + txtconnumber.getText() + "',"
                    + "'" + txtofzin.getText() + "','A')"
                    + " ON DUPLICATE KEY UPDATE name='" + txtname.getText() + "',address='" + txtaddress.getText() +
                    "',dor='" + dateformat.format(jDateChooser1.getDate()) + "',stores_type='" + jComboBox1.getSelectedItem()+ 
                    "',contactno='" + txtconnumber.getText().trim() + "',ofz_incharge='" + txtofzin.getText() +"',st='A'";

            
//            String sql = "INSERT INTO reg_stores (id, name, address, dor,stores_type,contactno,ofz_incharge) "
//                    + "VALUES ('" + txtstoresid.getText().trim() + "',"
//                    + " '" + txtname.getText().trim() + "',"
//                    + "'" + txtaddress.getText().trim() + "',"
//                    + "'" + dateformat.format(jDateChooser1.getDate()) + "',"
//                    + "'" + jComboBox1.getSelectedItem() + "',"
//                    + "'" + txtconnumber.getText() + "',"
//                    + "'" + txtofzin.getText() + "')";
            int tmp = _dbConnection.insertAI(sql);
            JOptionPane.showMessageDialog(rootPane, "Saved successfully");
            System.out.println("Key : " + tmp);
            new Reg_Stores().show();
            this.dispose();
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(rootPane, e.getLocalizedMessage());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void store_listMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_store_listMouseClicked

        try {
            String[] parts = store_list.getSelectedValue().toString().split("-");
            String part1 = parts[0]; // 004
            String part2 = parts[1]; // 034556

            //            JOptionPane.showMessageDialog(this, part1);
            ResultSet resultSet = MysqlConnect.getDbCon().query("SELECT * FROM reg_stores WHERE stores_id='" + part1 + "' and st ='A'");
            if (resultSet.next()) {

                txtstoresid.setText(resultSet.getInt("stores_id") + "");
                txtname.setText(resultSet.getString("name"));
                txtaddress.setText(resultSet.getString("address"));
                jDateChooser1.setDate(resultSet.getDate("dor"));
                jComboBox1.setSelectedItem(resultSet.getString("stores_type"));
                txtconnumber.setText(resultSet.getString("contactno"));
                txtofzin.setText(resultSet.getString("ofz_incharge"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Reg_Employee.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_store_listMouseClicked

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        try {
            if (store_list.getSelectedValue()==null) {
                JOptionPane.showMessageDialog(this, "Please select in list");
                return;
            }
            String[] parts = store_list.getSelectedValue().toString().split("--");
            int part1 = Integer.parseInt(parts[0]); // 004
            System.out.println(part1);
            String sql="UPDATE reg_stores SET st = 'D' WHERE stores_id ="+part1 +"";   
            int tmp = _dbConnection.insert(sql);
            new Reg_Stores().show();
            this.dispose();
        } catch (SQLException ex) {
            Logger.getLogger(Reg_Employee.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void btnIteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIteActionPerformed
        new Reg_Item().show();
        this.dispose();
    }//GEN-LAST:event_btnIteActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Reg_Stores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Reg_Stores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Reg_Stores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Reg_Stores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Reg_Stores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Clocklbl;
    private javax.swing.JButton btnCli;
    private javax.swing.JButton btnEmp;
    private javax.swing.JButton btnIte;
    private javax.swing.JButton btnSto;
    private javax.swing.JButton btnSup;
    private javax.swing.JButton btnToo;
    private javax.swing.JButton btnVeh;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton8;
    private javax.swing.JComboBox jComboBox1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList store_list;
    private javax.swing.JTextField txtaddress;
    private javax.swing.JTextField txtconnumber;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtofzin;
    private javax.swing.JTextField txtstoresid;
    // End of variables declaration//GEN-END:variables

    private void GetStore() {
        try {
            dataModel = new DefaultListModel();
            ResultSet rs = _dbConnection.query("SELECT * FROM `reg_stores` where st='A'");
            while (rs.next()) {
                dataModel.addElement(rs.getString("stores_id") + "--" + rs.getString("name"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Reg_Employee.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
