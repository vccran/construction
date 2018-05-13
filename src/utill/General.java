/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utill;

import database.MysqlConnect;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import view.Reg_Employee;

/**
 *
 * @author viraj.k
 */
public class General {

    private final MysqlConnect _dbConnection;

    public General() {
        _dbConnection = MysqlConnect.getDbCon();
    }

    public String getTableQuery(String type, ArrayList param) {
        String reply = "SELECT * FROM (";
        String condition = " ";
        if (!(param == null || param.isEmpty() || param.size() < 1)) {
            for (Object object : param) {
                condition += condition + object;
            }
        }
        switch (type) {
            case "0"://Get Project Info
                reply += "SELECT a.NAME AS ProjectName,location AS ProjectLocation,TYPE AS PrType ,\n"
                        + "noofemp AS NoEmployees,noofveh AS NoVehicals,noofofficers AS NoOfficers,VALUE,\n"
                        + "(SELECT NAME FROM reg_stores WHERE `stores_id`=a.`storeid`) AS store\n"
                        + "FROM reg_projects a "
                        + " where 1=1 " + condition;
                break;
            case "1"://Employees on Project
                reply += "SELECT b.`proid`AS ProjectID,b.`name`AS projectname,c.`empid`AS EmployeeID,c.`name`AS employeename "
                        + " ,c.`address` Address, c.`sex`,c.`emp_type`,c.`contactno`"
                        + "FROM  mapproj_employee a\n"
                        + "INNER JOIN `reg_projects` b ON a.`projectid`=b.`proid` AND b.`st` != 'D'\n"
                        + "INNER JOIN `reg_employee` c ON a.`employeeid`=c.`empid` AND c.`st` != 'D'\n"
                        + "WHERE a.`st` ='A' " + condition;
                break;
            case "2"://Total Income From Date
                reply += "SELECT "
                        + "adate DateFrom, "
                        + "SUM(IF(vou_type='C',IFNULL(amount, 0), 0)) AS TotalIncome, "
                        + "SUM(IF(vou_type='D',IFNULL(amount, 0), 0)) AS TotalOutcome, \n"
                        + "(SELECT SUM(IF(vou_type='C',IFNULL(amount, 0), 0)) - SUM(IF(vou_type='D',IFNULL(amount, 0), 0)) FROM DUAL ) AS Profit \n"
                        + "FROM accounts WHERE st='A' " + condition;
                break;
            case "3"://Accounts 
                reply += "SELECT "
                        + "SUM(IF(vou_type='C',IFNULL(amount, 0), 0)) AS TotalIncome, "
                        + "SUM(IF(vou_type='D',IFNULL(amount, 0), 0)) AS TotalOutcome, \n"
                        + "(SELECT SUM(IF(vou_type='C',IFNULL(amount, 0), 0)) - SUM(IF(vou_type='D',IFNULL(amount, 0), 0)) FROM DUAL ) AS Profit \n"
                        + "FROM accounts WHERE st='A'";
                break;
            case "4"://Employee Salary
                reply += "SELECT a.`adate` FromDate,SUM(IF(vou_type='D',IFNULL(amount, 0), 0)) salaryPaid,b.`name`AS projectname,c.`name`AS employeename \n"
                        + ",c.`address` Address, c.`sex`,c.`emp_type`,c.`contactno`\n"
                        + "FROM accounts a\n"
                        + "INNER JOIN `reg_projects` b ON a.`project`=b.`proid` AND b.`st` != 'D'\n"
                        + "LEFT OUTER JOIN `reg_employee` c ON a.`category`='Salary' AND  a.`toperson`=c.`empid` AND c.`st` != 'D'\n"
                        + "WHERE a.`st` ='A'";
                break;
            case "5":// All Clients
                reply += "SELECT clid  ClienID,NAME ClientName,address Addrss,email Email,sex Sex,dob Birthday,cli_type ClientType,contactno ContactNo, st  \n"
                        + "FROM `reg_client` WHERE st <> 'D' " + condition;
                break;
            case "6":// All Employees
                reply += "SELECT empid EmployeeID,NAME EmployeeName,address Address,email Email,sex Sex,dob Birthday,emp_type EmployeeType,contactno ContactNo,salary Salary\n"
                        + "FROM `reg_employee` WHERE st <> 'D'" + condition;
                break;
            case "7":// All Items
                reply += "SELECT iid ItemID,iname ItemName,itype ItemType,icode ItemCode,iuoh UnitofQty,ireoq ReOrderQty,idesc Description,iqonhand OnhandQty,icost Cost,idep Store,idate DATE\n"
                        + "FROM `reg_item` WHERE st <>'D'" + condition;
                break;
            case "8":// All Stores
                reply += "SELECT stores_id StoreID,NAME StoreName, address StoreAddress,dor DATE,stores_type StoresType,contactno ContactNo,ofz_incharge OfzIncharge \n"
                        + "FROM `reg_stores` WHERE st <>'D'" + condition;
                break;
            case "9":// All Suppliers
                reply += "SELECT supid SuppllierID,NAME SupplierName,nic NICNo,address Address,email Email,sex Sex,dob Birthday,contactno ContactNo,bank Bank,branch Branch,acountno AccountNO,sup_type SupplierType \n"
                        + "FROM `reg_sup` WHERE st <>'D'" + condition;
                break;
            case "10":// All Tools
                reply += "SELECT tid ToolID,NAME ToolName,store_incharge StoreIncharge,tlno ToolLicenceNo,tool_type ToolType,dob RegisterdDate,contactno ContactNo \n"
                        + "FROM `reg_tool` WHERE st <>'D'" + condition;
                break;
            case "11":// All Vehical
                reply += "SELECT vid VehicalID,NAME VehicalName,licence LicenceNo,address Address,dname DriverName,dlnum DriverLicenceNo,dob RegisteredDate,vehicle_type VehicalType,contactno ContactNo \n"
                        + "FROM `reg_vehicle` WHERE st <>'D'" + condition;
                break;
            default:
                reply = "";
        }
        if (reply.equals("")) {
            return "";
        } else {
            return reply + ") xx";
        }
    }

    public JComboBox GetProject(JComboBox cmbProject) {
        try {
            ResultSet rs = _dbConnection.query("SELECT * FROM `reg_projects` WHERE st ='A';");
            cmbProject.addItem("ALL");
            while (rs.next()) {
                cmbProject.addItem(rs.getString("proid") + "--" + rs.getString("name"));
            }
            return cmbProject;
        } catch (SQLException ex) {
            Logger.getLogger(Reg_Employee.class.getName()).log(Level.SEVERE, null, ex);
            return new JComboBox();
        }
    }

    public JComboBox GetStore(JComboBox cmbProject) {
        try {
            ResultSet rs = _dbConnection.query("SELECT * FROM `reg_stores` WHERE st ='A';");
            cmbProject.addItem("ALL");
            while (rs.next()) {
                cmbProject.addItem(rs.getString("stores_id") + "--" + rs.getString("name"));
            }
            return cmbProject;
        } catch (SQLException ex) {
            Logger.getLogger(Reg_Employee.class.getName()).log(Level.SEVERE, null, ex);
            return new JComboBox();
        }
    }

}
