package com.sapTest.boot;

import java.sql.*;

public class JDBCDemoHANA {

    private static final String DRIVER = "com.sap.db.jdbc.Driver";
    private static final String URL = "jdbc:sap://b292e140-a5e8-4486-9cd8-ebd49e3a6cdc.hana.trial-us10.hanacloud.ondemand.com:443?encrypt=true&validateCertificate=true";
    private static final String USER_NAME = "DBADMIN";
    private static final String PASSWORD = "Bjyxszd@0622";

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
        //第三步：获取数据库操作对象（专门执行sql语句的对象）
        //第四步：执行SQL语句
        PreparedStatement pstmt = con.prepareStatement("select * from book");
        ResultSet rs = pstmt.executeQuery();
        try {
            //第五步：处理查询结果集（只有当第四步执行的是select语句的时候，才有这第五步处理查询结果集。）
            this.processResult(rs);
        } finally {
            //第六步：释放资源（使用完资源之后一定要关闭资源。Java和数据库属于进程之间的通信，开启之后一定要关闭。）
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
            System.out.println("------------------");
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
        //第一步：注册驱动（作用：告诉Java程序，即将要连接的是哪个品牌的数据库）
        Class.forName(driver);
        //第二步：获取连接（表示JVM的进程和数据库进程之间的通道打开了，这属于进程之间的通信，重量级的，使用完之后一定要关闭通道。）
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