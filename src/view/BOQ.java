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
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import utill.Public;

/**
 *
 * @author Sachintha
 */
public class BOQ extends javax.swing.JFrame {

    private final MysqlConnect _dbConnection;
    private final SimpleDateFormat dateformat;
    DefaultListModel dataModel;

    public BOQ() {
        _dbConnection = MysqlConnect.getDbCon();
        dateformat = new SimpleDateFormat("yyyy-MM-dd");
        GetModel();
        initComponents();
//        GetItem();
        Start();
    }

    private void GetItem() {
        try {
            ResultSet rs = _dbConnection.query("SELECT * FROM `reg_item` WHERE st ='A' AND iid NOT IN (SELECT iid FROM `map_boq_item` WHERE st='A' and bid='" + txtboqid.getText() + "')");
            cmbItem.removeAllItems();
            while (rs.next()) {
                cmbItem.addItem(rs.getString("iid") + "--" + rs.getString("icode") + "_" + rs.getString("iname"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Reg_Employee.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void GetModel() {
        try {
            dataModel = new DefaultListModel();
            ResultSet rs = _dbConnection.query("SELECT * FROM reg_boq a inner join map_boq_item b on a.bid=b.bid WHERE a.st ='A' and b.st='A' group by a.bid");
            while (rs.next()) {
                dataModel.addElement(rs.getString("a.bid") + "--" + rs.getString("a.name"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Reg_Employee.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        txtunits = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        cli_list = new javax.swing.JList(dataModel);
        jButton26 = new javax.swing.JButton();
        cmbItem = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        txtboqid = new javax.swing.JTextField();
        btnStart = new javax.swing.JButton();
        btnAdd1 = new javax.swing.JButton();
        Clocklbl1 = new javax.swing.JLabel();
        txtgrandTotal = new javax.swing.JLabel();

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 240, Short.MAX_VALUE)
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

        jButton3.setText("Create BOQ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 407, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        jLabel2.setText("BOQ");

        jLabel5.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        jLabel5.setText("Item code");

        jLabel6.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        jLabel6.setText("Name");

        jLabel7.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        jLabel7.setText("Units");

        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

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

        cli_list.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cli_listMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(cli_list);

        jButton26.setText("X");
        jButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton26ActionPerformed(evt);
            }
        });

        cmbItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbItemActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        jLabel8.setText("BOQ ID");

        btnStart.setText("Start");
        btnStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartActionPerformed(evt);
            }
        });

        btnAdd1.setText("Delete");
        btnAdd1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdd1ActionPerformed(evt);
            }
        });

        Clocklbl1.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        Clocklbl1.setForeground(new java.awt.Color(255, 0, 51));
        Clocklbl1.setText("Grand Total : ");

        txtgrandTotal.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        txtgrandTotal.setForeground(new java.awt.Color(255, 0, 51));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 660, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(33, 33, 33)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(btnAdd)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btnAdd1))
                                            .addComponent(txtunits, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(cmbItem, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(334, 334, 334)
                                        .addComponent(jLabel2)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(32, 32, 32)
                                        .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnStart, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addGap(21, 21, 21)
                                        .addComponent(txtboqid, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(58, 58, 58)
                        .addComponent(Clocklbl1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtgrandTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addComponent(jButton26))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(txtboqid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Clocklbl1)
                                    .addComponent(txtgrandTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnStart)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cmbItem, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(txtunits, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnAdd)
                                    .addComponent(btnAdd1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton26)))
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cli_listMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cli_listMouseClicked

        try {
            String[] parts = cli_list.getSelectedValue().toString().split("--");
            String part1 = parts[0]; // 004
            String part2 = parts[1]; // 034556

            String sql = "select * from (SELECT c.`iid` ItemID,c.`iname` ItemName,c.`idesc` ItemDescription,c.`icost` UnitPrice,b.`qty` Quantity,"
                    + "(c.`icost`*b.`qty`) AS Total \n"
                    + " FROM reg_boq a INNER JOIN map_boq_item b ON a.bid=b.bid AND a.`st`=b.`st`\n"
                    + "LEFT OUTER JOIN `reg_item` c ON b.`iid`=c.`iid` AND c.`st`=b.`st`\n"
                    + "WHERE a.st ='A' and b.bid='" + part1 + "') x";
            System.out.println(sql);
            Public.FillTable(jTable1, sql, MysqlConnect.getDbCon());

            txtboqid.setText(part1);
            txtname.setText(part2);
            Start2();

        } catch (Exception ex) {
            Logger.getLogger(Reg_Employee.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cli_listMouseClicked

    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton26ActionPerformed
        try {
            if (cli_list.getSelectedValue() == null) {
                JOptionPane.showMessageDialog(this, "Please select in list");
                return;
            }
            String[] parts = cli_list.getSelectedValue().toString().split("--");
            int part1 = Integer.parseInt(parts[0]); // 004
            System.out.println(part1);
            String sql = "UPDATE reg_boq SET st = 'D' WHERE bid =" + part1 + "";
            //            MysqlConnect.db.query(sql);
            int tmp = _dbConnection.insert(sql);
            new BOQ().show();
            this.dispose();
        } catch (SQLException ex) {
            Logger.getLogger(Reg_Employee.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton26ActionPerformed

    private void cmbItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbItemActionPerformed
//        if (cmbItem.getSelectedItem().toString().contains("--") && cmbItem.getSelectedItem().toString().contains("_")) {
//            txtname.setText(cmbItem.getSelectedItem().toString().split("--")[1].split("_")[0]);
//        }
    }//GEN-LAST:event_cmbItemActionPerformed

    private void btnStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartActionPerformed
        try {

            if (txtboqid.getText().trim().isEmpty()) {
                txtboqid.setText("0");
            }
            String sql = "INSERT INTO reg_boq (bid,name,st)  VALUES('" + txtboqid.getText() + "','" + txtname.getText() + "','A')"
                    + " ON DUPLICATE KEY UPDATE name='" + txtname.getText() + "' ,st='A'";

            int tmp = _dbConnection.insertAI(sql);
            txtboqid.setText(String.valueOf(tmp));
            System.out.println("Key : " + tmp);
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(rootPane, e.getLocalizedMessage());
        } finally {
            Start2();
        }
    }//GEN-LAST:event_btnStartActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        try {

            if (txtboqid.getText().trim().isEmpty()) {
                txtboqid.setText("0");
            }
            if (!cmbItem.getSelectedItem().toString().contains("--")) {
                throw new Exception();
            }
            Integer.parseInt(txtunits.getText());

            String sql = "INSERT INTO map_boq_item (bid,iid,qty,st)  VALUES('" + txtboqid.getText() + "',"
                    + "'" + cmbItem.getSelectedItem().toString().split("--")[0] + "',"
                    + "'" + txtunits.getText() + "','A')"
                    + " ON DUPLICATE KEY UPDATE st='A'";

            int tmp = _dbConnection.insertAI(sql);
            txtboqid.setText(String.valueOf(tmp));
            System.out.println("Key : " + tmp);
            GetModel();
            jTable1.setModel(new javax.swing.table.DefaultTableModel(
                    new Object[][]{}, new String[]{}
            ));
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(rootPane, e.getLocalizedMessage());
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnAdd1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdd1ActionPerformed
        try {
            if (jTable1.getSelectedRow() < 0) {
                JOptionPane.showMessageDialog(this, "Please select in list");
                return;
            }
            String parts = jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString();
            System.out.println(parts);
            String sql = "UPDATE map_boq_item SET st = 'D' WHERE iid =" + parts + "";
            //            MysqlConnect.db.query(sql);
            int tmp = _dbConnection.insert(sql);
            new BOQ().show();
            this.dispose();
        } catch (SQLException ex) {
            Logger.getLogger(Reg_Employee.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAdd1ActionPerformed

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
            java.util.logging.Logger.getLogger(BOQ.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BOQ.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BOQ.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BOQ.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BOQ().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Clocklbl;
    private javax.swing.JLabel Clocklbl1;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnAdd1;
    private javax.swing.JButton btnStart;
    private javax.swing.JList cli_list;
    private javax.swing.JComboBox cmbItem;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtboqid;
    private javax.swing.JLabel txtgrandTotal;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtunits;
    // End of variables declaration//GEN-END:variables

    private void Start() {
        btnAdd.setEnabled(false);
        txtboqid.setEnabled(false);
        txtunits.setEnabled(false);
        cmbItem.setEnabled(false);
        txtname.setEnabled(true);
        txtboqid.setEnabled(false);
        btnStart.setEnabled(true);
    }

    private void Start2() {
        btnAdd.setEnabled(true);
        txtboqid.setEnabled(true);
        txtname.setEnabled(false);
        txtunits.setEnabled(true);
        cmbItem.setEnabled(true);
        txtboqid.setEnabled(false);
        btnStart.setEnabled(false);
        GetItem();
        try {
            ResultSet rs = MysqlConnect.getDbCon().query("SELECT SUM((IFNULL(c.`icost`, 0)*IFNULL(b.`qty`, 0) )) GrandTotal\n"
                    + " FROM reg_boq a INNER JOIN map_boq_item b ON a.bid=b.bid AND a.`st`=b.`st`\n"
                    + "LEFT OUTER JOIN `reg_item` c ON b.`iid`=c.`iid` AND c.`st`=b.`st`\n"
                    + "WHERE a.st ='A' AND b.bid='" + txtboqid.getText() + "'");
            if (rs.next()) {
                txtgrandTotal.setText(rs.getString("GrandTotal"));
            }
        } catch (Exception e) {
            e.printStackTrace();
            txtgrandTotal.setText("0");
        }
    }
}
