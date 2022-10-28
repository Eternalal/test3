package service;

import java.sql.*;
import java.util.Scanner;

public class DeleteContacts {

    public void de() throws ClassNotFoundException, SQLException {

        String Url = "jdbc:mysql://localhost:/springboot_test";
        String username = "root";
        String password = "Demonsgudu123";
        // Declare the JDBC objects.
        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;

        Scanner key=new Scanner(System.in);
        System.out.print("请输入要删除者的姓名：");
        String name=key.next();
        String sql = "delete from p_user where name='"+name+"'";
        // Establish the connection.
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection(Url,username,password);
        // Create and execute an SQL statement that returns some data.
        stmt = con.createStatement();
        stmt.executeUpdate(sql);
        System.out.println("删除成功：");
    }
}
