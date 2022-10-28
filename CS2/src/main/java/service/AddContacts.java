package service;

import java.sql.*;
import java.util.Scanner;

public class AddContacts {
    public static void ad() throws SQLException, ClassNotFoundException {

        String Url = "jdbc:mysql://localhost:/springboot_test";
        String username = "root";
        String password = "Demonsgudu123";
        // Declare the JDBC objects.
        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;

        Scanner key=new Scanner(System.in);
        System.out.print("请输入姓名：");
        String name=key.next();
        System.out.print("请输入住址：");
        String address=key.next();
        System.out.print("请输入电话号码（11位）");
        String phone=key.next();
        String sql = "insert into p_user values('"+name+"','"+address+"','"+phone+"')";
        // Establish the connection.
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection(Url,username,password);
        // Create and execute an SQL statement that returns some data.
        stmt = con.createStatement();
        stmt.executeUpdate(sql);
        System.out.println("添加成功");
    }
}
