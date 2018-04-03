package com.company;

import java.sql.*;
import java.util.Scanner;

public class BankTransaction {
    public Connection getCon () throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/kit", "root", "");
        con.setAutoCommit(false);
        return con;
    }

    public int credit(Connection con, float amt) throws SQLException {
        PreparedStatement pps = null;
        try {
            ResultSet rs = con.createStatement().executeQuery("SELECT * FROM balance WHERE id = 1;");
            float bal = amt;
            while (rs.next()) {
                bal = rs.getFloat("balance") + amt;
            }
            pps = con.prepareStatement("UPDATE balance SET balance = ? WHERE id = ?;");
            pps.setFloat(1, bal);
            pps.setInt(2, 1);
            pps.execute();
            con.commit();
            return 1;
        } catch (Exception e) {
            e.printStackTrace();
            con.rollback();
            return 0;
        }
    }

    public int debit(Connection con, float amt) throws SQLException {
        PreparedStatement pps = null;
        try {
            ResultSet rs = con.createStatement().executeQuery("SELECT * FROM balance WHERE id = 1;");
            float bal = amt;
            while (rs.next()) {
                bal = rs.getFloat("balance") - amt;
            }
            pps = con.prepareStatement("UPDATE balance SET balance = ? WHERE id = ?;");
            pps.setFloat(1, bal);
            pps.setInt(2, 1);
            pps.execute();
            con.commit();
            return 1;
        } catch (Exception e) {
            e.printStackTrace();
            con.rollback();
            return 0;
        }
    }

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Scanner s = new Scanner(System.in);
        System.out.println("Choose Action: \n1. Deposit \n2. Withdraw\nAction : ");
        int act = s.nextInt();
        System.out.println("Ammount : ");
        float amt = s.nextFloat();

        BankTransaction bt = new BankTransaction();
        Connection con = bt.getCon();

        if (act == 1) {
            int res = bt.credit(con, amt);
            if (res == 1)
                System.out.println("Balance updated");
            else
                System.out.println("Failed to update,");
        }
        else if (act == 2) {
            int op = bt.debit(con, amt);
            if (op == 1)
                System.out.println("Balance updated");
            else
                System.out.println("Failed to update,");
        }
    }
}
