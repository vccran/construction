/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utill;

/**
 *
 * @author viraj.k
 */
public class General {

    public General() {

    }

    public String getTableQuery(String type) {
        String reply = "SELECT * FROM (";
        switch (type) {
            case "1"://All Vehicals
                reply += "SELECT a.NAME AS ProjectName,location AS ProjectLocation,TYPE AS PrType ,\n"
                        + "noofemp AS NoEmployees,noofveh AS NoVehicals,noofofficers AS NoOfficers,VALUE,\n"
                        + "(SELECT NAME FROM reg_stores WHERE `stores_id`=a.`storeid`) AS store\n"
                        + "FROM reg_projects a";
                break;
            case "2"://EMployees on Project
                reply += "SELECT b.`proid`AS ProjectID,b.`name`AS projectname,c.`empid`AS EmployeeID,c.`name`AS employeename "
                        + " ,c.`address` Address, c.`sex`,c.`emp_type`,c.`contactno`"
                        + "FROM  mapproj_employee a\n"
                        + "INNER JOIN `reg_projects` b ON a.`projectid`=b.`proid` AND b.`st` != 'D'\n"
                        + "INNER JOIN `reg_employee` c ON a.`employeeid`=c.`empid` AND c.`st` != 'D'\n"
                        + "WHERE a.`st` ='A'";
                break;
            case "3"://All Vans
                reply += "SELECT a.storeid,a.NAME AS ProjectName,location AS ProjectLocation,TYPE AS PrType ,\n"
                        + "noofemp AS NoEmployees,noofveh AS NoVehicals,noofofficers AS NoOfficers,VALUE,\n"
                        + "b.`name` AS store\n"
                        + "FROM reg_projects a LEFT OUTER JOIN reg_stores b ON a.storeid=b.stores_id";
                break;
            case "4"://All Bikes
                reply += "SELECT * FROM tbl_vehical a INNER JOIN tbl_bike  b ON (a.idtbl_vehical=b.tbl_vehical_idtbl_vehical)";
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
