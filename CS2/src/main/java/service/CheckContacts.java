package service;

import java.sql.*;

public class CheckContacts {
    public static void show() throws ClassNotFoundException, SQLException {
        String Url = "jdbc:mysql://localhost:/springboot_test";
        String username = "root";
        String password = "Demonsgudu123";
        // Declare the JDBC objects.
        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;

        // Establish the connection.
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection(Url,username,password);
        // Create and execute an SQL statement that returns some data.
        String SQL = "select * from p_user ";
        stmt = con.createStatement();
        rs = stmt.executeQuery(SQL);

        // Iterate through the data in the result set and display it.
        while (rs.next()) {
            System.out.println(rs.getString(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3) + "\t");
        }
    }
}

