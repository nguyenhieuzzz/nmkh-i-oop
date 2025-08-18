package com.example.servingwebcontent.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/quan_coffee";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    private static Connection connection = null;

    // Singleton - chỉ tạo 1 kết nối duy nhất
    public static Connection getConnection() {
        if (connection == null) {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                connection = DriverManager.getConnection(URL, USER, PASSWORD);
                System.out.println("Kết nối CSDL thành công!");
            } catch (ClassNotFoundException | SQLException e) {
                e.printStackTrace();
                System.out.println("Kết nối CSDL thất bại!");
            }
        }
        return connection;
    }
}

