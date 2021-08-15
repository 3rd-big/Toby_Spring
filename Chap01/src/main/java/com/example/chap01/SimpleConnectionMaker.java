package com.example.chap01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SimpleConnectionMaker {
    public Connection getConnection() throws ClassNotFoundException, SQLException {
        String URL = "jdbc:oracle:thin:@192.168.55.10:11521:direadb";
        String USER = "study";
        String PASSWORD = "1234";

        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);

        return connection;
    }
}
