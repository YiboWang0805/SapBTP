package com.sapTest.boot;

import java.sql.*;

public class JDBCDemoHANA {

    private static final String DRIVER = "com.sap.db.jdbc.Driver";
    private static final String URL = "jdbc:sap://b292e140-a5e8-4486-9cd8-ebd49e3a6cdc.hana.trial-us10.hanacloud.ondemand.com:443?encrypt=true&validateCertificate=true";
    private static final String USER_NAME = "DBADMIN";
    private static final String PASSWORD = "Bjyxszd@0622";

    public JDBCDemoHANA() {

    }

    public static void main(String[] args) {
        JDBCDemoHANA demo = new JDBCDemoHANA();
        try {
            demo.select();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void select() throws Exception {

        Connection con = this.getConnection(DRIVER, URL, USER_NAME, PASSWORD);
        PreparedStatement pstmt = con.prepareStatement("select USER_ID,USER_NAME,USER_MODE from SYS.USERS");
        ResultSet rs = pstmt.executeQuery();
        try {
            this.processResult(rs);
        } finally {
            this.closeConnection(con, pstmt);
        }

    }

    private void processResult(ResultSet rs) throws Exception {
        if (rs.next()) {
            ResultSetMetaData rsmd = rs.getMetaData();
            int colNum = rsmd.getColumnCount();
            for (int i = 1; i <= colNum; i++) {
                if (i == 1) {
                    System.out.print(rsmd.getColumnName(i));
                } else {
                    System.out.print("\t" + rsmd.getColumnName(i));
                }

            }
            System.out.print("\n");
            System.out.println("———————–");
            do {
                for (int i = 1; i <= colNum; i++) {
                    if (i == 1) {
                        System.out.print(rs.getString(i));
                    } else {
                        System.out.print("\t"
                                + (rs.getString(i) == null ? "null" : rs
                                .getString(i).trim()));
                    }

                }
                System.out.print("\n");
            } while (rs.next());
        } else {
            System.out.println("query not result.");
        }

    }

    private Connection getConnection(String driver, String url, String user,
                                     String password) throws Exception {
        Class.forName(driver);
        return DriverManager.getConnection(url, user, password);

    }

    private void closeConnection(Connection con, Statement stmt)
            throws Exception {
        if (stmt != null) {
            stmt.close();
        }
        if (con != null) {
            con.close();
        }
    }

}