import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class StudentDAOImpl implements StudentDAO{

    @Override
    public Connection getCon() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost/kit", "root", "");
        System.out.println(con);
        return null;
    }

    @Override
    public int insert(StudentModel sm) {
        return 0;
    }

    @Override
    public int update(StudentModel sm) {
        return 0;
    }

    @Override
    public int delete(int id) {
        return 0;
    }

    @Override
    public StudentModel search(int id) {
        return null;
    }
    }
}
