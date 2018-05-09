/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utill;

import java.util.ArrayList;

/**
 *
 * @author viraj.k
 */
public class General {

    public General() {

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
            case "1"://All Vehicals
                reply += "SELECT a.NAME AS ProjectName,location AS ProjectLocation,TYPE AS PrType ,\n"
                        + "noofemp AS NoEmployees,noofveh AS NoVehicals,noofofficers AS NoOfficers,VALUE,\n"
                        + "(SELECT NAME FROM reg_stores WHERE `stores_id`=a.`storeid`) AS store\n"
                        + "FROM reg_projects a "
                        + " where 1=1 " + condition;
                break;
            case "2"://EMployees on Project
                reply += "SELECT b.`proid`AS ProjectID,b.`name`AS projectname,c.`empid`AS EmployeeID,c.`name`AS employeename "
                        + " ,c.`address` Address, c.`sex`,c.`emp_type`,c.`contactno`"
                        + "FROM  mapproj_employee a\n"
                        + "INNER JOIN `reg_projects` b ON a.`projectid`=b.`proid` AND b.`st` != 'D'\n"
                        + "INNER JOIN `reg_employee` c ON a.`employeeid`=c.`empid` AND c.`st` != 'D'\n"
                        + "WHERE a.`st` ='A' " + condition;
                break;
            case "3"://Store Details
                reply += "SELECT a.storeid,a.NAME AS ProjectName,location AS ProjectLocation,TYPE AS PrType ,\n"
                        + "noofemp AS NoEmployees,noofveh AS NoVehicals,noofofficers AS NoOfficers,VALUE,\n"
                        + "b.`name` AS store\n"
                        + "FROM reg_projects a LEFT OUTER JOIN reg_stores b ON a.storeid=b.stores_id "
                        + " where 1=1 " + condition;
                break;
            case "4"://Accounts 
                reply += "SELECT SUM(IF(vou_type='C',IFNULL(amount, 0), 0)) AS TotalIncome,SUM(IF(vou_type='D',IFNULL(amount, 0), 0)) AS TotalOutcome\n"
                        + ",(SELECT SUM(IF(vou_type='C',IFNULL(amount, 0), 0)) - SUM(IF(vou_type='D',IFNULL(amount, 0), 0)) FROM DUAL ) AS Profit\n"
                        + " FROM accounts WHERE st='A'";
                break;
            case "5"://Employee Salary
                reply += "SELECT a.`adate` FromDate,SUM(IF(vou_type='D',IFNULL(amount, 0), 0)) salaryPaid,b.`name`AS projectname,c.`name`AS employeename \n"
                        + ",c.`address` Address, c.`sex`,c.`emp_type`,c.`contactno`\n"
                        + "FROM accounts a\n"
                        + "INNER JOIN `reg_projects` b ON a.`project`=b.`proid` AND b.`st` != 'D'\n"
                        + "LEFT OUTER JOIN `reg_employee` c ON a.`category`='Salary' AND  a.`toperson`=c.`empid` AND c.`st` != 'D'\n"
                        + "WHERE a.`st` ='A'";
                break;
            default:
                reply = "";
        }
        System.out.println(reply);
        if (reply.equals("")) {
            return "";
        } else {
            return reply + ") xx";
        }
    }

}
