/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import database.MysqlConnect;
import java.sql.*;

/**
 *
 * @author viraj.k
 */
public class LogginController {

    MysqlConnect dbConnection;
    Connection conn = null;
    Statement stmt = null;
    String sql = null;

    public LogginController() {
        dbConnection = MysqlConnect.getDbCon();
    }

    public int logginByUser(String user, String pass) throws Exception {
        int logged = -1;
        try {
            String[] loginarray = {user, pass};
            BaseDAO dao = new LoginDAOImpl();
            Integer reply = (Integer) dao.get(loginarray);
            logged = reply;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return logged;
    }

}
