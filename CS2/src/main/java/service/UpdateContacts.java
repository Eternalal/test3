package service;

import java.sql.*;
import java.util.Scanner;

public class UpdateContacts {
    public void ch() throws ClassNotFoundException, SQLException {
        String Url = "jdbc:mysql://localhost:/springboot_test";
        String username = "root";
        String password = "Demonsgudu123";
        // Declare the JDBC objects.
        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;

        Scanner on=new Scanner( System.in);
        System.out.print("请输入要修改者的姓名：");
        String name1=on.next();
        System.out.print("1.修改姓名 2.修改住址 3.修改电话号码 4.修改结束 ");
        System.out.print("请选择修改的内容：");
        int x=on.nextInt();
        for(;x!=4;){
            if(x==1){
                System.out.print("请输入修改后的姓名：");
                String name2=on.next();
                String sql = "update p_user set name='"+name2+"'where name='"+name1+"'";
                // Establish the connection.
                Class.forName("com.mysql.jdbc.Driver");
                con = DriverManager.getConnection(Url,username,password);
                // Create and execute an SQL statement that returns some data.
                stmt = con.createStatement();
                stmt.executeUpdate(sql);
                System.out.println("修改成功！");
            }
            if(x==2){
                System.out.print("请输入修改后的住址：");
                String address=on.next();
                String sql = "update p_user set address='"+address+"'where name='"+name1+"'";
                // Establish the connection.
                Class.forName("com.mysql.jdbc.Driver");
                con = DriverManager.getConnection(Url,username,password);
                // Create and execute an SQL statement that returns some data.
                stmt = con.createStatement();
                stmt.executeUpdate(sql);
                System.out.println("修改成功！");

            }
            if(x==3){
                System.out.print("请输入修改后的电话号码：");
                String phone=on.next();
                String sql = "update p_user set phone='"+phone+"'where name='"+name1+"'";
                // Establish the connection.
                Class.forName("com.mysql.jdbc.Driver");
                con = DriverManager.getConnection(Url,username,password);
                // Create and execute an SQL statement that returns some data.
                stmt = con.createStatement();
                stmt.executeUpdate(sql);
                System.out.println("修改成功！");
            }
            System.out.print("1.修改姓名 2.修改住址 3.修改电话号码 4.修改结束");
            System.out.print("请选择修改的内容：");
            x=on.nextInt();
        }
    }
}
