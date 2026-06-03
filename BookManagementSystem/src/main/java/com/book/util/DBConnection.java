package com.book.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

    private static final String URL =
            "jdbc:mysql://localhost:3306/bookdb";

    private static final String USERNAME = "root";

    private static final String PASSWORD = "Jyoti@@2005";

    public static Connection getConnection() {

        try {

            Connection con =
                    DriverManager.getConnection(URL, USERNAME, PASSWORD);

            System.out.println("Database Connected Successfully");

            return con;

        } catch (Exception e) {

            System.out.println("Connection Failed");
            e.printStackTrace();

            return null;
        }
    }
}