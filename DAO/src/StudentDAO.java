import java.sql.Connection;
import java.sql.SQLException;

public interface StudentDAO {
    Connection getCon() throws ClassNotFoundException, SQLException;
    int insert(StudentModel sm);
    int update(StudentModel sm);
    int delete (int id);
    StudentModel search (int id);
}
