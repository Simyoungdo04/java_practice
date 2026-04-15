package com.kh.common;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class CatTemplate {

    private static Properties prop = new Properties();

    static {
        try {
            prop.load(new FileInputStream("resources/connection.properties"));
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(
                prop.getProperty("URL"),
                prop.getProperty("USERNAME"),
                prop.getProperty("PASSWORD")
            );
            conn.setAutoCommit(false);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }

    public static void close(Connection conn) {
        try { if (conn != null) conn.close(); }
        catch (SQLException e) { e.printStackTrace(); }
    }

    public static void close(Statement stmt) {
        try { if (stmt != null) stmt.close(); }
        catch (SQLException e) { e.printStackTrace(); }
    }

    public static void close(ResultSet rs) {
        try { if (rs != null) rs.close(); }
        catch (SQLException e) { e.printStackTrace(); }
    }

    public static void commit(Connection conn) {
        try { if (conn != null) conn.commit(); }
        catch (SQLException e) { e.printStackTrace(); }
    }

    public static void rollback(Connection conn) {
        try { if (conn != null) conn.rollback(); }
        catch (SQLException e) { e.printStackTrace(); }
    }
}