/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utill;

import database.MysqlConnect;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author viraj.k
 */
public class Public {

    public static boolean FillTable(JTable table, String Query, MysqlConnect dbConnection) {
        try {
            System.out.println("Table Query\n" + Query);
            ResultSet rs = dbConnection.query(Query);

            //To remove previously added rows
            while (table.getRowCount() > 0) {
                ((DefaultTableModel) table.getModel()).removeRow(0);
            }
            int columncount = rs.getMetaData().getColumnCount();

            DefaultTableModel model = null;
            while (rs.next()) {
                String[] columnames = new String[columncount];
                Object[] columndata = new Object[columncount];

                for (int i = 1; i <= columncount; i++) {
                    columndata[i - 1] = rs.getObject(i);
                    columnames[i - 1] = rs.getMetaData().getColumnName(i);
                }

                if (model == null) {
                    model = new DefaultTableModel(columnames, 0);
                }
                model.insertRow(rs.getRow() - 1, columndata);
            }
            if (model == null) {
                model = (DefaultTableModel) table.getModel();
                model.setRowCount(0);
            }
            table.setModel(model);
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

}
