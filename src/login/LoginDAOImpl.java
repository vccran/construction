package login;

import database.MysqlConnect;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class LoginDAOImpl extends LoginDAO {

    MysqlConnect _dbConnection = null;
    Connection conn = null;
    Statement stmt = null;
    String sql = null;

    public LoginDAOImpl() {
        _dbConnection = MysqlConnect.getDbCon();
    }

    @Override
    public Object get(Object obj) {
        Object trpObj = null;
        try {
            String[] array = (String[]) obj;
            sql = "SELECT idlogin FROM login where username = '" + array[0] + "' and password = '" + array[1] + "'";
            ResultSet rs = _dbConnection.query(sql);
            if (rs.next()) {
                trpObj = rs.getInt("idlogin");
            }
            rs.close();
            return trpObj;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public int save(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
