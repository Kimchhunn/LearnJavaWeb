import java.sql.*;
import java.util.LinkedList;
import java.util.List;

public class DAOFunction implements DAO {
    Controller cont = new Controller();

    public Connection getCon() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/auth", "root", "");
            return con;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public boolean insert (Controller cont, Connection connection) {
        try {
            PreparedStatement prestt = connection.prepareStatement("INSERT INTO detail VALUES (?, ?, ?, ?, ?)");
            prestt.setString(1, cont.getName());
            prestt.setString(2, cont.getPassword());
            prestt.setInt(3, cont.getAge());
            prestt.setString(4, cont.getPhone());
            prestt.setString(5, cont.getEmail());
            System.out.println(prestt+"sadsdasd");
            prestt.execute();
            return true;
        } catch (SQLException e) {
            return false;
        }
    }

    public LinkedList<String> select (Connection connection) throws SQLException {

        Statement stt = connection.createStatement();
        ResultSet rs = stt.executeQuery("SELECT * FROM detail");

        LinkedList<String> list = new LinkedList<>();

        while (rs.next()) {

            list.add(rs.getString("name") + "|" +rs.getString("password"));
        }
        for (String record : list)
        {
            System.out.println(record);
        }
        return list;
    }

    public boolean delete (String current_user, Controller cont, Connection connection) {
        try {
            PreparedStatement prestt = connection.prepareStatement("DELETE FROM detail WHERE name = ? ");
            prestt.setString(1, current_user);
            prestt.execute();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean update (String current_user, Controller cont, Connection connection) {
        System.out.println(current_user+"uudfdf");
        try {

        String name_q = "name = ", password_q = "password = ", phone_q = "phone = ", email_q = "email = ", age_q = "age = ";

        String name = cont.getName();
        String password = cont.getPassword();
        int age = cont.getAge();
        String phone = cont.getPhone();
        String email = cont.getEmail();

        if (name != "") {
            name_q = name_q + "'"+name + "', ";
        }
        else {
            name_q = "";
        }

        if (age > 0) {
            age_q = age_q + "'"+age + "', ";
        }
        else {
            age_q = "";
        }

        if (password != "") {
            password_q = password_q + "'"+password +"', ";
        }
        else {
            password_q = "";
        }

        if (phone != "") {
            phone_q = phone_q + "'"+phone +"', ";
        }
        else {
            phone_q = "";
        }

        if (email != "") {
            email_q = email_q + "'"+email +"' ";
        }
        else {
            email_q = "";
        }


        String query = "UPDATE detail SET "+ name_q + password_q + phone_q + age_q + email_q
                + "WHERE name = "+current_user+";";
            System.out.println(query+"dsfsdfdsfdf");
            Statement stt = connection.createStatement();
            stt.execute(query);
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}
