package com.company;

import java.sql.*;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public int insert(Connection con) throws SQLException {
        PreparedStatement pps = con.prepareStatement("INSERT INTO detail VALUES (?, ?, ?)");
        pps.setInt(1, 1);
        pps.setString(2, "Kimchhun");
        pps.setString(3, "Kimchhun@gmail.com");
        pps.execute();
        return 1;
    }
    public LinkedList selectAll(Connection con) throws SQLException {
        LinkedList <String> list = new LinkedList<>();
        ResultSet rs = con.createStatement().executeQuery("SELECT * FROM detail");
        while (rs.next()) {
            list.add(rs.getString("id") +
                    " | " + rs.getString("name") +
                    " | " + rs.getString("email"));
        }
        return list;
    }

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/system", "root", "");

        Main main = new Main();
        Scanner s = new Scanner(System.in);

        System.out.println("Select action to be performed wih database \n1. Insert Data \n2. Display Data");
        int act = s.nextInt();
        if ( act == 1) {
            int res = main.insert(con);
            if (res == 1)
                System.out.println("Insert successfully.");
            else
                System.out.println("Failed to insert.");
        }
        else if ( act == 2) {
            LinkedList <String> result = new LinkedList<>();
            result = main.selectAll(con);
            System.out.println("=================================");
            for (String record : result) {
                System.out.println(record + "\n=================================");
            }
        }
        else {
            System.out.println("Invalid Action!!!!");
        }

    }
}

