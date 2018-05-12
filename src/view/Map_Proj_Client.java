/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import database.MysqlConnect;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import utill.Public;

/**
 *
 * @author Sachintha
 */
public class Map_Proj_Client extends javax.swing.JFrame {

    private final MysqlConnect _dbConnection;
    private final SimpleDateFormat dateformat;

    public Map_Proj_Client() {
        _dbConnection = MysqlConnect.getDbCon();
        dateformat = new SimpleDateFormat("yyyy-MM-dd");
//        GetModel();
        initComponents();
        GetProject();
        GetClient();
    }

    private void GetProject() {
        try {
            ResultSet rs = _dbConnection.query("SELECT * FROM `reg_projects` WHERE st ='A';");
            cmbProject.removeAllItems();
            while (rs.next()) {
                cmbProject.addItem(rs.getString("proid") + "--" + rs.getString("name"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Reg_Employee.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private void GetClient() {
        try {
            ResultSet rs = _dbConnection.query("SELECT * FROM reg_client  WHERE st='A' and clid not in "
                    + "(select cid from map_proj_client where pid='" + cmbProject.getSelectedItem().toString().split("--")[0] + "' and st <> 'D')");
            cmbClient.removeAllItems();
            while (rs.next()) {
                cmbClient.addItem(rs.getString("clid") + "--" + rs.getString("name"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Reg_Employee.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        btnClient = new javax.swing.JButton();
        btnEmployee = new javax.swing.JButton();
        btnSupplier = new javax.swing.JButton();
        btnTools = new javax.swing.JButton();
        btnVehical = new javax.swing.JButton();
        btnItem = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        Clocklbl = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnDelete = new javax.swing.JButton();
        cmbProject = new javax.swing.JComboBox();
        cmbClient = new javax.swing.JComboBox();
        btnAdd = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(3, 38, 91));

        btnClient.setText("Project-Client");
        btnClient.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnClientMouseClicked(evt);
            }
        });
        btnClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClientActionPerformed(evt);
            }
        });

        btnEmployee.setText("Project-Employee");
        btnEmployee.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEmployeeMouseClicked(evt);
            }
        });
        btnEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmployeeActionPerformed(evt);
            }
        });

        btnSupplier.setText("Project-Supplier");
        btnSupplier.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSupplierMouseClicked(evt);
            }
        });
        btnSupplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSupplierActionPerformed(evt);
            }
        });

        btnTools.setText("Project-Tools");
        btnTools.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnToolsMouseClicked(evt);
            }
        });
        btnTools.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnToolsActionPerformed(evt);
            }
        });

        btnVehical.setText("Project-Vehicle");
        btnVehical.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVehicalMouseClicked(evt);
            }
        });
        btnVehical.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVehicalActionPerformed(evt);
            }
        });

        btnItem.setText("Store-Item");
        btnItem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnItemMouseClicked(evt);
            }
        });
        btnItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnItemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnItem, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVehical, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTools, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClient, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(btnClient, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnTools, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnVehical, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnItem, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(196, Short.MAX_VALUE))
        );

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 180, Short.MAX_VALUE)
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

        jPanel1.setLayout(null);

        jLabel5.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        jLabel5.setText("Project");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(20, 40, 80, 20);

        jLabel7.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        jLabel7.setText("Client");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(20, 70, 80, 20);

        btnDelete.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(204, 0, 0));
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jPanel1.add(btnDelete);
        btnDelete.setBounds(270, 100, 80, 30);

        cmbProject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbProjectActionPerformed(evt);
            }
        });
        jPanel1.add(cmbProject);
        cmbProject.setBounds(110, 40, 240, 20);

        jPanel1.add(cmbClient);
        cmbClient.setBounds(110, 70, 240, 20);

        btnAdd.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(204, 0, 0));
        btnAdd.setText("ADD");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        jPanel1.add(btnAdd);
        btnAdd.setBounds(190, 100, 70, 30);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Item code", "Item Name", "Description", "Unit Price", "Qty", "Total"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(20, 190, 790, 310);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnClientMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClientMouseClicked

        // TODO add your handling code here:
    }//GEN-LAST:event_btnClientMouseClicked

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        try {
            if (jTable1.getSelectedRow() < 0) {
                JOptionPane.showMessageDialog(rootPane, "Please select Item from grid");
                return;
            }
            String part1 = jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString();
            System.out.println(part1);
            String sql = "delete from map_proj_client WHERE mid =" + part1 + "";
//            String sql = "UPDATE mapproj_employee SET st = 'D' WHERE peid =" + part1 + "";
            //            MysqlConnect.db.query(sql);
            int tmp = _dbConnection.insert(sql);
//            new Map_Store_Item().show();
//            this.dispose();
//            GetModel();
            loadTable(jTable1.getValueAt(jTable1.getSelectedRow(), 1).toString());
        } catch (SQLException ex) {
            Logger.getLogger(Reg_Employee.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        try {
            if (!cmbProject.getSelectedItem().toString().contains("--")) {
                throw new Exception("Empty ProjectID");
            }
            if (!cmbClient.getSelectedItem().toString().contains("--")) {
                throw new Exception("Empty ClientID");
            }

            String sql = "INSERT INTO `map_proj_client` ("
                    + "`mid`," //1
                    + "`pid`," //1
                    + "`cid`,"//2
                    + "`st`"//3
                    + ") VALUES \n"
                    + " ('0','" + cmbProject.getSelectedItem().toString().split("--")[0] + "',"
                    + "'" + cmbClient.getSelectedItem().toString().split("--")[0] + "',"
                    + "'A')ON DUPLICATE KEY UPDATE "
                    + " pid='" + cmbProject.getSelectedItem().toString().split("--")[0] + "',"
                    + " cid='" + cmbClient.getSelectedItem().toString().split("--")[0] + "',st='A'";
            int tmp = _dbConnection.insert(sql);

            System.out.println("Key : " + tmp);
            loadTable(cmbProject.getSelectedItem().toString().split("--")[0]);
        } catch (SQLException ex) {
            Logger.getLogger(Reg_Supplier.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(Map_Proj_Client.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void loadTable(String part1) {
        try {
            String sql = "select * from ("
                    + "SELECT a.mid ID,a.`pid` ProjectID,b.`name`AS ProjectName,c.`name` ClientName,c.`address` ClientAddress,c.`email` Email,c.`sex` Sex, c.cli_type ClientType\n"
                    + "FROM map_proj_client a\n"
                    + "INNER JOIN `reg_projects` b ON a.`pid`=b.`proid` AND b.`st` != 'D'\n"
                    + "INNER JOIN `reg_client` c ON a.`cid`=c.`clid` AND c.`st` != 'D'\n"
                    + " WHERE a.pid='" + part1 + "' and a.`st` ='A') xx";
            Public.FillTable(jTable1, sql, MysqlConnect.getDbCon());
            GetClient();
        } catch (Exception ex) {
            Logger.getLogger(Reg_Employee.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void cmbProjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbProjectActionPerformed
        loadTable(cmbProject.getSelectedItem().toString().split("--")[0]);
    }//GEN-LAST:event_cmbProjectActionPerformed

    private void btnEmployeeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEmployeeMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEmployeeMouseClicked

    private void btnSupplierMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSupplierMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSupplierMouseClicked

    private void btnToolsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnToolsMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnToolsMouseClicked

    private void btnVehicalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVehicalMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVehicalMouseClicked

    private void btnItemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnItemMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnItemMouseClicked

    private void btnClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientActionPerformed
        new Map_Proj_Client().show();
        this.dispose();
    }//GEN-LAST:event_btnClientActionPerformed

    private void btnEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmployeeActionPerformed
        new Map_Proj_Employee().show();
        this.dispose();
    }//GEN-LAST:event_btnEmployeeActionPerformed

    private void btnSupplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSupplierActionPerformed
        new Map_Proj_Supplier().show();
        this.dispose();
    }//GEN-LAST:event_btnSupplierActionPerformed

    private void btnToolsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnToolsActionPerformed
        new Map_Proj_Tools().show();
        this.dispose();
    }//GEN-LAST:event_btnToolsActionPerformed

    private void btnVehicalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVehicalActionPerformed
        new Map_Proj_Vehicle().show();
        this.dispose();
    }//GEN-LAST:event_btnVehicalActionPerformed

    private void btnItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnItemActionPerformed
        new Map_Store_Item().show();
        this.dispose();
    }//GEN-LAST:event_btnItemActionPerformed

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
            java.util.logging.Logger.getLogger(Map_Proj_Client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Map_Proj_Client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Map_Proj_Client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Map_Proj_Client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Map_Proj_Client().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Clocklbl;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnClient;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEmployee;
    private javax.swing.JButton btnItem;
    private javax.swing.JButton btnSupplier;
    private javax.swing.JButton btnTools;
    private javax.swing.JButton btnVehical;
    private javax.swing.JComboBox cmbClient;
    private javax.swing.JComboBox cmbProject;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
