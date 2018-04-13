import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Preparedbatch {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql//localhost:3306/kitstudent", "root", "");
        PreparedStatement ps = con.prepareStatement("INSERT INTO bank_account VALUE (?, ?, ?)");

        ps.setInt(1, 45923);
        ps.setString(2, "Kimchhun");
        ps.setInt(3, 523000);
        ps.addBatch();

        ps.setInt(1, 2343);
        ps.setString(2, "Alexandria");
        ps.setInt(3, 920000);
        ps.addBatch();

        // submit the batch for execution
        int[] updateCounts = ps.executeBatch();

    }
}
